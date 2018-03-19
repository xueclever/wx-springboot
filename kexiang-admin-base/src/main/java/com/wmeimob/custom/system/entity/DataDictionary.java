/*
* DataDictionary.java
* EnTropyShiNe
* Copyright © 2016 ShiNez All Rights Reserved
* 作者：ShiNez
* QQ：136266602
* 2017-06-06 17:34 Created
*/ 
package com.wmeimob.custom.system.entity;

import javax.persistence.*;
import java.io.Serializable;

@Table(name = "data_dictionary")
public class DataDictionary implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    /**
     * 代表含义
     */
    @Column(name = "dict_name")
    private String dictName;

    /**
     * 详细解释
     */
    private String description;

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
     * 获取代表含义
     *
     * @return dict_name - 代表含义
     */
    public String getDictName() {
        return dictName;
    }

    /**
     * 设置代表含义
     *
     * @param dictName 代表含义
     */
    public void setDictName(String dictName) {
        this.dictName = dictName;
    }

    /**
     * 获取详细解释
     *
     * @return desc - 详细解释
     */
    public String getDescription() {
        return description;
    }

    /**
     * 设置详细解释
     *
     * @param desc 详细解释
     */
    public void setDescription(String desc) {
        this.description = desc;
    }
}