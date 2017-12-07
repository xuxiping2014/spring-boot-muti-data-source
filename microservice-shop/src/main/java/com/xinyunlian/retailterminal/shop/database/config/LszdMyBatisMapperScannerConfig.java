package com.xinyunlian.retailterminal.shop.database.config;

import org.mybatis.spring.mapper.MapperScannerConfigurer;
import org.springframework.boot.autoconfigure.AutoConfigureAfter;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * Created by Discover on 2017/11/29.
 */

@Configuration
@AutoConfigureAfter(MultiDataSourceConfig.class)
public class LszdMyBatisMapperScannerConfig {

    @Bean(name = "adminMapperScanner")
    public MapperScannerConfigurer adminMapperScanner(){
        MapperScannerConfigurer configurer = new MapperScannerConfigurer();
        configurer.setSqlSessionFactoryBeanName("adminSessionFactory");
        // TODO 需要改入配置
        configurer.setBasePackage("com.xinyunlian.retailterminal.shop.database.mapper");
        configurer.setAnnotationClass(AdminRepository.class);
        return configurer;
    }

    @Bean(name = "shopMapperScanner")
    public MapperScannerConfigurer shopMapperScanner(){
        MapperScannerConfigurer configurer = new MapperScannerConfigurer();
        configurer.setSqlSessionFactoryBeanName("shopSessionFactory");
        configurer.setBasePackage("com.xinyunlian.retailterminal.shop.database.mapper");
        configurer.setAnnotationClass(ShopRepository.class);
        return configurer;
    }
}
