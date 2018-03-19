package com.wmeimob.custom.system.service;

import com.alibaba.fastjson.JSONArray;
import com.wmeimob.custom.system.entity.SysUserDataRole;
import com.wmeimob.tools.SpringRedisUtil;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

import java.lang.reflect.Field;
import java.util.*;


/**
 * Created by Shinez on 2017/6/21.
 */

@Service
public class SysUserDataRoleService {

    private final Logger logger = LoggerFactory.getLogger(this.getClass());


    /**
     * 超管权限集map
     */
    private static Map<String, SysUserDataRole> adminDataRoleMap;

    /**
     * 子账号权限集map
     */
    private static Map<String, SysUserDataRole> childrenDataRoleMap;


    /**
     * 根据权限CODE获取超管数据权限
     *
     * @param dataAuthCode
     * @return
     */
    public SysUserDataRole getAdminDataRoleByDataRoleCode(String dataAuthCode) {
        return getAdminDataRole().get(dataAuthCode);
    }

    /**
     * 根据权限CODE获取子账号数据权限
     *
     * @param dataAuthCode
     * @return
     */
    public SysUserDataRole getChildrenDataRoleByCode(String dataAuthCode) {
        return getChildrenDataRole().get(dataAuthCode);
    }


    /**
     * 更新超管数据权限
     */
    public void updateAdminDataRole(String dataAuthCode, Object selectData) {
        updateDataRole(dataAuthCode, selectData, SysUserDataRole.DATA_ROLE_TYPE_ADMIN);
    }

    /**
     * 更新子账号数据权限
     */
    public void updateChildrenDataRole(String dataAuthCode, Object selectData) {
        updateDataRole(dataAuthCode, selectData, SysUserDataRole.DATA_ROLE_TYPE_CHILDREN);
    }

    private void removeOldSelect(Integer src, List<Object> list) throws IllegalAccessException, NoSuchFieldException {
        Iterator<Object> iterator = list.iterator();
        Class cls;
        Object select;
        while (iterator.hasNext()) {
            select = iterator.next();
            cls = select.getClass();
            Field s = cls.getDeclaredField("id");
            s.setAccessible(true);
            Integer id = (Integer) s.get(select);
            if (id.equals(src)) {
                iterator.remove();
            }
        }
    }

    /**
     * 更新数据权限
     */
    private void updateDataRole(String dataAuthCode, Object selectData, Integer type) {
        SysUserDataRole sysUserDataRole;
        Class cls = selectData.getClass();
        try {
            Field field = cls.getDeclaredField("id");
            field.setAccessible(true);
            Integer idVal = (Integer) field.get(selectData);
            if (SysUserDataRole.DATA_ROLE_TYPE_ADMIN.equals(type)) {
                sysUserDataRole = getAdminDataRole().get(dataAuthCode);
                List<Object> selects = sysUserDataRole.getDataSelects();
                removeOldSelect(idVal, selects);
                selects.add(selectData);
                sysUserDataRole.setDataSelects(selects);
                adminDataRoleMap.put(sysUserDataRole.getDataRoleCode(), sysUserDataRole);
            } else {
                sysUserDataRole = getChildrenDataRole().get(dataAuthCode);
                List<Object> selects = sysUserDataRole.getDataSelects();
                removeOldSelect(idVal, selects);
                selects.add(selectData);
                sysUserDataRole.setDataSelects(selects);
//            childrenDataRole.add(sysUserDataRole);
                childrenDataRoleMap.put(sysUserDataRole.getDataRoleCode(), sysUserDataRole);
            }
        } catch (NoSuchFieldException | IllegalAccessException e) {
            logger.error(e.getMessage());
        }
    }

    public static void main(String[] args) {

    }

