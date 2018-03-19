/*
* WechatUserMapper.java
* EnTropyShiNe
* Copyright © 2016 ShiNez All Rights Reserved
* 作者：ShiNez
* QQ：136266602
* 2017-06-06 15:12 Created
*/ 
package com.wmeimob.custom.wechat.mapper;

import com.wmeimob.custom.wechat.entity.WechatUser;
import com.wmeimob.custom.interfaces.Mapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.ResultMap;
import org.apache.ibatis.annotations.Select;

import java.util.List;

public interface WechatUserMapper extends Mapper<WechatUser> {
    int insertIgnore(WechatUser wechatUser);


    @Select("SELECT * FROM wechat_user WHERE  id = ( SELECT MAX(`id`) FROM wechat_user WHERE appid= #{appid}) AND appid = #{appid}")
    @ResultMap("BaseResultMap")
    WechatUser selectLastRecordByAppid(String appid);

    @Select("SELECT * FROM wechat_user WHERE appid = #{appid} limit #{startIndex},#{pageSize}")
    List<WechatUser> selectByPage(@Param("appid") String paramUser, @Param("startIndex") int startIndex, @Param("pageSize") int pageSize);

    void insertOpenidList(List<WechatUser> wechatUsers);
}