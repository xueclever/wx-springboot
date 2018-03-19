package com.wmeimob.custom.interfaces;

import java.util.List;

/**
 *  数据权限查询接口
 * Created by Shinez on 2017/6/16.
 */
public interface DataRoleQueryDefineMapper<T> {

    List<T> selectForDataRole();
}
