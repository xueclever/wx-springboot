/*
* WechatMps.java
* EnTropyShiNe
* Copyright © 2016 ShiNez All Rights Reserved
* 作者：ShiNez
* QQ：136266602
* 2017-06-06 15:12 Created
*/ 
package com.wmeimob.custom.wechat.entity;

import java.io.Serializable;
import javax.persistence.*;

@Table(name = "wechat_mps")
public class WechatMps implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    /**
     * 系統用戶id（弃用，原因：可被多个用户管理）
     */
    @Column(name = "sys_user_id")
    private Integer sysUserId;

    /**
     * 商戶id
     */
    @Column(name = "mch_id")
    private Integer mchId;

    private String appid;

    /**
     * 原始id
     */
    private String ghid;

    private String secret;

    @Column(name = "auth_url")
    private String authUrl;

    private String token;

    /**
     * 消息加密密钥由43位字符组成，可随机修改，字符范围为A-Z，a-z，0-9。
     */
    @Column(name = "encoding_aes_key")
    private String encodingAesKey;

    /**
     * 公众号昵称
     */
    @Column(name = "nick_name")
    private String nickName;

    /**
     * 公众号logo
     */
    @Column(name = "head_img")
    private String headImg;

    /**
     * 关注二维码
     */
    @Column(name = "sub_qr")
    private String subQr;

    /**
     * 授权作用域
     */
    @Column(name = "auth_scope")
    private String authScope;

    /**
     * 第三方授权地址
     */
    @Column(name = "component_authorize_url")
    private String componentAuthorizeUrl;

    /**
     * 第三方授权地址回调
     */
    @Column(name = "component_authorize_openid_url")
    private String componentAuthorizeOpenidUrl;

    /**
     * 授权方公众号类型，0代表订阅号，1代表由历史老帐号升级后的订阅号，2代表服务号
     */
    @Column(name = "service_type_info")
    private Byte serviceTypeInfo;

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
     * 获取系統用戶id（弃用，原因：可被多个用户管理）
     *
     * @return sys_user_id - 系統用戶id（弃用，原因：可被多个用户管理）
     */
    public Integer getSysUserId() {
        return sysUserId;
    }

    /**
     * 设置系統用戶id（弃用，原因：可被多个用户管理）
     *
     * @param sysUserId 系統用戶id（弃用，原因：可被多个用户管理）
     */
    public void setSysUserId(Integer sysUserId) {
        this.sysUserId = sysUserId;
    }

    /**
     * 获取商戶id
     *
     * @return mch_id - 商戶id
     */
    public Integer getMchId() {
        return mchId;
    }

    /**
     * 设置商戶id
     *
     * @param mchId 商戶id
     */
    public void setMchId(Integer mchId) {
        this.mchId = mchId;
    }

    /**
     * @return appid
     */
    public String getAppid() {
        return appid;
    }

    /**
     * @param appid
     */
    public void setAppid(String appid) {
        this.appid = appid;
    }

    /**
     * 获取原始id
     *
     * @return ghid - 原始id
     */
    public String getGhid() {
        return ghid;
    }

    /**
     * 设置原始id
     *
     * @param ghid 原始id
     */
    public void setGhid(String ghid) {
        this.ghid = ghid;
    }

    /**
     * @return secret
     */
    public String getSecret() {
        return secret;
    }

    /**
     * @param secret
     */
    public void setSecret(String secret) {
        this.secret = secret;
    }

    /**
     * @return auth_url
     */
    public String getAuthUrl() {
        return authUrl;
    }

    /**
     * @param authUrl
     */
    public void setAuthUrl(String authUrl) {
        this.authUrl = authUrl;
    }

    /**
     * @return token
     */
    public String getToken() {
        return token;
    }

    /**
     * @param token
     */
    public void setToken(String token) {
        this.token = token;
    }

    /**
     * 获取消息加密密钥由43位字符组成，可随机修改，字符范围为A-Z，a-z，0-9。
     *
     * @return encoding_aes_key - 消息加密密钥由43位字符组成，可随机修改，字符范围为A-Z，a-z，0-9。
     */
    public String getEncodingAesKey() {
        return encodingAesKey;
    }

    /**
     * 设置消息加密密钥由43位字符组成，可随机修改，字符范围为A-Z，a-z，0-9。
     *
     * @param encodingAesKey 消息加密密钥由43位字符组成，可随机修改，字符范围为A-Z，a-z，0-9。
     */
    public void setEncodingAesKey(String encodingAesKey) {
        this.encodingAesKey = encodingAesKey;
    }

    /**
     * 获取公众号昵称
     *
     * @return nick_name - 公众号昵称
     */
    public String getNickName() {
        return nickName;
    }

    /**
     * 设置公众号昵称
     *
     * @param nickName 公众号昵称
     */
    public void setNickName(String nickName) {
        this.nickName = nickName;
    }

    /**
     * 获取公众号logo
     *
     * @return head_img - 公众号logo
     */
    public String getHeadImg() {
        return headImg;
    }

    /**
     * 设置公众号logo
     *
     * @param headImg 公众号logo
     */
    public void setHeadImg(String headImg) {
        this.headImg = headImg;
    }

    /**
     * 获取关注二维码
     *
     * @return sub_qr - 关注二维码
     */
    public String getSubQr() {
        return subQr;
    }

    /**
     * 设置关注二维码
     *
     * @param subQr 关注二维码
     */
    public void setSubQr(String subQr) {
        this.subQr = subQr;
    }

    /**
     * 获取授权作用域
     *
     * @return auth_scope - 授权作用域
     */
    public String getAuthScope() {
        return authScope;
    }

    /**
     * 设置授权作用域
     *
     * @param authScope 授权作用域
     */
    public void setAuthScope(String authScope) {
        this.authScope = authScope;
    }

    /**
     * 获取第三方授权地址
     *
     * @return component_authorize_url - 第三方授权地址
     */
    public String getComponentAuthorizeUrl() {
        return componentAuthorizeUrl;
    }

    /**
     * 设置第三方授权地址
     *
     * @param componentAuthorizeUrl 第三方授权地址
     */
    public void setComponentAuthorizeUrl(String componentAuthorizeUrl) {
        this.componentAuthorizeUrl = componentAuthorizeUrl;
    }

    /**
     * 获取第三方授权地址回调
     *
     * @return component_authorize_openid_url - 第三方授权地址回调
     */
    public String getComponentAuthorizeOpenidUrl() {
        return componentAuthorizeOpenidUrl;
    }

    /**
     * 设置第三方授权地址回调
     *
     * @param componentAuthorizeOpenidUrl 第三方授权地址回调
     */
    public void setComponentAuthorizeOpenidUrl(String componentAuthorizeOpenidUrl) {
        this.componentAuthorizeOpenidUrl = componentAuthorizeOpenidUrl;
    }

    /**
     * 获取授权方公众号类型，0代表订阅号，1代表由历史老帐号升级后的订阅号，2代表服务号
     *
     * @return service_type_info - 授权方公众号类型，0代表订阅号，1代表由历史老帐号升级后的订阅号，2代表服务号
     */
    public Byte getServiceTypeInfo() {
        return serviceTypeInfo;
    }

    /**
     * 设置授权方公众号类型，0代表订阅号，1代表由历史老帐号升级后的订阅号，2代表服务号
     *
     * @param serviceTypeInfo 授权方公众号类型，0代表订阅号，1代表由历史老帐号升级后的订阅号，2代表服务号
     */
    public void setServiceTypeInfo(Byte serviceTypeInfo) {
        this.serviceTypeInfo = serviceTypeInfo;
    }
}