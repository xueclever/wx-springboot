package com.wmeimob.tools.web;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.context.request.RequestContextHolder;
import org.springframework.web.context.request.ServletRequestAttributes;

import javax.servlet.http.HttpServletRequest;

/**
 * Created by Shinez on 2016/11/16.
 */
public class IpAddressHelper {

    private static final Logger logger = LoggerFactory.getLogger(IpAddressHelper.class);

    public static String getRemoteHost(HttpServletRequest request){
        String ip = request.getHeader("x-forwarded-for");
        if (ip == null || ip.length() == 0 || "unknown".equalsIgnoreCase(ip)) {
            ip = request.getHeader("Proxy-Client-IP");
        }
        if (ip == null || ip.length() == 0 || "unknown".equalsIgnoreCase(ip)) {
            ip = request.getHeader("WL-Proxy-Client-IP");
        }
        if (ip == null || ip.length() == 0 || "unknown".equalsIgnoreCase(ip)) {
            ip = request.getRemoteAddr();
        }
        String[] ips = ip.split(",");
        int i = 0;
        while (i < ips.length) {
            ips[i]=ips[i].replace(" ","");
            logger.info("request ip "+i+":"+ips[i]);
            if ("127.0.0.1".equals(ips[i]) || "0:0:0:0:0:0:0:1".equals(ips[i])) {
                return ips[i];
            }
            ip = ips[i];
            ++i;
        }
        return ip;
    }

    public static String getRemoteHost() {
        HttpServletRequest request = ((ServletRequestAttributes) RequestContextHolder.getRequestAttributes()).getRequest();
        return getRemoteHost(request);
    }
}
