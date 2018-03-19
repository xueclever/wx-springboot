package com.wmeimob.custom.config;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

import java.util.Map;

/**
 * Created by Shinez on 2017/1/11.
 */
@Component
@ConfigurationProperties(prefix="custom") //接收application.yml中的myProps下面的属性
public class CustomProp {
    private Map<String, String> config; //接收mapProps里面的属性值

    public Map<String, String> getConfig() {
        return config;
    }

    public void setConfig(Map<String, String> config) {
        this.config = config;
    }

    public String getConfig(String key){
        return getConfig().get(key);
    }
}
