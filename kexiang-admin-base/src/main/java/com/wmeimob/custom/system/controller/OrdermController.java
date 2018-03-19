package com.wmeimob.custom.system.controller;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.alibaba.fastjson.JSONObject;
import com.github.pagehelper.PageInfo;
import com.google.common.base.Strings;
import com.wmeimob.custom.annotation.Logging;
import com.wmeimob.custom.message.RestResult;
import com.wmeimob.kexiang.wechat.entity.Cargoinformation;
import com.wmeimob.kexiang.wechat.entity.Orderm;
import com.wmeimob.kexiang.wechat.entity.OrdermVo;
import com.wmeimob.kexiang.wechat.mapper.CargoinformationMapper;
import com.wmeimob.kexiang.wechat.mapper.OrdermMapper;

import lombok.extern.slf4j.Slf4j;

@Logging
@RestController
@RequestMapping("orderm")
@Slf4j
public class OrdermController {

	@Resource 
	private OrdermMapper ordermMapper;
	
	@Resource
	private CargoinformationMapper cargoinformationMapper;
	
	
	/**
	 * 查询订单信息
	 * @param request
	 * @param isrefer
	 * @return
	 */
	@RequestMapping("infobase")
	public JSONObject infobase(HttpServletRequest request,String startDate,String endDate,String orderNo) {
//		WechatUser wechat = (WechatUser)SecurityContextHolder.getContext().getAuthentication().getPrincipal();
		
		Map<String,Object> cmap = new HashMap<String,Object>();
		cmap.put("startT", startDate+" 00:00:00");
		cmap.put("endT", endDate +" 23:59:59");
		if(!Strings.isNullOrEmpty(orderNo)) {
			cmap.put("orderNo",orderNo);
		}
		List<OrdermVo> list =  ordermMapper.selectOrder(cmap);
		Map<String,Object> map = new HashMap<String,Object>();
		map.put("page", new PageInfo<>(list));
		return RestResult.success(map);
	}
	
	/**
	 * 查询订单详情信息
	 * @param request
	 * @param id
	 * @return
	 */
	@RequestMapping("detailbase")
	public JSONObject detailbase(HttpServletRequest request,Integer id) {
//		WechatUser wechat = (WechatUser)SecurityContextHolder.getContext().getAuthentication().getPrincipal();
		OrdermVo orderm  = ordermMapper.selectByprimaryKey(id);
		Cargoinformation  cargoinformation = new Cargoinformation();
		cargoinformation.setOrderId(id);
		List<Cargoinformation> cargoinformationLt = cargoinformationMapper.select(cargoinformation);
		Map<String,Object> map = new HashMap<String,Object>();
		map.put("orderm", orderm);
		map.put("cargoinformationLt", cargoinformationLt);
		return RestResult.success(map);
	}
}
