package com.wmeimob.custom.system.service;

import com.wmeimob.custom.exception.CustomException;
import com.wmeimob.custom.system.entity.*;
import com.wmeimob.custom.system.mapper.SysPermissionMapper;
import com.wmeimob.custom.system.mapper.SysResourceMapper;
import com.wmeimob.custom.system.security.SysSecurityMetadataSource;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.util.StringUtils;
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
public class SysResourceService {


    @Resource
    private SysResourceMapper sysResourceMapper;
    @Resource
    private SysPermissionMapper sysPermissionMapper;
    @Resource
    private SysUserService sysUserService;
    @Resource
    private SysRoleService sysRoleService;

    /**
     * 查询系统全部资源
     *
     * @param keyword
     * @return
     */
    public List<SysResource> findAll(String keyword) {
        keyword = StringUtils.isEmpty(keyword) ? "" : keyword;
        SysUser userDetails = (SysUser) SecurityContextHolder.getContext().getAuthentication().getPrincipal();
        boolean isRoot = LoginUserService.isRootAccount(userDetails.getUsername());
        Example example = new Example(SysResource.class);
        Example.Criteria criteria = example.createCriteria();
        List<SysResource> sysResourceList = new ArrayList<>();
        if (!isRoot) {
            Integer roleId = sysUserService.getUserRoleId(userDetails.getUsername());
            List<SysPermission> sysPermissions = sysPermissionMapper.selectByRoleId(roleId);
            sysPermissions.removeIf(sysPermission -> !(sysPermission.getAllowPost() || sysPermission.getAllowPut() || sysPermission.getAllowGet() || sysPermission.getAllowDelete()));
            if (sysPermissions.size() == 0) {
                return sysResourceList;
            }
            List<Integer> resourceIds = new ArrayList<>();
            sysPermissions.forEach(sp -> resourceIds.add(sp.getResourceId()));
            criteria.andLike("resourceName", "%" + keyword + "%").andIn("id", resourceIds);
            example.or().andLike("resourceUrl", "%" + keyword + "%").andIn("id", resourceIds);
        } else {
            criteria.andLike("resourceName", "%" + keyword + "%");
            example.or().andLike("resourceUrl", "%" + keyword + "%");
        }
        sysResourceList = sysResourceMapper.selectByExample(example);
        return sysResourceList;
    }

    /**
     * 根据资源id查询系统权限
     *
     * @param resourceId
     * @return
     */
    public List<SysPermission> findById(Integer resourceId) {
        SysUser userDetails = (SysUser) SecurityContextHolder.getContext().getAuthentication().getPrincipal();
        Integer myRoleId = sysUserService.getUserRoleId(userDetails.getUsername());
        return sysPermissionMapper.selectByResourceIdAndRoleType(resourceId, myRoleId, userDetails.getId());
    }

    /**
     * 更新权限
     *
     * @param resourceId
     * @param permissions
     * @return
     */
    public void save(Integer resourceId, List<SysPermission> permissions) {
        if (permissions == null) {
            throw new CustomException("没有更新的权限");
        }
        Date date = new Date();
        SysUser sysUser = LoginUserService.getPrincipal();
        boolean isRoot = LoginUserService.isRootAccount(sysUser.getUsername());
        Example example;
        List<Integer> childrenIds;
        for (SysPermission sp : permissions) {
            sp.setResourceId(resourceId);
            sp.setAllowDelete(sp.getAllowDelete() == null ? false : sp.getAllowDelete());
            sp.setAllowGet(sp.getAllowGet() == null ? false : sp.getAllowGet());
            sp.setAllowPut(sp.getAllowPut() == null ? false : sp.getAllowPut());
            sp.setAllowPost(sp.getAllowPost() == null ? false : sp.getAllowPost());
            sp.setUpdatedAt(date);
            boolean nonePermission = false;
            if (!(sp.getAllowDelete() || sp.getAllowGet() || sp.getAllowPut() || sp.getAllowPost())) {
                nonePermission = true;
            }
            if (sp.getId() == null && !nonePermission) {
                //insert
                sp.setCreatedAt(date);
                sysPermissionMapper.insertSelective(sp);//可优化为insertList
            } else {
                if (nonePermission) {
                    //删除
                    sysPermissionMapper.deleteByPrimaryKey(sp.getId());
                    if (isRoot) {
                        //删除子角色的permission  resourceId&roleId
                        childrenIds = sysRoleService.getChildrenRoleId(sp.getRoleId());
                        if (childrenIds.size() > 0) {
                            example = new Example(SysPermission.class, true, true);
                            example.createCriteria()
                                    .andEqualTo("resourceId", resourceId)
                                    .andIn("roleId", childrenIds);
                            sysPermissionMapper.deleteByExample(example);
                        }
                    }
                } else {
                    sysPermissionMapper.updateByPrimaryKeySelective(sp);
                }
            }
        }
        SysSecurityMetadataSource.resetInitResourceFlag();
    }

    public void add(SysResource resource) {
        Date date = new Date();
        resource.setCreatedAt(date);
        resource.setUpdatedAt(date);
        sysResourceMapper.insertSelective(resource);
    }

    public int update(SysResource resource) {
        resource.setUpdatedAt(new Date());
        return sysResourceMapper.updateByPrimaryKeySelective(resource);
    }

    public int del(Integer id) {
        int result = sysResourceMapper.deleteByPrimaryKey(id);
        if (result > 0) {
            SysPermission sysPermission = new SysPermission();
            sysPermission.setResourceId(id);
            sysPermissionMapper.delete(sysPermission);
        }
        return result;
    }
}
