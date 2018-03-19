package com.wmeimob.custom.system.controller;

import com.alibaba.fastjson.JSONObject;
import com.wmeimob.custom.annotation.Logging;
import com.wmeimob.custom.config.CustomProp;
import com.wmeimob.custom.system.entity.DataDictionary;
import com.wmeimob.custom.system.mapper.DataDictionaryMapper;
import com.wmeimob.custom.wechat.entity.WechatMps;
import com.wmeimob.custom.wechat.entity.WechatUser;
import com.wmeimob.custom.wechat.mapper.WechatAppMapper;
import com.wmeimob.custom.wechat.mapper.WechatMpsMapper;
import com.wmeimob.custom.wechat.service.WechatQYService;
import com.wmeimob.custom.wechat.service.WechatService;
import com.wmeimob.tools.InputValidator;
import com.wmeimob.custom.message.RestResult;
import com.wmeimob.tools.qiniu.QiniuUtil;
import lombok.extern.slf4j.Slf4j;

import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.util.Assert;
import org.springframework.util.StringUtils;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Created by Shinez on 2017/2/6.
 */
@RestController
@Logging
@Slf4j
public class CommonController {

    /**
     * 系统数据字典
     */
    private static Map<Integer, DataDictionary> dataDictionaryMap;

    @Resource
    private DataDictionaryMapper dataDictionaryMapper;

    @Resource
    private CustomProp customProp;

    @Resource
    private WechatMpsMapper wechatMpsMapper;

    @Resource
    private WechatAppMapper wechatAppMapper;


    /**
     * 获取七牛上传token
     *
     * @param request
     * @return
     */
    @GetMapping("/qiniu-token")
    public JSONObject getQiniuToken(HttpServletRequest request) {
    	//WechatUser wechat = (WechatUser)SecurityContextHolder.getContext().getAuthentication().getPrincipal();
        Map<String, Object> map = RestResult.getDataMap();
        map.put("uploadToken", QiniuUtil.getToken());
        map.put("domain", QiniuUtil.getDomain());
        return RestResult.success(map);
    }

    /**
     * 获取数据字典
     *
     * @param request
     * @return
     */
    @GetMapping("data-dictionary")
    public JSONObject getDataDict(HttpServletRequest request) {
        if (dataDictionaryMap == null) {
            dataDictionaryMap = new HashMap<>();
            List<DataDictionary> dataDictionaryList = dataDictionaryMapper.selectAll();
            dataDictionaryList.forEach(dd -> dataDictionaryMap.put(dd.getId(), dd));
        }
        Map<String, Object> map = new HashMap<>();
        map.put("dataDicts", dataDictionaryMap);
        return RestResult.success(map);
    }

    /**
     *  获取JSSDK
     *
     * @param currentUrl
     * @return
     */
    @GetMapping("jssdk")
    public JSONObject getJssdk(String currentUrl, String mpid, String agentId) {
         if (!InputValidator.isUrl(currentUrl)) {
             return RestResult.fail("地址不正确");
         }
        if (StringUtils.isEmpty(mpid)) {
            //单个公众号
            mpid = customProp.getConfig("mpid");
            Assert.notNull(mpid, "未指定的mpid");
        }
        Map<String, Object> jssdkMap;
        WechatMps wechatMps;
        if(StringUtils.isEmpty(agentId)){
            wechatMps = WechatService.getMps(mpid);
            jssdkMap = WechatService.jssdkInit(wechatMps.getAppid(),currentUrl);
        }else{
            wechatMps = WechatQYService.getMps(mpid);
            jssdkMap = WechatQYService.jssdkInit(wechatMps.getAppid(),agentId,currentUrl);
        }
        return RestResult.success(jssdkMap);
    }


    /**
     * 企业号根据ServerId 获取 文件名称
     *
     * @param serverId
     * @return
     */
    @GetMapping("file-name")
    public JSONObject getFileName(String mpid, String agentId, String moduleName,String... serverId) {
        if (serverId == null || serverId.length == 0 || StringUtils.isEmpty(agentId))
            return RestResult.fail("serverId o  r agentId array is empty or null");
        if (StringUtils.isEmpty(mpid)) {
            //单个公众号
            mpid = customProp.getConfig("mpid");
            Assert.notNull(mpid, "未指定的mpid");
        }
        String path = customProp.getConfig("file-path-"+moduleName);
        Assert.notNull(path,"未配置模块【"+moduleName+"】的文件上传路径");
        List<String> fileNames = new ArrayList<>();
        for (String sid : serverId) {
            String fileName = null;
            try {
                fileName = WechatQYService.getMedia(mpid,agentId,sid,path);
            } catch (IOException e) {
                log.error(e.getMessage(),e);
            }
            fileNames.add(fileName);
            System.out.println("save file :"+fileName);
        }
        Map<String, Object> map = new HashMap<>();
        map.put("fileNames", fileNames);
        return RestResult.success(map);
    }
}
