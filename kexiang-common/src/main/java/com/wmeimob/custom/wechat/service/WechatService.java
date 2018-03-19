package com.wmeimob.custom.wechat.service;

import com.alibaba.fastjson.JSONObject;
import com.mzlion.easyokhttp.HttpClient;
import com.wmeimob.custom.config.CustomProp;
import com.wmeimob.custom.exception.CustomException;
import com.wmeimob.custom.wechat.entity.WechatMch;
import com.wmeimob.custom.wechat.entity.WechatMps;
import com.wmeimob.custom.wechat.entity.WechatUser;
import com.wmeimob.custom.wechat.mapper.WechatMchMapper;
import com.wmeimob.custom.wechat.mapper.WechatMpsMapper;
import com.wmeimob.custom.wechat.mapper.WechatUserMapper;
import com.wmeimob.tools.RandomCodeUtil;
import com.wmeimob.tools.SpringHelper;
import com.wmeimob.tools.SpringRedisUtil;
import com.wmeimob.tools.web.HttpHelper;
import com.wmeimob.tools.wechat.WechatSignUtil;
import lombok.extern.slf4j.Slf4j;
import me.hao0.wechat.core.Component;
import org.springframework.stereotype.Service;
import org.springframework.util.Assert;
import org.springframework.util.StringUtils;

import java.security.NoSuchAlgorithmException;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;

import static me.hao0.common.util.Preconditions.checkNotNullAndEmpty;


/**
 * Created by Shinez on 2017/2/22.
 */

@Service
@Slf4j
public class    WechatService extends Component {


    /**
     * 添加模板消息
     *
     * @param templateShortId
     * @return
     */
    public String addTemplate(String templateShortId) {
        String accessToken = loadAccessToken();
        checkNotNullAndEmpty(accessToken, "accessToken");
        String apiAddTemplate = "https://api.weixin.qq.com/cgi-bin/template/api_add_template?access_token=" + accessToken;
        JSONObject param = new JSONObject();
        param.put("template_id_short", templateShortId);
        JSONObject jsonObject = JSONObject.parseObject(HttpClient
                .textBody(apiAddTemplate)
                .json(param.toJSONString())
                .asString());
        if (jsonObject.getInteger("errcode").equals(0)) {
            return jsonObject.getString("template_id");
        }
        throw new CustomException("获取模板消息失败: " + jsonObject.getInteger("errmsg"));
    }


    /**
     * 发送客服文本消息
     *
     * @param openid
     * @param content
     * @return
     */
    public String sendCustomTextMsg(String openid, String content) {
        String accessToken = loadAccessToken();
        checkNotNullAndEmpty(accessToken, "accessToken");
        String apiAddTemplate = "https://api.weixin.qq.com/cgi-bin/message/custom/send?access_token=" + accessToken;
        JSONObject param = new JSONObject();
        param.put("touser", openid);
        param.put("msgtype", "text");
        JSONObject textJson = new JSONObject();
        textJson.put("content", content);
        param.put("text", textJson);
        JSONObject jsonObject = JSONObject.parseObject(HttpClient
                .textBody(apiAddTemplate)
                .json(param.toJSONString())
                .asString());
        if (jsonObject.getInteger("errcode").equals(0)) {
            return jsonObject.getString("errmsg");
        }
        throw new CustomException("发送客服消息失败: [" + jsonObject.getInteger("errcode") +"]"+ jsonObject.getString("errmsg"));
    }

    private static CustomProp customProp = (CustomProp) SpringHelper.getBean("customProp");
    private static WechatMpsMapper wechatMpsMapper = (WechatMpsMapper) SpringHelper.getBean("wechatMpsMapper");
    private static WechatMchMapper wechatMchMapper = (WechatMchMapper) SpringHelper.getBean("wechatMchMapper");
    private static WechatUserMapper wechatUserMapper = (WechatUserMapper) SpringHelper.getBean("wechatUserMapper");

    /**
     * 获取公众号信息
     *
     * @param mpid
     * @return
     */
    public static WechatMps getMps(String mpid) {
        mpid = getMpid(mpid);
        //查询公众号
        WechatMps wechatMps = SpringRedisUtil.get("mps:" + mpid + ":object");
        if (wechatMps == null) {
            wechatMps = wechatMpsMapper.selectByPrimaryKey(Integer.valueOf(mpid));
            Assert.notNull(wechatMps, "公众号 " + mpid + " 不存在");
            SpringRedisUtil.save("mps:" + mpid, wechatMps, null);
        }
        return wechatMps;
    }

