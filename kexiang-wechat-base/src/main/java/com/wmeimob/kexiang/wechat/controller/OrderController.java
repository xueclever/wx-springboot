package com.wmeimob.kexiang.wechat.controller;

import com.alibaba.fastjson.JSONObject;
import com.google.common.base.Strings;
import com.wmeimob.custom.annotation.Logging;
import com.wmeimob.custom.message.RestResult;
import com.wmeimob.custom.system.entity.CityInfo;
import com.wmeimob.custom.system.mapper.CityInfoMapper;
import com.wmeimob.custom.wechat.entity.WechatUser;
import com.wmeimob.kexiang.wechat.core.OrderUtil;
import com.wmeimob.kexiang.wechat.entity.Cargoinformation;
import com.wmeimob.kexiang.wechat.entity.Orderm;
import com.wmeimob.kexiang.wechat.mapper.CargoinformationMapper;
import com.wmeimob.kexiang.wechat.mapper.OrdermMapper;
import com.wmeimob.tools.RandomCodeUtil;
import lombok.extern.slf4j.Slf4j;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.util.StringUtils;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import java.math.BigDecimal;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.*;

@Logging
@RestController
@RequestMapping("order")
@Slf4j
public class OrderController {

    @Resource
    private OrdermMapper ordermMapper;

    @Resource
    private CargoinformationMapper cargoinformationMapper;

    @Resource
    private CityInfoMapper cityInfoMapper;

    /**
     * 通过第三方接口查询
     *
     * @param request
     * @param orderNo
     * @return
     */
    @RequestMapping("info")
    public JSONObject info(HttpServletRequest request, String orderNo) {

        return RestResult.success();
    }

    /**
     * 查询订单信息
     *
     * @param request
     * @param isrefer
     * @return
     */
    @RequestMapping("infobase")
    public JSONObject infobase(HttpServletRequest request, Integer isrefer) {
        WechatUser wechat = (WechatUser) SecurityContextHolder.getContext().getAuthentication().getPrincipal();

        Orderm orderm = new Orderm();
        orderm.setOpenid(wechat.getOpenid());
        orderm.setIsrefer(isrefer);
        List<Orderm> list = ordermMapper.select(orderm);
        Map<String, Object> map = new HashMap<String, Object>();
        map.put("orderLt", list);
        return RestResult.success(map);
    }

    /**
     * 查询订单详情信息
     *
     * @param request
     * @param id
     * @return
     */
    @RequestMapping("detailbase")
    public JSONObject detailbase(HttpServletRequest request, Integer id) {
        WechatUser wechat = (WechatUser) SecurityContextHolder.getContext().getAuthentication().getPrincipal();
        Orderm orderm = ordermMapper.selectByPrimaryKey(id);
        Cargoinformation cargoinformation = new Cargoinformation();
        cargoinformation.setOrderId(id);
        List<Cargoinformation> cargoinformationLt = cargoinformationMapper.select(cargoinformation);
        Map<String, Object> map = new HashMap<String, Object>();
        map.put("orderm", orderm);
        map.put("cargoinformationLt", cargoinformationLt);
        return RestResult.success(map);
    }


