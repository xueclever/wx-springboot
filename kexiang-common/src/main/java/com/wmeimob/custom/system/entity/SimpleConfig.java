/*
* SimpleConfig.java
* EnTropyShiNe
* Copyright © 2016 ShiNez All Rights Reserved
* 作者：ShiNez
* QQ：136266602
* 2017-06-06 15:12 Created
*/ 
package com.wmeimob.custom.system.entity;

import java.io.Serializable;
import javax.persistence.*;

@Table(name = "simple_config")
public class SimpleConfig implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    private Integer mpid;

    /**
     * 系統設置名稱
     */
    @Column(name = "config_name")
    private String configName;

    /**
     * 系統設置數值
     */
    @Column(name = "config_value")
    private String configValue;

    /**
     * 系統設置 類型
     */
    @Column(name = "config_type")
    private Integer configType;

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
     * @return mpid
     */
    public Integer getMpid() {
        return mpid;
    }

    /**
     * @param mpid
     */
    public void setMpid(Integer mpid) {
        this.mpid = mpid;
    }

    /**
     * 获取系統設置名稱
     *
     * @return config_name - 系統設置名稱
     */
    public String getConfigName() {
        return configName;
    }

    /**
     * 设置系統設置名稱
     *
     * @param configName 系統設置名稱
     */
    public void setConfigName(String configName) {
        this.configName = configName;
    }

    /**
     * 获取系統設置數值
     *
     * @return config_value - 系統設置數值
     */
    public String getConfigValue() {
        return configValue;
    }

    /**
     * 设置系統設置數值
     *
     * @param configValue 系統設置數值
     */
    public void setConfigValue(String configValue) {
        this.configValue = configValue;
    }

    /**
     * 获取系統設置 類型
     *
     * @return config_type - 系統設置 類型
     */
    public Integer getConfigType() {
        return configType;
    }

    /**
     * 设置系統設置 類型
     *
     * @param configType 系統設置 類型
     */
    public void setConfigType(Integer configType) {
        this.configType = configType;
    }
}