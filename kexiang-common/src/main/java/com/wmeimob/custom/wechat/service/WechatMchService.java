package com.wmeimob.custom.wechat.service;

import com.wmeimob.custom.wechat.entity.WechatMch;
import com.wmeimob.custom.wechat.mapper.WechatMchMapper;
import org.springframework.stereotype.Service;
import tk.mybatis.mapper.entity.Example;

import javax.annotation.Resource;
import java.util.List;

/**
 * Created by Shinez on 2017/8/25.
 */
@Service
public class WechatMchService {

    @Resource
    private WechatMchMapper wechatMchMapper;


    /**
     * 根据商户号获取key
     * @param mchId
     * @return
     */
    public String findKeyByNo(String mchId) {
        Example example = new Example(WechatMch.class);
        example.selectProperties("key");
        example.createCriteria().andEqualTo("mchNo",mchId);
        List<WechatMch> wechatMch = wechatMchMapper.selectByExample(example);
        if(wechatMch.size()!=1){
            return null;
        }
        return wechatMch.get(0).getMchKey();
    }
}
