package com.xinyunlian.retailterminal.shop.database.mapper;

import com.xinyunlian.retailterminal.shop.database.model.shop.ADMShop;
import com.xinyunlian.retailterminal.shop.database.model.shop.ADMShopExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface ADMShopMapper {
    int countByExample(ADMShopExample example);

    int deleteByExample(ADMShopExample example);

    int deleteByPrimaryKey(Long shopId);

    int insert(ADMShop record);

    int insertSelective(ADMShop record);

    List<ADMShop> selectByExample(ADMShopExample example);

    ADMShop selectByPrimaryKey(Long shopId);

    int updateByExampleSelective(@Param("record") ADMShop record, @Param("example") ADMShopExample example);

    int updateByExample(@Param("record") ADMShop record, @Param("example") ADMShopExample example);

    int updateByPrimaryKeySelective(ADMShop record);

    int updateByPrimaryKey(ADMShop record);
}