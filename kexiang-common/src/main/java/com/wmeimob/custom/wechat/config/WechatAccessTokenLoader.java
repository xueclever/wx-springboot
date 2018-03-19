package com.wmeimob.custom.wechat.config;

import com.wmeimob.tools.SpringRedisUtil;
import me.hao0.wechat.loader.AccessTokenLoader;
import me.hao0.wechat.model.base.AccessToken;

/**
 * Created by Shinez on 2017/9/1.
 */
public class WechatAccessTokenLoader implements AccessTokenLoader {

    private String appid;

    public WechatAccessTokenLoader(String appid) {
        this.appid = appid;
    }
    @Override
    public String get() {
        return SpringRedisUtil.get("mps:" + appid + ":access_token");
    }

    @Override
    public void refresh(AccessToken accessToken) {
        SpringRedisUtil.save("mps:" + appid + ":access_token",accessToken.getAccessToken(),accessToken.getExpiredAt()-System.currentTimeMillis());
}
}
