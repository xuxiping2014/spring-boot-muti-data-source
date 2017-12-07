package com.xinyunlian.retailterminal.shop.service.inner;

import com.github.pagehelper.PageInfo;
import com.xinyunlian.retailterminal.dto.ShopChangeDTO;
import com.xinyunlian.retailterminal.dto.query.ret.SimpleShopViewDto;
import com.xinyunlian.retailterminal.enums.ShopActiveEnum;
import com.xinyunlian.retailterminal.shop.database.model.shop.ADMShop;

import java.util.List;

/**
 * Created by Discover on 2017/11/28.
 */

public interface ShopInnerService {

    /**
     * 查询店铺信息
     * @param keyword       关键字
     * @param activeEnum
     * @param currentPage
     * @param pageSize
     * @return
     */
    List<SimpleShopViewDto> findSimpleShopInfoInPage(String keyword, ShopActiveEnum activeEnum, Integer currentPage, Integer pageSize);

    /**
     * 获取店铺详细信息
     * @param shopId
     * @return
     */
    ADMShop findShopDetailViewByShopId(Long shopId);

    /**
     * 改变店铺激活状态
     * @param shopId
     * @param activeEnum
     * @return
     */
    int saveShopActive(Long shopId,ShopActiveEnum activeEnum);

    /**
     * 保存店铺信息
     * @param dto
     * @return
     */
    int saveShop(ShopChangeDTO dto);


}
