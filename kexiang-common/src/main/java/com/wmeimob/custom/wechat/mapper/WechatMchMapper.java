/*
* WechatMchMapper.java
* EnTropyShiNe
* Copyright © 2016 ShiNez All Rights Reserved
* 作者：ShiNez
* QQ：136266602
* 2017-06-06 15:12 Created
*/ 
package com.wmeimob.custom.wechat.mapper;

import com.wmeimob.custom.wechat.entity.WechatMch;
import com.wmeimob.custom.interfaces.Mapper;

public interface WechatMchMapper extends Mapper<WechatMch> {

    String selectMchKeyByAppid(String appid);
}