package com.wmeimob.custom.system.service;

import com.wmeimob.custom.exception.CustomException;
import com.wmeimob.custom.system.entity.*;
import com.wmeimob.custom.system.mapper.*;
import com.wmeimob.tools.SpringRedisUtil;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.dao.DuplicateKeyException;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.util.Assert;
import org.springframework.util.DigestUtils;
import org.springframework.util.StringUtils;
import tk.mybatis.mapper.entity.Example;

import javax.annotation.Resource;
import java.util.*;

/**
 * Created by Shinez on 2017/5/19.
 */
@Service
@Transactional
public class SysUserService {


    @Resource
    private SysUserMapper sysUserMapper;

    @Resource
    private SysRoleMapper sysRoleMapper;
    @Resource
    private SimpleConfigMapper simpleConfigMapper;

    @Resource
    private SysUserDataRoleMapper sysUserDataRoleMapper;

    @Resource
    private SysUserDataRoleService sysUserDataRoleService;

    private final Logger logger = LoggerFactory.getLogger(this.getClass());


    /**
     * 获取角色id（目前系统仅支持自定义单角色）
     *
     * @param username
     * @return
     */
    public Integer getUserRoleId(String username) {
        List<SysRole> roles = SpringRedisUtil.get("userRoles:" + username);
        Integer roleId = -1;
        for (SysRole role : roles) {
            if (role.getId() != null) {
                roleId = role.getId();
                break;
            }
        }
        return roleId;
    }


    private void throwErrorAuthentication() {
        throw new CustomException("用户名或密码错误");
    }

    private void throwErrorAuthentication(String reason) {
        throw new CustomException(reason);
    }

    private String generateSecurityRoleCode(String roleCode) {
        return "ROLE_" + roleCode;
    }


    /**
     * 构建system账号
     *
     * @param pwd
     * @return
     */
    private SysUser createSystemUser(String pwd) {
        SimpleConfig simpleConfig = new SimpleConfig();
        simpleConfig.setConfigType(-1);
        simpleConfig = simpleConfigMapper.selectOne(simpleConfig);
        if (!pwd.equals(simpleConfig.getConfigValue()))
            throwErrorAuthentication();
        List<SysRole> roles = new ArrayList<>();
        SysRole sysRole = new SysRole();
        sysRole.setRoleCode(generateSecurityRoleCode("ROOT"));
        sysRole.setId(0);
        roles.add(sysRole);

        sysRole = new SysRole();
        sysRole.setId(0);
        sysRole.setRoleCode(generateSecurityRoleCode("ACTUATOR"));//服务监控角色
        roles.add(sysRole);

        SysUser sysUser = new SysUser();
        sysUser.setId(0);
        sysUser.setUsername("system");
        sysUser.setUserType(SysUser.USER_TYPE_ROOT);
        sysUser.setNickname("系统管理员");
        sysUser.setIsLocked(false);
        sysUser.setIsEnabled(true);
        sysUser.setRoles(roles);
        return sysUser;
    }

    /**
     * 构建管理员
     *
     * @param sysUser
     * @return
     */
    private SysUser createAdmin(SysUser sysUser) {
        List<SysRole> roles = new ArrayList<>();
        if (SysUser.USER_TYPE_SUPER.equals(sysUser.getUserType())) {
            //创建超管
            SysRole sysRole = new SysRole();
            sysRole.setRoleCode(generateSecurityRoleCode("SUPER"));
            roles.add(sysRole);
        }
        SysRole dbSysRole = sysRoleMapper.selectByPrimaryKey(sysUser.getRoleId());
        dbSysRole.setRoleCode(generateSecurityRoleCode(dbSysRole.getRoleCode()));
        roles.add(dbSysRole);

        sysUser.setRoles(roles);
        sysUser.setPwd("");
        if (sysUser.getEnableDataRole()) {
            //数据权限
            SysUserDataRole sysUserDataRole = new SysUserDataRole();
            sysUserDataRole.setSysUserId(sysUser.getId());
            List<SysUserDataRole> sysUserDataRoles = sysUserDataRoleMapper.select(sysUserDataRole);
            sysUser.setDataRoles(sysUserDataRoles);
        }
        return sysUser;
    }

