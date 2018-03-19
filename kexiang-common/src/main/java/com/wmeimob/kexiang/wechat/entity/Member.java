/*
* Member.java
* http://www.wmeimob.com
* Copyright © 2018 wmeimob All Rights Reserved
* 作者：???
* QQ：???
* E-Mail：???
* 2018-02-27 16:40 Created
*/ 
package com.wmeimob.kexiang.wechat.entity;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.*;

@Table(name = "member")
public class Member implements Serializable {
    /**
     * 主键
     */
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    /**
     * 用户编号
     */
    @Column(name = "member_no")
    private String memberNo;

    /**
     * openid
     */
    @Column(name = "openid")
    private String openid;
    
    @Column(name = "head_img_url")
    private String headImgUrl;
    

    public String getHeadImgUrl() {
		return headImgUrl;
	}

	public void setHeadImgUrl(String headImgUrl) {
		this.headImgUrl = headImgUrl;
	}

	/**
     * 微信昵称
     */
    @Column(name = "nick_name")
    private String nickName;

    /**
     * 电话号码
     */
    private String telphone;

    /**
     * 用户类型（1.客户、0.操作员）
     */
    @Column(name = "member_type")
    private String memberType;

    /**
     * 公司名称
     */
    @Column(name = "member_company")
    private String memberCompany;

    /**
     * 用户姓名
     */
    @Column(name = "member_name")
    private String memberName;

    /**
     * 创建时间
     */
    @Column(name = "create_time")
    private Date createTime;

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
     * 获取用户编号
     *
     * @return member_no - 用户编号
     */
    public String getMemberNo() {
        return memberNo;
    }

    /**
     * 设置用户编号
     *
     * @param memberNo 用户编号
     */
    public void setMemberNo(String memberNo) {
        this.memberNo = memberNo;
    }

    /**
     * 获取openid
     *
     * @return openId - openid
     */
    public String getOpenid() {
        return openid;
    }

    /**
     * 设置openid
     *
     * @param openid openid
     */
    public void setOpenid(String openid) {
        this.openid = openid;
    }


    /**
     * 获取电话号码
     *
     * @return telphone - 电话号码
     */
    public String getTelphone() {
        return telphone;
    }

    /**
     * 设置电话号码
     *
     * @param telphone 电话号码
     */
    public void setTelphone(String telphone) {
        this.telphone = telphone;
    }

    /**
     * 获取用户类型（1.客户、0.操作员）
     *
     * @return member_type - 用户类型（1.客户、0.操作员）
     */
    public String getMemberType() {
        return memberType;
    }

    /**
     * 设置用户类型（1.客户、0.操作员）
     *
     * @param memberType 用户类型（1.客户、0.操作员）
     */
    public void setMemberType(String memberType) {
        this.memberType = memberType;
    }

    /**
     * 获取公司名称
     *
     * @return member_company - 公司名称
     */
    public String getMemberCompany() {
        return memberCompany;
    }

    /**
     * 设置公司名称
     *
     * @param memberCompany 公司名称
     */
    public void setMemberCompany(String memberCompany) {
        this.memberCompany = memberCompany;
    }

    /**
     * 获取用户姓名
     *
     * @return member_name - 用户姓名
     */
    public String getMemberName() {
        return memberName;
    }

    /**
     * 设置用户姓名
     *
     * @param memberName 用户姓名
     */
    public void setMemberName(String memberName) {
        this.memberName = memberName;
    }

	public String getNickName() {
		return nickName;
	}

	public void setNickName(String nickName) {
		this.nickName = nickName;
	}

	public Date getCreateTime() {
		return createTime;
	}

	public void setCreateTime(Date createTime) {
		this.createTime = createTime;
	}

}