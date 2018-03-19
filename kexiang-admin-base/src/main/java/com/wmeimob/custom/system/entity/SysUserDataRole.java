/*
* SysUserDataRole.java
* EnTropyShiNe
* Copyright © 2017 ShiNez All Rights Reserved
* 作者：ShiNez
* QQ：136266602
* 2017-01-16 16:53 Created
*/
package com.wmeimob.custom.system.entity;
import javax.persistence.*;
import java.io.Serializable;
import java.util.List;


/**
 * 数据权限配置类
 */
@Table(name = "sys_user_data_role")
public class SysUserDataRole implements Serializable {


    public static final String QUERY_DATA_ROLE_METHOD = "selectForDataRole";

    public static final Integer DATA_ROLE_TYPE_ADMIN=1;

    public static final Integer DATA_ROLE_TYPE_CHILDREN=0;


    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;


    /**
     * 管理员id
     */
    @Column(name = "sys_user_id")
    private Integer sysUserId;

    /**
     * 表名
     */
    @Column(name = "prefix_name")
    private String prefixName;

    /**
     * 列名
     */
    @Column(name = "column_name")
    private String columnName;

    /**
     * 值
     */
    @Column(name = "column_value")
    private String columnValue;

    @Column(name = "data_role_code")
    private String dataRoleCode;


    /**
     * 继承的用户id
     */
    @Column(name = "extends_user")
    private Integer extendsUser;


    /**
     * 权限说明
     */
    @Transient
    private String roleName;

    /**
     * 权限级别
     */
    @Transient
    private Integer level;

    /**
     * 数据权限初始化连接
     */
    @Transient
    private String url;

    /**
     * 权限值select
     */
    @Transient
    private List<Object> dataSelects;


    /**
     * 数据权限数组
     */
    @Transient
    private SysUserDataRole[] dataRoles;

    public SysUserDataRole[] getDataRoles() {
        return dataRoles;
    }

    public void setDataRoles(SysUserDataRole[] dataRoles) {
        this.dataRoles = dataRoles;
    }


    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public String getRoleName() {
        return roleName;
    }

    public void setRoleName(String roleName) {
        this.roleName = roleName;
    }

    public Integer getLevel() {
        return level;
    }

    public void setLevel(Integer level) {
        this.level = level;
    }

    public List<Object> getDataSelects() {
        return dataSelects;
    }

    public void setDataSelects(List<Object> dataSelects) {
        this.dataSelects = dataSelects;
    }

    public String getDataRoleCode() {
        return dataRoleCode;
    }

    public void setDataRoleCode(String dataRoleCode) {
        this.dataRoleCode = dataRoleCode;
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
     * 获取管理员id
     *
     * @return sys_user_id - 管理员id
     */
    public Integer getSysUserId() {
        return sysUserId;
    }

    /**
     * 设置管理员id
     *
     * @param sysUserId 管理员id
     */
    public void setSysUserId(Integer sysUserId) {
        this.sysUserId = sysUserId;
    }

    public String getPrefixName() {
        return prefixName;
    }

    public void setPrefixName(String prefixName) {
        this.prefixName = prefixName;
    }

    /**
     * 获取列名
     *
     * @return column_name - 列名
     */
    public String getColumnName() {
        return columnName;
    }

    /**
     * 设置列名
     *
     * @param columnName 列名
     */
    public void setColumnName(String columnName) {
        this.columnName = columnName;
    }

    /**
     * 获取值
     *
     * @return column_value - 值
     */
    public String getColumnValue() {
        return columnValue;
    }

    /**
     * 设置值
     *
     * @param columnValue 值
     */
    public void setColumnValue(String columnValue) {
        this.columnValue = columnValue;
    }


    public Integer getExtendsUser() {
        return extendsUser;
    }

    public void setExtendsUser(Integer extendsUser) {
        this.extendsUser = extendsUser;
    }

}