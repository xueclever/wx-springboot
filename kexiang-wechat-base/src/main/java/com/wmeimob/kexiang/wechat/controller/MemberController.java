package com.wmeimob.kexiang.wechat.controller;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;

import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.alibaba.fastjson.JSONObject;
import com.google.common.base.Strings;
import com.wmeimob.custom.annotation.Logging;
import com.wmeimob.custom.message.RestResult;
import com.wmeimob.custom.wechat.entity.WechatUser;
import com.wmeimob.kexiang.wechat.entity.Member;
import com.wmeimob.kexiang.wechat.mapper.MemberMapper;

import lombok.extern.slf4j.Slf4j;
import redis.clients.jedis.Jedis;

@Logging
@RestController
@RequestMapping("member")
@Slf4j
public class MemberController {
	
	@Resource
	private MemberMapper memberMapper;
	
	/**
	 * 判断是否身份验证
	 */
	@RequestMapping("auth")
	public JSONObject auth(HttpServletRequest request) {
		WechatUser wechat = (WechatUser)SecurityContextHolder.getContext().getAuthentication().getPrincipal();
		
		Map<String,Object> map = new HashMap<String,Object>();
		
		Member member =new Member();
		member.setOpenid(wechat.getOpenid());
		List<Member> list =	memberMapper.select(member);
		
		if(list.size() == 0) {
			map.put("auth", 1);
		}else {
			map.put("auth", 0);
		}
		
		return RestResult.success(map);
	}
	
	/**
	 * 用户身份绑定
	 * @param request
	 * @return
	 */
	@PostMapping("bingding")
	public JSONObject bingding(HttpServletRequest request,String code,String tel) {
		
		Jedis jedis = new Jedis("127.0.0.1", 6379, 2000);
		
		WechatUser wechat = (WechatUser)SecurityContextHolder.getContext().getAuthentication().getPrincipal();
		
		if(Strings.isNullOrEmpty(tel)) {
			return RestResult.fail("请填写手机号");
		}
		
		if(Strings.isNullOrEmpty(code)) {
			return RestResult.fail("请填写验证码");
		}
		
		if(!code.equals(jedis.get(wechat.getOpenid()))) {
			return RestResult.fail("验证码错误");
		}
		
		Member member =new Member();
		member.setTelphone(tel);
		List<Member> list = memberMapper.select(member);
		if(list.size() == 0) {
			return RestResult.fail("白名单中不存在该用户");
		}
		member = list.get(0);
		
		member.setOpenid(wechat.getOpenid());
		member.setHeadImgUrl(wechat.getHeadimgurl());
		member.setNickName(wechat.getNickname());
		
		memberMapper.updateByPrimaryKeySelective(member);
		
		
		return RestResult.success();
	}
	
	/**
	 * 用户基础信息查询
	 * @param request
	 * @return
	 */
	@RequestMapping("info")
	public JSONObject info(HttpServletRequest request) {
		
		WechatUser wechat = (WechatUser)SecurityContextHolder.getContext().getAuthentication().getPrincipal();
		
		Map<String,Object> map = new HashMap<String,Object>();
		
		Member member =new Member();
		member.setOpenid(wechat.getOpenid());
		List<Member> list = memberMapper.select(member);
		if(list.size() == 0) {
			return RestResult.fail("白名单中不存在该用户");
		}
		member = list.get(0);
		map.put("member", member);
		return RestResult.success(map);
		
	}
}