    /**
     * 提交订单信息
     *
     * @param request
     * @param orderNo
     * @return
     */
    @PostMapping("order")
    public JSONObject order(HttpServletRequest request, @RequestBody Map<String, Object> params) {

        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");

        Orderm orderm = new Orderm();


        /****收件人******************************************************/
        //收件人
        if (params.get("recPerson") != null && params.get("recPerson") !="") {
            orderm.setRecPerson(params.get("recPerson").toString());
        } else {
            return RestResult.fail("请填写收件人姓名");
        }
        //收件人联系电话
        if (params.get("recTel") != null && params.get("recTel") !="") {
            orderm.setRecTel(params.get("recTel").toString());
        } else {
            return RestResult.fail("请填写收件人电话");
        }

        //收件人单位名称
        if (params.get("recUnitName") != null && params.get("recUnitName") != "") {
            orderm.setRecUnitName(params.get("recUnitName").toString());
        } else {
            return RestResult.fail("请填写单位名称");
        }

        //省
        if (params.get("recProvinceId") != null && params.get("recProvinceId") != "") {
            orderm.setRecProvinceId((Integer) params.get("recProvinceId"));
            CityInfo cityInfo = cityInfoMapper.selectByPrimaryKey((Integer) params.get("recProvinceId"));
            orderm.setRecProvince(cityInfo.getName());
        } else {
            return RestResult.fail("请选择省");
        }

        //市
        if (params.get("recCityId") != null && params.get("recCityId") != "") {
            orderm.setRecCityId((Integer) params.get("recCityId"));
            CityInfo cityInfo = cityInfoMapper.selectByPrimaryKey((Integer) params.get("recCityId"));
            orderm.setRecCity(cityInfo.getName());
        } else {
            return RestResult.fail("请选择市");
        }

        //区
        if (params.get("recAreaId") != null && params.get("recAreaId") != "") {
            orderm.setRecAreaId((Integer) params.get("recAreaId"));
            CityInfo cityInfo = cityInfoMapper.selectByPrimaryKey((Integer) params.get("recAreaId"));
            orderm.setRecArea(cityInfo.getName());
        } else {
            return RestResult.fail("请选择区");
        }

        //详细地址
        if (params.get("recDetailAdress") != null && params.get("recDetailAdress") != "") {
            orderm.setRecDetailAdress(params.get("recDetailAdress").toString());
        } else {
            return RestResult.fail("请填写详细地址");
        }

        //交货方式（1.直送、0.自提）
        if (params.get("recMode") != null && params.get("recMode") != "") {
            orderm.setRecMode((Integer) params.get("recMode"));
        } else {
            return RestResult.fail("请选择交货方式");
        }


        /****发件人******************************************************/
        //发件人
        if (params.get("mailPerson") != null && params.get("mailPerson") != "") {
            orderm.setMailPerson(params.get("mailPerson").toString());
        } else {
            return RestResult.fail("请填写发件人姓名");
        }
        //发件人联系电话
        if (params.get("mailTel") != null && params.get("mailTel") != "") {
            orderm.setMailTel(params.get("mailTel").toString());
        } else {
            return RestResult.fail("请填写发件人电话");
        }

        //发件人单位名称
        if (params.get("mailUnitName") != null && params.get("mailUnitName") != "") {
            orderm.setMailUnitName(params.get("mailUnitName").toString());
        } else {
            return RestResult.fail("请填写发件人单位名称");
        }

        //省
        if (params.get("mailProvinceId") != null && params.get("mailProvinceId") != "") {
            orderm.setMailProvinceId((Integer) params.get("mailProvinceId"));
            CityInfo cityInfo = cityInfoMapper.selectByPrimaryKey((Integer) params.get("mailProvinceId"));
            orderm.setMailProvince(cityInfo.getName());
        } else {
            return RestResult.fail("请选择省");
        }

        //市
        if (params.get("mailCityId") != null && params.get("mailCityId") != "") {
            orderm.setMailCityId((Integer) params.get("mailCityId"));
            CityInfo cityInfo = cityInfoMapper.selectByPrimaryKey((Integer) params.get("mailCityId"));
            orderm.setMailCity(cityInfo.getName());
        } else {
            return RestResult.fail("请选择市");
        }

        //区
        if (params.get("mailAreaId") != null && params.get("mailAreaId") != "") {
            orderm.setMailAreaId((Integer) params.get("mailAreaId"));
            CityInfo cityInfo = cityInfoMapper.selectByPrimaryKey((Integer) params.get("mailAreaId"));
            orderm.setMailArea(cityInfo.getName());
        } else {
            return RestResult.fail("请选择区");
        }

        //详细地址
        if (params.get("mailDetailAdress") != null && params.get("mailDetailAdress") != "") {
            orderm.setMailDetailAdress(params.get("mailDetailAdress").toString());
        } else {
            return RestResult.fail("请填写发件人详细地址");
        }

        //发件时间
        if (!Strings.isNullOrEmpty((String) params.get("mailTime"))) {
            try {
                orderm.setMailTime(sdf.parse((String) params.get("mailTime")));
            } catch (ParseException e) {
                // TODO Auto-generated catch block
                e.printStackTrace();
            }
        } else {
            return RestResult.fail("请选择发件时间");
        }

        //预计到达时间
        if (!Strings.isNullOrEmpty((String) params.get("arriveTime"))) {
            try {
                orderm.setArriveTime(sdf.parse((String) params.get("arriveTime")));
            } catch (ParseException e) {
                // TODO Auto-generated catch block
                e.printStackTrace();
            }
        } else {
            return RestResult.fail("请选择预计到达时间");
        }

        //回单份数
        if (params.get("receipt") != null && params.get("receipt") != "") {
            orderm.setReceipt((Integer) params.get("receipt"));
        } else {
            return RestResult.fail("请选择回单份数");
        }

        WechatUser wechat = (WechatUser) SecurityContextHolder.getContext().getAuthentication().getPrincipal();

        if (params.get("id") == null || params.get("id") == "") {
            orderm.setOpenid(wechat.getOpenid());
            orderm.setCreateTime(new Date());
            //0:未提交.1:提交
            orderm.setIsrefer(0);
            ordermMapper.insertSelective(orderm);
        } else {
            orderm.setId((Integer) params.get("id"));
            ordermMapper.updateByPrimaryKeySelective(orderm);
        }

        Map<String, Object> map = new HashMap<String, Object>();
        map.put("orderId", orderm.getId());

        return RestResult.success(map);
    }


