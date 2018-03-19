/*
* WechatMch.java
* EnTropyShiNe
* Copyright © 2016 ShiNez All Rights Reserved
* 作者：ShiNez
* QQ：136266602
* 2017-06-06 15:12 Created
*/ 
package com.wmeimob.custom.wechat.entity;

import java.io.Serializable;
import javax.persistence.*;

@Table(name = "wechat_mch")
public class WechatMch implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    /**
     * 商戶號
     */
    @Column(name = "mch_no")
    private String mchNo;

    @Column(name = "mch_key")
    private String mchKey;

    /**
     * 证书有无上传标识
     */
    @Column(name = "p12_set_flag")
    private Boolean p12SetFlag;

    /**
     * 證書路徑
     */
    @Column(name = "p12")
    private byte[] p12;

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
     * 获取商戶號
     *
     * @return mch_no - 商戶號
     */
    public String getMchNo() {
        return mchNo;
    }

    /**
     * 设置商戶號
     *
     * @param mchNo 商戶號
     */
    public void setMchNo(String mchNo) {
        this.mchNo = mchNo;
    }

    /**
     * @return mch_key
     */
    public String getMchKey() {
        return mchKey;
    }

    /**
     * @param mchKey
     */
    public void setMchKey(String mchKey) {
        this.mchKey = mchKey;
    }

    /**
     * 获取证书有无上传标识
     *
     * @return p12_set_flag - 证书有无上传标识
     */
    public Boolean getP12SetFlag() {
        return p12SetFlag;
    }

    /**
     * 设置证书有无上传标识
     *
     * @param p12SetFlag 证书有无上传标识
     */
    public void setP12SetFlag(Boolean p12SetFlag) {
        this.p12SetFlag = p12SetFlag;
    }

    /**
     * 获取證書路徑
     *
     * @return p12_path - 證書路徑
     */
    public byte[] getP12() {
        return p12;
    }

    /**
     * 设置證書路徑
     *
     * @param p12 證書路徑
     */
    public void setP12(byte[] p12) {
        this.p12 = p12;
    }
}