package com.wmeimob.custom.wechat.service;


import com.mzlion.easyokhttp.HttpClient;
import com.wmeimob.custom.config.CustomProp;
import com.wmeimob.custom.wechat.entity.WechatMch;
import com.wmeimob.custom.wechat.entity.WechatMps;
import com.wmeimob.custom.wechat.mapper.WechatMchMapper;
import com.wmeimob.tools.SpringHelper;
import com.wmeimob.tools.SpringRedisUtil;
import com.wmeimob.tools.XmlUtil;
import com.wmeimob.tools.web.IpAddressHelper;
import com.wmeimob.tools.wechat.Signature;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.util.Assert;
import org.springframework.util.StringUtils;

import java.math.BigDecimal;
import java.text.SimpleDateFormat;
import java.util.Map;
import java.util.TreeMap;
import java.util.UUID;

/**
 * Created by Shinez on 2017/4/2.
 */
public class WechatPayService {

    private Logger logger = LoggerFactory.getLogger(this.getClass());

    private CustomProp customProp = (CustomProp) SpringHelper.getBean("customProp");

    private SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyyMMddHHmmss");

    private WechatMchMapper wechatMchMapper = (WechatMchMapper) SpringHelper.getBean("wechatMchMapper");


    private static WechatPayService wechatPayService;

    public WechatPayService() {
    }

    ;

    public static WechatPayService getInstance() {
        if (wechatPayService == null) {
            wechatPayService = new WechatPayService();
        }
        return wechatPayService;
    }

    public Map<String, Object> prePayAndGetSignature(String goodsDesc, String totalFee, String orderNo, String openid) {
        String mpid = customProp.getConfig("mpid");
        WechatMch wechatMch = SpringRedisUtil.get("mps:" + mpid + ":mch");
        WechatMps wechatMps = SpringRedisUtil.get("mps:" + mpid + ":object");
        Assert.notNull(wechatMps, "mp in cache is null");
        if (wechatMch == null) {
            wechatMch = wechatMchMapper.selectByPrimaryKey(wechatMps.getMchId());
            Assert.notNull(wechatMch, "商户未配置支付，您暂时不能下单");
            SpringRedisUtil.save("mps:" + mpid + ":mch", wechatMch, null);
        }
        Map<String, Object> map = WechatPayService.getInstance().prePay(
                wechatMps.getAppid(),
                wechatMch.getMchNo(),
                goodsDesc,
                orderNo,
                totalFee,
                IpAddressHelper.getRemoteHost(),
                openid);
        String prepayId = null;
        if (map != null) {
            prepayId = map.get("prepay_id").toString();
        }
        if (StringUtils.isEmpty(prepayId)) {
            throw new RuntimeException("暂时无法发起微信支付");
        }
        map = WechatPayService.getInstance().chooseWXPay(wechatMps.getAppid(), prepayId);
        return map;
    }

    /**
     * 微信预支付
     *
     * @return
     */
    public Map<String, Object> prePay(String appid, String mchNo, String body, String out_trade_no, String total_fee, String spbill_create_ip, String openid) {
        TreeMap<String, Object> map = new TreeMap<>();
        map.put("appid", appid);
        map.put("mch_id", mchNo);
        map.put("nonce_str", UUID.randomUUID().toString().replace("-", ""));
        map.put("notify_url", customProp.getConfig("wechat-pay-notify"));
        map.put("trade_type", "JSAPI");
        map.put("body", body);
        map.put("out_trade_no", out_trade_no);
        map.put("total_fee", new BigDecimal(total_fee).setScale(0, BigDecimal.ROUND_DOWN).toString());
        map.put("spbill_create_ip", spbill_create_ip);
        map.put("openid", openid);
        WechatMch wechatMch = new WechatMch();
        wechatMch.setMchNo(mchNo);
        wechatMch = wechatMchMapper.selectOne(wechatMch);
        String key = wechatMch.getMchKey();
        StringBuffer sb = new StringBuffer();
        String sign = Signature.getInstance(key).getSign(map);
        map.put("sign", sign);

//        //将要提交给API的数据对象转换成XML格式数据Post给API
        String postDataXML = XmlUtil.map2XmlString(map);
        System.out.println("XML:" + postDataXML);
        String responseData = HttpClient
                // 请求方式和请求url
                .textBody("https://api.mch.weixin.qq.com/pay/unifiedorder")
                //post提交xml
                .xml(postDataXML)
                .charset("utf-8")
                .asString();
        Map<String, Object> resultMap;
        try {
            resultMap = XmlUtil.readStringXmlOut(responseData);
            if (resultMap.get("return_code").equals("FAIL")) {
                logger.error(resultMap.get("return_msg").toString());
                return null;
            }
            boolean signResult = Signature.getInstance(key).checkIsSignValidFromResponseString(responseData);
            if (!signResult) {
                logger.error("签名错误，有可疑程序在伪造统一下单结果");
                return null;
            }
        } catch (Exception e) {
            logger.error(e.getMessage(), e);
            return null;
        }
        return resultMap;
    }

