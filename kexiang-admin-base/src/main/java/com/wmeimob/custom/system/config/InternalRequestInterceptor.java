package com.wmeimob.custom.system.config;

import com.wmeimob.tools.SpringHelper;
import com.wmeimob.tools.web.IpAddressHelper;

import lombok.extern.slf4j.Slf4j;
import org.springframework.web.servlet.handler.HandlerInterceptorAdapter;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Created by Shinez on 2017/8/12.
 */

@Slf4j
public class InternalRequestInterceptor extends HandlerInterceptorAdapter {



    ApplicationVariable applicationVariable= (ApplicationVariable) SpringHelper.getBean("applicationVariable");

    @Override
    public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler) throws Exception {
        String ip = IpAddressHelper.getRemoteHost();
        String[] wips = applicationVariable.writeIps.split("\\|");
        for (int i = 0; i < wips.length; i++) {
            if (ip.equals(wips[i])) {
                return true;
            }
        }
        return false;
    }
}
