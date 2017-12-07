package com.xinyunlian.retailterminal.shop.database.mapper;

import com.xinyunlian.retailterminal.shop.database.config.AdminRepository;
import com.xinyunlian.retailterminal.shop.database.model.admin.ADMSystem;
import org.apache.ibatis.annotations.Select;

import java.util.List;

/**
 * Created by Discover on 2017/11/29.
 */

@AdminRepository
public interface ADMSystemMapper {

    @Select("SELECT * FROM ADM_SYSTEM;")
    List<ADMSystem> getAllSystem();
}
