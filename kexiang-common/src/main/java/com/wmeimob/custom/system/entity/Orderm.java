/*
* Orderm.java
* http://www.wmeimob.com
* Copyright © 2018 wmeimob All Rights Reserved
* 作者：???
* QQ：???
* E-Mail：???
* 2018-02-27 16:25 Created
*/ 
package com.wmeimob.custom.system.entity;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;
import javax.persistence.*;

@Table(name = "orderm")
public class Orderm implements Serializable {
    /**
     * 主键
     */
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    /**
     * 收件人
     */
    @Column(name = "rec_person")
    private String recPerson;

    /**
     * 收件人联系电话
     */
    @Column(name = "rec_tel")
    private String recTel;

    /**
     * 收件人单位名称
     */
    @Column(name = "rec_unit_name")
    private String recUnitName;

    /**
     * 省id
     */
    @Column(name = "rec_province_id")
    private Integer recProvinceId;

    /**
     * 省
     */
    @Column(name = "rec_province")
    private String recProvince;

    /**
     * 市id
     */
    @Column(name = "rec_city_id")
    private Integer recCityId;

    /**
     * 市
     */
    @Column(name = "rec_city")
    private String recCity;

    /**
     * 区id
     */
    @Column(name = "rec_area_id")
    private Integer recAreaId;

    /**
     * 区
     */
    @Column(name = "rec_area")
    private String recArea;

    /**
     * 收件人详细地址
     */
    @Column(name = "rec_detail_adress")
    private String recDetailAdress;

    /**
     * 交货方式（1.直送、0.自提）
     */
    @Column(name = "rec_mode")
    private Integer recMode;

    /**
     * 发件人
     */
    @Column(name = "mail_person")
    private String mailPerson;

    /**
     * 发件人联系电话
     */
    @Column(name = "mail_tel")
    private String mailTel;

    /**
     * 发件人单位名称
     */
    @Column(name = "mail_unit_name")
    private String mailUnitName;

    /**
     * 省id
     */
    @Column(name = "mail_province_id")
    private Integer mailProvinceId;

    /**
     * 省
     */
    @Column(name = "mail_province")
    private String mailProvince;

    /**
     * 市id
     */
    @Column(name = "mail_city_id")
    private Integer mailCityId;

    /**
     * 市
     */
    @Column(name = "mail_city")
    private String mailCity;

    /**
     * 区id
     */
    @Column(name = "mail_area_id")
    private Integer mailAreaId;

    /**
     * 区
     */
    @Column(name = "mail_area")
    private String mailArea;

    /**
     * 发件人详细地址
     */
    @Column(name = "mail_detail_adress")
    private String mailDetailAdress;

    /**
     * 发件时间
     */
    @Column(name = "mailTime")
    private Date mailtime;

    /**
     * 预计到达时间
     */
    @Column(name = "arriveTime")
    private Date arrivetime;

    /**
     * 回单份数
     */
    private Integer receipt;

    /**
     * 运费合计
     */
    @Column(name = "total_freight")
    private BigDecimal totalFreight;

    /**
     * 投保额度
     */
    private BigDecimal coverage;

    /**
     * 保险额度
     */
    private BigDecimal premium;

    /**
     * 付款总额
     */
    @Column(name = "total_payments")
    private BigDecimal totalPayments;

    /**
     * 预付款合计
     */
    private BigDecimal prepayment;

    /**
     * 预付款-现金
     */
    @Column(name = "prepayment_cash")
    private BigDecimal prepaymentCash;

    /**
     * 预付款-油卡
     */
    @Column(name = "prepayment_oil_card")
    private BigDecimal prepaymentOilCard;

    /**
     * 回单付合计
     */
    @Column(name = "total_receipt")
    private BigDecimal totalReceipt;

    /**
     * 回单付-现金
     */
    @Column(name = "receipt_cash")
    private BigDecimal receiptCash;

    /**
     * 回单付-油卡
     */
    @Column(name = "receipt_oil_card")
    private BigDecimal receiptOilCard;

