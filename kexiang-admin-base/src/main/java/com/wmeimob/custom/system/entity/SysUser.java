/*
* SysUser.java
* EnTropyShiNe
* Copyright © 2016 ShiNez All Rights Reserved
* 作者：ShiNez
* QQ：136266602
* 2017-06-06 17:34 Created
*/ 
package com.wmeimob.custom.system.entity;

import com.wmeimob.custom.exception.CustomException;
import com.wmeimob.tools.InputValidator;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;

import javax.persistence.*;
import java.io.Serializable;
import java.util.*;

@Table(name = "sys_user")
public class SysUser  implements Serializable,UserDetails {


    public static final Integer USER_TYPE_SUPER = 10001;
    public static final Integer USER_TYPE_CHILD = 10002;
    public static final Integer USER_TYPE_ROOT = 10005;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;


    /**
     * 用户名
     */
    private String username;

    /**
     * 显示名
     */
    private String nickname;

    /**
     * 密码
     */
    private String pwd;

    /**
     * 盐值
     */
    private String salt;

    /**
     * 电话
     */
    private String tel;

    /**
     * 系统用户类型 10001 母账号 10002子账号
     */
    @Column(name = "user_type")
    private Integer userType;

    /**
     * 角色id 
     */
    @Column(name = "role_id")
    private Integer roleId;

    /**
     * 角色名称
     */
    @Column(name = "role_name")
    private String roleName;

    /**
     * 是否启用
     */
    @Column(name = "is_enabled")
    private Boolean isEnabled;

    /**
     * 是否锁定
     */
    @Column(name = "is_locked")
    private Boolean isLocked;

    /**
     * 创建者（母账号或system或root）
     */
    @Column(name = "created_user")
    private Integer createdUser;

    /**
     * 是否开启数据权限验证
     */
    @Column(name = "enable_data_role")
    private Boolean enableDataRole;

    @Column(name = "created_at")
    private Date createdAt;

    @Column(name = "last_login_date")
    private Date lastLoginDate;

    @Column(name = "last_login_ip")
    private String lastLoginIp;

    private static final long serialVersionUID = 1L;

    /**
     * 角色集
     */
    @Transient
    private List<SysRole> roles;

    @Transient
    private List<SysUserDataRole> dataRoles;

    public SysUser(Integer id,String username ,String nickname, Integer userType, List<GrantedAuthority> authorities,List<SysUserDataRole> dataRoles) {
        this.id=id;
        this.username=username;
        this.nickname=nickname;
        this.userType = userType;
        this.authorities=authorities;
        this.dataRoles = dataRoles;
    }

    public SysUser(){}

    public List<SysUserDataRole> getDataRoles() {
        return dataRoles;
    }

    public void setDataRoles(List<SysUserDataRole> dataRoles) {
        this.dataRoles = dataRoles;
    }

    public List<SysRole> getRoles() {
        return roles;
    }

    public void setRoles(List<SysRole> roles) {
        this.roles = roles;
    }

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
     * Returns the authorities granted to the user. Cannot return <code>null</code>.
     *
     * @return the authorities, sorted by natural key (never <code>null</code>)
     */
    @Override
    public Collection<? extends GrantedAuthority> getAuthorities() {
        return authorities;
    }


    @Transient
    private  List<GrantedAuthority> authorities;

    /**
     * Returns the password used to authenticate the user.
     *
     * @return the password
     */
    @Override
    public String getPassword() {
        return getPwd();
    }

    /**
     * 获取用户名
     *
     * @return username - 用户名
     */
    public String getUsername() {
        return username;
    }

    /**
     * Indicates whether the user's account has expired. An expired account cannot be
     * authenticated.
     *
     * @return <code>true</code> if the user's account is valid (ie non-expired),
     * <code>false</code> if no longer valid (ie expired)
     */
    @Override
    public boolean isAccountNonExpired() {
        return true;
    }

    /**
     * Indicates whether the user is locked or unlocked. A locked user cannot be
     * authenticated.
     *
     * @return <code>true</code> if the user is not locked, <code>false</code> otherwise
     */
    @Override
    public boolean isAccountNonLocked() {
        return !(getIsLocked()==null?true:getIsLocked());
    }

    /**
     * Indicates whether the user's credentials (password) has expired. Expired
     * credentials prevent authentication.
     *
     * @return <code>true</code> if the user's credentials are valid (ie non-expired),
     * <code>false</code> if no longer valid (ie expired)
     */
    @Override
    public boolean isCredentialsNonExpired() {
        return true;
    }

    /**
     * Indicates whether the user is enabled or disabled. A disabled user cannot be
     * authenticated.
     *
     * @return <code>true</code> if the user is enabled, <code>false</code> otherwise
     */
    @Override
    public boolean isEnabled() {
        return getIsEnabled()==null?false:getIsEnabled();
    }

    /**
     * 设置用户名
     *
     * @param username 用户名
     */
    public void setUsername(String username) {
        this.username = username;
    }

    /**
     * 获取显示名
     *
     * @return nickname - 显示名
     */
    public String getNickname() {
        return nickname;
    }

    /**
     * 设置显示名
     *
     * @param nickname 显示名
     */
    public void setNickname(String nickname) {
        this.nickname = nickname;
    }

