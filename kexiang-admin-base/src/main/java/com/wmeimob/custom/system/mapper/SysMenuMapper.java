/*
* SysMenuMapper.java
* EnTropyShiNe
* Copyright © 2016 ShiNez All Rights Reserved
* 作者：ShiNez
* QQ：136266602
* 2017-06-06 17:34 Created
*/ 
package com.wmeimob.custom.system.mapper;

import com.wmeimob.custom.system.entity.SysMenu;
import com.wmeimob.custom.interfaces.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface SysMenuMapper extends Mapper<SysMenu> {

    /**
     * 查询菜单，分级
     * @param roleId
     * @return
     */
    List<SysMenu> selectMenus(@Param("roleId") Integer roleId);

    /**
     * 查询全部菜单，包括是否拥有权限的菜单
     * @param roleId
     * @return
     */
    List<SysMenu> selectMenusSimple(@Param("roleId") Integer roleId);



    /**
     * 查询子账号全部菜单，包括是否拥有权限的菜单
     * @param roleId
     * @return
     */
    List<SysMenu> selectChildrenMenusSimple(@Param("superRoleId") Integer superRoleId, @Param("roleId") Integer roleId);

    int updateList(List<SysMenu> sysMenus);
}