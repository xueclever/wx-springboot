package com.wmeimob.custom.system.controller;

import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import com.github.pagehelper.PageInfo;
import com.wmeimob.custom.annotation.Logging;
import com.wmeimob.custom.annotation.Page;
import com.wmeimob.custom.system.entity.*;
import com.wmeimob.custom.system.config.SystemMenuConfig;
import com.wmeimob.custom.system.mapper.*;
import com.wmeimob.custom.system.security.JwtUtility;
import com.wmeimob.custom.system.security.SysSecurityMetadataSource;
import com.wmeimob.custom.system.service.*;
import com.wmeimob.tools.SpringRedisUtil;
import com.wmeimob.custom.message.MessageConst;
import com.wmeimob.custom.message.RestResult;
import com.wmeimob.tools.qiniu.QiniuUtil;
import com.wmeimob.tools.web.IpAddressHelper;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.util.Assert;
import org.springframework.util.DigestUtils;
import org.springframework.util.StringUtils;
import org.springframework.web.bind.annotation.*;
import tk.mybatis.mapper.entity.Example;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.*;


/**
 * Created by RestResult on 2016/1/5.
 */

@Logging
@RestController
@RequestMapping("main")
public class SysController {


    @Resource
    private SysMenuService sysMenuService;
    @Resource
    private SysMenuMapper sysMenuMapper;
    @Resource
    private SysUserMapper sysUserMapper;

    @Resource
    private SimpleConfigMapper simpleConfigMapper;

    @Resource
    private SysUserDataRoleMapper sysUserDataRoleMapper;

    @Resource
    private SysUserService sysUserService;
    @Resource
    private SysRoleService sysRoleService;
    @Resource
    private SysResourceService sysResourceService;

    @Resource
    private SysUserDataRoleService sysUserDataRoleService;

    @Resource
    private JwtUtility jwtUtility;


    private final Logger logger = LoggerFactory.getLogger(this.getClass());


    /**
     * 登陆
     *
     * @param response
     * @param user
     * @return
     */
    @PostMapping("login")
    public JSONObject login(HttpServletResponse response, SysUser user) {
        SysUser loginUser = sysUserService.login(user);
        Assert.notNull(loginUser, "用户不存在");
        String jwt = jwtUtility.generateToken(loginUser);
        response.setHeader("Authorization", jwt);
        return RestResult.success();
    }

    /**
     * 注销
     *
     * @return
     */
    @PostMapping("logout")
    public JSONObject logout() {

        SysUser sysUser = (SysUser) SecurityContextHolder.getContext()
                .getAuthentication()
                .getPrincipal();
        SpringRedisUtil.delete("userRoles:" + sysUser.getUsername());
        SpringRedisUtil.delete("userDataRoles:" + sysUser.getUsername());
        return RestResult.success();
    }