    /**
     * 到付
     */
    @Column(name = "fad_payment")
    private BigDecimal fadPayment;

    /**
     * 月结
     */
    @Column(name = "month_balance")
    private BigDecimal monthBalance;

    /**
     * 装卸费
     */
    @Column(name = "coolie_hire")
    private BigDecimal coolieHire;

    /**
     * 其他
     */
    private BigDecimal other;

    /**
     * 承运公司
     */
    @Column(name = "carriage_company")
    private String carriageCompany;

    /**
     * 司机姓名
     */
    @Column(name = "driver_name")
    private String driverName;

    /**
     * 联系电话
     */
    @Column(name = "driver_tel")
    private String driverTel;

    /**
     * 身份证
     */
    @Column(name = "driver_card")
    private String driverCard;

    /**
     * 车牌号
     */
    @Column(name = "plate_number")
    private String plateNumber;

    /**
     * 运单号
     */
    @Column(name = "orderNo")
    private String orderno;

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
     * 获取收件人
     *
     * @return rec_person - 收件人
     */
    public String getRecPerson() {
        return recPerson;
    }

    /**
     * 设置收件人
     *
     * @param recPerson 收件人
     */
    public void setRecPerson(String recPerson) {
        this.recPerson = recPerson;
    }

    /**
     * 获取收件人联系电话
     *
     * @return rec_tel - 收件人联系电话
     */
    public String getRecTel() {
        return recTel;
    }

    /**
     * 设置收件人联系电话
     *
     * @param recTel 收件人联系电话
     */
    public void setRecTel(String recTel) {
        this.recTel = recTel;
    }

    /**
     * 获取收件人单位名称
     *
     * @return rec_unit_name - 收件人单位名称
     */
    public String getRecUnitName() {
        return recUnitName;
    }

    /**
     * 设置收件人单位名称
     *
     * @param recUnitName 收件人单位名称
     */
    public void setRecUnitName(String recUnitName) {
        this.recUnitName = recUnitName;
    }

    /**
     * 获取省id
     *
     * @return rec_province_id - 省id
     */
    public Integer getRecProvinceId() {
        return recProvinceId;
    }

    /**
     * 设置省id
     *
     * @param recProvinceId 省id
     */
    public void setRecProvinceId(Integer recProvinceId) {
        this.recProvinceId = recProvinceId;
    }

    /**
     * 获取省
     *
     * @return rec_province - 省
     */
    public String getRecProvince() {
        return recProvince;
    }

    /**
     * 设置省
     *
     * @param recProvince 省
     */
    public void setRecProvince(String recProvince) {
        this.recProvince = recProvince;
    }

    /**
     * 获取市id
     *
     * @return rec_city_id - 市id
     */
    public Integer getRecCityId() {
        return recCityId;
    }

    /**
     * 设置市id
     *
     * @param recCityId 市id
     */
    public void setRecCityId(Integer recCityId) {
        this.recCityId = recCityId;
    }

    /**
     * 获取市
     *
     * @return rec_city - 市
     */
    public String getRecCity() {
        return recCity;
    }

    /**
     * 设置市
     *
     * @param recCity 市
     */
    public void setRecCity(String recCity) {
        this.recCity = recCity;
    }

    /**
     * 获取区id
     *
     * @return rec_area_id - 区id
     */
    public Integer getRecAreaId() {
        return recAreaId;
    }

    /**
     * 设置区id
     *
     * @param recAreaId 区id
     */
    public void setRecAreaId(Integer recAreaId) {
        this.recAreaId = recAreaId;
    }

    /**
     * 获取区
     *
     * @return rec_area - 区
     */
    public String getRecArea() {
        return recArea;
    }

    /**
     * 设置区
     *
     * @param recArea 区
     */
    public void setRecArea(String recArea) {
        this.recArea = recArea;
    }

    /**
     * 获取收件人详细地址
     *
     * @return rec_detail_adress - 收件人详细地址
     */
    public String getRecDetailAdress() {
        return recDetailAdress;
    }