    /**
     * 获取公众号标识
     *
     * @param mpid
     * @return
     */
    private static String getMpid(String mpid) {
        if (StringUtils.isEmpty(mpid)) {
            //单个公众号
            mpid = customProp.getConfig("mpid");
            Assert.notNull(mpid, "未指定的mpid");
        }
        return mpid;
    }

    /**
     * 获取商户号
     *
     * @param mpid
     * @return
     */
    public static WechatMch getMch(String mpid) {
        WechatMch wechatMch = SpringRedisUtil.get("mps:" + mpid + ":mch");
        WechatMps wechatMps = getMps(mpid);
        if (wechatMch == null) {
            wechatMch = wechatMchMapper.selectByPrimaryKey(wechatMps.getMchId());
            Assert.notNull(wechatMps, " AppId " + wechatMps.getAppid() + " 未配置商户号");
            SpringRedisUtil.save("mps:" + mpid + ":mch", wechatMch, null);
        }
        return wechatMch;
    }


    public static WechatUser saveWechatUserInfo(WechatUser wechatUser) {
        try {
            String openid = wechatUser.getOpenid();
            Assert.notNull(openid,"An error occurred when saving wechat user to db ,cause the openid is null");
            WechatUser queryWechatUser = new WechatUser();
            queryWechatUser.setOpenid(openid);
            synchronized (openid.intern()) {
                queryWechatUser = wechatUserMapper.selectOne(queryWechatUser);
                if (queryWechatUser == null) {
                    wechatUserMapper.insertSelective(wechatUser);
                } else {
                    wechatUser.setId(queryWechatUser.getId());
                    wechatUserMapper.updateByPrimaryKeySelective(wechatUser);
                }
                return wechatUser;
            }
        } catch (Exception e) {
            log.error(e.getMessage(), e);
            return null;
        }
    }
    public static Map<String, Object> jssdkInit(String appid, String currentUrl) {
        long timestamp = System.currentTimeMillis();
        String nonceStr = RandomCodeUtil.randCode(12);
        TreeMap<String,Object> map = new TreeMap<>();
        map.put("timestamp", timestamp / 1000L);
        map.put("noncestr", nonceStr);
        map.put("url", currentUrl);
        String ticket =  SpringRedisUtil.get("mps:" + appid + ":jsapi_ticket");
        if (ticket == null) {
            JSONObject sb = JSONObject.parseObject(HttpHelper.SSLGet("https://api.weixin.qq.com/cgi-bin/ticket/getticket?access_token=ACCESS_TOKEN&type=jsapi"
                    .replace("ACCESS_TOKEN", getAccessToken(appid)), null));
            if (sb != null && sb.getString("ticket") != null) {
                ticket = sb.getString("ticket");
                SpringRedisUtil.save("mps:" + appid + ":jsapi_ticket", ticket, (long) (sb.getInteger("expires_in") - 600) * 1000L);
            }
        }

        map.put("jsapi_ticket", ticket);
        StringBuffer sb1 = new StringBuffer("");
        Iterator result = map.keySet().iterator();

        String sha1;
        while (result.hasNext()) {
            sha1 = (String) result.next();
            sb1.append(sha1 + "=" + map.get(sha1) + "&");
        }

        String result1 = sb1.substring(0, sb1.length() - 1);
        sha1 = "";

        try {
            sha1 = WechatSignUtil.SHA1(result1);
        } catch (NoSuchAlgorithmException var12) {
            log.error(var12.getMessage(), var12);
        }

        map.put("signature", sha1.toLowerCase());
        map.put("appId", appid);
        return map;
    }


    private static String getAccessToken(String appid) {
        String accessToken = SpringRedisUtil.get("mps:" + appid + ":access_token");
        if (accessToken == null) {
            WechatMps wechatMps = (WechatMps) SpringRedisUtil.get("mps:" + appid + ":object");
            if (wechatMps == null) {
                wechatMps=new WechatMps();
                wechatMps.setAppid(appid);
                wechatMps = wechatMpsMapper.selectOne(wechatMps);
                SpringRedisUtil.save("mps:" + wechatMps.getAppid() + ":object", wechatMps, 21600000L);
            }

            String result = HttpHelper.SSLGet("https://api.weixin.qq.com/cgi-bin/token?grant_type=client_credential&appid=APPID&secret=APPSECRET".replace("APPID", wechatMps.getAppid()).replace("APPSECRET", wechatMps.getSecret()), (List) null);
            JSONObject jsonObject = JSONObject.parseObject(result);
            accessToken = jsonObject.getString("access_token");
            if (accessToken == null) {
                return "";
            }

            SpringRedisUtil.save("mps:" + appid + ":access_token", accessToken, (long) (jsonObject.getInteger("expires_in") - 600) * 1000L);
        }

        return accessToken;
    }

}
