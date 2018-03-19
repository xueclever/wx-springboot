package com.wmeimob.kexiang.wechat.controller;

import javax.servlet.http.HttpServletRequest;

import org.datacontract.schemas._2004._07.EdiSoft_Common_Domain_ExportDomain.Shipment;
import org.inter.ShipmentClient_Gn;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.alibaba.fastjson.JSONObject;
import com.wmeimob.custom.annotation.Logging;
import com.wmeimob.custom.message.RestResult;

import lombok.extern.slf4j.Slf4j;

/**
 * 其他第三方接口(订单查询接口)
 * @author Administrator
 *
 */


@Logging
@RestController
@RequestMapping("other")
@Slf4j
public class OtherInterfaceController {
	  /**
     * 查询第三方接口
     *
     * @param request
     * @param orderNo
     * @return
     */
    @RequestMapping("getOrderInfo")
    public JSONObject getOrderInfo(HttpServletRequest request, String orderNo) {

    	Shipment[] shipment =  ShipmentClient_Gn.getOrder(orderNo);
    	if(shipment.length == 0) {
    		return RestResult.fail("只能查询30天内的运单或者运单不存在");
    	}
        return RestResult.success(shipment[0]);
    }

}
