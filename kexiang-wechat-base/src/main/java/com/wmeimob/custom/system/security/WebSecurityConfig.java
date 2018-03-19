package com.wmeimob.custom.system.security;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.method.configuration.EnableGlobalMethodSecurity;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.config.http.SessionCreationPolicy;
import org.springframework.security.web.authentication.UsernamePasswordAuthenticationFilter;

import javax.annotation.Resource;


/**
 * Created by Shinez on 2017/5/17.
 */
@Configuration
@EnableWebSecurity
@EnableGlobalMethodSecurity(prePostEnabled = true)
public class WebSecurityConfig extends WebSecurityConfigurerAdapter {


    private Logger logger = LoggerFactory.getLogger(this.getClass());

    @Resource
    private JwtAuthenticationTokenFilter jwtAuthenticationTokenFilter;

    @Resource
    private JwtAuthenticationProvider jwtAuthenticationProvider;

    @Resource
    private NoAuthenticationAndAuthorizationHandler noAuthenticationAndAuthorizationHandler;

    //无需token,全局通过
    private static final String PERMISSION_ALL = "/**";

    private static final String[] PERMISSION_URL = {"/core/token"};


    @Override
    protected void configure(AuthenticationManagerBuilder auth) throws Exception {
        auth.authenticationProvider(jwtAuthenticationProvider);
    }


    @Override
    protected void configure(HttpSecurity http) throws Exception {

        http.csrf().disable()
                .httpBasic().disable()
                .formLogin().disable()
                //装载jwt的过滤器
                .addFilterBefore(jwtAuthenticationTokenFilter, UsernamePasswordAuthenticationFilter.class)
                // 基于token，所以不需要session,也不使用session
                .sessionManagement().sessionCreationPolicy(SessionCreationPolicy.STATELESS)
                .and()
                //自定义授权错误
                .exceptionHandling()
                .authenticationEntryPoint(noAuthenticationAndAuthorizationHandler)
                .accessDeniedHandler(noAuthenticationAndAuthorizationHandler)
                .and()
                .authorizeRequests()
                // 允许登陆接口匿名
//                .antMatchers(LOGIN_URL,OAUTH2_CALLBACK_URL,PAY_CALLBACK).permitAll()
                .antMatchers(PERMISSION_URL).permitAll()
                // 除上面外的所有请求全部需要鉴权认证
                .anyRequest().authenticated();

        // 禁用缓存
        http.headers().cacheControl();
    }
}
