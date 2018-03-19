package com.wmeimob.custom.system.security;

import com.alibaba.fastjson.JSONArray;
import com.wmeimob.custom.system.entity.*;
import com.wmeimob.custom.system.mapper.DataDictionaryMapper;
import com.wmeimob.custom.system.mapper.SysPermissionMapper;
import com.wmeimob.custom.system.mapper.SysResourceMapper;
import com.wmeimob.custom.system.mapper.SysRoleMapper;
import com.wmeimob.custom.system.service.SysUserDataRoleService;
import com.wmeimob.tools.ResourcesFileReader;
import com.wmeimob.tools.SpringHelper;
import com.wmeimob.tools.SpringRedisUtil;
import lombok.extern.slf4j.Slf4j;
import org.springframework.security.access.ConfigAttribute;
import org.springframework.security.web.FilterInvocation;
import org.springframework.security.web.access.intercept.FilterInvocationSecurityMetadataSource;
import org.springframework.security.web.util.matcher.AntPathRequestMatcher;
import org.springframework.security.web.util.matcher.RequestMatcher;
import org.springframework.stereotype.Component;
import org.springframework.util.ReflectionUtils;
import org.springframework.util.StringUtils;
import tk.mybatis.mapper.entity.Example;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import java.lang.reflect.Method;
import java.util.*;

import static com.wmeimob.custom.system.entity.SysUserDataRole.QUERY_DATA_ROLE_METHOD;

/**
 * 系统资源初始化
 * Created by Shinez on 2017/6/7.
 */
@Component
@Slf4j
public class SysSecurityMetadataSource implements FilterInvocationSecurityMetadataSource {

    /**
     * 资源url 资源权限集Map
     */
    private static Map<String, Collection<ConfigAttribute>> permissionMap;


    /**
     * ant类型的资源url集合
     */
    private static List<String> sortedPermissionUrl;


    /**
     * 系统所有定义的资源
     */
    private static List<String> allDefinedResource;


    /**
     * 系统数据字典
     */
    private static Map<Integer, DataDictionary> dataDictionaryMap;

    /**
     * 获取数据字典
     *
     * @return
     */
    public static Map<Integer, DataDictionary> getDataDictionaryMap() {
        return dataDictionaryMap;
    }

    private static boolean initResourceFlag = false;

    public static void resetInitResourceFlag() {
        initResourceFlag = false;
    }

    @Resource
    private SysRoleMapper sysRoleMapper;
    @Resource
    private SysPermissionMapper sysPermissionMapper;

    @Resource
    private SysResourceMapper sysResourceMapper;

    @Resource
    private DataDictionaryMapper dataDictionaryMapper;

    @Resource
    private SysUserDataRoleService sysUserDataRoleService;

    /**
     * 加载数据字典
     */
    private void loadSysDataDictionary() {
        dataDictionaryMap = new HashMap<>();
        List<DataDictionary> dataDictionaryList = dataDictionaryMapper.selectAll();
        dataDictionaryList.forEach(dd -> dataDictionaryMap.put(dd.getId(), dd));
        SpringRedisUtil.save("data-dictionary", dataDictionaryMap, null);
    }

    /**
     * 加载系统所有ant类型资源，并排序
     */
    private void loadSysResourceUrl() {
        Example example = new Example(SysResource.class);
        example.selectProperties("resourcesUrl");
        List<SysResource> list = sysResourceMapper.selectByExample(example);
        sortedPermissionUrl = new ArrayList<>();
        allDefinedResource = new ArrayList<>();
        list.forEach(sr -> {
            sortedPermissionUrl.add(sr.getResourceUrl());
            allDefinedResource.add(sr.getResourceUrl());
        });
//        sortedPermissionUrl.removeIf(s ->
//            !s.contains("*"));
        sortedPermissionUrl.removeIf(s -> !s.contains("*"));
//        Thread.sleep(1000L);
        log.info("waiting to remove permission urls and then will sort them...");
        try {
            sortedPermissionUrl.sort((o1, o2) -> {
                if (o1.endsWith("/**") && !o1.contains("/*/"))
                    return 1;
                return o1.compareTo(o2);
            });
        } catch (Exception e) {
            log.error("An error occured by sort permission urls,application will exits ");
            log.error(e.getMessage(), e);
            System.exit(-1);
        }

        SpringRedisUtil.save("sorted-permission-url", sortedPermissionUrl, null);
        SpringRedisUtil.save("all-defined-resource", allDefinedResource, null);

    }

    /**
     * 加载当前系统的权限集
     */
    private void loadSysPermissionDefine() {
        List<SysRole> roles = sysRoleMapper.selectAll();
        permissionMap = new HashMap<>();
        Collection<ConfigAttribute> resourceRoles;
        for (SysRole role : roles) {
            // 根据roleid查询角色对应的权限  role-=>permission
            List<SysPermission> permissions = sysPermissionMapper.selectByRoleId(role.getId());
            //遍历当前角色的权限集 构建 resource-=>permission
            for (SysPermission permission : permissions) {
                permission.setRoleCode("ROLE_" + permission.getRoleCode());
                // 如果已经存在相关的资源url，则要通过该url为key提取出权限集合，将权限增加到权限集合中。
                if (permissionMap.containsKey(permission.getResourceUrl())) {
                    resourceRoles = permissionMap.get(permission.getResourceUrl());
                    resourceRoles.add(permission);//添加资源对应的角色
                    permissionMap.put(permission.getResourceUrl(), resourceRoles);
                } else {
                    resourceRoles = new ArrayList<>();
                    resourceRoles.add(permission);
                    permissionMap.put(permission.getResourceUrl(), resourceRoles);
                }

            }
        }

        SpringRedisUtil.save("permission-map", permissionMap, null);
    }


