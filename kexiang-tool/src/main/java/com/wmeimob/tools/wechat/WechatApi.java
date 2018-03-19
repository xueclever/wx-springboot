package com.wmeimob.tools.wechat;

/**
 * Created by Shinez on 2016/10/9.
 */
public class WechatApi {

    public static final String GET_ACCESS_TOKEN = "https://api.weixin.qq.com/cgi-bin/token?grant_type=client_credential&appid=APPID&secret=APPSECRET";

    //获取用户基本信息 500000次/日
    public static final String GET_USER_INFO = "https://api.weixin.qq.com/cgi-bin/user/info?access_token=ACCESS_TOKEN&openid=OPENID&lang=zh_CN";
    public static final String GET_USER_INFO_BASE = "https://api.weixin.qq.com/sns/userinfo?access_token=ACCESS_TOKEN&openid=OPENID&lang=zh_CN";
    public static final String GET_OPENID="https://api.weixin.qq.com/sns/oauth2/access_token?appid=APPID&secret=SECRET&code=CODE&grant_type=authorization_code";
    public static final String CREATE_MENU = "https://api.weixin.qq.com/cgi-bin/menu/create?access_token=ACCESS_TOKEN";
    public static final String GET_CODE = "https://open.weixin.qq.com/connect/oauth2/authorize?appid=APPID&redirect_uri=REDIRECT_URI&response_type=code&scope=SCOPE#wechat_redirect";

    public static final String RED_PACKET = "https://api.mch.weixin.qq.com/mmpaymkttransfers/sendredpack";

    public static final String OPEN_GET_CODE ="https://open.weixin.qq.com/connect/oauth2/authorize?appid=APPID&redirect_uri=REDIRECT_URI&response_type=code&scope=SCOPE&component_appid=COMPONENT_APPID#wechat_redirect";
    public static final String OPEN_GET_OPENID = "https://api.weixin.qq.com/sns/oauth2/component/access_token?appid=APPID&code=CODE&grant_type=authorization_code&component_appid=COMPONENT_APPID&component_access_token=COMPONENT_ACCESS_TOKEN";
    public static final String GET_COMPONENT_TOKEN="https://api.weixin.qq.com/cgi-bin/component/api_component_token";
    public static final String REFRESH_AUTHORIZER_ACCESS_TOKEN = "https://api.weixin.qq.com/cgi-bin/component/api_authorizer_token?component_access_token=COMPONENT_ACCESS_TOKEN";

    public static final String SEND_CUSTOM_MSG="https://api.weixin.qq.com/cgi-bin/message/custom/send?access_token=ACCESS_TOKEN";

    public static final String SEND_TEMPLATE_MSG="https://api.weixin.qq.com/cgi-bin/message/template/send?access_token=ACCESS_TOKEN";
    public static final String GET_TEMPLATE_ID = "https://api.weixin.qq.com/cgi-bin/template/api_add_template?access_token=ACCESS_TOKEN";
    public static final String GET_JSAPI_TICKET = "https://api.weixin.qq.com/cgi-bin/ticket/getticket?access_token=ACCESS_TOKEN&type=jsapi";

//    public static final String sendMsgTextXml="<xml>\n" +
//            "<ToUserName><![CDATA[TO_USER]]></ToUserName>\n" +
//            "<FromUserName><![CDATA[FROM_USER]]></FromUserName>\n" +
//            "<CreateTime>TIMESTAMP</CreateTime>\n" +
//            "<MsgType><![CDATA[text]]></MsgType>\n" +
//            "<Content><![CDATA[CONTENT]]></Content>\n" +
//            "</xml>";
}
