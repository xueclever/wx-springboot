/*
* WechatUser.java
* EnTropyShiNe
* Copyright © 2016 ShiNez All Rights Reserved
* 作者：ShiNez
* QQ：136266602
* 2017-06-06 15:12 Created
*/ 
package com.wmeimob.custom.wechat.entity;

import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;

import java.io.Serializable;
import java.util.Collection;
import java.util.Date;
import java.util.List;
import javax.persistence.*;

@Table(name = "wechat_user")
public class WechatUser  implements Serializable,UserDetails {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    /**
     * 所属公众号
     */
    private String appid;

    /**
     * 用户的唯一标识，对当前公众号唯一
     */
    private String openid;

    /**
     * 用户是否订阅该公众号标识，值为0时，代表此用户没有关注该公众号，拉取不到其余信息。
     */
    private Boolean subscribe;

    /**
     * 用户关注时间，为时间戳。如果用户曾多次关注，则取最后关注时间
     */
    @Column(name = "subscribe_time")
    private Date subscribeTime;

    /**
     * 公众号运营者对粉丝的备注，公众号运营者可在微信公众平台用户管理界面对粉丝添加备注
     */
    private String remark;

    /**
     * 用户的昵称
     */
    private String nickname;

    /**
     * 用户的性别，值为1时是男性，值为2时是女性，值为0时是未知
     */
    private Boolean sex;

    /**
     * 用户所在省份
     */
    private String province;

    /**
     * 用户所在城市
     */
    private String city;

    /**
     * 用户所在国家
     */
    private String country;

    /**
     * 用户头像，最后一个数值代表正方形头像大小（有0、46、64、96、132数值可选，0代表640*640正方形头像），用户没有头像时该项为空。若用户更换头像，原有头像URL将失效。
     */
    private String headimgurl;

    /**
     * 用户特权信息，json 数组，如微信沃卡用户为（chinaunicom）
     */
    private String privilege;

    /**
     * 只有在用户将公众号绑定到微信开放平台帐号后，才会出现该字段。
     */
    private String unionid;

    /**
     * 用户所在的分组ID（兼容旧的用户分组接口）
     */
    private Integer groupid;

    /**
     * 用户被打上的标签ID列表
     */
    @Column(name = "targid_list")
    private String targidList;

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
     * 获取所属公众号
     *
     * @return appid - 所属公众号
     */
    public String getAppid() {
        return appid;
    }

    /**
     * 设置所属公众号
     *
     * @param appid 所属公众号
     */
    public void setAppid(String appid) {
        this.appid = appid;
    }

    /**
     * 获取用户的唯一标识，对当前公众号唯一
     *
     * @return openid - 用户的唯一标识，对当前公众号唯一
     */
    public String getOpenid() {
        return openid;
    }

    /**
     * 设置用户的唯一标识，对当前公众号唯一
     *
     * @param openid 用户的唯一标识，对当前公众号唯一
     */
    public void setOpenid(String openid) {
        this.openid = openid;
    }

    /**
     * 获取用户是否订阅该公众号标识，值为0时，代表此用户没有关注该公众号，拉取不到其余信息。
     *
     * @return subscribe - 用户是否订阅该公众号标识，值为0时，代表此用户没有关注该公众号，拉取不到其余信息。
     */
    public Boolean getSubscribe() {
        return subscribe;
    }

    /**
     * 设置用户是否订阅该公众号标识，值为0时，代表此用户没有关注该公众号，拉取不到其余信息。
     *
     * @param subscribe 用户是否订阅该公众号标识，值为0时，代表此用户没有关注该公众号，拉取不到其余信息。
     */
    public void setSubscribe(Boolean subscribe) {
        this.subscribe = subscribe;
    }

    /**
     * 获取用户关注时间，为时间戳。如果用户曾多次关注，则取最后关注时间
     *
     * @return subscribe_time - 用户关注时间，为时间戳。如果用户曾多次关注，则取最后关注时间
     */
    public Date getSubscribeTime() {
        return subscribeTime;
    }

    /**
     * 设置用户关注时间，为时间戳。如果用户曾多次关注，则取最后关注时间
     *
     * @param subscribeTime 用户关注时间，为时间戳。如果用户曾多次关注，则取最后关注时间
     */
    public void setSubscribeTime(Date subscribeTime) {
        this.subscribeTime = subscribeTime;
    }

    /**
     * 获取公众号运营者对粉丝的备注，公众号运营者可在微信公众平台用户管理界面对粉丝添加备注
     *
     * @return remark - 公众号运营者对粉丝的备注，公众号运营者可在微信公众平台用户管理界面对粉丝添加备注
     */
    public String getRemark() {
        return remark;
    }

    /**
     * 设置公众号运营者对粉丝的备注，公众号运营者可在微信公众平台用户管理界面对粉丝添加备注
     *
     * @param remark 公众号运营者对粉丝的备注，公众号运营者可在微信公众平台用户管理界面对粉丝添加备注
     */
    public void setRemark(String remark) {
        this.remark = remark;
    }

    /**
     * 获取用户的昵称
     *
     * @return nickname - 用户的昵称
     */
    public String getNickname() {
        return nickname;
    }

