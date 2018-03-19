package com.wmeimob.custom.system.security;

import com.wmeimob.custom.system.entity.SysPermission;
import org.springframework.security.access.AccessDecisionManager;
import org.springframework.security.access.AccessDeniedException;
import org.springframework.security.access.ConfigAttribute;
import org.springframework.security.authentication.InsufficientAuthenticationException;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.web.FilterInvocation;
import org.springframework.stereotype.Component;

import javax.servlet.http.HttpServletRequest;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

/**
 * Created by Shinez on 2017/6/7.
 */
@Component
public class SysAccessDecisionManager implements AccessDecisionManager {


    /**
     * 断言是明确定义的资源请求
     *
     * @param configAttributes
     */
    private void assertNotInvalidPermission(Collection<ConfigAttribute> configAttributes) {
        if (configAttributes.size() == 1) {
            List<ConfigAttribute> nullPermission = new ArrayList<>(configAttributes);
            SysPermission sysPermission = (SysPermission) nullPermission.get(0);
            if (sysPermission.isInvalidPermission())
                throw new AccessDeniedException("无效的资源请求");
        }
    }

//    /**
//     * 判断是否是管理员
//     * @param authentication
//     * @return
//     */
//    private boolean isSuper(Authentication authentication){
//        for (GrantedAuthority ga : authentication.getAuthorities()) {//遍历访问者拥有的权限
//            if (ga.getAuthority().trim().equals("ROLE_SUPER")) return true;//超级管理员放行
//        }
//        return false;
//    }

    /**
     * 通过传递的参数来决定用户是否有访问对应受保护对象的权限
     *
     * @param authentication   当前正在请求的用户认证信息
     * @param object           受保护对象，其可以是一个MethodInvocation、JoinPoint或FilterInvocation。
     * @param configAttributes 与正在请求的受保护对象相关联的配置属性
     */
    @Override
    public void decide(Authentication authentication, Object object, Collection<ConfigAttribute> configAttributes) throws AccessDeniedException, InsufficientAuthenticationException {
        if (configAttributes == null) //资源未受保护
            return;
        //断言非定义的请求资源
        assertNotInvalidPermission(configAttributes);
        SysPermission sysPermission;
        FilterInvocation fi = (FilterInvocation) object;
        HttpServletRequest request = fi.getRequest();
        String requestMethod = request.getMethod();
        boolean requestMethodValidResult;

        String needRoleCode;
        for (GrantedAuthority ga : authentication.getAuthorities()) {//遍历访问者拥有的权限
            for (ConfigAttribute ca : configAttributes) {//遍历请求资源的权限
                sysPermission = (SysPermission) ca;
                needRoleCode = sysPermission.getRoleCode();
                if (needRoleCode.trim().equals(ga.getAuthority().trim())) {//如果资源所需要的角色与访问者拥有的角色一致
                    requestMethodValidResult = requestMethodValid(sysPermission, requestMethod);//判断访问者请求的方法是否在权限对应资源的请求方法的允许范围
                    if (requestMethodValidResult)
                        return;
                }
            }
        }
        throw new AccessDeniedException("您无权进行此操作！");
    }

    /**
     * 判断当前请求的requestMethod是否是请求的资源所允许的
     *
     * @param sysPermission
     * @param requestMethod
     * @return
     */

    private boolean requestMethodValid(SysPermission sysPermission, String requestMethod) {
        switch (requestMethod) {
            case "GET":
                return sysPermission.getAllowGet();
            case "POST":
                return sysPermission.getAllowPost();
            case "PUT":
                return sysPermission.getAllowPut();
            case "DELETE":
                return sysPermission.getAllowDelete();
        }
        return false;
    }

    @Override
    public boolean supports(ConfigAttribute attribute) {
        return true;
    }

    @Override
    public boolean supports(Class<?> clazz) {
        return true;
    }
}
