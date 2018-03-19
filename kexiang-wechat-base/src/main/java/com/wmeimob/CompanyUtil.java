package com.wmeimob;

import java.util.ArrayList;
import java.util.List;

import org.json.JSONArray;

import com.alibaba.fastjson.JSONObject;
import com.wmeimob.custom.message.RestResult;
import com.wmeimob.kexiang.wechat.core.HttpRequest;

public class CompanyUtil {

	public static void main(String[] args) {
		String url = "http://sstest.consignor.com/ship/ShipmentServerModule.dll";
    	String param = "actor=63&command=GetProducts&key=sample";
    	//org.json.JSONObject json = new org.json.JSONObject(HttpRequest.sendPost(url, param));
    	
    	JSONObject json = JSONObject.parseObject(HttpRequest.sendPost(url, param));
    	
    	com.alibaba.fastjson.JSONArray jArray1  = JSONObject.parseArray(json.get("Carriers").toString());
    	//System.out.print(json);
    	
    	for(int i=0;i<jArray1.size();i++) {
    		com.alibaba.fastjson.JSONArray jArray2 = JSONObject.parseArray(JSONObject.parseObject(jArray1.get(i).toString()).getString("Subcarriers"));
    		for(int j=0;j<jArray2.size();j++) {
    			com.alibaba.fastjson.JSONArray jArray3 = JSONObject.parseArray(JSONObject.parseObject(jArray2.get(j).toString()).getString("Products"));
    			for(int k=0;k<jArray3.size();k++) {
    				JSONObject jPro = JSONObject.parseObject(jArray3.get(k).toString());
    				System.out.println(jPro.getIntValue("ProdConceptID"));
    				System.out.println(jPro.getString("ProdName"));
    			}
    		}
    	}
    	
    	
//    	JSONArray carriers = new JSONArray(json.get("Carriers"));
//    	JSONArray subcarriers = new JSONArray(new org.json.JSONObject(carriers.get(0)).get("Subcarriers"));
//    	
//    	JSONArray products = new JSONArray(new org.json.JSONObject(subcarriers.get(0)).get("Products"));
//    	List<JSONObject> companyLt = new ArrayList<JSONObject>();
//    	for(int i=0;i<products.length();i++) {
//    		JSONObject json1 = new JSONObject();
//    		json1.put("prodConceptID", new org.json.JSONObject(products.get(i)).get("ProdConceptID"));
//    		json1.put("prodName", new org.json.JSONObject(products.get(i)).get("ProdName"));
//    		companyLt.add(json1);
//    	}
	}
}
