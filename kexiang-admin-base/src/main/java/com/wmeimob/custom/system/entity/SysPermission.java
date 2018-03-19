/*
* SysPermission.java
* EnTropyShiNe
* Copyright © 2016 ShiNez All Rights Reserved
* 作者：ShiNez
* QQ：136266602
* 2017-06-06 17:34 Created
*/ 
package com.wmeimob.custom.system.entity;

import org.springframework.security.access.ConfigAttribute;

import javax.persistence.*;
import java.util.Date;
import java.util.List;

@Table(name = "sys_permission")
public class SysPermission implements  ConfigAttribute {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column(name = "resource_id")
    private Integer resourceId;

    @Column(name = "role_id")
    private Integer roleId;

    @Column(name = "allow_get")
    private Boolean allowGet;

    @Column(name = "allow_post")
    private Boolean allowPost;

    @Column(name = "allow_put")
    private Boolean allowPut;

    @Column(name = "allow_delete")
    private Boolean allowDelete;

    @Column(name = "updated_at")
    private Date updatedAt;

    @Column(name = "created_at")
    private Date createdAt;

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
     * @return resource_id
     */
    public Integer getResourceId() {
        return resourceId;
    }

    /**
     * @param resourceId
     */
    public void setResourceId(Integer resourceId) {
        this.resourceId = resourceId;
    }

    /**
     * @return role_id
     */
    public Integer getRoleId() {
        return roleId;
    }

    /**
     * @param roleId
     */
    public void setRoleId(Integer roleId) {
        this.roleId = roleId;
    }

    /**
     * @return allow_get
     */
    public Boolean getAllowGet() {
        return allowGet;
    }

    /**
     * @param allowGet
     */
    public void setAllowGet(Boolean allowGet) {
        this.allowGet = allowGet;
    }

    /**
     * @return allow_post
     */
    public Boolean getAllowPost() {
        return allowPost;
    }

    /**
     * @param allowPost
     */
    public void setAllowPost(Boolean allowPost) {
        this.allowPost = allowPost;
    }

    /**
     * @return allow_put
     */
    public Boolean getAllowPut() {
        return allowPut;
    }

    /**
     * @param allowPut
     */
    public void setAllowPut(Boolean allowPut) {
        this.allowPut = allowPut;
    }

    /**
     * @return allow_delete
     */
    public Boolean getAllowDelete() {
        return allowDelete;
    }

    /**
     * @param allowDelete
     */
    public void setAllowDelete(Boolean allowDelete) {
        this.allowDelete = allowDelete;
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


    /**
     * 角色code
     */
    @Transient
    private String roleCode;

    /**
     * 资源路径
     */
    @Transient
    private String resourceUrl;

    /**
     * 角色名称
     */
    @Transient
    private String roleName;

    /**
     * 资源名称
     */
    @Transient
    private String resourceName;

    /**
     * 无效权限标识
     */
    @Transient
    private boolean invalidPermission;


    /**
     * 权限集合（用于前台传输集合）
     */
    @Transient
    private List<SysPermission> permissions;

    public List<SysPermission> getPermissions() {
        return permissions;
    }

    public void setPermissions(List<SysPermission> permissions) {
        this.permissions = permissions;
    }

    public boolean isInvalidPermission() {
        return invalidPermission;
    }

    public void setInvalidPermission(boolean invalidPermission) {
        this.invalidPermission = invalidPermission;
    }

    public String getRoleCode() {
        return roleCode;
    }

    public void setRoleCode(String roleCode) {
        this.roleCode = roleCode;
    }

    public String getResourceUrl() {
        return resourceUrl;
    }

    public void setResourceUrl(String resourceUrl) {
        this.resourceUrl = resourceUrl;
    }

    public String getRoleName() {
        return roleName;
    }

    public void setRoleName(String roleName) {
        this.roleName = roleName;
    }

    public String getResourceName() {
        return resourceName;
    }

    public void setResourceName(String resourceName) {
        this.resourceName = resourceName;
    }

    @Override
    public String getAttribute() {
        return getRoleCode();
    }
}