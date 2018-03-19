/*
* CargoinformationMapper.java
* http://www.wmeimob.com
* Copyright © 2018 wmeimob All Rights Reserved
* 作者：???
* QQ：???
* E-Mail：???
* 2018-02-27 16:40 Created
*/ 
package com.wmeimob.kexiang.wechat.mapper;

import org.apache.ibatis.annotations.Delete;

import com.wmeimob.custom.interfaces.Mapper;
import com.wmeimob.kexiang.wechat.entity.Cargoinformation;

public interface CargoinformationMapper extends Mapper<Cargoinformation> {
	
	@Delete("delete from cargoinformation where order_id = #{orderId}")
	void del(Integer orderId);
}