    /**
     * 修改订单信息1
     *
     * @param request
     * @return
     */
    @PostMapping("editorder")
    public JSONObject editorder(HttpServletRequest request, @RequestBody Map<String, Object> params) {
        List<LinkedHashMap<String, Object>> list = (List<LinkedHashMap<String, Object>>) params.get("list");
        Orderm orderm = new Orderm();
        if ((Integer) params.get("id") == null) {
            return RestResult.fail("订单id不能为空");
        }

        orderm.setId((Integer) params.get("id"));

        //运费合计
        if (!StringUtils.isEmpty(params.get("totalFreight"))) {
            orderm.setTotalFreight(new BigDecimal(params.get("totalFreight").toString()));
        } else {
            return RestResult.fail("运费合计不能为空");
        }
        //投保额度
        if (!StringUtils.isEmpty(params.get("coverage"))) {
            orderm.setCoverage(new BigDecimal(params.get("coverage").toString()));
        } else {
            return RestResult.fail("请填写投保额度");
        }
        //保险额度
        if (!StringUtils.isEmpty(params.get("premium"))) {
            orderm.setPremium(new BigDecimal(params.get("premium").toString()));
        } else {
            return RestResult.fail("请填写保险额度");
        }

        cargoinformationMapper.del((Integer) params.get("id"));
        for (LinkedHashMap<String, Object> mapss : list) {
            Cargoinformation cargoinformation = new Cargoinformation();

            //货物名称
            if (mapss.get("cargoName") != null) {
                cargoinformation.setCargoName(mapss.get("cargoName").toString());
            } else {
                return RestResult.fail("请填写货物名称");
            }

            //货物数量
            if (mapss.get("count") != null && mapss.get("count") != "") {
            	try {
                	cargoinformation.setCount((Integer) mapss.get("count"));
            	}catch(Exception e) {
            		return RestResult.fail("数量请填写正整数");
            	}
            		
            } else {
                return RestResult.fail("请填写货物数量");
            }

            //单位（1.件.2.吨.3.立方）
            if (mapss.get("unit") != null && mapss.get("unit") != "") {
                cargoinformation.setUnit((Integer) mapss.get("unit"));
            } else {
                return RestResult.fail("请选择单位");
            }

            //运费单价
            if (!StringUtils.isEmpty(mapss.get("freightUnit"))) {
                cargoinformation.setFreightUnit(new BigDecimal(mapss.get("freightUnit").toString()));
            } else {
                return RestResult.fail("请填写运费单价");
            }

            cargoinformation.setOrderId((Integer) params.get("id"));

            cargoinformationMapper.insertSelective(cargoinformation);
        }

        ordermMapper.updateByPrimaryKeySelective(orderm);
        

        Map<String, Object> map = new HashMap<String, Object>();
        map.put("orderId", orderm.getId());

        return RestResult.success(map);
    }


