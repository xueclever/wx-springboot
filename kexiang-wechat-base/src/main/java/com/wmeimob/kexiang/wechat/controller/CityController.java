package com.wmeimob.kexiang.wechat.controller;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;

import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.alibaba.fastjson.JSONObject;
import com.wmeimob.custom.annotation.Logging;
import com.wmeimob.custom.message.RestResult;
import com.wmeimob.custom.system.entity.CityInfo;
import com.wmeimob.custom.system.mapper.CityInfoMapper;
import com.wmeimob.custom.system.service.CityService;
import com.wmeimob.custom.wechat.entity.WechatUser;

import lombok.extern.slf4j.Slf4j;

@Logging
@RestController
@RequestMapping("city")
@Slf4j
public class CityController {

	@Resource
	private CityService cityService;
	
	@Resource
	private CityInfoMapper cityInfoMapper;
	
	@GetMapping("treeinfo")
	public JSONObject treeinfo(HttpServletRequest request) {
		
		//WechatUser wechat = (WechatUser)SecurityContextHolder.getContext().getAuthentication().getPrincipal();
		List<CityInfo> list = cityService.getCityInfoList();
		return RestResult.success(list);
	}
	
	@GetMapping("info")
	public JSONObject treeinfo(HttpServletRequest request,Integer type,Integer pId) {
		CityInfo cityInfo = new CityInfo();
		cityInfo.setType(type);
		cityInfo.setPid(pId);
		Map<String,Object> map = new HashMap<String,Object>();
		map.put("cityInfo", cityInfoMapper.select(cityInfo));
		return RestResult.success(map);	
	}
}