    /**
     * 设置收件人详细地址
     *
     * @param recDetailAdress 收件人详细地址
     */
    public void setRecDetailAdress(String recDetailAdress) {
        this.recDetailAdress = recDetailAdress;
    }

    /**
     * 获取交货方式（1.直送、0.自提）
     *
     * @return rec_mode - 交货方式（1.直送、0.自提）
     */
    public Integer getRecMode() {
        return recMode;
    }

    /**
     * 设置交货方式（1.直送、0.自提）
     *
     * @param recMode 交货方式（1.直送、0.自提）
     */
    public void setRecMode(Integer recMode) {
        this.recMode = recMode;
    }

    /**
     * 获取发件人
     *
     * @return mail_person - 发件人
     */
    public String getMailPerson() {
        return mailPerson;
    }

    /**
     * 设置发件人
     *
     * @param mailPerson 发件人
     */
    public void setMailPerson(String mailPerson) {
        this.mailPerson = mailPerson;
    }

    /**
     * 获取发件人联系电话
     *
     * @return mail_tel - 发件人联系电话
     */
    public String getMailTel() {
        return mailTel;
    }

    /**
     * 设置发件人联系电话
     *
     * @param mailTel 发件人联系电话
     */
    public void setMailTel(String mailTel) {
        this.mailTel = mailTel;
    }

    /**
     * 获取发件人单位名称
     *
     * @return mail_unit_name - 发件人单位名称
     */
    public String getMailUnitName() {
        return mailUnitName;
    }

    /**
     * 设置发件人单位名称
     *
     * @param mailUnitName 发件人单位名称
     */
    public void setMailUnitName(String mailUnitName) {
        this.mailUnitName = mailUnitName;
    }

    /**
     * 获取省id
     *
     * @return mail_province_id - 省id
     */
    public Integer getMailProvinceId() {
        return mailProvinceId;
    }

    /**
     * 设置省id
     *
     * @param mailProvinceId 省id
     */
    public void setMailProvinceId(Integer mailProvinceId) {
        this.mailProvinceId = mailProvinceId;
    }

    /**
     * 获取省
     *
     * @return mail_province - 省
     */
    public String getMailProvince() {
        return mailProvince;
    }

    /**
     * 设置省
     *
     * @param mailProvince 省
     */
    public void setMailProvince(String mailProvince) {
        this.mailProvince = mailProvince;
    }

    /**
     * 获取市id
     *
     * @return mail_city_id - 市id
     */
    public Integer getMailCityId() {
        return mailCityId;
    }

    /**
     * 设置市id
     *
     * @param mailCityId 市id
     */
    public void setMailCityId(Integer mailCityId) {
        this.mailCityId = mailCityId;
    }

    /**
     * 获取市
     *
     * @return mail_city - 市
     */
    public String getMailCity() {
        return mailCity;
    }

    /**
     * 设置市
     *
     * @param mailCity 市
     */
    public void setMailCity(String mailCity) {
        this.mailCity = mailCity;
    }

    /**
     * 获取区id
     *
     * @return mail_area_id - 区id
     */
    public Integer getMailAreaId() {
        return mailAreaId;
    }

    /**
     * 设置区id
     *
     * @param mailAreaId 区id
     */
    public void setMailAreaId(Integer mailAreaId) {
        this.mailAreaId = mailAreaId;
    }

    /**
     * 获取区
     *
     * @return mail_area - 区
     */
    public String getMailArea() {
        return mailArea;
    }

    /**
     * 设置区
     *
     * @param mailArea 区
     */
    public void setMailArea(String mailArea) {
        this.mailArea = mailArea;
    }

    /**
     * 获取发件人详细地址
     *
     * @return mail_detail_adress - 发件人详细地址
     */
    public String getMailDetailAdress() {
        return mailDetailAdress;
    }

    /**
     * 设置发件人详细地址
     *
     * @param mailDetailAdress 发件人详细地址
     */
    public void setMailDetailAdress(String mailDetailAdress) {
        this.mailDetailAdress = mailDetailAdress;
    }