    /**
     * 修改订单信息2
     *
     * @param request
     * @param params
     * @return
     */
    @PostMapping("edittwiceorder")
    public JSONObject edittwiceorder(HttpServletRequest request, @RequestBody Map<String, Object> params) {
        Orderm orderm = new Orderm();
        if (params.get("id") == null) {
            return RestResult.fail("订单id不能为空");
        }

        orderm.setId((Integer) params.get("id"));

        //付款总额
        if (!StringUtils.isEmpty(params.get("totalPayments"))) {
            orderm.setTotalPayments(new BigDecimal(params.get("totalPayments").toString()));
        } else {
            return RestResult.fail("付款总额不能为空");
        }
        //预付款合计
        if (!StringUtils.isEmpty(params.get("prepayment"))) {
            orderm.setPrepayment(new BigDecimal(params.get("prepayment").toString()));
        } else {
            return RestResult.fail("预付款合计不能为空");
        }

        //预付款-现金
        if (!StringUtils.isEmpty(params.get("prepaymentCash"))) {
            orderm.setPrepaymentCash(new BigDecimal(params.get("prepaymentCash").toString()));
        }else{
            orderm.setPrepaymentCash(new BigDecimal("0"));
        }


        //预付款-油卡
        if (!StringUtils.isEmpty(params.get("prepaymentOilCard"))) {
            orderm.setPrepaymentOilCard(new BigDecimal(params.get("prepaymentOilCard").toString()));
        }else{
            orderm.setPrepaymentOilCard(new BigDecimal("0"));
        }


        if (StringUtils.isEmpty(params.get("prepaymentCash")) && StringUtils.isEmpty(params.get("prepaymentOilCard"))) {
            return RestResult.fail("预付款-油卡/现金至少填一项");
        }

        //回单付合计
        if (!StringUtils.isEmpty(params.get("totalReceipt"))) {
            orderm.setTotalReceipt(new BigDecimal(params.get("totalReceipt").toString()));
        } else {
            return RestResult.fail("回单付合计不能为空");
        }

        //回单付-现金
        if (!StringUtils.isEmpty(params.get("receiptCash"))) {
            orderm.setReceiptCash(new BigDecimal(params.get("receiptCash").toString()));
        }else{
            orderm.setReceiptCash(new BigDecimal("0"));
        }

        //回单付-油卡
        if (!StringUtils.isEmpty(params.get("receiptOilCard"))) {
            orderm.setReceiptOilCard(new BigDecimal(params.get("receiptOilCard").toString()));
        }else{
            orderm.setReceiptOilCard(new BigDecimal("0"));
        }

        if (StringUtils.isEmpty(params.get("receiptCash"))&& StringUtils.isEmpty(params.get("receiptOilCard"))) {
            return RestResult.fail("回单付-油卡/现金至少填一项");
        }

        //到付
        if (!StringUtils.isEmpty(params.get("fadPayment"))) {
            orderm.setFadPayment(new BigDecimal(params.get("fadPayment").toString()));
        } else {
            orderm.setFadPayment(new BigDecimal("0"));
        }

        //月结
        if (!StringUtils.isEmpty(params.get("monthBalance"))) {
            orderm.setMonthBalance(new BigDecimal(params.get("monthBalance").toString()));
        } else {
            orderm.setMonthBalance(new BigDecimal("0"));
        }

        //装卸费
        if (!StringUtils.isEmpty(params.get("coolieHire"))) {
            orderm.setCoolieHire(new BigDecimal(params.get("coolieHire").toString()));
        } else {
            orderm.setCoolieHire(new BigDecimal("0"));
        }

        //其他
        if (!StringUtils.isEmpty(params.get("other"))) {
            orderm.setOther(new BigDecimal(params.get("other").toString()));
        } else {
            orderm.setOther(new BigDecimal("0"));
        }

        //承运公司id
        if (params.get("carriageId") != null && params.get("carriageId") != "") {
            orderm.setCarriageId(Integer.valueOf(params.get("carriageId").toString()));
        } else {
            return RestResult.fail("承运公司不能为空");
        }

        //承运公司
        if (params.get("carriageCompany") != null) {
            orderm.setCarriageCompany(params.get("carriageCompany").toString());
        } else {
            return RestResult.fail("请填写承运公司名称");
        }

        //司机姓名
        if (params.get("driverName") != null && params.get("driverName") != "") {
            orderm.setDriverName(params.get("driverName").toString());
        } else {
            return RestResult.fail("请填写司机名称");
        }

        //联系电话
        if (params.get("driverTel") != null && params.get("driverTel") != "") {
            orderm.setDriverTel(params.get("driverTel").toString());
        } else {
            return RestResult.fail("请填写联系电话");
        }

        //身份证
        if (params.get("driverCard") != null && params.get("driverCard") !="") {
            orderm.setDriverCard(params.get("driverCard").toString());
        } else {
            return RestResult.fail("请填写身份证");
        }

        //车牌号
        if (!Strings.isNullOrEmpty((String) params.get("plateNumber"))) {
            orderm.setPlateNumber((String) params.get("plateNumber"));
        } else {
            return RestResult.fail("请填写车牌号");
        }

//        SimpleDateFormat sdf = new SimpleDateFormat("yyyyMMddHHmmss");
//        String orderNo = sdf.format(new Date()) + RandomCodeUtil.randCode(6);

        //是否已提交
//        orderm.setIsrefer(1);
       
        ordermMapper.updateByPrimaryKeySelective(orderm);
        
        
        Map<String, Object> map = new HashMap<String, Object>();
        map.put("orderId", orderm.getId());

        return RestResult.success(map);
    }

