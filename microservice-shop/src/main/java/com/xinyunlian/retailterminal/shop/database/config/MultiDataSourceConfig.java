package com.xinyunlian.retailterminal.shop.database.config;

import org.apache.ibatis.session.SqlSessionFactory;
import org.mybatis.spring.SqlSessionFactoryBean;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.autoconfigure.jdbc.DataSourceBuilder;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;
import org.springframework.core.io.support.PathMatchingResourcePatternResolver;
import org.springframework.data.transaction.ChainedTransactionManager;
import org.springframework.jdbc.datasource.DataSourceTransactionManager;
import org.springframework.transaction.PlatformTransactionManager;
import org.springframework.transaction.annotation.EnableTransactionManagement;
import org.springframework.transaction.annotation.TransactionManagementConfigurer;

import javax.sql.DataSource;

/**
 * Created by Discover on 2017/11/28.
 */

@Configuration
@EnableTransactionManagement
public class MultiDataSourceConfig implements TransactionManagementConfigurer {

    private final static Logger LOGGER = LoggerFactory.getLogger(MultiDataSourceConfig.class);

    @Bean(name = "adminDataSource", destroyMethod = "close")
    @ConfigurationProperties(prefix = "spring.datasource.admin")
    public DataSource dataSourceForAdmin(){
        return DataSourceBuilder.create().build();
    }

    @Bean(name = "shopDataSource", destroyMethod = "close")
    @ConfigurationProperties(prefix = "spring.datasource.shop")
    public DataSource dataSourceForShop(){
        return DataSourceBuilder.create().build();
    }

    @Bean(name = "adminMybatisConfig")
    @ConfigurationProperties(prefix = "spring.mybatis.admin")
    public MyBatisConfiguration adminMybatisConfig(){
        return new MyBatisConfiguration();
    }

    @Bean(name = "shopMybatisConfig")
    @ConfigurationProperties(prefix = "spring.mybatis.shop")
    public MyBatisConfiguration shopMybatisConfig(){
        return new MyBatisConfiguration();
    }

    @Bean(name = "adminSessionFactory")
    @Primary
    public SqlSessionFactory adminSessionFactory() throws Exception {

        SqlSessionFactoryBean factoryBean = new SqlSessionFactoryBean();
        MyBatisConfiguration configuration = adminMybatisConfig();
        factoryBean.setDataSource(dataSourceForAdmin());
        factoryBean.setConfigLocation(new PathMatchingResourcePatternResolver().getResource(configuration.getConfiguration()));
        return factoryBean.getObject();
    }

    @Bean(name = "shopSessionFactory")
    public SqlSessionFactory shopSessionFactory() throws Exception {

        SqlSessionFactoryBean factoryBean = new SqlSessionFactoryBean();
        MyBatisConfiguration configuration = shopMybatisConfig();
        factoryBean.setDataSource(dataSourceForShop());
        factoryBean.setConfigLocation(new PathMatchingResourcePatternResolver().getResource(configuration.getConfiguration()));
        return factoryBean.getObject();
    }

    @Override
    public PlatformTransactionManager annotationDrivenTransactionManager() {
        DataSourceTransactionManager adminTransManager = new DataSourceTransactionManager(dataSourceForAdmin());
        //DataSourceTransactionManager shopTransManager = new DataSourceTransactionManager(dataSourceForShop());
        return new ChainedTransactionManager(adminTransManager);
    }
}
