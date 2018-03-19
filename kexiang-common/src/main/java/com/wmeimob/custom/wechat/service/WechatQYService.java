package com.wmeimob.custom.wechat.service;

import com.alibaba.fastjson.JSONObject;
import com.mzlion.easyokhttp.HttpClient;
import com.wmeimob.custom.config.CustomProp;
import com.wmeimob.custom.exception.CustomException;
import com.wmeimob.custom.wechat.entity.WechatApp;
import com.wmeimob.custom.wechat.entity.WechatMps;
import com.wmeimob.custom.wechat.mapper.WechatAppMapper;
import com.wmeimob.custom.wechat.mapper.WechatMpsMapper;
import com.wmeimob.tools.RandomCodeUtil;
import com.wmeimob.tools.SpringHelper;
import com.wmeimob.tools.SpringRedisUtil;
import com.wmeimob.tools.web.HttpHelper;
import com.wmeimob.tools.wechat.WechatSignUtil;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.util.Assert;
import org.springframework.util.StringUtils;

import java.io.*;
import java.net.URL;
import java.net.URLConnection;
import java.security.NoSuchAlgorithmException;
import java.text.SimpleDateFormat;
import java.util.*;


/**
 * Created by Shinez on 2017/2/22.
 */
public class WechatQYService {

    private static CustomProp customProp = (CustomProp) SpringHelper.getBean("customProp");
    private static WechatMpsMapper wechatMpsMapper = (WechatMpsMapper) SpringHelper.getBean("wechatMpsMapper");
    private static SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
    private static final Logger logger = LoggerFactory.getLogger(WechatService.class);
    private static WechatAppMapper wechatAppMapper = (WechatAppMapper) SpringHelper.getBean("wechatAppMapper");


    /**
     * 获取公众号信息
     *
     * @param mpid
     * @return
     */
    public static WechatMps getMps(String mpid) {
        mpid = getMpid(mpid);
        //查询公众号
        WechatMps wechatMps = SpringRedisUtil.get("mps:" + mpid);
        if (wechatMps == null) {
            wechatMps = wechatMpsMapper.selectByPrimaryKey(Integer.valueOf(mpid));
            Assert.notNull(wechatMps, "公众号 " + mpid + " 不存在");
            SpringRedisUtil.save("mps:" + mpid, wechatMps, null);
        }
        return wechatMps;
    }


    /**
     * 初始化jssdk
     *
     * @param mpid
     * @param agentId
     * @param currentUrl
     * @return
     */
    public static Map<String, Object> jssdkInit(String mpid, String agentId, String currentUrl) {
        mpid = getMpid(mpid);
        long timestamp = System.currentTimeMillis();
        String nonceStr = RandomCodeUtil.randCode(12);
        TreeMap<String, Object> map = new TreeMap<>();
        map.put("timestamp", timestamp / 1000L);
        map.put("noncestr", nonceStr);
        map.put("url", currentUrl);
        String ticket = SpringRedisUtil.get("mps:" + mpid + ":apps:" + agentId + ":jsapi_ticket");
        if (ticket == null) {
            JSONObject sb = JSONObject.parseObject(HttpHelper.SSLGet("https://qyapi.weixin.qq.com/cgi-bin/get_jsapi_ticket?access_token=ACCESS_TOKEN".replace("ACCESS_TOKEN", getAgentAccessToken(mpid, agentId)), null));
            if (sb != null && sb.getString("ticket") != null) {
                ticket = sb.getString("ticket");
                SpringRedisUtil.save("mps:" + mpid + ":apps:" + agentId + ":jsapi_ticket", ticket, (long) (sb.getInteger("expires_in") - 600) * 1000L);
            }
        }
        map.put("jsapi_ticket", ticket);
        StringBuffer sb1 = new StringBuffer("");
        Iterator result = map.keySet().iterator();

        String sha1;
        while (result.hasNext()) {
            sha1 = (String) result.next();
            sb1.append(sha1 + "=" + map.get(sha1) + "&");
        }
        String result1 = sb1.substring(0, sb1.length() - 1);
        sha1 = "";

        try {
            sha1 = WechatSignUtil.SHA1(result1);
        } catch (NoSuchAlgorithmException var12) {
            logger.error(var12.getMessage(), var12);
        }

        map.put("signature", sha1.toLowerCase());
        WechatMps wechatMps = getMps(mpid);
        map.put("appId", wechatMps.getAppid());
        map.remove("jsapi_ticket");
        return map;
    }


