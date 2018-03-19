/*
* WechatApp.java
* EnTropyShiNe
* Copyright © 2017 ShiNez All Rights Reserved
* 作者：shinez
* QQ：136266602
* 2017-09-16 15:59 Created
*/ 
package com.wmeimob.custom.wechat.entity;

import org.springframework.util.StringUtils;

import javax.persistence.*;
import java.io.Serializable;

@Table(name = "wechat_app")
public class WechatApp implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    /**
     * 应用名称
     */
    @Column(name = "agent_name")
    private String agentName;

    /**
     * 应用ID
     */
    @Column(name = "agent_id")
    private String agentId;

    /**
     * 应用密钥
     */
    private String secret;

    /**
     * 公众号关联ID
     */
    private Integer mpid;

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
     * 获取应用名称
     *
     * @return agent_name - 应用名称
     */
    public String getAgentName() {
        return agentName;
    }

    /**
     * 设置应用名称
     *
     * @param agentName 应用名称
     */
    public void setAgentName(String agentName) {
        this.agentName = agentName;
    }

    /**
     * 获取应用ID
     *
     * @return agent_id - 应用ID
     */
    public String getAgentId() {
        return agentId;
    }

    /**
     * 设置应用ID
     *
     * @param agentId 应用ID
     */
    public void setAgentId(String agentId) {
        this.agentId = agentId;
    }

    /**
     * 获取应用密钥
     *
     * @return secret - 应用密钥
     */
    public String getSecret() {
        return secret;
    }

    /**
     * 设置应用密钥
     *
     * @param secret 应用密钥
     */
    public void setSecret(String secret) {
        this.secret = secret;
    }

    /**
     * 获取公众号关联ID
     *
     * @return mpid - 公众号关联ID
     */
    public Integer getMpid() {
        return mpid;
    }

    /**
     * 设置公众号关联ID
     *
     * @param mpid 公众号关联ID
     */
    public void setMpid(Integer mpid) {
        this.mpid = mpid;
    }

    public String validSave() {
      if(StringUtils.isEmpty(this.getAgentId()))
          return "应用ID不能为空";
        if(StringUtils.isEmpty(this.getAgentName()))
            return "应用名称不能为空";
        if(StringUtils.isEmpty(this.getSecret()))
            return "应用密钥不能为空";
        if(StringUtils.isEmpty(this.getMpid()))
            return "未指定公众号";
        return null;
    }

}