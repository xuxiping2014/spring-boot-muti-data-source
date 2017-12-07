package com.xinyunlian.retailterminal.shop.service.inner.impl;

import com.github.pagehelper.PageInfo;
import com.xinyunlian.retailterminal.dto.ShopChangeDTO;
import com.xinyunlian.retailterminal.dto.query.ret.SimpleShopViewDto;
import com.xinyunlian.retailterminal.enums.*;
import com.xinyunlian.retailterminal.exception.LSZDException;
import com.xinyunlian.retailterminal.shop.database.DatabasePageHelper;
import com.xinyunlian.retailterminal.shop.database.QueryWrapper;
import com.xinyunlian.retailterminal.shop.database.mapper.ADMShopMapper;
import com.xinyunlian.retailterminal.shop.database.model.shop.ADMShop;
import com.xinyunlian.retailterminal.shop.database.model.shop.ADMShopExample;
import com.xinyunlian.retailterminal.shop.service.inner.ShopInnerService;
import org.apache.commons.lang.StringUtils;
import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 * Created by Discover on 2017/11/28.
 */

@Service
public class ShopInnerServiceImpl implements ShopInnerService  {

    private final static Logger LOGGER = Logger.getLogger(ShopInnerServiceImpl.class);

    @Autowired
    private ADMShopMapper admShopMapper;

    @Autowired
    private DatabasePageHelper pageHelper;

    /**
     * 店铺列表
     * @param keyword       关键字
     * @param activeEnum
     * @param currentPage
     * @param pageSize
     * @return
     */
    @Override
    public List<SimpleShopViewDto> findSimpleShopInfoInPage(String keyword, ShopActiveEnum activeEnum, Integer currentPage, Integer pageSize) {
        ADMShopExample queryModel = new ADMShopExample();
        ADMShopExample.Criteria andCriteria  = queryModel.createCriteria();
        if(activeEnum!=null)
        {
            andCriteria.andActiveEqualTo(activeEnum.getCode());
        }
        if(StringUtils.isNotEmpty(keyword))
        {
            ADMShopExample.Criteria orCriteria= queryModel.or();
            orCriteria.andShopNameLike("%"+keyword+"%");
            //orCriteria.andMobileLike("%"+keyword+"%");
        }
        queryModel.setOrderByClause(" active asc,shopid desc ");
        PageInfo<ADMShop> page = pageHelper.query(currentPage, pageSize, () -> (admShopMapper.selectByExample(queryModel)));
        List<SimpleShopViewDto> lstRet = new ArrayList<>();
        if(page.getSize()>0)
        {
            for (ADMShop shop:page.getList()) {
                SimpleShopViewDto dto = new SimpleShopViewDto();
                dto.setShopId(shop.getShopId());
                dto.setShopName(shop.getShopName());
                dto.setActive(shop.getActive());
                lstRet.add(dto);
            }
        }
        return lstRet;
    }

    @Override
    public ADMShop findShopDetailViewByShopId(Long shopId) {
        return admShopMapper.selectByPrimaryKey(shopId);
    }

    @Transactional(rollbackFor = LSZDException.class,propagation = Propagation.REQUIRED)
    @Override
    public int saveShopActive(Long shopId, ShopActiveEnum activeEnum) {
        ADMShop shop = admShopMapper.selectByPrimaryKey(shopId);
        if(shop==null)
        {
            throw new LSZDException("","店铺不存在");
        }
        shop.setActive(activeEnum.getCode());
        shop.setLastUpdTime(new Date());
        return admShopMapper.updateByPrimaryKey(shop);
    }

    @Transactional(rollbackFor = LSZDException.class,propagation = Propagation.REQUIRED)
    @Override
    public int saveShop(ShopChangeDTO dto) {
        ADMShop shop =null;
        ADMShopExample queryModel = new ADMShopExample();
        if(shop.getShopId()!=null) {
            shop = admShopMapper.selectByPrimaryKey(dto.getShopId());
            if (shop == null) {
                throw new LSZDException("", "店铺不存在");
            }
            //queryModel.createCriteria().andShopIdNotEqualTo(dto.getShopId()).andShopNameEqualTo()
            shop.setLastUpdTime(new Date());
        }
        else
        {
            shop = new ADMShop();
            shop.setCreateTime(new Date());
        }
        shop.setAddress(dto.getAddress());
        shop.setProvince(dto.getProvince());
        shop.setCity(dto.getCity());
        shop.setCounty(dto.getCountry());
        //shop.setMobile(dto.getMobile());
        shop.setShopKeeper(dto.getKeeper());
        shop.setShopName(dto.getName());
        shop.setLatitude(dto.getLatitude());
        shop.setLongitude(dto.getLongitude());
        shop.setBaseType(BaseTypeEnum.findByCode(dto.getBaseType())!=null?BaseTypeEnum.findByCode(dto.getBaseType()).getCode():null);
        shop.setSaleType(SaleTypeEnum.findByCode(dto.getSaleType())!=null?SaleTypeEnum.findByCode(dto.getSaleType()).getCode():null);
        shop.setWorkPort(ShopWorkPortEnum.findByCode(dto.getWorkport())!=null?ShopWorkPortEnum.findByCode(dto.getWorkport()).getCode():null);
        shop.setBusinessArea(BizAreaEnum.findByCode(dto.getBizArea())!=null?BizAreaEnum.findByCode(dto.getBizArea()).getCode():null);
        //shop.setSaleScope(SaleScopeEnum.findByCode(dto.getSaleScope())!=null?SaleScopeEnum.findByCode(dto.getSaleScope()).getCode():null);
        shop.setTobaccoLicense(dto.getTobaccoLicense());
        shop.setBusinessLicense(dto.getBizLicense());
        //shop.setTobaccoCustId(dto.get);
        int result;
        if(shop.getShopId()!=null)
        {
            result = admShopMapper.updateByPrimaryKey(shop);
        }
        else
        {
            result = admShopMapper.insert(shop);
        }
        return result;
    }
}
