package com.xinyunlian.retailterminal.shop.database.config;

/**
 * Created by Discover on 2017/11/29.
 */

public class MyBatisConfiguration {

    private String configuration;

    private String mappers;

    private String typeAlias;

    public String getTypeAlias() {
        return typeAlias;
    }

    public void setTypeAlias(String typeAlias) {
        this.typeAlias = typeAlias;
    }

    public String getMappers() {
        return mappers;
    }

    public void setMappers(String mappers) {
        this.mappers = mappers;
    }

    public String getConfiguration() {
        return configuration;
    }

    public void setConfiguration(String configuration) {
        this.configuration = configuration;
    }
}
