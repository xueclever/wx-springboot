package com.wmeimob.custom.system.config;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

/**
 * Created by Shinez on 2017/11/9.
 */
@Component
public class ApplicationVariable {

    @Value("${writeIp}")
    public String writeIps;
}
