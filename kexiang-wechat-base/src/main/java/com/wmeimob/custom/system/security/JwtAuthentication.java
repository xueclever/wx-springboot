
package com.wmeimob.custom.system.security;

import org.springframework.security.authentication.AbstractAuthenticationToken;
import org.springframework.security.core.userdetails.UserDetails;


/**
 * 包含Jwt的UserDetails
 */
public class JwtAuthentication extends AbstractAuthenticationToken {
    private static final long serialVersionUID = 1L;

    private UserDetails principal;
    private String jsonWebToken;

    public JwtAuthentication(UserDetails principal, String jsonWebToken) {
        super(principal.getAuthorities());
        this.principal = principal;
        this.jsonWebToken = jsonWebToken;
    }

    @Override
    public Object getCredentials() {
        return null;
    }

    public String getJsonWebToken() {
        return jsonWebToken;
    }

    @Override
    public Object getPrincipal() {
        return principal;
    }
}