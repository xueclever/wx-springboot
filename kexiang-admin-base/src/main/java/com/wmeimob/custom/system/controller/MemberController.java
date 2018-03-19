package com.wmeimob.custom.system.controller;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.alibaba.fastjson.JSONObject;
import com.github.pagehelper.PageInfo;
import com.google.common.base.Strings;
import com.wmeimob.custom.annotation.Logging;
import com.wmeimob.custom.message.RestResult;
import com.wmeimob.kexiang.wechat.entity.Member;
import com.wmeimob.kexiang.wechat.mapper.MemberMapper;

import lombok.extern.slf4j.Slf4j;

@Logging
@RestController
@RequestMapping("member")
@Slf4j
public class MemberController {

	@Resource
	private MemberMapper memberMapper;
	
	@RequestMapping("info")
	public JSONObject info(HttpServletRequest request,Member member) {
		
		Map<String,Object> cMap = new HashMap<String,Object>();
		cMap.put("memberType", member.getMemberType());
		cMap.put("memberCompany", member.getMemberCompany());
		
		List<Member> list =	memberMapper.selectByCondition(cMap);
		Map<String, Object> map =new HashMap<String,Object>();
		map.put("page", new PageInfo<>(list));
		return RestResult.success(map);
	}
	
	@PostMapping("save")
	public JSONObject save(HttpServletRequest request,Member member) {
		
		if(Strings.isNullOrEmpty(member.getMemberNo())) {
			return RestResult.fail("请填写用户编号");
		}
		
		if(Strings.isNullOrEmpty(member.getMemberCompany())) {
			return RestResult.fail("请填写公司名称");
		}
		
		if(Strings.isNullOrEmpty(member.getMemberName())) {
			return RestResult.fail("请填写姓名");
		}
		
		if(Strings.isNullOrEmpty(member.getTelphone())) {
			return RestResult.fail("请填写手机号码");
		}
		
		Member meb = new Member();
		meb.setTelphone(member.getTelphone());
		
		List<Member> meList =	memberMapper.select(meb);
		if(meList.size()>0) {
			return RestResult.fail("手机号码已存在");
		}
		
		memberMapper.insertSelective(member);
		
		return RestResult.success();
	}
	
	@DeleteMapping("del/{id}")
	public JSONObject del(HttpServletRequest request,@PathVariable Integer id) {
		memberMapper.deleteByPrimaryKey(id);
		return RestResult.success();
	}
		
}