    /**
     * 获取登陆信息
     *
     * @param request
     * @return 可选：
     * menuIconMap 菜单icon
     * 必须：menus 菜单
     * nickname 当前登陆昵称
     * dataDict 数据字典
     */
    @GetMapping("login-info")
    public JSONObject loginInfo(HttpServletRequest request) {
        SysUser userDetails = (SysUser) SecurityContextHolder.getContext()
                .getAuthentication()
                .getPrincipal();
        Map<String, Object> map = new HashMap<>();
        //加载数据字典
        map.put("dataDict", SysSecurityMetadataSource.getDataDictionaryMap());
//        加载省市区信息
//        map.put("cityInfo", cityService.getCityInfoList());
        //开发者账号
        boolean isRoot = LoginUserService.isRootAccount(userDetails.getUsername());
        if (isRoot) {
            //系统用户
            //获取基础菜单
            List<SysMenu> sysMenus = SystemMenuConfig.loadMenus(isRoot);
            //系统菜单图标映射（非必需）
            map.put("menuIconMap", SysMenu.convertMenuIconMap(sysMenus));

            //系统菜单
            map.put("menus", sysMenus);
            map.put("nickname", "系统管理员");
            //用户类型
            map.put("userType", SysUser.USER_TYPE_ROOT);
            return RestResult.success(map);
        }

        List<SysRole> roles = (List<SysRole>) userDetails.getAuthorities();
        if (roles == null || roles.size() == 0) {
            //没有给管理员分配角色
            return RestResult.fail("您无权登陆管理后台");
        }
        Integer roleId = sysUserService.getUserRoleId(userDetails.getUsername());
        //根据角色加载菜单
        List<SysMenu> menuList = sysMenuMapper.selectMenus(roleId);
        //如果是管理员角色，增加权限菜单
        if (LoginUserService.isSuper(userDetails.getUserType())) {
            map.put("userType", SysUser.USER_TYPE_SUPER);
            menuList.addAll(SystemMenuConfig.loadMenus(false));
        }
        //如果没有可以管理的菜单
        if (menuList == null || menuList.size() == 0) {
            return RestResult.fail("没有可管理项");
        }

        map.put("menuIconMap", SysMenu.convertMenuIconMap(menuList));//保存菜单icon
        map.put("menus", menuList);
        map.put("nickname", userDetails.getNickname());
        //更新用户登陆信息
        userDetails.setLastLoginDate(new Date());
        userDetails.setLastLoginIp(IpAddressHelper.getRemoteHost(request));
        sysUserMapper.updateByPrimaryKeySelective(userDetails);
        return RestResult.success(map);
    }


    /**
     * 密码修改
     *
     * @param oldPwd
     * @param newPwd
     * @param request
     * @return
     */
    @PutMapping("sys-user/pwd")
    public JSONObject modifyPwd(String oldPwd, String newPwd, HttpServletRequest request) {
        int result = 0;
        SysUser userDetails = (SysUser) SecurityContextHolder.getContext()
                .getAuthentication()
                .getPrincipal();
        oldPwd = DigestUtils.md5DigestAsHex(oldPwd.getBytes());
        newPwd = DigestUtils.md5DigestAsHex(newPwd.getBytes());
        if (LoginUserService.isRootAccount(userDetails.getUsername())) {
            Example example = new Example(SimpleConfig.class);
            example.createCriteria().andEqualTo("configValue", oldPwd).andEqualTo("configType", -1);
            SimpleConfig simpleConfig = new SimpleConfig();
            simpleConfig.setConfigValue(newPwd);
            result = simpleConfigMapper.updateByExampleSelective(simpleConfig, example);
        } else {
            Integer id = userDetails.getId();
            if (id == null) return RestResult.fail();
            Example example = new Example(SysUser.class);
            example.createCriteria().andEqualTo("id", userDetails.getId()).andEqualTo("pwd", oldPwd);
            SysUser sysUser = new SysUser();
            sysUser.setId(id);
            sysUser.setPwd(newPwd);
            result = sysUserMapper.updateByExampleSelective(sysUser, example);
        }
        return result > 0 ? RestResult.success() : RestResult.fail("密码错误");
    }


    /********************************************系统菜单****************************************************/

    /**
     * 查询角色菜单
     *
     * @param request
     * @param roleId
     * @return
     */
    @PreAuthorize("hasAnyRole('SUPER','ROOT')")
    @GetMapping(value = "sys-role/{roleId}/menus")
    public JSONObject getRoleRootMenus(HttpServletRequest request, @PathVariable Integer roleId) {
        if (StringUtils.isEmpty(roleId))
            return RestResult.fail("不正确的角色");
        List<ZTreeNode> zTreeNodeList = sysMenuService.findMenus(roleId);
        Map<String, Object> map = new HashMap<>();
        map.put("menusData", JSONObject.toJSON(zTreeNodeList));
        return RestResult.success(map);
    }


    /**
     * 修改角色菜单
     *
     * @param zTreeNodeArray
     * @param request
     * @return
     */
    @PreAuthorize("hasAnyRole('SUPER','ROOT')")
    @PutMapping(value = "sys-role/{roleId}/menus")
    public JSONObject updateRoleMenus(ZTreeNodeArray zTreeNodeArray, HttpServletRequest request, @PathVariable Integer roleId) {
        int result = sysMenuService.updateRoleMenus(zTreeNodeArray.getNodes(), roleId);
        return result > 0 ? RestResult.success() : RestResult.fail();
    }
    /********************************************系统菜单END****************************************************/