    /**
     * 注入数据权限配置
     *
     * @param jsonArray
     */
    public void injectDataAuth(JSONArray jsonArray) {
        List<SysUserDataRole> sysUserDataRoles = jsonArray.toJavaList(SysUserDataRole.class);
        if (sysUserDataRoles == null || sysUserDataRoles.size() == 0) return;
        for (SysUserDataRole sysUserDataRole : sysUserDataRoles) {
            try {
                if (SysUserDataRole.DATA_ROLE_TYPE_ADMIN.equals(sysUserDataRole.getLevel())) {
                    adminDataRoleMap = SpringRedisUtil.get("admin-data-auth-map");
                    if (adminDataRoleMap == null) {
                        adminDataRoleMap = new HashMap<>();
                    }
                    adminDataRoleMap.put(sysUserDataRole.getDataRoleCode(), sysUserDataRole);
                }
                if (SysUserDataRole.DATA_ROLE_TYPE_CHILDREN.equals(sysUserDataRole.getLevel())) {
                    childrenDataRoleMap = SpringRedisUtil.get("children-data-auth-map");
                    if (childrenDataRoleMap == null) {
                        childrenDataRoleMap = new HashMap<>();
                    }
                    childrenDataRoleMap.put(sysUserDataRole.getDataRoleCode(), sysUserDataRole);
                }
            } catch (Exception e) {
                logger.error("载入数据权限[" + sysUserDataRole.getDataRoleCode() + "]元数据失败，" + e.getMessage());
            }
            SpringRedisUtil.save("admin-data-auth-map", adminDataRoleMap, null);
            SpringRedisUtil.save("children-data-auth-map", childrenDataRoleMap, null);
        }
    }



    /**
     * 超管支持的数据权限
     */
    public Map<String, SysUserDataRole> getAdminDataRole() {
//        adminDataRoleMap = getDataRole(adminDataRoleMap, SysUserDataRole.DATA_ROLE_TYPE_ADMIN)
        return SpringRedisUtil.get("admin-data-auth-map");
    }

    /**
     * 子账号支持的数据权限
     */
    public Map<String, SysUserDataRole> getChildrenDataRole() {
//        childrenDataRoleMap = getDataRole(childrenDataRoleMap, SysUserDataRole.DATA_ROLE_TYPE_CHILDREN);
        return SpringRedisUtil.get("children-data-auth-map");
    }

    /**
     * 移除超管数据权限
     *
     * @param dataAuthCode
     * @param dataSelectId
     */
    public void removeAdminDataRole(String dataAuthCode, Integer dataSelectId) {
        removeDataRole(dataAuthCode, dataSelectId, SysUserDataRole.DATA_ROLE_TYPE_ADMIN);
    }

    /**
     * 移除子账号数据权限
     *
     * @param dataAuthCode
     * @param dataSelectId
     */
    public void removeChildDataRole(String dataAuthCode, Integer dataSelectId) {
        removeDataRole(dataAuthCode, dataSelectId, SysUserDataRole.DATA_ROLE_TYPE_CHILDREN);
    }

    /**
     * 移除数据权限
     *
     * @param dataAuthCode
     * @param dataSelectId
     * @param type
     */
    private void removeDataRole(String dataAuthCode, Integer dataSelectId, Integer type) {
        SysUserDataRole sysUserDataRole;
        if (SysUserDataRole.DATA_ROLE_TYPE_ADMIN.equals(type)) {
            sysUserDataRole = getAdminDataRole().get(dataAuthCode);
            List<Object> selects = sysUserDataRole.getDataSelects();
            try {
                removeOldSelect(dataSelectId, selects);
            } catch (IllegalAccessException | NoSuchFieldException e) {
                logger.error(e.getMessage());
            }
            sysUserDataRole.setDataSelects(selects);
            adminDataRoleMap.put(sysUserDataRole.getDataRoleCode(), sysUserDataRole);
        } else {
            sysUserDataRole = getChildrenDataRole().get(dataAuthCode);
            List<Object> selects = sysUserDataRole.getDataSelects();
            try {
                removeOldSelect(dataSelectId, selects);
            } catch (IllegalAccessException | NoSuchFieldException e) {
                logger.error(e.getMessage());
            }
            sysUserDataRole.setDataSelects(selects);
            childrenDataRoleMap.put(sysUserDataRole.getDataRoleCode(), sysUserDataRole);
        }
    }
}
