package com.wmeimob.custom.system.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.core.annotation.Order;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;

/**
 * Created by xiangzhao on 2016/7/29.
 */
@Order(2)
@Configuration
public class WechatWebMvcConfigurerAdapter extends WebMvcConfigurerAdapter {
    @Override
    public void addInterceptors(InterceptorRegistry registry) {
        registry.addInterceptor(new InternalRequestInterceptor()).addPathPatterns("/internal/**");
//                .("/user/code","/user","/core/**","/restError","/lite","/lite/**","/error","/order/notify");
        super.addInterceptors(registry);
    }
}
