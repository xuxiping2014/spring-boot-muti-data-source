package com.xinyunlian.retailterminal.shop.database;

import java.util.List;

/**
 * Created by Discover on 2017/11/29.
 */

public interface QueryWrapper<T> {

    List<T> list();
}