    public Map<String, Object> chooseWXPay(String appid, String prepayId) {
        TreeMap<String, Object> treeMap = new TreeMap<>();
        treeMap.put("appId", appid);
        treeMap.put("timeStamp", String.valueOf(System.currentTimeMillis() / 1000));
        treeMap.put("nonceStr", UUID.randomUUID().toString().replace("-", ""));
        treeMap.put("package", "prepay_id=" + prepayId);
        treeMap.put("signType", "MD5");
        String key = wechatMchMapper.selectMchKeyByAppid(appid);
        String sign = Signature.getInstance(key).getSign(treeMap);
        treeMap.put("paySign", sign);
        System.out.println(XmlUtil.map2XmlString(treeMap));
        return treeMap;
    }

    public Map<String, Object> queryOrder(String appid, String mchId, String orderNo) {
        TreeMap<String, Object> treeMap = new TreeMap<>();
        treeMap.put("appid", appid);
        treeMap.put("mch_id", mchId);
        treeMap.put("out_trade_no", orderNo);
        treeMap.put("nonce_str", UUID.randomUUID().toString().replace("-", ""));
        String key = wechatMchMapper.selectMchKeyByAppid(appid);
        String sign = Signature.getInstance(key).getSign(treeMap);
        treeMap.put("sign", sign);
        String postDataXML = XmlUtil.map2XmlString(treeMap);
        String responseData = HttpClient
                // 请求方式和请求url
                .textBody("https://api.mch.weixin.qq.com/pay/orderquery")
                //post提交xml
                .xml(postDataXML)
                .charset("utf-8")
                .asString();
        Map<String, Object> resultMap = null;
        try {
            resultMap = XmlUtil.readStringXmlOut(responseData);
            if (resultMap.get("return_code").equals("FAIL")) {
                logger.error(resultMap.toString());
                return null;
            }
            boolean validSign = Signature.getInstance(key).checkIsSignValidFromResponseString(responseData);
            if (!validSign) {
                logger.error("签名错误，有可疑程序伪造微信支付订单查询结果");
                return null;
            }
        } catch (Exception e) {
            logger.error(e.getMessage(), e);
            return null;
        }
        return resultMap;
    }

    public Map<String, Object> closeOrder(String appid, String mchId, String orderNo) {
        TreeMap<String, Object> treeMap = new TreeMap<>();
        treeMap.put("appid", appid);
        treeMap.put("mch_id", mchId);
        treeMap.put("out_trade_no", orderNo);
        treeMap.put("nonce_str", UUID.randomUUID().toString().replace("-", ""));
        String key = wechatMchMapper.selectMchKeyByAppid(appid);
        String sign = Signature.getInstance(key).getSign(treeMap);
        treeMap.put("sign", sign);
        String postDataXML = XmlUtil.map2XmlString(treeMap);
        String responseData = HttpClient
                // 请求方式和请求url
                .textBody("https://api.mch.weixin.qq.com/pay/closeorder")
                //post提交xml
                .xml(postDataXML)
                .charset("utf-8")
                .asString();
        Map<String, Object> resultMap = null;
        try {
            resultMap = XmlUtil.readStringXmlOut(responseData);
            if (resultMap.get("return_code").equals("FAIL")) {
                logger.error(resultMap.toString());
                return null;
            }
            boolean validSign = Signature.getInstance(key).checkIsSignValidFromResponseString(responseData);
            if (!validSign) {
                logger.error("签名错误，有可疑程序伪造微信支付订单关闭结果");
                return null;
            }
        } catch (Exception e) {
            logger.error(e.getMessage(), e);
            return null;
        }
        return resultMap;
    }

}
