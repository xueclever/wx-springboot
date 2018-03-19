package com.wmeimob.kexiang.wechat.controller;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;

import org.json.JSONArray;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.alibaba.fastjson.JSONObject;
import com.google.gson.JsonObject;
import com.wmeimob.custom.annotation.Logging;
import com.wmeimob.custom.message.RestResult;
import com.wmeimob.kexiang.wechat.core.HttpRequest;

import lombok.extern.slf4j.Slf4j;

@Logging
@RestController
@RequestMapping("company")
@Slf4j
public class CompanyController {

	@RequestMapping("info")
	public JSONObject info(HttpServletRequest request) {
		String url = "http://www.shipmentserver.cn/shipmentservermodule.dll";
    	String param = "actor=67&command=GetProducts&key=Slqg7UWGrF";
    	JSONObject json = JSONObject.parseObject(HttpRequest.sendPost(url, param));
    	
    	com.alibaba.fastjson.JSONArray jArray1  = JSONObject.parseArray(json.get("Carriers").toString());
    	
    	List<Map<String,Object>> companyLt = new ArrayList<Map<String,Object>>();
    	
    	Map<String,Object> cMap = new HashMap<String,Object>();
    	
    	
    	
    	for(int i=0;i<jArray1.size();i++) {
    		com.alibaba.fastjson.JSONArray jArray2 = JSONObject.parseArray(JSONObject.parseObject(jArray1.get(i).toString()).getString("Subcarriers"));
    		for(int j=0;j<jArray2.size();j++) {
    			com.alibaba.fastjson.JSONArray jArray3 = JSONObject.parseArray(JSONObject.parseObject(jArray2.get(j).toString()).getString("Products"));
    			for(int k=0;k<jArray3.size();k++) {
    				Map<String,Object> map = new HashMap<String,Object>();
    				JSONObject jPro = JSONObject.parseObject(jArray3.get(k).toString());
    				map.put("prodConceptID", jPro.getIntValue("ProdConceptID"));
    				map.put("prodName", jPro.getString("ProdName"));
    				companyLt.add(map);
    			}
    		}
    	}
    	
    	cMap.put("companyLt", companyLt);
		return RestResult.success(cMap);
	}
}
