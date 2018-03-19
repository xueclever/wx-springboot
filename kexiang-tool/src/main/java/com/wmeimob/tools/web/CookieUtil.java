package com.wmeimob.tools.web;

import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class CookieUtil {
    /**
     * 添加cookie操作
     *
     * @param key  cookie的name
     * @param value cookie的value
     */
    public static void  addCookie(String key, String value, HttpServletResponse response) {
        Cookie cookie = new Cookie(key.trim(), value.trim());
        cookie.setMaxAge(-1);
        cookie.setPath("/");
        response.addCookie(cookie);
    }
    /**
     * 更新cookie操作
     *
     * @param cookie 要修改的cookie
     * @param value  修改的cookie的值
     */
    public static void updateCookie(Cookie cookie, String value, HttpServletResponse response) {
        cookie.setValue(value.trim());
        cookie.setMaxAge(-1);
        cookie.setPath("/");
        response.addCookie(cookie);
    }

    /**
     * 获取Cookie操作
     * @param key
     * @param request
     * @return
     */
    public  static Cookie getCookie(String key, HttpServletRequest request){
        Cookie cookie=null;
        Cookie cookies[] = request.getCookies();
        if (cookies == null || cookies.length < 0) {
        } else {
            for (Cookie c : cookies) {
                if (c.getName().equals(key)) {
                    cookie= c;
                }
            }
        }
        return cookie;
    }
    /**
     * 删除Cookie操作
     * @param key
     * @param request
     * @return
     */
    public  static void removeCookieByKey(String key, HttpServletRequest request, HttpServletResponse response){
        Cookie cookies[] = request.getCookies();
        if (cookies == null || cookies.length < 0) {
        } else {
            for (Cookie c : cookies) {
                if (c.getName().equals(key)) {
                    c.setMaxAge(0);
                    c.setPath("/");
                    response.addCookie(c);
                }
            }
        }
    }
}
