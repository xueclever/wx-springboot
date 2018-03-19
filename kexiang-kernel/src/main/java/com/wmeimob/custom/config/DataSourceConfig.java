package com.wmeimob.custom.config;

import com.github.pagehelper.PageHelper;
import org.apache.commons.dbcp.BasicDataSource;
import org.apache.ibatis.plugin.Interceptor;
import org.apache.ibatis.session.SqlSessionFactory;
import org.mybatis.spring.SqlSessionFactoryBean;
import org.mybatis.spring.SqlSessionTemplate;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.io.support.PathMatchingResourcePatternResolver;
import org.springframework.core.io.support.ResourcePatternResolver;
import org.springframework.jdbc.datasource.DataSourceTransactionManager;
import org.springframework.transaction.PlatformTransactionManager;
import org.springframework.transaction.annotation.EnableTransactionManagement;
import org.springframework.transaction.annotation.TransactionManagementConfigurer;

import javax.sql.DataSource;
import java.util.Properties;


/**
 * Created by xiangzhao on 2016/7/28.
 */
@Configuration
@EnableTransactionManagement
public class DataSourceConfig implements TransactionManagementConfigurer {


    private static final Logger logger = LoggerFactory.getLogger(DataSourceConfig.class);
    private DataSource dataSource;

    @Bean(destroyMethod = "close")
    @ConfigurationProperties(prefix = "spring.datasource")
    public DataSource getDataSource() {
        if (dataSource==null){
            logger.info("【配置数据源】");
            dataSource=new BasicDataSource();
        }
        return dataSource;
    }

    @Bean(name = "sqlSessionFactory")
    public SqlSessionFactory sqlSessionFactoryBean() {
        logger.info("【配置sqlSessionFactory】");
        SqlSessionFactoryBean bean = new SqlSessionFactoryBean();
        bean.setDataSource(getDataSource());
        //添加模型
        bean.setTypeAliasesPackage("com.wmeimob.**.entity");

        //分页插件
        PageHelper pageHelper = new PageHelper();
        Properties properties = new Properties();
        properties.setProperty("reasonable", "true");
        properties.setProperty("supportMethodsArguments", "true");
        properties.setProperty("returnPageInfo", "check");
        properties.setProperty("params", "count=countSql");
        pageHelper.setProperties(properties);

        //数据权限
//        MybatisDataInterceptor dataInterceptor = new MybatisDataInterceptor();

        //添加插件
        bean.setPlugins(new Interceptor[]{pageHelper});

        //添加XML目录
        ResourcePatternResolver resolver = new PathMatchingResourcePatternResolver();
        try {
            bean.setMapperLocations(resolver.getResources("classpath*:com/wmeimob/**/mapper/**/*.xml"));
            return bean.getObject();
        } catch (Exception e) {
            e.printStackTrace();
            throw new RuntimeException(e);
        }
    }

    @Bean
    public SqlSessionTemplate sqlSessionTemplate(SqlSessionFactory sqlSessionFactory) {
        logger.info("【配置sqlSessionTemplate】");
        return new SqlSessionTemplate(sqlSessionFactory);
    }

    @Bean
    @Override
    public PlatformTransactionManager annotationDrivenTransactionManager() {
        logger.info("【配置事务】");
        return new DataSourceTransactionManager(getDataSource());
    }

}