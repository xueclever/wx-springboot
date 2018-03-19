
package com.wmeimob.custom.system.security;

import com.alibaba.fastjson.JSONObject;
import org.apache.http.HttpStatus;
import org.springframework.security.access.AccessDeniedException;
import org.springframework.security.core.AuthenticationException;
import org.springframework.security.web.AuthenticationEntryPoint;
import org.springframework.security.web.access.AccessDeniedHandler;
import org.springframework.stereotype.Component;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;


/**
 *  未认证，未授权返回的信息
 */

@Component
public class NoAuthenticationAndAuthorizationHandler implements AuthenticationEntryPoint, AccessDeniedHandler {

    @Override
    public void commence(HttpServletRequest request, HttpServletResponse response, AuthenticationException authException)
            throws IOException, ServletException {
        response.setStatus(HttpStatus.SC_UNAUTHORIZED);
        System.out.println(request.getServerName());
        noAuthenticationOrAuthorizationResponse(response,"登陆信息已过期");
    }


    @Override
    public void handle(HttpServletRequest request, HttpServletResponse response, AccessDeniedException accessDeniedException) throws IOException, ServletException {
        response.setStatus(HttpStatus.SC_FORBIDDEN);
        noAuthenticationOrAuthorizationResponse(response,accessDeniedException.getMessage());
    }

    private void noAuthenticationOrAuthorizationResponse(HttpServletResponse response, String msg) throws IOException {
        //返回json形式的错误信息
        response.setCharacterEncoding("UTF-8");
        response.setContentType("application/json");
        JSONObject jsonObject=new JSONObject();
        jsonObject.put("status", response.getStatus());
        jsonObject.put("info",msg);
        response.getWriter().println(jsonObject);
        response.getWriter().flush();
    }

}