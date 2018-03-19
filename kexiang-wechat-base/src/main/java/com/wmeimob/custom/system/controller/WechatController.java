package com.wmeimob.custom.system.controller;

import com.alibaba.fastjson.JSONObject;
import com.mzlion.easyokhttp.HttpClient;
import com.wmeimob.custom.annotation.Logging;
import com.wmeimob.custom.system.security.JwtUtility;
import com.wmeimob.custom.wechat.entity.WechatMps;
import com.wmeimob.custom.wechat.entity.WechatUser;
import com.wmeimob.custom.wechat.service.WechatService;
import com.wmeimob.custom.message.RestResult;
import com.wmeimob.tools.wechat.WechatApi;
import lombok.extern.slf4j.Slf4j;
import org.springframework.util.Assert;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import java.io.UnsupportedEncodingException;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;

/**
 * Created by Shinez on 2016/12/29.
 */

@RestController
@RequestMapping("/core")
@Logging
@CrossOrigin
@Slf4j
public class WechatController {

    @Resource
    private JwtUtility jwtUtility;


    /**
     * 获取本系统接口调用凭证
     *
     * @param code
     * @return
     * @throws UnsupportedEncodingException
     */
    @GetMapping("/token")
    public Map<String,Object> getToken(HttpServletRequest request, String code, String mpid) {
        Assert.notNull(code, "code is null");
        WechatMps wechatMps = WechatService.getMps(mpid);
        JSONObject jsonObject = JSONObject.parseObject(HttpClient.get(WechatApi.GET_OPENID
                        .replace("APPID", wechatMps.getAppid())
                        .replace("SECRET", wechatMps.getSecret())
                        .replace("CODE", code)
                ).execute().asString()
        );
        String openid = jsonObject.getString("openid");
        Assert.notNull(openid, "无法获取 openid ， " + jsonObject);
        WechatUser wechatUser = new WechatUser();
        wechatUser.setOpenid(openid);

        if ("snsapi_userinfo".equals(wechatMps.getAuthScope())) {
            //保存用户信息
            JSONObject userInfo = JSONObject.parseObject(
                    HttpClient.get(WechatApi.GET_USER_INFO_BASE
                            .replace("ACCESS_TOKEN", jsonObject.getString("access_token")
                                    .replace("OPENID", openid)
                            )).asString()
            );
            wechatUser = JSONObject.parseObject(userInfo.toJSONString(), WechatUser.class);
        }
        wechatUser.setAppid(wechatMps.getAppid());
        wechatUser = WechatService.saveWechatUserInfo(wechatUser);

        String token = jwtUtility.generateToken(wechatUser);
        log.info("token：" + token);
        Map<String, Object> map = new HashMap<>();
        map.put("token", token);
        map.put("wechatUser", wechatUser);
        return map;
    }

    public static void main(String[] args) {
        System.out.println(new Date(2147483647000L));
    }

}
