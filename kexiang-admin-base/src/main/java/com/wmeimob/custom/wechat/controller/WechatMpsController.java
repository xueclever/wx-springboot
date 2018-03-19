package com.wmeimob.custom.wechat.controller;

import com.alibaba.fastjson.JSONObject;
import com.github.pagehelper.PageInfo;
import com.wmeimob.custom.annotation.Logging;
import com.wmeimob.custom.system.entity.SysUser;
import com.wmeimob.custom.system.security.DataAuthHelper;
import com.wmeimob.custom.wechat.entity.WechatApp;
import com.wmeimob.custom.wechat.entity.WechatMch;
import com.wmeimob.custom.wechat.entity.WechatMps;
import com.wmeimob.custom.wechat.mapper.WechatMchMapper;
import com.wmeimob.custom.wechat.mapper.WechatMpsMapper;
import com.wmeimob.custom.wechat.service.WechatAppService;
import com.wmeimob.tools.InputValidator;
import com.wmeimob.tools.SpringRedisUtil;
import com.wmeimob.custom.message.RestResult;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.util.StringUtils;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;
import tk.mybatis.mapper.entity.Example;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import java.io.IOException;
import java.util.List;

/**
 * Created by Shinez on 2017/1/9.
 */
@RestController
@PreAuthorize("hasRole('ROOT')")
@Logging
public class WechatMpsController {

    @Resource
    private WechatMpsMapper wechatMpsMapper;

    @Resource
    private WechatMchMapper wechatMchMapper;



    @Resource
    private WechatAppService wechatAppService;


    /**
     * 获取公众号列表
     *
     * @param request
     * @return
     */
    @GetMapping("mps")
    public JSONObject getMpsInfo(HttpServletRequest request) {
        SysUser sysUser = (SysUser) SecurityContextHolder.getContext()
                .getAuthentication()
                .getPrincipal();
        PageInfo<WechatMps> pageInfo = null;
//        if (sysUserService.isRootAccount(sysUser.getUsername())) {
//            返回所有
//            pageInfo = new PageInfo<>(wechatMpsMapper.selectAll());
//        } else {
        String mpid = DataAuthHelper.getByUserDetails(sysUser, "BY_MP_ID");
//        if (mpid == null)
//            mpid = "-1";
        Example example = new Example(WechatMps.class);
        example.createCriteria().andEqualTo("id", mpid);
        pageInfo = new PageInfo<>(wechatMpsMapper.selectByExample(example));
//    }
        return RestResult.success(pageInfo);
    }


    /**
     * 第三方授权跳转
     *
     * @param request
     * @return
     */
    @RequestMapping("mps/toAuth")
    public JSONObject toAuth(HttpServletRequest request) {
        String mpid = request.getParameter("mpid");
        WechatMps wechatMps = wechatMpsMapper.selectByPrimaryKey(Integer.valueOf(mpid));
        String componentAuthUrl = wechatMps.getComponentAuthorizeUrl();
        if (!StringUtils.isEmpty(componentAuthUrl) && InputValidator.isUrl(componentAuthUrl.substring(0, componentAuthUrl.indexOf("?")))) {
            return RestResult.success(componentAuthUrl +
                    "?redirect_url=" + request.getScheme() + "://" + request.getServerName() + request.getContextPath() + "/mps/authBack?method=");
        }
        return RestResult.fail("商户未配置授权地址");
    }


    /**
     * 以下注释的部分，功能在未来会保留。实现需重构，保留废弃的代码供重构时参考
     */

//    @Logging("授权回调页面")
//    @RequestMapping("mps/authBack")
//    public ModelAndView authBack(HttpServletRequest request) throws UnsupportedEncodingException {
//        String headImg = request.getParameter("headImg");
//        String appid = request.getParameter("appid");
//        String serviceTypeInfo = request.getParameter("serviceTypeInfo");
//        String nickName = request.getParameter("nickName");
//
//        //更新授权信息
//        WechatMps wechatMps = new WechatMps();
//        wechatMps.setAppid(appid);
//        wechatMps.setHeadImg(URLDecoder.decode(StringUtils.isEmpty(headImg) ? "/images/mp_default.jpg" : headImg, "utf-8"));
//        wechatMps.setServiceTypeInfo(Byte.valueOf(serviceTypeInfo));
//        wechatMps.setNickName(URLDecoder.decode(nickName, "utf-8"));
//        int result = wechatMpsMapper.updateAuthInfo(wechatMps);
//        ModelAndView modelAndView = new ModelAndView();
//        if (result > 0) {
//            modelAndView.setViewName("redirect:/mps/index");
//        } else {
//            //授权信息不匹配
//            modelAndView.addObject("msg", ShiNez.msg(MessageConst.Msg.AUTHORIZE_APPID_ERROR));
//            modelAndView.setViewName("/error");
//        }
//        return modelAndView;
//    }