    /**
     * 登陆
     *
     * @param user
     * @return
     */
    public SysUser login(SysUser user) {
        String username = user.getUsername();
        String pwd = user.getPwd();
        Assert.hasText(username, "用户名不能为空");
        Assert.hasLength(pwd, "密码不能为空");
        pwd = DigestUtils.md5DigestAsHex(pwd.getBytes());
        if (LoginUserService.isRootAccount(username)) {
            return createSystemUser(pwd);
        }
        SysUser queryLogin = new SysUser();
        queryLogin.setUsername(username);
        queryLogin.setPwd(pwd);
        queryLogin = sysUserMapper.selectOne(queryLogin);
        if (queryLogin == null) {
            throw new CustomException("用户名或密码错误");
        }
        if (queryLogin.getIsLocked() || !queryLogin.getIsEnabled()) {
            throwErrorAuthentication("用户被锁定或被禁用");
        }
        return createAdmin(queryLogin);
    }


    /**
     * 保存账号
     *
     * @param user
     * @param sysUserDataRole
     * @return
     */
    public int save(SysUser user, SysUserDataRole sysUserDataRole) {

        SysUser userDetails = (SysUser) SecurityContextHolder.getContext().getAuthentication().getPrincipal();
        boolean isRoot = LoginUserService.isRootAccount(userDetails.getUsername());
        if (!isRoot) {//当前是超管
            user.setCreatedUser(userDetails.getId());
            user.setUserType(SysUser.USER_TYPE_CHILD);
        } else {
            user.setCreatedUser(0);
            user.setUserType(SysUser.USER_TYPE_SUPER);
        }

        int result;
        if (StringUtils.isEmpty(user.getId())) {
            //新增
            user.setCreatedAt(new Date());
            user.setPwd(DigestUtils.md5DigestAsHex(user.getPwd().getBytes()));
            try {
                sysUserMapper.insertSelective(user);
                result = user.getId();
            } catch (DuplicateKeyException e) {
                throw new CustomException("您不能使用这个用户名");
            }
        } else {
            user.setUsername(null);
            user.setUserType(null);
            //修改
            Example example = new Example(SysUser.class);
            Example.Criteria criteria = example.createCriteria();
            if (!LoginUserService.isRootAccount(userDetails.getUsername())) {
                criteria.andEqualTo("createdUser", user.getCreatedUser());
            }
            criteria.andEqualTo("id", user.getId());
            if (sysUserDataRole.getDataRoles() == null || sysUserDataRole.getDataRoles().length == 0)
                user.setEnableDataRole(false);
            result = sysUserMapper.updateByExampleSelective(user, example);
        }


        if (result > 0) {
            //清空当前修改的账号的数据权限和他的子账号数据权限
            SysUserDataRole delCondition = new SysUserDataRole();
            delCondition.setSysUserId(user.getId());
            sysUserDataRoleMapper.delete(delCondition);
            //sql外键级联删除
            delCondition = new SysUserDataRole();
            delCondition.setExtendsUser(user.getId());
            sysUserDataRoleMapper.delete(delCondition);

            if (isRoot && user.getEnableDataRole()) {
                setSuperDataRole(user);
            } else {
                setChildrenDataRole(user);
            }
        }
        return result;
    }


    /**
     * 远程注册
     *
     * @param sysUser
     * @return
     */
    public int addByRemote(SysUser sysUser) {
        sysUser.setUserType(SysUser.USER_TYPE_SUPER);
        sysUser.setCreatedAt(new Date());
        if (sysUser.getDataRoles() == null || sysUser.getDataRoles().size() == 0) {
            throw new CustomException("创建的用户丢失数据权限维度");
        }

        try {
            sysUserMapper.insertSelective(sysUser);
        } catch (DuplicateKeyException e) {
            throw new CustomException("用户名已存在");
        }
        setSuperDataRole(sysUser);
        return 1;
    }

