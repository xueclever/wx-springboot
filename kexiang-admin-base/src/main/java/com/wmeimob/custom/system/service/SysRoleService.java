package com.wmeimob.custom.system.service;

import com.wmeimob.custom.exception.CustomException;
import com.wmeimob.custom.system.entity.SysMenuRole;
import com.wmeimob.custom.system.entity.SysPermission;
import com.wmeimob.custom.system.entity.SysRole;
import com.wmeimob.custom.system.entity.SysUser;
import com.wmeimob.custom.system.mapper.SysMenuRoleMapper;
import com.wmeimob.custom.system.mapper.SysPermissionMapper;
import com.wmeimob.custom.system.mapper.SysRoleMapper;
import com.wmeimob.custom.system.mapper.SysUserMapper;
import org.springframework.dao.DuplicateKeyException;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import tk.mybatis.mapper.entity.Example;

import javax.annotation.Resource;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 * Created by Shinez on 2017/6/15.
 */
@Service
@Transactional
public class SysRoleService {

    @Resource
    private SysRoleMapper sysRoleMapper;

    @Resource
    private SysUserMapper sysUserMapper;

    @Resource
    private SysUserService sysUserService;

    @Resource
    private SysMenuRoleMapper sysMenuRoleMapper;

    @Resource
    private SysPermissionMapper sysPermissionMapper;


    /**
     * 按当前登陆账号类型查询全部角色
     *
     * @return
     */
    public List<SysRole> findAll() {
        Example example = new Example(SysRole.class);
        SysUser userDetails = (SysUser) SecurityContextHolder.getContext().getAuthentication().getPrincipal();
        Example.Criteria criteria = example.createCriteria();
        Integer myRoleId = sysUserService.getUserRoleId(userDetails.getUsername());
//        if (!LoginUserService.isRootAccount(userDetails.getUsername())) {
            criteria
                    .andEqualTo("createdRole", myRoleId)
                    .andEqualTo("createdUser", userDetails.getId());
//        }
        return sysRoleMapper.selectByExample(example);
    }

    /**
     * 保存角色
     *
     * @param sysRole
     * @return
     */
    public int save(SysRole sysRole) {
        SysUser userDetails = (SysUser) SecurityContextHolder.getContext().getAuthentication().getPrincipal();
        Integer canProcessRoleType = LoginUserService.getCanProcessRoleType(userDetails);
        Integer myRoleId = sysUserService.getUserRoleId(userDetails.getUsername());
        sysRole.setCreatedRole((SysRole.ROLE_TYPE_SUPER.equals(canProcessRoleType) ? 0 : myRoleId));
        sysRole.setUpdatedAt(new Date());
        if (sysRole.getId() == null) {//新增
            sysRole.setRoleType(canProcessRoleType);
            sysRole.setCreatedUser(userDetails.getId());
            sysRole.setCreatedAt(new Date());
            try {
                return sysRoleMapper.insertSelective(sysRole);
            } catch (DuplicateKeyException e) {
                throw new CustomException("您不能使用这个角色编号");
            }
        }

        //修改名称
        sysRole.setRoleCode(null);//角色code不允许修改
        sysRole.setCreatedRole(null);
        sysRole.setCreatedUser(null);
        Example example = new Example(SysRole.class);
        Example.Criteria criteria = example.createCriteria();
        criteria.andEqualTo("id", sysRole.getId());
        if (!LoginUserService.isRootAccount(userDetails.getUsername())) {
            criteria.andEqualTo("createdRole", sysRole.getCreatedRole());
        }
        int result = sysRoleMapper.updateByExampleSelective(sysRole, example);
        if (result > 0) {
            example = new Example(SysUser.class);
            example.createCriteria().andEqualTo("roleId", sysRole.getId());
            SysUser sysUser = new SysUser();
            sysUser.setRoleName(sysRole.getRoleName());
            sysUserMapper.updateByExampleSelective(sysUser, example);
        }
        return result;
    }


    /**
     * 删除角色
     *
     * @param id
     * @return
     */
    public int del(Integer id) {
        SysUser sysUser = new SysUser();
        sysUser.setRoleId(id);
        Integer count = sysUserMapper.selectCount(sysUser);
        if (count > 0)
            throw new CustomException("该角色下有所属的管理员，无法删除");
        Example example = new Example(SysRole.class);
        example.createCriteria().andEqualTo("createdRole", id);
        count = sysRoleMapper.selectCountByExample(example);
        if (count > 0) {
            throw new CustomException("该角色下有所属子角色，无法删除");
        }
        example.clear();
        SysUser userDetails = (SysUser) SecurityContextHolder.getContext().getAuthentication().getPrincipal();
        Integer myRoleId = sysUserService.getUserRoleId(userDetails.getUsername());
        Example.Criteria criteria= example.createCriteria();
        criteria.andEqualTo("id", id);
        if (!LoginUserService.isRootAccount(userDetails.getUsername())) {
            criteria.andEqualTo("createdRole", myRoleId);
        }
        int result = sysRoleMapper.deleteByExample(example);
        if (result == 0)
            throw new CustomException("角色不存在的");
        SysMenuRole SysMenuRole = new SysMenuRole();
        SysMenuRole.setRoleId(id);
        sysMenuRoleMapper.delete(SysMenuRole);
        SysPermission sysPermission = new SysPermission();
        sysPermission.setRoleId(id);
        sysPermissionMapper.delete(sysPermission);
        return result;
    }


    /**
     * 获取子角色ID集合
     *
     * @param createdRoleId
     * @return
     */
    public List<Integer> getChildrenRoleId(Integer createdRoleId) {
        SysRole sysRole = new SysRole();
        sysRole.setCreatedRole(createdRoleId);
        List<SysRole> list = sysRoleMapper.select(sysRole);
        List<Integer> childrenIds = new ArrayList<>();
        list.forEach(r -> childrenIds.add(r.getId()));
        return childrenIds;
    }
}
