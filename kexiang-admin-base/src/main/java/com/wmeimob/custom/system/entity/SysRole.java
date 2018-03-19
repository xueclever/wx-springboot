/*
* SysRole.java
* EnTropyShiNe
* Copyright © 2016 ShiNez All Rights Reserved
* 作者：ShiNez
* QQ：136266602
* 2017-06-06 17:34 Created
*/ 
package com.wmeimob.custom.system.entity;

import org.springframework.security.core.GrantedAuthority;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Date;

@Table(name = "sys_role")
public class SysRole implements Serializable, GrantedAuthority {


    public static final Integer ROLE_TYPE_SUPER = 10003;
    public static final Integer ROLE_TYPE_NORMAL = 10004;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    public SysRole(){}


    public SysRole(SysRole sysRole) {
        this.id=sysRole.getId();
        this.roleCode = sysRole.getRoleCode();
    }


    /**
     * 角色编号
     */
    @Column(name = "role_code")
    private String roleCode;

    /**
     * 角色名
     */
    @Column(name = "role_name")
    private String roleName;

    /**
     * 角色类型 1母账号角色 2子账号角色 (未使用)
     */
    @Column(name = "role_type")
    private Integer roleType;

    /**
     * 是否启用
     */
    @Column(name = "is_enable")
    private Boolean isEnable;

    @Column(name = "updated_at")
    private Date updatedAt;

    @Column(name = "created_at")
    private Date createdAt;

    @Column(name = "created_role")
    private Integer createdRole;

    @Column(name = "created_user")
    private Integer createdUser;

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
     * 获取角色编号
     *
     * @return role_code - 角色编号
     */
    public String getRoleCode() {
        return roleCode;
    }

    /**
     * 设置角色编号
     *
     * @param roleCode 角色编号
     */
    public void setRoleCode(String roleCode) {
        this.roleCode = roleCode;
    }

    /**
     * 获取角色名
     *
     * @return role_name - 角色名
     */
    public String getRoleName() {
        return roleName;
    }

    /**
     * 设置角色名
     *
     * @param roleName 角色名
     */
    public void setRoleName(String roleName) {
        this.roleName = roleName;
    }

    /**
     * 获取角色类型 1母账号角色 2子账号角色 (未使用)
     *
     * @return role_type - 角色类型 1母账号角色 2子账号角色 (未使用)
     */
    public Integer getRoleType() {
        return roleType;
    }

    /**
     * 设置角色类型 1母账号角色 2子账号角色 (未使用)
     *
     * @param roleType 角色类型 1母账号角色 2子账号角色 (未使用)
     */
    public void setRoleType(Integer roleType) {
        this.roleType = roleType;
    }

    /**
     * 获取是否启用
     *
     * @return is_enable - 是否启用
     */
    public Boolean getIsEnable() {
        return isEnable;
    }

    /**
     * 设置是否启用
     *
     * @param isEnable 是否启用
     */
    public void setIsEnable(Boolean isEnable) {
        this.isEnable = isEnable;
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


    public Integer getCreatedRole() {
        return createdRole;
    }

    public void setCreatedRole(Integer createdRole) {
        this.createdRole = createdRole;
    }


    public Integer getCreatedUser() {
        return createdUser;
    }

    public void setCreatedUser(Integer createdUser) {
        this.createdUser = createdUser;
    }

    @Override
    public String getAuthority() {
        return getRoleCode();
    }
}