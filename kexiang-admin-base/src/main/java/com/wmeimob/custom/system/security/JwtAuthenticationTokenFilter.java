package com.wmeimob.custom.system.security;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.web.authentication.preauth.RequestHeaderAuthenticationFilter;
import org.springframework.stereotype.Component;

/**
 * Created by Shinez on 2017/6/6.
 */
@Component
public class JwtAuthenticationTokenFilter extends RequestHeaderAuthenticationFilter {


    private final JwtUtility jwtUtility;

    @Autowired
    public JwtAuthenticationTokenFilter(JwtUtility jwtUtility) {
        // 如果没找到请求头不抛异常
        this.setExceptionIfHeaderMissing(false);
        //要查找的jwt请求头
        this.setPrincipalRequestHeader(jwtUtility.getHeader());
        this.jwtUtility = jwtUtility;
    }

    @Override
    @Autowired
    public void setAuthenticationManager(AuthenticationManager authenticationManager) {
        super.setAuthenticationManager(authenticationManager);
    }
}
