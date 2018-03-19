package com.wmeimob.custom.system.config;

import com.wmeimob.custom.config.DateConvert;
import org.springframework.context.annotation.Configuration;
import org.springframework.format.FormatterRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;

/**
 * Created by Shinez on 2017/9/23.
 */
@Configuration
public class SpringBootConfig extends WebMvcConfigurerAdapter {
    @Override
    public void addFormatters(FormatterRegistry registry) {
        registry.addConverter(new DateConvert());
        super.addFormatters(registry);
    }
}