    /**
     * 获取发件时间
     *
     * @return mailTime - 发件时间
     */
    public Date getMailtime() {
        return mailtime;
    }

    /**
     * 设置发件时间
     *
     * @param mailtime 发件时间
     */
    public void setMailtime(Date mailtime) {
        this.mailtime = mailtime;
    }

    /**
     * 获取预计到达时间
     *
     * @return arriveTime - 预计到达时间
     */
    public Date getArrivetime() {
        return arrivetime;
    }

    /**
     * 设置预计到达时间
     *
     * @param arrivetime 预计到达时间
     */
    public void setArrivetime(Date arrivetime) {
        this.arrivetime = arrivetime;
    }

    /**
     * 获取回单份数
     *
     * @return receipt - 回单份数
     */
    public Integer getReceipt() {
        return receipt;
    }

    /**
     * 设置回单份数
     *
     * @param receipt 回单份数
     */
    public void setReceipt(Integer receipt) {
        this.receipt = receipt;
    }

    /**
     * 获取运费合计
     *
     * @return total_freight - 运费合计
     */
    public BigDecimal getTotalFreight() {
        return totalFreight;
    }

    /**
     * 设置运费合计
     *
     * @param totalFreight 运费合计
     */
    public void setTotalFreight(BigDecimal totalFreight) {
        this.totalFreight = totalFreight;
    }

    /**
     * 获取投保额度
     *
     * @return coverage - 投保额度
     */
    public BigDecimal getCoverage() {
        return coverage;
    }

    /**
     * 设置投保额度
     *
     * @param coverage 投保额度
     */
    public void setCoverage(BigDecimal coverage) {
        this.coverage = coverage;
    }

    /**
     * 获取保险额度
     *
     * @return premium - 保险额度
     */
    public BigDecimal getPremium() {
        return premium;
    }

    /**
     * 设置保险额度
     *
     * @param premium 保险额度
     */
    public void setPremium(BigDecimal premium) {
        this.premium = premium;
    }

    /**
     * 获取付款总额
     *
     * @return total_payments - 付款总额
     */
    public BigDecimal getTotalPayments() {
        return totalPayments;
    }

    /**
     * 设置付款总额
     *
     * @param totalPayments 付款总额
     */
    public void setTotalPayments(BigDecimal totalPayments) {
        this.totalPayments = totalPayments;
    }

    /**
     * 获取预付款合计
     *
     * @return prepayment - 预付款合计
     */
    public BigDecimal getPrepayment() {
        return prepayment;
    }

    /**
     * 设置预付款合计
     *
     * @param prepayment 预付款合计
     */
    public void setPrepayment(BigDecimal prepayment) {
        this.prepayment = prepayment;
    }

    /**
     * 获取预付款-现金
     *
     * @return prepayment_cash - 预付款-现金
     */
    public BigDecimal getPrepaymentCash() {
        return prepaymentCash;
    }

    /**
     * 设置预付款-现金
     *
     * @param prepaymentCash 预付款-现金
     */
    public void setPrepaymentCash(BigDecimal prepaymentCash) {
        this.prepaymentCash = prepaymentCash;
    }

    /**
     * 获取预付款-油卡
     *
     * @return prepayment_oil_card - 预付款-油卡
     */
    public BigDecimal getPrepaymentOilCard() {
        return prepaymentOilCard;
    }

    /**
     * 设置预付款-油卡
     *
     * @param prepaymentOilCard 预付款-油卡
     */
    public void setPrepaymentOilCard(BigDecimal prepaymentOilCard) {
        this.prepaymentOilCard = prepaymentOilCard;
    }

    /**
     * 获取回单付合计
     *
     * @return total_receipt - 回单付合计
     */
    public BigDecimal getTotalReceipt() {
        return totalReceipt;
    }

    /**
     * 设置回单付合计
     *
     * @param totalReceipt 回单付合计
     */
    public void setTotalReceipt(BigDecimal totalReceipt) {
        this.totalReceipt = totalReceipt;
    }

