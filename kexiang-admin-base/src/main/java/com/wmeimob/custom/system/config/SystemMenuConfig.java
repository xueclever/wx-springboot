package com.wmeimob.custom.system.config;


import com.alibaba.fastjson.JSONArray;
import com.wmeimob.custom.system.entity.SysMenu;
import com.wmeimob.tools.ResourcesFileReader;
import com.wmeimob.tools.SpringRedisUtil;
import lombok.extern.slf4j.Slf4j;

import java.util.*;

/**
 * Created by Shinez on 2017/1/16.
 */
@Slf4j
public class SystemMenuConfig {

    /**
     * 远程服务菜单
     */
    private static Map<Integer, SysMenu> remoteInitSysMenusMap = new HashMap<>();

    @Deprecated
    public static void putRemoteInitSysMenusMap(Integer menuId, SysMenu sysMenu) {
        remoteInitSysMenusMap = SpringRedisUtil.get("remote-init-sys-menus-map");
        if (remoteInitSysMenusMap == null) {
            remoteInitSysMenusMap = new HashMap<>();
        }
        remoteInitSysMenusMap.put(menuId, sysMenu);
        SpringRedisUtil.save("remote-init-sys-menus-map", remoteInitSysMenusMap, null);
    }

    /**
     * 从配置文件里装载菜单
     *
     * @param isRoot
     * @return
     */
    public static List<SysMenu> loadMenus(boolean isRoot) {
        String menuStr = ResourcesFileReader.read(SystemMenuConfig.class, "menu.json");
        List<SysMenu> sysMenus;
        JSONArray jsonArray = JSONArray.parseArray(menuStr);
        sysMenus = jsonArray.toJavaList(SysMenu.class);
        if (!isRoot) {
            sysMenus.removeIf(s -> "SUPER".equals(s.getExcludeRole()));
            sysMenus.forEach(sc ->
                    sc.getSysMenus().removeIf(s -> "SUPER".equals(s.getExcludeRole()))
            );
        }
        return sysMenus;
    }


}