    /**
     * 提交
     *
     * @param id
     * @return
     */
    @PutMapping("{id}")
    public JSONObject submitOrder(@PathVariable("id") Integer id) {
        Orderm orderm = new Orderm();
        
//        ordermMapper.updateByPrimaryKeySelective(orderm);
        //第三方接口调用
        Orderm orderm1 = ordermMapper.selectByPrimaryKey(id);
        Cargoinformation cargoinformation = new Cargoinformation();
        cargoinformation.setOrderId(id);
        List<Cargoinformation> cargoinformationLt = cargoinformationMapper.select(cargoinformation);
        org.json.JSONObject jObject = null;
        try {
        	jObject =  OrderUtil.sendOtherOrder(orderm1, cargoinformationLt);
        }catch(Exception e) {
        	return RestResult.fail("网络异常，请稍后再试");
        }
        
        
        System.out.println(jObject.toString());
        if(jObject.has("ErrorMessages")) {
        	return RestResult.fail(jObject.get("ErrorMessages").toString());
        }
        orderm.setOrderno(jObject.getString("ShpNo"));
        orderm.setId(id);
        orderm.setIsrefer(1);
        int result = ordermMapper.updateByPrimaryKeySelective(orderm);
        Map<String, Object> map = new HashMap<String, Object>();
        map.put("orderNo", jObject.getString("ShpNo"));
        return result > 0 ? RestResult.success(map) : RestResult.fail();
    }


    /**
     * 未提交订单删除操作
     *
     * @param request
     * @param id
     * @return
     */
    @DeleteMapping("order")
    public JSONObject order(HttpServletRequest request, Integer id) {
        ordermMapper.deleteByPrimaryKey(id);
        return RestResult.success();
    }

}
