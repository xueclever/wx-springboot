/*
* CityInfoMapper.java
* EnTropyShiNe
* Copyright © 2017 ShiNez All Rights Reserved
* 作者：ShiNez
* QQ：136266602
* 2017-08-08 15:13 Created
*/ 
package com.wmeimob.custom.system.mapper;

import com.wmeimob.custom.interfaces.Mapper;
import com.wmeimob.custom.system.entity.CityInfo;
import org.apache.ibatis.annotations.ResultMap;
import org.apache.ibatis.annotations.Select;

import java.util.List;

public interface CityInfoMapper extends Mapper<CityInfo> {

    /**
     * 根据parentid查询
     * @param pid
     * @return
     */
    @Select("SELECT * FROM city_info WHERE  pid = #{pid} ORDER BY `id`")
    @ResultMap("TreeMap")
    List<CityInfo> selectByParentId(Integer pid);


    /**
     * 根据类型查询
     * @param type
     * @return
     */
    @Select("SELECT * FROM city_info WHERE `type` = #{type} ORDER BY `id`")
    @ResultMap("TreeMap")
    List<CityInfo> selectByType(Integer type);
}