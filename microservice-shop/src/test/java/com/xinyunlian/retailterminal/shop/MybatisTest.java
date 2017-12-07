package com.xinyunlian.retailterminal.shop;

import com.netflix.discovery.converters.Auto;
import com.xinyunlian.retailterminal.shop.database.mapper.ADMSystemMapper;
import com.xinyunlian.retailterminal.shop.database.mapper.ShopGoodsMapper;
import com.xinyunlian.retailterminal.shop.database.model.admin.ADMSystem;
import com.xinyunlian.retailterminal.shop.database.model.shop.ShopGoods;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import java.util.List;

/**
 * Created by Discover on 2017/11/29.
 */

@RunWith(SpringJUnit4ClassRunner.class)
@SpringBootTest(classes = ShopApplication.class)
public class MybatisTest {

    @Autowired
    private ADMSystemMapper mapper;

    @Autowired
    private ShopGoodsMapper shopMapper;

    @Test
    public void loadAll(){

        List<ADMSystem> systems = mapper.getAllSystem();
        Assert.assertNotNull(systems);

        List<ShopGoods> goods = shopMapper.list();
        Assert.assertNotNull(goods);
    }
}
