package com.wmeimob.custom.system.service;

import com.wmeimob.custom.system.entity.SysRole;
import com.wmeimob.custom.system.entity.SysUser;
import org.springframework.security.core.context.SecurityContextHolder;

/**
 * Created by Shinez on 2017/11/3.
 */
public class LoginUserService {

    /**
     * 判断是否是root账户
     *
     * @param username
     * @return
     */
    public static boolean isRootAccount(String username) {
        return "system".equals(username);
    }

    /**
     * 根据登陆用户获取所能操作的角色类型
     *
     * @param userDetails
     * @return
     */
    public static Integer   getCanProcessRoleType(SysUser userDetails) {
        return isRootAccount(userDetails.getUsername()) ? SysRole.ROLE_TYPE_SUPER : SysRole.ROLE_TYPE_NORMAL;
    }


    /**
     * 获取当前登陆的用户
     *
     * @return
     */
    public static SysUser getPrincipal() {
        return (SysUser) SecurityContextHolder.getContext().getAuthentication().getPrincipal();
    }

    /**
     * 判断是否是超管
     *
     * @param userType
     * @return
     */
    public static boolean isSuper(Integer userType) {
        return userType.equals(SysUser.USER_TYPE_SUPER);
    }
}
