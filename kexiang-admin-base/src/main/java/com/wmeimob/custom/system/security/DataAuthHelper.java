package com.wmeimob.custom.system.security;

import com.wmeimob.custom.system.entity.SysUser;
import com.wmeimob.custom.system.entity.SysUserDataRole;
import com.wmeimob.tools.SpringRedisUtil;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.stereotype.Component;

import java.util.List;

/**
 * 数据权限帮助类
 * Created by Shinez on 2017/5/13.
 */
@Component
public class DataAuthHelper {

    public static final String DATA_AUTH_BY_MP_ID = "BY_MP_ID";

//    /**
//     * 获取公众号数据权限值
//     * @param userDetails
//     * @return
//     */
//    public static String getMpId(UserDetails userDetails) {
//       return getByUserDetails(userDetails,DATA_AUTH_BY_MP_ID);
//    }
//
//    /**
//     * 获取公众号数据权限值
//     * @return
//     */
//    public static String getMpId() {
//        return getByUserDetails(DATA_AUTH_BY_MP_ID);
//    }


    /**
     * 根据authCode和登陆用户获取权限值
     *
     * @param authCode
     * @return
     */
    public static String getByUserDetails(String authCode) {
        SysUser userDetails = (SysUser) SecurityContextHolder.getContext().getAuthentication().getPrincipal();
        List<SysUserDataRole> sysUserDataRoleList = SpringRedisUtil.get("userDataRoles:" + userDetails.getUsername());

        if (sysUserDataRoleList == null) return null;
        for (SysUserDataRole sysUserDataRole : sysUserDataRoleList) {
            if (authCode.equals(sysUserDataRole.getDataRoleCode())) {
                return sysUserDataRole.getColumnValue();
            }
        }
        return null;
    }

    /**
     * 根据authCode和登陆用户获取权限值
     *
     * @param userDetails
     * @param authCode
     * @return
     */
    public static String getByUserDetails(UserDetails userDetails, String authCode) {
        List<SysUserDataRole> sysUserDataRoleList = SpringRedisUtil.get("userDataRoles:" + userDetails.getUsername());
        if (sysUserDataRoleList == null) return null;
        for (SysUserDataRole sysUserDataRole : sysUserDataRoleList) {
            if (authCode.equals(sysUserDataRole.getDataRoleCode())) {
                return sysUserDataRole.getColumnValue();
            }
        }
        return null;
    }
}
