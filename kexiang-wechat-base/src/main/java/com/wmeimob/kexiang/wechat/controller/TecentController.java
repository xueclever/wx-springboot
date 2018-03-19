package com.wmeimob.kexiang.wechat.controller;

import java.util.ArrayList;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;

import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.alibaba.fastjson.JSONObject;
import com.github.qcloudsms.SmsSingleSender;
import com.github.qcloudsms.SmsSingleSenderResult;
import com.google.common.base.Strings;
import com.wmeimob.custom.annotation.Logging;
import com.wmeimob.custom.config.CustomProp;
import com.wmeimob.custom.message.RestResult;
import com.wmeimob.custom.wechat.entity.WechatUser;

import lombok.extern.slf4j.Slf4j;
import redis.clients.jedis.Jedis;

@Logging
@RestController
@RequestMapping("tecent")
@Slf4j
public class TecentController {

	
	/**
	 * 短信接口
	 * @param request
	 * @param tel
	 * @return
	 */
	@RequestMapping("sendCode")
	public JSONObject sendCode(HttpServletRequest request,String tel) {
		
		
		WechatUser wechat = (WechatUser)SecurityContextHolder.getContext().getAuthentication().getPrincipal();
		
		Jedis jedis = new Jedis("127.0.0.1", 6379, 2000);
		
		if(Strings.isNullOrEmpty(tel)) {
			return RestResult.fail("电话不能为空");
		}
		//生成短信验证码
		int code = (int)((Math.random() *9 +1)*100000);
		jedis.set(wechat.getOpenid(), code+"");
		
		SmsSingleSenderResult  result =null;
		try {
			 	SmsSingleSender sender = new   SmsSingleSender(1400069836, "96e2b852951eb6a239961faa132b4f0a");
			    ArrayList<String> params = new ArrayList<String>();
			    params.add(code+"");
			    params.add("2");
			    result = sender.sendWithParam("86", tel, 89949, params, "", "", "");
			    System.out.println(result);
		    
		    if(result.result == 1014) {
		    	return RestResult.fail("发送失败，请联系开发人员");
		    }
		} catch (Exception e) {
			e.printStackTrace();
		}
		return  RestResult.success(result);
		
	}
}