    /**
     * 保存公众号
     *
     * @param request
     * @param wechatMps
     * @return
     */
    @RequestMapping(value = "mps", method = {RequestMethod.POST, RequestMethod.PUT})
    public JSONObject save(HttpServletRequest request, WechatMps wechatMps) {
        if (StringUtils.isEmpty(wechatMps.getId())) {
            //添加
            wechatMpsMapper.insertSelective(wechatMps);
            return RestResult.success(wechatMps.getId());
        }
        int result = wechatMpsMapper.updateByPrimaryKeySelective(wechatMps);
        if (result > 0) {
            SpringRedisUtil.save("mps:" + wechatMps.getAppid() + ":object", wechatMps, 6 * 3600 * 1000L);
            return RestResult.success();
        }
        return RestResult.fail();
    }

    /**
     * 删除公众号
     *
     * @param id
     * @return
     */
    @DeleteMapping("mps/{id}")
    public JSONObject del(@PathVariable("id") Integer id) {
        if (id == null) {
            return RestResult.fail();
        }
        int result = wechatMpsMapper.deleteByPrimaryKey(id);
        return result > 0 ? RestResult.success() : RestResult.fail();
    }


    /**
     * 获取商户证书
     *
     * @param request
     * @return
     */
    @GetMapping("mch")
    public JSONObject loadMchInfo(HttpServletRequest request) {
        Example example = new Example(WechatMch.class);
        example.selectProperties("id", "mchNo", "mchKey", "p12SetFlag");
        return RestResult.success(wechatMchMapper.selectByExample(example));
    }

    /**
     * 保存商户证书
     *
     * @param uploadFile
     * @param wechatMch
     * @return
     * @throws IOException
     */
    @RequestMapping(value = "mch", method = {RequestMethod.POST, RequestMethod.PUT})
    public JSONObject saveMchInfo(@RequestParam(value = "p12Data") MultipartFile uploadFile, WechatMch wechatMch) throws IOException {
        if (uploadFile != null) {
            wechatMch.setP12(uploadFile.getBytes());
            wechatMch.setP12SetFlag(true);
        } else {
            wechatMch.setP12SetFlag(false);
        }

        if (StringUtils.isEmpty(wechatMch.getId())) {
            //添加
            wechatMchMapper.insertSelective(wechatMch);
            return RestResult.success(wechatMch.getId());
        }
        int result = wechatMchMapper.updateByPrimaryKeySelective(wechatMch);
        return result > 0 ? RestResult.success() : RestResult.fail();
    }


    /**
     * 删除商户证书
     *
     * @param id
     * @return
     */
    @DeleteMapping("mch/{id}")
    public JSONObject delMch(@PathVariable("id") Integer id) {
        int result = wechatMchMapper.deleteByPrimaryKey(id);
        return result > 0 ? RestResult.success() : RestResult.fail();
    }

    /**
     * 获取应用
     *
     * @param mpid
     * @return
     */
    @GetMapping("mps/{mpid}/app")
    public JSONObject getApp(@PathVariable Integer mpid) {
        List<WechatApp> wechatAppList = wechatAppService.findByMpid(mpid);
        return RestResult.success(wechatAppList);
    }

    /**
     * 添加应用
     *
     * @param mpid
     * @return
     */
    @PostMapping("mps/{mpid}/app")
    public JSONObject addApp(@PathVariable Integer mpid, WechatApp wechatApp) {
        String validAdd = wechatApp.validSave();
        if (validAdd != null) return RestResult.fail(validAdd);
        wechatAppService.add(wechatApp);
        return RestResult.success(wechatApp);
    }


    /**
     * 修改应用
     *
     * @param mpid
     * @param appId
     * @param wechatApp
     * @return
     */
    @PutMapping("mps/{mpid}/app/{appId}")
    public JSONObject updateApp(@PathVariable Integer mpid, @PathVariable Integer appId, WechatApp wechatApp) {
        String validAdd = wechatApp.validSave();
        if (validAdd != null) return RestResult.fail(validAdd);
        wechatAppService.update(wechatApp);
        return RestResult.success(wechatApp);
    }

    /**
     * 删除应用
     *
     * @param mpid
     * @param appId
     * @return
     */
    @DeleteMapping("mps/{mpid}/app/{appId}")
    public JSONObject delApp(@PathVariable Integer mpid, @PathVariable Integer appId) {
        WechatApp wechatApp = new WechatApp();
        wechatApp.setMpid(mpid);
        wechatApp.setId(appId);
        int result = wechatAppService.del(wechatApp);
        return result > 0 ? RestResult.success() : RestResult.fail();
    }


    public static void main(String[] args) {

    }
}
