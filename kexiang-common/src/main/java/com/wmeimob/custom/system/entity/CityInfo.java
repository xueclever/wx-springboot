/*
* CityInfo.java
* EnTropyShiNe
* Copyright © 2017 ShiNez All Rights Reserved
* 作者：ShiNez
* QQ：136266602
* 2017-08-08 15:13 Created
*/ 
package com.wmeimob.custom.system.entity;

import javax.persistence.*;
import java.io.Serializable;
import java.util.List;

@Table(name = "city_info")
public class CityInfo implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    private String name;

    private Integer type;

    private Integer pid;

    @Transient
    private Boolean checked;

    @Transient
    private Boolean checkAll;

    @Transient
    private List<CityInfo> children;

    public Boolean getChecked() {
        return checked;
    }

    public void setChecked(Boolean checked) {
        this.checked = checked;
    }

    public Boolean getCheckAll() {
        return checkAll;
    }

    public void setCheckAll(Boolean checkAll) {
        this.checkAll = checkAll;
    }

    public List<CityInfo> getChildren() {
        return children;
    }

    public void setChildren(List<CityInfo> children) {
        this.children = children;
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
     * @return name
     */
    public String getName() {
        return name;
    }

    /**
     * @param name
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * @return type
     */
    public Integer getType() {
        return type;
    }

    /**
     * @param type
     */
    public void setType(Integer type) {
        this.type = type;
    }

    /**
     * @return pid
     */
    public Integer getPid() {
        return pid;
    }

    /**
     * @param pid
     */
    public void setPid(Integer pid) {
        this.pid = pid;
    }
}