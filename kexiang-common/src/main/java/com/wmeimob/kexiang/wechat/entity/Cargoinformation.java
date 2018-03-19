/*
* Cargoinformation.java
* http://www.wmeimob.com
* Copyright © 2018 wmeimob All Rights Reserved
* 作者：???
* QQ：???
* E-Mail：???
* 2018-02-27 16:40 Created
*/ 
package com.wmeimob.kexiang.wechat.entity;

import java.io.Serializable;
import java.math.BigDecimal;
import javax.persistence.*;

@Table(name = "cargoinformation")
public class Cargoinformation implements Serializable {
    /**
     * 主键
     */
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    /**
     * 订单id
     */
    @Column(name = "order_id")
    private Integer orderId;

    /**
     * 货物名称
     */
    @Column(name = "cargo_name")
    private String cargoName;

    /**
     * 数量
     */
    private Integer count;

    /**
     * 单位（1.件.2.吨.3.立方）
     */
    private Integer unit;

    /**
     * 运费单价
     */
    @Column(name = "freight_unit")
    private BigDecimal freightUnit;

    private static final long serialVersionUID = 1L;

    /**
     * 获取主键
     *
     * @return id - 主键
     */
    public Integer getId() {
        return id;
    }

    /**
     * 设置主键
     *
     * @param id 主键
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * 获取订单id
     *
     * @return order_id - 订单id
     */
    public Integer getOrderId() {
        return orderId;
    }

    /**
     * 设置订单id
     *
     * @param orderId 订单id
     */
    public void setOrderId(Integer orderId) {
        this.orderId = orderId;
    }

    /**
     * 获取货物名称
     *
     * @return cargo_name - 货物名称
     */
    public String getCargoName() {
        return cargoName;
    }

    /**
     * 设置货物名称
     *
     * @param cargoName 货物名称
     */
    public void setCargoName(String cargoName) {
        this.cargoName = cargoName;
    }

    /**
     * 获取数量
     *
     * @return count - 数量
     */
    public Integer getCount() {
        return count;
    }

    /**
     * 设置数量
     *
     * @param count 数量
     */
    public void setCount(Integer count) {
        this.count = count;
    }

    /**
     * 获取单位（1.件.2.吨.3.立方）
     *
     * @return unit - 单位（1.件.2.吨.3.立方）
     */
    public Integer getUnit() {
        return unit;
    }

    /**
     * 设置单位（1.件.2.吨.3.立方）
     *
     * @param unit 单位（1.件.2.吨.3.立方）
     */
    public void setUnit(Integer unit) {
        this.unit = unit;
    }

    /**
     * 获取运费单价
     *
     * @return freight_unit - 运费单价
     */
    public BigDecimal getFreightUnit() {
        return freightUnit;
    }

    /**
     * 设置运费单价
     *
     * @param freightUnit 运费单价
     */
    public void setFreightUnit(BigDecimal freightUnit) {
        this.freightUnit = freightUnit;
    }
}