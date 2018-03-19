package com.wmeimob.custom.config;

import com.wmeimob.custom.interfaces.Mapper;
import org.springframework.boot.autoconfigure.AutoConfigureAfter;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import tk.mybatis.spring.mapper.MapperScannerConfigurer;

import java.util.Properties;

/**
 * Created by Shinez on 2016/11/15.
 */
@Configuration
//注意，由于MapperScannerConfigurer执行的比较早，所以必须有下面的注解
//MyBatisConfig.class是一个包含了SqlSessionFactory配置的类
@AutoConfigureAfter(DataSourceConfig.class)
public class MyBatisMapperScannerConfig {
    @Bean
    public MapperScannerConfigurer mapperScannerConfigurer() {
        MapperScannerConfigurer mapperScannerConfigurer = new MapperScannerConfigurer();
        mapperScannerConfigurer.setSqlSessionFactoryBeanName("sqlSessionFactory");
        mapperScannerConfigurer.setBasePackage("com.wmeimob.**.mapper");
        Properties properties = new Properties();
        properties.setProperty("mappers", Mapper.class.getName());
        properties.setProperty("notEmpty", "false");
        properties.setProperty("IDENTITY", "MYSQL");
        //这里使用的通用Mapper的MapperScannerConfigurer，所有有下面这个方法
        mapperScannerConfigurer.setProperties(properties);
        return mapperScannerConfigurer;
    }
}