    /**
     * 获取回单付-现金
     *
     * @return receipt_cash - 回单付-现金
     */
    public BigDecimal getReceiptCash() {
        return receiptCash;
    }

    /**
     * 设置回单付-现金
     *
     * @param receiptCash 回单付-现金
     */
    public void setReceiptCash(BigDecimal receiptCash) {
        this.receiptCash = receiptCash;
    }

    /**
     * 获取回单付-油卡
     *
     * @return receipt_oil_card - 回单付-油卡
     */
    public BigDecimal getReceiptOilCard() {
        return receiptOilCard;
    }

    /**
     * 设置回单付-油卡
     *
     * @param receiptOilCard 回单付-油卡
     */
    public void setReceiptOilCard(BigDecimal receiptOilCard) {
        this.receiptOilCard = receiptOilCard;
    }

    /**
     * 获取到付
     *
     * @return fad_payment - 到付
     */
    public BigDecimal getFadPayment() {
        return fadPayment;
    }

    /**
     * 设置到付
     *
     * @param fadPayment 到付
     */
    public void setFadPayment(BigDecimal fadPayment) {
        this.fadPayment = fadPayment;
    }

    /**
     * 获取月结
     *
     * @return month_balance - 月结
     */
    public BigDecimal getMonthBalance() {
        return monthBalance;
    }

    /**
     * 设置月结
     *
     * @param monthBalance 月结
     */
    public void setMonthBalance(BigDecimal monthBalance) {
        this.monthBalance = monthBalance;
    }

    /**
     * 获取装卸费
     *
     * @return coolie_hire - 装卸费
     */
    public BigDecimal getCoolieHire() {
        return coolieHire;
    }

    /**
     * 设置装卸费
     *
     * @param coolieHire 装卸费
     */
    public void setCoolieHire(BigDecimal coolieHire) {
        this.coolieHire = coolieHire;
    }

    /**
     * 获取其他
     *
     * @return other - 其他
     */
    public BigDecimal getOther() {
        return other;
    }

    /**
     * 设置其他
     *
     * @param other 其他
     */
    public void setOther(BigDecimal other) {
        this.other = other;
    }

    /**
     * 获取承运公司
     *
     * @return carriage_company - 承运公司
     */
    public String getCarriageCompany() {
        return carriageCompany;
    }

    /**
     * 设置承运公司
     *
     * @param carriageCompany 承运公司
     */
    public void setCarriageCompany(String carriageCompany) {
        this.carriageCompany = carriageCompany;
    }

    /**
     * 获取司机姓名
     *
     * @return driver_name - 司机姓名
     */
    public String getDriverName() {
        return driverName;
    }

    /**
     * 设置司机姓名
     *
     * @param driverName 司机姓名
     */
    public void setDriverName(String driverName) {
        this.driverName = driverName;
    }

    /**
     * 获取联系电话
     *
     * @return driver_tel - 联系电话
     */
    public String getDriverTel() {
        return driverTel;
    }

    /**
     * 设置联系电话
     *
     * @param driverTel 联系电话
     */
    public void setDriverTel(String driverTel) {
        this.driverTel = driverTel;
    }

    /**
     * 获取身份证
     *
     * @return driver_card - 身份证
     */
    public String getDriverCard() {
        return driverCard;
    }

    /**
     * 设置身份证
     *
     * @param driverCard 身份证
     */
    public void setDriverCard(String driverCard) {
        this.driverCard = driverCard;
    }

    /**
     * 获取车牌号
     *
     * @return plate_number - 车牌号
     */
    public String getPlateNumber() {
        return plateNumber;
    }

    /**
     * 设置车牌号
     *
     * @param plateNumber 车牌号
     */
    public void setPlateNumber(String plateNumber) {
        this.plateNumber = plateNumber;
    }

    /**
     * 获取运单号
     *
     * @return orderNo - 运单号
     */
    public String getOrderno() {
        return orderno;
    }

    /**
     * 设置运单号
     *
     * @param orderno 运单号
     */
    public void setOrderno(String orderno) {
        this.orderno = orderno;
    }
}