    /**
     * 设置用户的昵称
     *
     * @param nickname 用户的昵称
     */
    public void setNickname(String nickname) {
        this.nickname = nickname;
    }

    /**
     * 获取用户的性别，值为1时是男性，值为2时是女性，值为0时是未知
     *
     * @return sex - 用户的性别，值为1时是男性，值为2时是女性，值为0时是未知
     */
    public Boolean getSex() {
        return sex;
    }

    /**
     * 设置用户的性别，值为1时是男性，值为2时是女性，值为0时是未知
     *
     * @param sex 用户的性别，值为1时是男性，值为2时是女性，值为0时是未知
     */
    public void setSex(Boolean sex) {
        this.sex = sex;
    }

    /**
     * 获取用户所在省份
     *
     * @return province - 用户所在省份
     */
    public String getProvince() {
        return province;
    }

    /**
     * 设置用户所在省份
     *
     * @param province 用户所在省份
     */
    public void setProvince(String province) {
        this.province = province;
    }

    /**
     * 获取用户所在城市
     *
     * @return city - 用户所在城市
     */
    public String getCity() {
        return city;
    }

    /**
     * 设置用户所在城市
     *
     * @param city 用户所在城市
     */
    public void setCity(String city) {
        this.city = city;
    }

    /**
     * 获取用户所在国家
     *
     * @return country - 用户所在国家
     */
    public String getCountry() {
        return country;
    }

    /**
     * 设置用户所在国家
     *
     * @param country 用户所在国家
     */
    public void setCountry(String country) {
        this.country = country;
    }

    /**
     * 获取用户头像，最后一个数值代表正方形头像大小（有0、46、64、96、132数值可选，0代表640*640正方形头像），用户没有头像时该项为空。若用户更换头像，原有头像URL将失效。
     *
     * @return headimgurl - 用户头像，最后一个数值代表正方形头像大小（有0、46、64、96、132数值可选，0代表640*640正方形头像），用户没有头像时该项为空。若用户更换头像，原有头像URL将失效。
     */
    public String getHeadimgurl() {
        return headimgurl;
    }

    /**
     * 设置用户头像，最后一个数值代表正方形头像大小（有0、46、64、96、132数值可选，0代表640*640正方形头像），用户没有头像时该项为空。若用户更换头像，原有头像URL将失效。
     *
     * @param headimgurl 用户头像，最后一个数值代表正方形头像大小（有0、46、64、96、132数值可选，0代表640*640正方形头像），用户没有头像时该项为空。若用户更换头像，原有头像URL将失效。
     */
    public void setHeadimgurl(String headimgurl) {
        this.headimgurl = headimgurl;
    }

    /**
     * 获取用户特权信息，json 数组，如微信沃卡用户为（chinaunicom）
     *
     * @return privilege - 用户特权信息，json 数组，如微信沃卡用户为（chinaunicom）
     */
    public String getPrivilege() {
        return privilege;
    }

    /**
     * 设置用户特权信息，json 数组，如微信沃卡用户为（chinaunicom）
     *
     * @param privilege 用户特权信息，json 数组，如微信沃卡用户为（chinaunicom）
     */
    public void setPrivilege(String privilege) {
        this.privilege = privilege;
    }

    /**
     * 获取只有在用户将公众号绑定到微信开放平台帐号后，才会出现该字段。
     *
     * @return unionid - 只有在用户将公众号绑定到微信开放平台帐号后，才会出现该字段。
     */
    public String getUnionid() {
        return unionid;
    }

    /**
     * 设置只有在用户将公众号绑定到微信开放平台帐号后，才会出现该字段。
     *
     * @param unionid 只有在用户将公众号绑定到微信开放平台帐号后，才会出现该字段。
     */
    public void setUnionid(String unionid) {
        this.unionid = unionid;
    }

    /**
     * 获取用户所在的分组ID（兼容旧的用户分组接口）
     *
     * @return groupid - 用户所在的分组ID（兼容旧的用户分组接口）
     */
    public Integer getGroupid() {
        return groupid;
    }

    /**
     * 设置用户所在的分组ID（兼容旧的用户分组接口）
     *
     * @param groupid 用户所在的分组ID（兼容旧的用户分组接口）
     */
    public void setGroupid(Integer groupid) {
        this.groupid = groupid;
    }

    /**
     * 获取用户被打上的标签ID列表
     *
     * @return targid_list - 用户被打上的标签ID列表
     */
    public String getTargidList() {
        return targidList;
    }

    /**
     * 设置用户被打上的标签ID列表
     *
     * @param targidList 用户被打上的标签ID列表
     */
    public void setTargidList(String targidList) {
        this.targidList = targidList;
    }

    @Transient
    private List<GrantedAuthority> authorities;

    @Override
    public Collection<? extends GrantedAuthority> getAuthorities() {
        return authorities;
    }

    @Override
    public String getPassword() {
        return null;
    }

    @Override
    public String getUsername() {
        return getOpenid();
    }

    @Override
    public boolean isAccountNonExpired() {
        return true;
    }

    @Override
    public boolean isAccountNonLocked() {
        return true;
    }

    @Override
    public boolean isCredentialsNonExpired() {
        return true;
    }

    @Override
    public boolean isEnabled() {
        return true;
    }
}