    /**
     * 设置超管数据权限
     *
     * @param user
     */
    private void setSuperDataRole(SysUser user) {
        Map<String, SysUserDataRole> sysUserDataRoleMap = sysUserDataRoleService.getAdminDataRole();
        if (sysUserDataRoleMap == null) return;
        if (user.getDataRoles() == null || user.getDataRoles().size() == 0) return;
        List<Integer> childrenIds = new ArrayList<>();
        //获取当前编辑的超管的子账号id
        Example example = new Example(SysUser.class);
        example.selectProperties("id");
        example.createCriteria()
                .andEqualTo("createdUser", user.getId());
        List<SysUser> children = sysUserMapper.selectByExample(example);
        children.forEach(s -> childrenIds.add(s.getId()));
        SysUserDataRole sysInitDataRole;

        //遍历前端设置的数据权限
        for (SysUserDataRole dataRole : user.getDataRoles()) {
            //如果前端传递过来的设置是有效值
            if (!StringUtils.isEmpty(dataRole.getColumnValue()) && !StringUtils.isEmpty(dataRole.getDataRoleCode())) {
                sysInitDataRole = sysUserDataRoleMap.get(dataRole.getDataRoleCode());
                //完善对象模型
                dataRole.setSysUserId(user.getId());
                dataRole.setPrefixName(sysInitDataRole.getPrefixName());
                dataRole.setColumnName(sysInitDataRole.getColumnName());
                sysUserDataRoleMapper.insertIgnore(dataRole);
                //添加子账号相同的数据权限
                for (Integer childrenId : childrenIds) {
                    dataRole.setSysUserId(childrenId);
                    dataRole.setExtendsUser(user.getId());
                    sysUserDataRoleMapper.insertIgnore(dataRole);
                }
            }
        }
    }

    /**
     * 设置子账号数据权限
     *
     * @param user
     */
    private void setChildrenDataRole(SysUser user) {
        Map<String, SysUserDataRole> sysUserDataRoleMap = sysUserDataRoleService.getChildrenDataRole();
        //继承母账号数据权限
        SysUser userDetails = (SysUser) SecurityContextHolder.getContext().getAuthentication().getPrincipal();
        //查询母账号数据权限（当前登陆用户）
        Example example = new Example(SysUserDataRole.class);
        example.createCriteria()
                .andEqualTo("sysUserId", userDetails.getId());
        List<SysUserDataRole> sysUserDataRoles = sysUserDataRoleMapper.selectByExample(example);
        for (SysUserDataRole sysUserDataRole : sysUserDataRoles) {
            sysUserDataRole.setSysUserId(user.getId());
            sysUserDataRole.setExtendsUser(userDetails.getId());
            //添加到子账号
            sysUserDataRoleMapper.insertIgnore(sysUserDataRole);
        }

        //添加子账号独有的数据权限设置
        //遍历前端设置的数据权限
        if (sysUserDataRoleMap == null) return;
        if (user.getDataRoles() == null) return;
        SysUserDataRole sysInitDataRole;
        for (SysUserDataRole dataRole : user.getDataRoles()) {
            //如果前端传递过来的设置是有效值
            if (!StringUtils.isEmpty(dataRole.getColumnValue()) && !StringUtils.isEmpty(dataRole.getDataRoleCode())) {
                sysInitDataRole = sysUserDataRoleMap.get(dataRole.getDataRoleCode());
                //完善对象模型
                dataRole.setSysUserId(user.getId());
                dataRole.setPrefixName(sysInitDataRole.getPrefixName());
                dataRole.setColumnName(sysInitDataRole.getColumnName());
                sysUserDataRoleMapper.insertIgnore(dataRole);
            }
        }
    }

    /**
     * 修改密码
     *
     * @param currentUsername
     * @param updateUsername
     * @param pwd
     * @return
     */
    public int updatePwdByUserName(String currentUsername, String updateUsername, String pwd) {
        if (StringUtils.isEmpty(updateUsername)) return 0;
        if (!currentUsername.equals(updateUsername)) {

            SysUser updateUser = new SysUser();
            updateUser.setUsername(updateUsername);
            updateUser = sysUserMapper.selectOne(updateUser);
            SysUser currentUser = new SysUser();
            currentUser.setUsername(currentUsername);
            currentUser = sysUserMapper.selectOne(currentUser);
            if (!updateUser.getCreatedUser().equals(currentUser.getId())) {
                logger.error("user " + currentUsername + " update " + updateUser + " rejected");
                return 0;
            }
        }
        Example example = new Example(SysUser.class);
        example.createCriteria().andEqualTo("username", updateUsername);
        SysUser sysUser = new SysUser();
        sysUser.setPwd(pwd);
        return sysUserMapper.updateByExampleSelective(sysUser, example);

    }


    public int updateMyCreatedUserSimple(SysUser currentUser, SysUser sysUser) {
        if (sysUser.getId() == null) return 0;
        if (currentUser.getId() == null) return 0;
        Example example = new Example(SysUser.class);
        example.createCriteria()
                .andEqualTo("createdUser", currentUser.getId())
                .andEqualTo("id", sysUser.getId());
        int result = sysUserMapper.updateByExampleSelective(sysUser, example);
        return result;
    }
}
