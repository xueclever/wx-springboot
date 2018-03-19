/*
* MemberMapper.java
* http://www.wmeimob.com
* Copyright © 2018 wmeimob All Rights Reserved
* 作者：???
* QQ：???
* E-Mail：???
* 2018-02-27 16:25 Created
*/ 
package com.wmeimob.kexiang.wechat.mapper;

import java.util.List;
import java.util.Map;

import com.wmeimob.custom.interfaces.Mapper;
import com.wmeimob.kexiang.wechat.entity.Member;

public interface MemberMapper extends Mapper<Member> {
	
	/**
	 * 通过条件查询用户信息 
	 * @param map
	 * @return
	 */
	public List<Member> selectByCondition(Map<String,Object> map);
}