    @Override
    public Collection<ConfigAttribute> getAttributes(Object object) throws IllegalArgumentException {
        FilterInvocation filterInvocation = (FilterInvocation) object;
        HttpServletRequest httpRequest = filterInvocation.getHttpRequest();
        String servletPath = httpRequest.getServletPath();
        if (!initResourceFlag) {
            initData();
        }

        //先取精确匹配
        //判断资源是否是定义的
        boolean exists = allDefinedResource.contains(servletPath);
        Collection<ConfigAttribute> urlPermissions = permissionMap.get(servletPath);
        if (urlPermissions != null)
            return urlPermissions;

        boolean isCustomReource = false;
        //取出系统所有定义的带通配符的资源url
        for (String url : sortedPermissionUrl) {
            RequestMatcher requestMatcher = new AntPathRequestMatcher(url);
            if (requestMatcher.matches(httpRequest)) {
                //请求与现有资源匹配上了，返回该资源对应的权限集
                isCustomReource = true;
                urlPermissions = permissionMap.get(url);
                break;
            }
        }

        //放行的接口权限交给security自己判断
        for (String permissionUrl : WebSecurityConfig.PERMISSION_URLS) {
            RequestMatcher requestMatcher = new AntPathRequestMatcher(permissionUrl);
            if (requestMatcher.matches(httpRequest)) {
                return null;
            }
        }

        //非数据库定义的权限请求比如内置的root，super资源请求，权限交给security自己判断
        if (!isCustomReource && !exists)
            return null;
        if (urlPermissions == null)//权限集没有定义
            return emptyUrlPermissionColections();
        return urlPermissions;
    }


    public void registerDataAuth() {
        String dataAuthStr = ResourcesFileReader.read(SysSecurityMetadataSource.class, "data-authority.json");
        if (StringUtils.isEmpty(dataAuthStr) || StringUtils.isEmpty(dataAuthStr.trim())) return;
        JSONArray dataAuthArray = JSONArray.parseArray(dataAuthStr);
        for (int i = 0; i < dataAuthArray.size(); i++) {
            SysUserDataRole sysUserDataRole = dataAuthArray.getObject(i, SysUserDataRole.class);

            try {
                Object objectMapper = SpringHelper.getBean(sysUserDataRole.getPrefixName() + "Mapper");
                Method method = ReflectionUtils.findMethod(objectMapper.getClass(), QUERY_DATA_ROLE_METHOD);
                sysUserDataRole.setDataSelects((List<Object>) ReflectionUtils.invokeMethod(method, objectMapper));
                dataAuthArray.set(i, sysUserDataRole);
            } catch (Exception e) {
                log.error(e.getMessage(),e);
            }

        }
        sysUserDataRoleService.injectDataAuth(dataAuthArray);
        log.info("success to inject data auth to access system");
    }

    /**
     * 注入菜单和权限
     */
    public void registerMenuAndDataAuth() {
        registerDataAuth();
    }

    /**
     * 数据初始化
     */
    public synchronized void initData() {
        if (!initResourceFlag) {
            log.info("init resource and permission ...");
            loadSysPermissionDefine();
            loadSysResourceUrl();
            loadSysDataDictionary();
            registerMenuAndDataAuth();
            initResourceFlag = true;
            log.info("resource and permission init complete！");
        }
    }


    /**
     * 构造未定义权限的资源请求
     *
     * @return
     */
    private Collection<ConfigAttribute> emptyUrlPermissionColections() {
        Collection<ConfigAttribute> permissions = new ArrayList<>();
        SysPermission sysPermission = new SysPermission();
        sysPermission.setInvalidPermission(true);
        sysPermission.setResourceName("未定义权限的资源");
        permissions.add(sysPermission);
        return permissions;
    }

    public static void main(String[] args) {
        Set<String> sets = new HashSet<>();
        sets.add("/schoolyard/**");

        String path = "/schoolyard";
        String result = realMatches(sets, path);
        System.out.println(result);
    }

    private static String realMatches(Set<String> sets, String path) {
        sets.removeIf(s -> !s.contains("*"));
        List<String> list = new ArrayList<>(sets);
        list.sort((o1, o2) -> {
            if (o1.endsWith("/**") && !o1.contains("/*/"))
                return 1;
            return o1.compareTo(o2);
        });

        for (String s : list) {
            System.out.println(s);
            if (s.contains("**"))
                s = s.replace("**", "[a-z0-9/]+");
            else
                s = s.replace("*", "[a-z0-9]+");
            if (path.matches(s))
                return s;
        }
        return null;
    }


    @Override
    public Collection<ConfigAttribute> getAllConfigAttributes() {
        return null;
    }

    @Override
    public boolean supports(Class<?> clazz) {
        return true;
    }
}
