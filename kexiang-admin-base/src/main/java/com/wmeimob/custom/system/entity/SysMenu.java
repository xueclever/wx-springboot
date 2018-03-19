/*
* SysMenu.java
* EnTropyShiNe
* Copyright © 2016 ShiNez All Rights Reserved
* 作者：ShiNez
* QQ：136266602
* 2017-06-06 17:34 Created
*/ 
package com.wmeimob.custom.system.entity;

import org.springframework.util.StringUtils;

import javax.persistence.*;
import java.io.Serializable;
import java.util.*;

@Table(name = "sys_menu")
public class SysMenu implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    /**
     * 父菜单
     */
    @Column(name = "parent_id")
    private Integer parentId;

    /**
     * 图标
     */
    private String icon;

    /**
     * 菜单编号
     */
    @Column(name = "menu_code")
    private String menuCode;

    /**
     * 菜单名称
     */
    @Column(name = "menu_name")
    private String menuName;

    @Transient
    private String excludeRole;

    public String getExcludeRole() {
        return excludeRole;
    }

    public void setExcludeRole(String excludeRole) {
        this.excludeRole = excludeRole;
    }

    /**
     * 菜单描述
     */
    @Column(name = "menu_describe")
    private String menuDescribe;

    /**
     * 菜单链接
     */
    @Column(name = "menu_href")
    private String menuHref;

    /**
     * 链接参数
     */
    @Column(name = "query_string")
    private String queryString;

    @Column(name = "created_at")
    private Date createdAt;

    @Column(name = "updated_at")
    private Date updatedAt;


    /**
     * 排序号
     */
    @Column(name = "order_no")
    private Integer orderNo;

    public Integer getOrderNo() {
        return orderNo;
    }

    public void setOrderNo(Integer orderNo) {
        this.orderNo = orderNo;
    }

    private static final long serialVersionUID = 1L;

    /**
     * @return id
     */
    public Integer getId() {
        return id;
    }

    /**
     * @param id
     */
    public void setId(Integer id) {
        this.id = id;
    }


    /**
     * 获取父菜单
     *
     * @return parent_id - 父菜单
     */
    public Integer getParentId() {
        return parentId;
    }

    /**
     * 设置父菜单
     *
     * @param parentId 父菜单
     */
    public void setParentId(Integer parentId) {
        this.parentId = parentId;
    }

    /**
     * 获取图标
     *
     * @return icon - 图标
     */
    public String getIcon() {
        return icon;
    }

    /**
     * 设置图标
     *
     * @param icon 图标
     */
    public void setIcon(String icon) {
        this.icon = icon;
    }

    /**
     * 获取菜单编号
     *
     * @return menu_code - 菜单编号
     */
    public String getMenuCode() {
        return menuCode;
    }

    /**
     * 设置菜单编号
     *
     * @param menuCode 菜单编号
     */
    public void setMenuCode(String menuCode) {
        this.menuCode = menuCode;
    }

    /**
     * 获取菜单名称
     *
     * @return menu_name - 菜单名称
     */
    public String getMenuName() {
        return menuName;
    }

    /**
     * 设置菜单名称
     *
     * @param menuName 菜单名称
     */
    public void setMenuName(String menuName) {
        this.menuName = menuName;
    }

    /**
     * 获取菜单描述
     *
     * @return menu_describe - 菜单描述
     */
    public String getMenuDescribe() {
        return menuDescribe;
    }

    /**
     * 设置菜单描述
     *
     * @param menuDescribe 菜单描述
     */
    public void setMenuDescribe(String menuDescribe) {
        this.menuDescribe = menuDescribe;
    }

    /**
     * 获取菜单链接
     *
     * @return menu_href - 菜单链接
     */
    public String getMenuHref() {
        return menuHref;
    }

    /**
     * 设置菜单链接
     *
     * @param menuHref 菜单链接
     */
    public void setMenuHref(String menuHref) {
        this.menuHref = menuHref;
    }

    /**
     * 获取链接参数
     *
     * @return query_string - 链接参数
     */
    public String getQueryString() {
        return queryString;
    }

    /**
     * 设置链接参数
     *
     * @param queryString 链接参数
     */
    public void setQueryString(String queryString) {
        this.queryString = queryString;
    }

    /**
     * @return created_at
     */
    public Date getCreatedAt() {
        return createdAt;
    }

    /**
     * @param createdAt
     */
    public void setCreatedAt(Date createdAt) {
        this.createdAt = createdAt;
    }

    /**
     * @return updated_at
     */
    public Date getUpdatedAt() {
        return updatedAt;
    }

    /**
     * @param updatedAt
     */
    public void setUpdatedAt(Date updatedAt) {
        this.updatedAt = updatedAt;
    }


    /**
     * 子菜单
     */
    @Transient
    private List<SysMenu> sysMenus;


    /**
     * 所属角色（DTO）
     */
    @Transient
    private Integer roleId;

    public Integer getRoleId() {
        return roleId;
    }

    public void setRoleId(Integer roleId) {
        this.roleId = roleId;
    }

    public List<SysMenu> getSysMenus() {
        return sysMenus;
    }

    public void setSysMenus(List<SysMenu> sysMenus) {
        this.sysMenus = sysMenus;
    }


    public static Map<String,SysMenu> convertMenuIconMap(List<SysMenu> fnList) {
        Map<String,SysMenu> map = new HashMap<>();
        Iterator<SysMenu> iterator = fnList.iterator();
        Iterator<SysMenu> iteratorChild = null;
        SysMenu sysFnRoot = null;
        SysMenu sysFnChild = null;
        while (iterator.hasNext()){
            sysFnRoot = iterator.next();
            if (sysFnRoot.getSysMenus()!=null&&sysFnRoot.getSysMenus().size()>0){
                iteratorChild = sysFnRoot.getSysMenus().iterator();
                while (iteratorChild.hasNext()){
                    sysFnChild = iteratorChild.next();
                    map.put(sysFnChild.getMenuHref()+(StringUtils.isEmpty(sysFnChild.getQueryString())?"":"?"+sysFnChild.getQueryString()),sysFnChild);
                }
            }
        }
        return map;
    }
}