package com.xinyunlian.retailterminal.shop.database.mapper;

import com.xinyunlian.retailterminal.shop.database.config.ShopRepository;
import com.xinyunlian.retailterminal.shop.database.model.shop.ShopGoods;
import org.apache.ibatis.annotations.Select;

import java.util.List;

/**
 * Created by Discover on 2017/11/29.
 */

@ShopRepository
public interface ShopGoodsMapper {

    @Select("SELECT * FROM TG_GOODS_SHOP;")
    List<ShopGoods> list();
}
