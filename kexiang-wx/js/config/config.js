// const APPID = "wxcc9a425363989bf2";
const APPID = "wxbd296320838eb230";
//const DOMAIN = "qx7514.free.ngrok.cc";
const DOMAIN = "wxchat.danduoduo.com.cn";
const FIRST_PAGE = "个人中心.html";

const oauth2Scope = {
    snsapi_base: "snsapi_base",
    snsapi_userinfo: "snsapi_userinfo",
}


const TOKEN_FIELD = "jwt-token";

const WECHAT_OAUTH2_SCOPE = oauth2Scope.snsapi_userinfo;
const ENABLED_SECURE = false;

function getSchema() {
    return ENABLED_SECURE ? "https" : "http";
}


const API_URL = getSchema() + "://" + DOMAIN + "/api";
const WECHAT_OAUTH2_REDIRECT_URI = getSchema() + "://" + DOMAIN + "/login.html";
const OAUTH2_REDIRECT = "https://open.weixin.qq.com/connect/oauth2/authorize?appid=" + APPID + "&redirect_uri=" + WECHAT_OAUTH2_REDIRECT_URI + "&response_type=code&scope=" + WECHAT_OAUTH2_SCOPE + "#wechat_redirect"