    /********************************************系统角色****************************************************/

    /**
     * 获取角色
     *
     * @param request
     * @return
     */
    @PreAuthorize("hasAnyRole('SUPER','ROOT')")
    @GetMapping("sys-role")
    public JSONObject getRoles(HttpServletRequest request) {
        List<SysRole> list = sysRoleService.findAll();
        return RestResult.success(new PageInfo<>(list));
    }


    /**
     * 保存角色
     *
     * @param request
     * @param sysRole
     * @return
     */
    @PreAuthorize("hasAnyRole('SUPER','ROOT')")
    @RequestMapping(value = "sys-role", method = {RequestMethod.POST, RequestMethod.PUT})
    public JSONObject saveRole(HttpServletRequest request, SysRole sysRole) {
        int result = sysRoleService.save(sysRole);
        return result > 0 ? RestResult.success() : RestResult.fail();
    }

    /**
     * 删除角色
     *
     * @param id
     * @return
     */
    @PreAuthorize("hasAnyRole('SUPER','ROOT')")
    @DeleteMapping("sys-role/{id}")
    public JSONObject delRole(@PathVariable("id") Integer id) {
        if (id == null) return RestResult.fail();
        return sysRoleService.del(id) > 0 ? RestResult.success() : RestResult.fail();
    }
    /********************************************系统角色END****************************************************/


    /********************************************系统资源****************************************************/

    /**
     * 添加系统资源
     *
     * @param resource
     * @return
     */
    @PreAuthorize("hasAnyRole('ROOT')")
    @PostMapping("sys-resource")
    public JSONObject addResource(SysResource resource) {
        sysResourceService.add(resource);
        return RestResult.success();
    }

    /**
     * 修改系统资源
     *
     * @param id
     * @param resource
     * @return
     */
    @PreAuthorize("hasAnyRole('ROOT')")
    @PutMapping("sys-resource/{id}")
    public JSONObject updateResource(@PathVariable Integer id, SysResource resource) {
        int result = sysResourceService.update(resource);
        return result > 0 ? RestResult.success() : RestResult.fail();
    }

    /**
     * 删除系统资源
     *
     * @param id
     * @return
     */
    @PreAuthorize("hasAnyRole('ROOT')")
    @DeleteMapping("sys-resource/{id}")
    public JSONObject delResource(@PathVariable Integer id) {
        int result = sysResourceService.del(id);
        return result > 0 ? RestResult.success() : RestResult.fail();
    }


    /**
     * 获取资源
     *
     * @return
     */
    @PreAuthorize("hasAnyRole('SUPER','ROOT')")
    @GetMapping("sys-resource")
    public JSONObject getRolePermission(String keyword) {
        List<SysResource> sysResources = sysResourceService.findAll(keyword);
        SysUser sysUser = LoginUserService.getPrincipal();
        boolean isRoot = LoginUserService.isRootAccount(sysUser.getUsername());
        Map<String, Object> map = new HashMap<>();
        String[] roles = {"ROOT", "ACT"};
        map.put("roles", isRoot ? roles : "");
        map.put("page", new PageInfo<>(sysResources));
        return RestResult.success(map);
    }


    /**
     * 根据资源id查找对应的权限
     *
     * @param id
     * @return
     */
    @PreAuthorize("hasAnyRole('SUPER','ROOT')")
    @GetMapping("sys-resource/{id}/permission")
    public JSONObject getPermissionByResourceId(@PathVariable Integer id) {
        List<SysPermission> sysPermissions = sysResourceService.findById(id);
        return RestResult.success(sysPermissions);
    }

    /**
     * 更新资源权限
     *
     * @param resourceId
     * @param sysPermission
     * @return
     */
    @PreAuthorize("hasAnyRole('SUPER','ROOT')")
    @RequestMapping(value = "sys-resource/{id}/permission", method = {RequestMethod.PUT, RequestMethod.POST})
    public JSONObject updatePermission(@PathVariable("id") Integer resourceId, SysPermission sysPermission) {
        sysResourceService.save(resourceId, sysPermission.getPermissions());
        return RestResult.success();
    }

