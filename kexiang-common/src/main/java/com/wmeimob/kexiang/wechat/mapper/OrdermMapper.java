/*
* OrdermMapper.java
* http://www.wmeimob.com
* Copyright © 2018 wmeimob All Rights Reserved
* 作者：???
* QQ：???
* E-Mail：???
* 2018-02-27 16:40 Created
*/ 
package com.wmeimob.kexiang.wechat.mapper;

import java.util.List;
import java.util.Map;

import com.wmeimob.custom.interfaces.Mapper;
import com.wmeimob.kexiang.wechat.entity.Orderm;
import com.wmeimob.kexiang.wechat.entity.OrdermVo;

public interface OrdermMapper extends Mapper<Orderm> {
	
	//查询运单信息
	public List<OrdermVo> selectOrder(Map<String,Object> map);
	
	//查询运单详情
	public OrdermVo selectByprimaryKey(Integer id);
	
}