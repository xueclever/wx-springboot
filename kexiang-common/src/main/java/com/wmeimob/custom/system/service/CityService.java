package com.wmeimob.custom.system.service;

import com.alibaba.fastjson.JSONArray;
import com.wmeimob.custom.system.entity.CityInfo;
import com.wmeimob.custom.system.mapper.CityInfoMapper;
import com.wmeimob.tools.SpringRedisUtil;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;


/**
 * Created by Shinez on 2017/8/8.
 */
@Service
public class CityService {

    @Resource
    private CityInfoMapper cityInfoMapper;

    public   List<CityInfo> getCityInfoList() {
        List<CityInfo> cityInfoList =  SpringRedisUtil.get("cityInfo");
        if (cityInfoList == null) {
            cityInfoList = cityInfoMapper.selectByType(0);
            System.out.println(JSONArray.toJSON(cityInfoList));
            SpringRedisUtil.save("cityInfo",cityInfoList,null);
        }
        System.out.println(JSONArray.toJSON(cityInfoList));
        return cityInfoList;
    }
}
