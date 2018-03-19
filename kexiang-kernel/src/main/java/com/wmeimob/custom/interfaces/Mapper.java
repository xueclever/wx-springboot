package com.wmeimob.custom.interfaces;


import tk.mybatis.mapper.common.MySqlMapper;

/**
 * Created by Shinez on 2016/11/15.
 */
public interface Mapper<T> extends tk.mybatis.mapper.common.Mapper<T>, MySqlMapper<T> {
}
