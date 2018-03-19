package com.wmeimob.custom.system.security;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.authentication.AuthenticationProvider;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.AuthenticationException;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.web.authentication.preauth.PreAuthenticatedAuthenticationToken;
import org.springframework.stereotype.Component;

/**
 * Created by Shinez on 2017/6/7.
 */
@Component
public class JwtAuthenticationProvider implements AuthenticationProvider {


    private final JwtUtility jwtUtility;

    @Autowired
    public JwtAuthenticationProvider(JwtUtility jwtUtility) {
        this.jwtUtility = jwtUtility;
    }


    @Override
    public Authentication authenticate(Authentication authentication) throws AuthenticationException {
        Authentication authenticatedUser = null;
        // Only process the PreAuthenticatedAuthenticationToken
        if (authentication.getClass().
                isAssignableFrom(PreAuthenticatedAuthenticationToken.class)
                && authentication.getPrincipal() != null) {
            String tokenHeader = (String) authentication.getPrincipal();
            UserDetails userDetails = jwtUtility.decodeToken(tokenHeader);
            if (userDetails != null) {//合法的请求
                authenticatedUser = new JwtAuthentication(userDetails, tokenHeader);
            }
        } else {
            authenticatedUser = authentication;
        }
        return authenticatedUser;
    }

    @Override
    public boolean supports(Class<?> authentication) {
        return
                authentication.isAssignableFrom(
                        PreAuthenticatedAuthenticationToken.class)||
                        authentication.isAssignableFrom(
                                JwtAuthentication.class);
    }
}
