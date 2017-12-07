package com.xinyunlian.retailterminal.shop.database;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import org.springframework.stereotype.Component;

import java.util.List;

/**
 * Created by Discover on 2017/11/29.
 */

@Component
public class DatabasePageHelper {

    public PageInfo query(Integer offset, Integer limit, QueryWrapper queryWrapper) {
        PageHelper.startPage(offset, limit);
        List result = queryWrapper.list();
        return new PageInfo(result);
    }
}
