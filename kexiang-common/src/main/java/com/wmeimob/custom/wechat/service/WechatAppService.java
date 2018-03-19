package com.wmeimob.custom.wechat.service;

import com.wmeimob.custom.wechat.entity.WechatApp;
import com.wmeimob.custom.wechat.mapper.WechatAppMapper;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.util.Assert;
import tk.mybatis.mapper.entity.Example;

import javax.annotation.Resource;
import java.util.List;

/**
 * Created by Shinez on 2017/9/16.
 */
@Service
@Transactional
public class WechatAppService {


    @Resource
    private WechatAppMapper wechatAppMapper;

    /**
     * 根据企业号ID查询应用
     * @param mpid
     * @return
     */
    public List<WechatApp> findByMpid(Integer mpid) {
        Assert.notNull(mpid,"mpid is required");
        WechatApp wechatApp = new WechatApp();
        wechatApp.setMpid(mpid);
        return wechatAppMapper.select(wechatApp);
    }


    /**
     * 添加应用
     * @param wechatApp
     * @return
     */
    public WechatApp add(WechatApp wechatApp) {
        wechatAppMapper.insertSelective(wechatApp);
        return wechatApp;
    }

    /**
     * 修改应用
     * @param wechatApp
     */
    public int update(WechatApp wechatApp) {
        Example example =new Example(WechatApp.class);
        example.createCriteria()
                .andEqualTo("mpid",wechatApp.getMpid())
                .andEqualTo("id",wechatApp.getId());
        int result = wechatAppMapper.updateByExampleSelective(wechatApp,example);
        return result;
    }

    /**
     * 删除应用
     * @param wechatApp
     * @return
     */
    public int del(WechatApp wechatApp) {
        Example example =new Example(WechatApp.class);
        example.createCriteria()
                .andEqualTo("mpid",wechatApp.getMpid())
                .andEqualTo("id",wechatApp.getId());
        int result = wechatAppMapper.deleteByExample(example);
        return result;
    }
}
