package com.wmeimob.custom.system.config;

import com.wmeimob.custom.system.entity.SimpleConfig;
import com.wmeimob.custom.system.mapper.SimpleConfigMapper;
import com.wmeimob.custom.system.security.SysSecurityMetadataSource;
import com.wmeimob.tools.SpringHelper;
import com.wmeimob.tools.SpringRedisUtil;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;
import org.springframework.util.Assert;

/**
 * Created by Shinez on 2017/11/4.
 */
@Component
public class StartUpRunner implements ApplicationRunner {
    @Override
    public void run(ApplicationArguments applicationArguments) throws Exception {
        SysSecurityMetadataSource sysSecurityMetadataSource = (SysSecurityMetadataSource) SpringHelper.getBean("sysSecurityMetadataSource");
        sysSecurityMetadataSource.initData();

        loadJsonWebTokenSecretToCache();
    }

    private void loadJsonWebTokenSecretToCache() {
        SimpleConfigMapper simpleConfigMapper = (SimpleConfigMapper) SpringHelper.getBean("simpleConfigMapper");
        SimpleConfig simpleConfig = new SimpleConfig();
        String jwtSecretKey = "jwt-secret";
        simpleConfig.setConfigName(jwtSecretKey);
        simpleConfig = simpleConfigMapper.selectOne(simpleConfig);
        Assert.notNull(simpleConfig, "can't find \"" + jwtSecretKey + "\"config on database");
        String secret = simpleConfig.getConfigValue();
        SpringRedisUtil.save("jwt:secret", secret, null);
    }
}