    /**
     * 获取应用信息
     *
     * @param mpid
     * @param agentId
     * @return
     */
    public static WechatApp getApp(String mpid, String agentId) {
        mpid = getMpid(mpid);
        Assert.notNull(agentId, "agentId is null");
        //查询应用
        WechatApp wechatApp = SpringRedisUtil.get("mps:" + mpid + ":apps:" + agentId);
        if (wechatApp == null) {
            wechatApp = new WechatApp();
            wechatApp.setMpid(Integer.valueOf(mpid));
            wechatApp.setAgentId(agentId);
            wechatApp = wechatAppMapper.selectOne(wechatApp);
            Assert.notNull(wechatApp, "应用 " + agentId + " 不存在");
            SpringRedisUtil.save("mps:" + mpid + ":apps:" + agentId, wechatApp, null);
        }
        return wechatApp;
    }

    /**
     * 获取应用accessToken
     *
     * @param mpid
     * @param agentId
     * @return
     */
    public static String getAgentAccessToken(String mpid, String agentId) {
        mpid = getMpid(mpid);
        String accessToken = SpringRedisUtil.get("mps:" + mpid + ":apps:" + agentId + ":accessToken");
        if (accessToken == null) {
            //查询公众号
            WechatMps wechatMps = getMps(mpid);
            //查询应用
            WechatApp wechatApp = getApp(mpid, agentId);
            JSONObject accessTokenJson = JSONObject.parseObject(HttpClient.get(
                    "https://qyapi.weixin.qq.com/cgi-bin/gettoken?corpid=ID&corpsecret=SECRECT"
                            .replace("ID", wechatMps.getAppid())
                            .replace("SECRECT", wechatApp.getSecret())
            ).asString());
            accessToken = accessTokenJson.getString("access_token");
            Assert.notNull(accessToken, "[" + accessTokenJson.getInteger("errcode") + "]" + accessTokenJson.getString("errmsg"));
        }
        return accessToken;
    }

    /**
     * 获取临时素材
     *
     * @param mpid
     * @param agentId
     * @param serverId
     * @param path
     * @return
     */
    public static String getMedia(String mpid, String agentId, String serverId, String path) throws IOException {
        String accessToken = getAgentAccessToken(mpid, agentId);
        File file = new File(path);
        if (!file.exists()) {
            if (!file.mkdirs()) throw new CustomException("没有读取和创建 " + path + " 目录的权限");
        }
        String url = "https://qyapi.weixin.qq.com/cgi-bin/media/get?access_token=ACCESS_TOKEN&media_id=MEDIA_ID"
                .replace("ACCESS_TOKEN", accessToken)
                .replace("MEDIA_ID", serverId);
        URL u = new URL(url);
        URLConnection uc = u.openConnection();
        String type = uc.getContentType();
        logger.info("::type is ::" + type);
        if ("voice".equals(type)) {
            type = "audio/amr";
        }
        type = type.split("/")[1];
        String fileName = UUID.randomUUID().toString().replace("-", "") + "." + type;
        String fileFullName = path + "/" + fileName;
        file = new File(fileFullName);
        HttpClient.get(url).asFile(file);
        if ("amr".equals(type)) {
            String newFileName = fileName.split("\\.")[0] + ".mp3";
            try {
                Process exec = Runtime.getRuntime().exec(path + "/ffmpeg -i " + path + "/" + fileName + " " + path + "/" + newFileName);
                InputStream stdin = exec.getErrorStream();
                InputStreamReader isr = new InputStreamReader(stdin);
                BufferedReader br = new BufferedReader(isr);
                String line = null;
                System.out.println("<OUTPUT>");
                while ((line = br.readLine()) != null)
                    System.out.println(line);
                System.out.println("</OUTPUT>");
                int exitVal = exec.waitFor();
                System.out.println("Process exitValue: " + exitVal);
            } catch (Exception e) {
                e.printStackTrace();
            }

            StringBuilder sb = new StringBuilder("");
            System.out.println(sb);
            return newFileName;
        }
        return fileName;
    }

