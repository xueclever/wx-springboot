package com.wmeimob.custom.system.controller;

import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import com.github.pagehelper.PageHelper;
import com.wmeimob.custom.annotation.Logging;
import com.wmeimob.custom.system.entity.SysMenu;
import com.wmeimob.custom.system.entity.SysUser;
import com.wmeimob.custom.system.config.SystemMenuConfig;
import com.wmeimob.custom.system.security.JwtUtility;
import com.wmeimob.custom.system.service.SysUserDataRoleService;
import com.wmeimob.custom.system.service.SysUserService;
import com.wmeimob.custom.message.RestResult;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;

/**
 * Created by Shinez on 2017/11/3.
 */

@Logging
@RestController
@RequestMapping("internal")
@Slf4j
public class InternalController {

    @Resource
    private SysUserDataRoleService sysUserDataRoleService;

    @Resource
    private SysUserService sysUserService;

    @Resource
    private JwtUtility jwtUtility;

    /**
     * 注入权限
     *
     * @return
     */
    @PostMapping("inject-data-auth")
    public JSONObject injectDataAuth(@RequestBody JSONArray jsonArray) {
        sysUserDataRoleService.injectDataAuth(jsonArray);
        return RestResult.success();
    }

    /**
     * 注入菜单
     *
     * @return
     */
    @PostMapping("inject-static-menu")
    public JSONObject injectStaticMenu(@RequestBody JSONArray jsonArray) {


        for (int i = 0; i < jsonArray.size(); i++) {
            SysMenu sysMenu = jsonArray.getObject(i, SysMenu.class);
            SystemMenuConfig.putRemoteInitSysMenusMap(sysMenu.getId(), sysMenu);
        }
        return RestResult.success();
    }

    /**
     * 修改管理员密码
     *
     * @return
     */
    @PostMapping("password")
    public JSONObject updateAdminPassword(HttpServletRequest request, String updateUserName, String newMd5Pwd) {
        String token = request.getHeader("Authorization");
        if (token == null) return RestResult.fail("token is missing");
        SysUser sysUser = (SysUser) jwtUtility.decodeToken(token);
        if (sysUser == null) return RestResult.fail("token is invalid");

        int result = sysUserService.updatePwdByUserName(sysUser.getUsername(), updateUserName, newMd5Pwd);
        return result > 0 ? RestResult.success() : RestResult.fail();
    }

    /**
     * 创建管理员账号
     *
     * @param sysUser
     * @return
     */
    @PostMapping("sys-user")
    public JSONObject addSysUser(HttpServletRequest request, @RequestBody SysUser sysUser) {
        String token = request.getHeader("Authorization");
        if (token == null) return RestResult.fail("token is missing");
        SysUser currentUser = (SysUser) jwtUtility.decodeToken(token);
        if (currentUser == null) return RestResult.fail("token is invalid");

        String validResult = SysUser.validSave(sysUser);
        if (validResult != null) {
            return RestResult.fail(validResult);
        }
        sysUser.setCreatedUser(currentUser.getId());
        int result = sysUserService.addByRemote(sysUser);
        return result > 0 ? RestResult.success() : RestResult.fail();
    }

    /**
     * 修改用户
     *
     * @param request
     * @param id
     * @param sysUser
     * @return
     */
    @PutMapping("{id}/sys-user")
    public JSONObject updateUser(HttpServletRequest request, @PathVariable Integer id, @RequestBody SysUser sysUser) {
        String token = request.getHeader("Authorization");
        if (token == null) return RestResult.fail("token is missing");
        SysUser currentUser = (SysUser) jwtUtility.decodeToken(token);
        if (currentUser == null) return RestResult.fail("token is invalid");

        sysUser.setRoleId(null);
        sysUser.setPwd(null);

        int result = sysUserService.updateMyCreatedUserSimple(currentUser,sysUser);
        return result > 0 ? RestResult.success() : RestResult.fail();

    }

}