    /**
     * 获取密码
     *
     * @return pwd - 密码
     */
    public String getPwd() {
        return pwd;
    }

    /**
     * 设置密码
     *
     * @param pwd 密码
     */
    public void setPwd(String pwd) {
        this.pwd = pwd;
    }

    /**
     * 获取盐值
     *
     * @return salt - 盐值
     */
    public String getSalt() {
        return salt;
    }

    /**
     * 设置盐值
     *
     * @param salt 盐值
     */
    public void setSalt(String salt) {
        this.salt = salt;
    }

    /**
     * 获取电话
     *
     * @return tel - 电话
     */
    public String getTel() {
        return tel;
    }

    /**
     * 设置电话
     *
     * @param tel 电话
     */
    public void setTel(String tel) {
        this.tel = tel;
    }

    /**
     * 获取系统用户类型 10001 母账号 10002子账号
     *
     * @return user_type - 系统用户类型 10001 母账号 10002子账号
     */
    public Integer getUserType() {
        return userType;
    }

    /**
     * 设置系统用户类型 10001 母账号 10002子账号
     *
     * @param userType 系统用户类型 10001 母账号 10002子账号
     */
    public void setUserType(Integer userType) {
        this.userType = userType;
    }

    /**
     * 获取角色id 
     *
     * @return role_id - 角色id 
     */
    public Integer getRoleId() {
        return roleId;
    }

    /**
     * 设置角色id 
     *
     * @param roleId 角色id 
     */
    public void setRoleId(Integer roleId) {
        this.roleId = roleId;
    }

    /**
     * 获取角色名称
     *
     * @return role_name - 角色名称
     */
    public String getRoleName() {
        return roleName;
    }

    /**
     * 设置角色名称
     *
     * @param roleName 角色名称
     */
    public void setRoleName(String roleName) {
        this.roleName = roleName;
    }

    /**
     * 获取是否启用
     *
     * @return is_enable - 是否启用
     */
    public Boolean getIsEnabled() {
        return isEnabled;
    }

    /**
     * 设置是否启用
     *
     * @param isEnable 是否启用
     */
    public void setIsEnabled(Boolean isEnable) {
        this.isEnabled = isEnable;
    }

    /**
     * 获取是否锁定
     *
     * @return is_locked - 是否锁定
     */
    public Boolean getIsLocked() {
        return isLocked;
    }

    /**
     * 设置是否锁定
     *
     * @param isLocked 是否锁定
     */
    public void setIsLocked(Boolean isLocked) {
        this.isLocked = isLocked;
    }

    /**
     * 获取创建者（为空表示root账号创建）
     *
     * @return created_user - 创建者（母账号或system或root）
     */
    public Integer getCreatedUser() {
        return createdUser;
    }

    /**
     * 设置创建者（为空表示root账号创建）
     *
     * @param createdUser 创建者（母账号或system或root）
     */
    public void setCreatedUser(Integer createdUser) {
        this.createdUser = createdUser;
    }

    /**
     * 获取是否开启数据权限验证
     *
     * @return enable_data_role - 是否开启数据权限验证
     */
    public Boolean getEnableDataRole() {
        return enableDataRole;
    }

    /**
     * 设置是否开启数据权限验证
     *
     * @param enableDataRole 是否开启数据权限验证
     */
    public void setEnableDataRole(Boolean enableDataRole) {
        this.enableDataRole = enableDataRole;
    }

    /**
     * @return created_at
     */
    public Date getCreatedAt() {
        return createdAt;
    }

    /**
     * @param createdAt
     */
    public void setCreatedAt(Date createdAt) {
        this.createdAt = createdAt;
    }

    /**
     * @return last_login_date
     */
    public Date getLastLoginDate() {
        return lastLoginDate;
    }

    /**
     * @param lastLoginDate
     */
    public void setLastLoginDate(Date lastLoginDate) {
        this.lastLoginDate = lastLoginDate;
    }

    /**
     * @return last_login_ip
     */
    public String getLastLoginIp() {
        return lastLoginIp;
    }

    /**
     * @param lastLoginIp
     */
    public void setLastLoginIp(String lastLoginIp) {
        this.lastLoginIp = lastLoginIp;
    }


    public static String validSave(SysUser user) {
        if (!InputValidator.isUsername(user.getUsername()))
            return "用户名含有非法字符";
        if("system".equals(user.getUsername()))
            return "您不能使用这个名字";
        if (user.getNickname().contains("<") || user.getNickname().contains(">"))
            return "昵称含有非法字符";
        if (!Objects.equals(user.getTel(), "") && !InputValidator.isMobile(user.getTel()))
            return "联系电话不合法 ";
        if(user.getRoleId()==null){
            return "角色没有指定";
        }
        if (user.getIsLocked()==null)user.setIsLocked(false);
        if (user.getIsEnabled()==null)user.setIsEnabled(false);
        if (user.getEnableDataRole()==null)user.setEnableDataRole(false);
        return null;
    }

    public static void filterUserName(String username) {
        if("system".equals(username)||"admin".equals(username))
            throw new CustomException("您不能使用这个名字");
    }
}