    /********************************************系统资源END****************************************************/


    /********************************************系统用户****************************************************/

    /**
     * 获取管理用户
     *
     * @param request
     * @return
     */
    @PreAuthorize("hasAnyRole('SUPER','ROOT')")
    @GetMapping("sys-user")
    @Page
    public JSONObject getUsers(HttpServletRequest request, SysUser querySysUser) {
        SysUser sysUser = (SysUser) SecurityContextHolder.getContext()
                .getAuthentication()
                .getPrincipal();
        boolean isRootAccount = LoginUserService.isRootAccount(sysUser.getUsername());
        String queryUsername = request.getParameter("username");
        List<SysUser> list = new ArrayList<>();
        Map<String, Object> map = new HashMap<>();
        Example example = new Example(SysUser.class);

        Map<String, SysUserDataRole> sysUserDataRoleMap = new HashMap<>();
        Example.Criteria criteria = example.createCriteria();
        if (!isRootAccount) {
            criteria.andEqualTo("createdUser", sysUser.getId());
        } else {
            criteria.andEqualTo("userType", SysUser.USER_TYPE_SUPER);
        }
        criteria.andEqualTo("roleId", querySysUser.getRoleId())
                .andLike("username", "%" + queryUsername + "%");

        //获取数据权限维度

        if (isRootAccount) {
            //获取数据权限维度
            sysUserDataRoleMap = sysUserDataRoleService.getAdminDataRole();
        } else {
            //获取数据权限维度
            sysUserDataRoleMap = sysUserDataRoleService.getChildrenDataRole();
        }

        List<SysUserDataRole> sysUserDataRoles = new ArrayList<>();

        if (sysUserDataRoleMap != null) {
            sysUserDataRoles.addAll(sysUserDataRoleMap.values());
        }

        map.put("dataRoles", sysUserDataRoles);
        list = sysUserMapper.selectByExample(example);
        map.put("roles", sysRoleService.findAll());
        map.put("page", new PageInfo<>(list));
        JSONObject jsonObject = RestResult.success(map);
        return jsonObject;
    }


    /**
     * 保存系统用户
     *
     * @param request
     * @param user
     * @param sysUserDataRole
     * @return
     */
    @PreAuthorize("hasAnyRole('SUPER','ROOT')")
    @RequestMapping(value = "sys-user", method = {RequestMethod.POST, RequestMethod.PUT})
    public JSONObject saveUser(HttpServletRequest request, SysUser user, SysUserDataRole sysUserDataRole) {
        String validResult = SysUser.validSave(user);
        if (validResult != null) {
            return RestResult.fail(validResult);
        }
        int result = sysUserService.save(user, sysUserDataRole);
        return result > 0 ? RestResult.success() : RestResult.fail();
    }


    /**
     * 删除管理员
     *
     * @param request
     * @param id
     * @return
     */
    @PreAuthorize("hasAnyRole('SUPER','ROOT')")
    @DeleteMapping("sys-user/{id}")
    public JSONObject delUser(HttpServletRequest request, @PathVariable("id") Integer id) {
        SysUser sysUser = (SysUser) SecurityContextHolder.getContext()
                .getAuthentication()
                .getPrincipal();
        if (id == null) return RestResult.fail("无法识别删除的用户");
        int result = 0;
        Example example = new Example(SysUser.class);
        example.createCriteria().andEqualTo("createdUser", id);
        int childCount = sysUserMapper.selectCountByExample(example);
        if (childCount > 0)
            return RestResult.fail("该管理员用户下有子账号，你不能删除它");
        example.clear();
        example.createCriteria()
                .andEqualTo("id", id)
                .andEqualTo("createdUser", sysUser.getId());
        result = sysUserMapper.deleteByExample(example);
        return result > 0 ? RestResult.success() : RestResult.fail();
    }

