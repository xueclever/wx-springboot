package com.wmeimob.tools.wechat;

/**
 * Created by Shinez on 15/9/14.
 */
public class WechatQyapi {

    /**
     * 分页每页显示条数
     */
    public final static int PAGE_SIZE = 10;

    /**
     * 消息关键字
     */
    public final static String MSG_KEY = "message";

    /**
     * redis中存储token的key
     */
    public final static String TOKEN = "app.token";

    /**
     * 获取token的url
     */
    public final static String GET_TOKEN_URL = "https://qyapi.weixin.qq.com/cgi-bin/gettoken?corpid=CORPID&corpsecret=SECRECT";

    /**
     * 发送消息url
     */
    public final static String SEND_MSG_URL = "https://qyapi.weixin.qq.com/cgi-bin/message/send?access_token=ACCESS_TOKEN";

    /**
     * 获取用户信息(openid)
     */
    public final static String GET_USER_INFO = "https://qyapi.weixin.qq.com/cgi-bin/user/getuserinfo?access_token=ACCESS_TOKEN&code=CODE";

    /**
     * 获取用户详细信息
     */
    public final static String GET_USER_DETAIL = "https://qyapi.weixin.qq.com/cgi-bin/user/get?access_token=ACCESS_TOKEN&userid=USERID";

    /**
     * 授权URL
     */
    public final static String AUTH_URL = "https://open.weixin.qq.com/connect/oauth2/authorize?appid=wx470a12c71200d3b2&redirect_uri=REDIRECT_URI&response_type=code&scope=snsapi_base&state=STATE#wechat_redirect";

    /**
     * 根据标签获取用户URL
     */
    public final static String GET_USER_BY_TAG_URL = "https://qyapi.weixin.qq.com/cgi-bin/tag/get?access_token=ACCESS_TOKEN&tagid=TAGID";

    /**
     * 增加标签成员
     */
    public final static String ADD_USER_BY_TAG="https://qyapi.weixin.qq.com/cgi-bin/tag/addtagusers?access_token=ACCESS_TOKEN";

    /**
     * 删除标签成员
     */
    public final static String DEL_USER_BY_TAG="https://qyapi.weixin.qq.com/cgi-bin/tag/deltagusers?access_token=ACCESS_TOKEN";
    /**
     * 获取所有标签
     */
    public final static String GET_ALL_TAGS = "https://qyapi.weixin.qq.com/cgi-bin/tag/list?access_token=ACCESS_TOKEN";

}