    /**
     * 发送消息
     *
     * @param mpid
     * @param agentId
     * @param touser
     * @param content
     * @return
     */
    public static JSONObject sendTextMsg(String mpid, String agentId, List<String> touser, String content) {
        JSONObject contentJson = new JSONObject();
        contentJson.put("content", content);
        return sendMsg(mpid,agentId,touser,null,null,"text",contentJson);
    }

    /**
     * 获取公众号标识
     *
     * @param mpid
     * @return
     */
    private static String getMpid(String mpid) {
        if (StringUtils.isEmpty(mpid)) {
            //单个公众号
            mpid = customProp.getConfig("mpid");
            Assert.notNull(mpid, "未指定的mpid");
        }
        return mpid;
    }


    /**
     * 发送消息
     * @param mpid
     * @param agentId
     * @param touser
     * @param toparty
     * @param totag
     * @param msgtype
     * @param contentJson
     * @return
     */
    private static JSONObject sendMsg(
            String mpid,
            String agentId,
            List<String> touser,
            List<String> toparty,
            List<String> totag,
            String msgtype,
            JSONObject contentJson) {

        mpid = getMpid(mpid);
        String accessToken = getAgentAccessToken(mpid, agentId);
        JSONObject jsonObject = new JSONObject();
        StringBuilder touserSb = new StringBuilder("");
        if (touser != null && touser.size() != 0) {
            for (String userId : touser) {
                touserSb.append(userId).append("|");
            }
        }
        StringBuilder topartSb = new StringBuilder("");
        if (toparty != null && toparty.size() != 0) {
            for (String part : toparty) {
                topartSb.append(part).append("|");
            }
        }

        StringBuilder totagSb = new StringBuilder("");
        if (totag != null && totag.size() != 0) {
            for (String tag : totag) {
                totagSb.append(tag).append("|");
            }
        }

        if(touserSb.length()>0){
            String touserStr = touserSb.substring(0, touserSb.length() - 1);
            jsonObject.put("touser", touserStr);
        }
        if(topartSb.length()>0){
            String topartSbStr = topartSb.substring(0, topartSb.length() - 1);
            jsonObject.put("toparty", topartSbStr);
        }

        if(totagSb.length()>0){
            String totagSbStr = totagSb.substring(0, totagSb.length() - 1);
            jsonObject.put("totag", totagSbStr);
        }

        jsonObject.put("msgtype", msgtype);
        jsonObject.put("agentid", agentId);
        jsonObject.put(msgtype, contentJson);
        JSONObject resultJson = JSONObject.parseObject(HttpClient
                .textBody(" https://qyapi.weixin.qq.com/cgi-bin/message/send?access_token=ACCESS_TOKEN"
                        .replace("ACCESS_TOKEN", accessToken))
                .json(jsonObject.toJSONString()).execute().asString());
        if (resultJson.getInteger("errcode") == 0) {
            logger.info("push text msg success ,return result ：" + jsonObject.toJSONString());
        } else {
            logger.error("push text msg fail , return result ：" + jsonObject.toJSONString());
        }
        return resultJson;
    }

    /**
     * 发送消息卡片
     * @param mpid
     * @param agentId
     * @param touser
     * @param title
     * @param description
     * @param url
     * @param btntxt
     * @return
     */
    public static JSONObject sendCardText(String mpid,
                                          String agentId,
                                          List<String> touser,
                                          String title,
                                          String description,
                                          String url,
                                          String btntxt) {
        JSONObject contentJson = new JSONObject();
        contentJson.put("title", title);
        contentJson.put("description", description);
        contentJson.put("url", url);
        contentJson.put("btntxt", btntxt);
        return sendMsg(mpid, agentId, touser, null, null, "textcard", contentJson);
    }


}