    /**
     * 密码重置
     *
     * @param request
     * @param sysUser
     * @return
     */
    @PreAuthorize("hasAnyRole('SUPER','ROOT')")
    @PutMapping("resetPwd")
    public JSONObject resetPwd(HttpServletRequest request, SysUser sysUser) {
        SysUser userDetails = (SysUser) SecurityContextHolder.getContext()
                .getAuthentication()
                .getPrincipal();
        if (StringUtils.isEmpty(sysUser.getId()) || StringUtils.isEmpty(sysUser.getPwd())) {
            return RestResult.msg(MessageConst.Msg.ILLEGAL_PARAM);
        }
        sysUser.setPwd(DigestUtils.md5DigestAsHex(sysUser.getPwd().getBytes()));
        int result = 0;
        Example example = new Example(SysUser.class);
        Example.Criteria criteria = example.createCriteria()
                .andEqualTo("id", sysUser.getId());
        if (!LoginUserService.isRootAccount(userDetails.getUsername())) {
            criteria.andEqualTo("createdUser", userDetails.getId());
        }
        result = sysUserMapper.updateByExampleSelective(sysUser, example);
        return result > 0 ? RestResult.success() : RestResult.fail();
    }


    /********************************************系统用户END****************************************************/


    /**
     * 获取七牛上传token
     *
     * @param request
     * @return
     */
    @RequestMapping("qiniu-token")
    public JSONObject getQiniuToken(HttpServletRequest request) {
        Map<String, Object> map = new HashMap<>();
        map.put("uploadToken", QiniuUtil.getToken());
        map.put("domain", QiniuUtil.getDomain());
        return RestResult.success(map);
    }


    /**
     * 根据用户获取数据权限
     *
     * @param request
     * @param id
     * @return
     */
    @PreAuthorize("hasAnyRole('SUPER','ROOT')")
    @GetMapping("sys-user/{id}/data-role")
    public JSONObject getDataRoleBySysUserId(HttpServletRequest request, @PathVariable("id") Integer id) {
        if (id == null) return RestResult.fail();
        Example example = new Example(SysUserDataRole.class);
        example.createCriteria().andEqualTo("sysUserId", id);
        List<SysUserDataRole> sysUserDataRoles = sysUserDataRoleMapper.selectByExample(example);
        return RestResult.success(sysUserDataRoles);
    }

    /**
     * 获取全部系统菜单
     *
     * @return
     */
    @PreAuthorize("hasAnyRole('ROOT')")
    @GetMapping("menu")
    public JSONObject getMenus() {
        List<SysMenu> sysMenus = sysMenuService.findMenus();
        return RestResult.success(sysMenus);
    }

    /**
     * 新增菜单
     *
     * @param sysMenus
     * @return
     */
    @PreAuthorize("hasAnyRole('ROOT')")
    @PostMapping("menu")
    public JSONObject addMenu(SysMenu sysMenus) {
        sysMenuService.add(sysMenus);
        return RestResult.success(sysMenus);
    }


    /**
     * 修改菜单
     *
     * @param id
     * @param sysMenus
     * @return
     */
    @PreAuthorize("hasAnyRole('ROOT')")
    @PutMapping("menu/{id}")
    public JSONObject updateMenu(@PathVariable Integer id, SysMenu sysMenus) {
        int result = sysMenuService.update(sysMenus);
        return result > 0 ? RestResult.success() : RestResult.fail();
    }

    /**
     * 批量保存
     *
     * @param data
     * @return
     */
    @PreAuthorize("hasAnyRole('ROOT')")
    @PostMapping("menu/list")
    public JSONObject updateMenu(@RequestBody JSONArray data) {
        if (data == null || data.size() == 0) return RestResult.fail("没有更新任何数据");
        int result = sysMenuService.update(data);
        return result > 0 ? RestResult.success() : RestResult.fail();
    }

    /**
     * 删除菜单
     *
     * @param id
     * @return
     */
    @PreAuthorize("hasAnyRole('ROOT')")
    @DeleteMapping("menu/{id}")
    public JSONObject delMenu(@PathVariable Integer id) {
        int result = sysMenuService.del(id);
        return result > 0 ? RestResult.success() : RestResult.fail();
    }


}