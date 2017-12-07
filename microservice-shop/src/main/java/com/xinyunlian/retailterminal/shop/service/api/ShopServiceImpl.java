package com.xinyunlian.retailterminal.shop.service.api;

import com.xinyunlian.retailterminal.api.ShopServiceApi;
import com.xinyunlian.retailterminal.api.user.bean.AccountUpdateParam;
import com.xinyunlian.retailterminal.api.user.service.AccountClientService;
import com.xinyunlian.retailterminal.common.bean.BaseResponse;
import com.xinyunlian.retailterminal.dto.ShopChangeDTO;
import com.xinyunlian.retailterminal.dto.query.ret.SimpleShopViewDto;
import com.xinyunlian.retailterminal.enums.ShopActiveEnum;
import com.xinyunlian.retailterminal.shop.service.inner.ShopInnerService;
import org.apache.commons.lang.StringUtils;
import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * Created by Discover on 2017/11/28.
 */

@RestController
public class ShopServiceImpl implements ShopServiceApi {

    private final static Logger LOGGER = Logger.getLogger(ShopServiceImpl.class);

    @Autowired
    private ShopInnerService shopInnerService;
    @Autowired
    private AccountClientService accountClientService;

    @Override
    public BaseResponse list(@RequestParam(value = "active",required = false) Integer active,
                             @RequestParam("keyword") String keyword, @RequestParam("currentPage") Integer currentPage, @RequestParam("pageSize") Integer pageSize) {

        ShopActiveEnum shopActiveEnum = ShopActiveEnum.findByCode(active);
        // TODO 统一检验入参
        List<SimpleShopViewDto> a = shopInnerService.findSimpleShopInfoInPage(keyword,shopActiveEnum, currentPage, pageSize);
        return new BaseResponse(a,0);
    }

    @Override
    public BaseResponse view(@PathVariable(value = "shopId") Long shopId) {
        return new  BaseResponse(shopInnerService.findShopDetailViewByShopId(shopId));
    }

    @Override
    public BaseResponse save(@RequestBody ShopChangeDTO change) {
        BaseResponse ret = null;
        String message = checkParamters(change);
        if(StringUtils.isNotEmpty(message))
        {
            ret = new BaseResponse(message,false);
        }
        else
        {
            //修改账号信息
            if(change.getAccountId()!=null) {
                AccountUpdateParam accParam = new AccountUpdateParam();
                accParam.setAccountId(change.getAccountId());
                accParam.setAccountName(change.getName());
                accountClientService.updateAccount(accParam);
            }
            //新增账户
            else
            {

            }
            //修改店铺信息
            shopInnerService.saveShop(change);
            ret = new BaseResponse();
        }
        return ret;
    }

    @Override
    public BaseResponse changeStatus(@PathVariable("shopId") Integer shopId, @RequestParam("status") Integer status) {
        return null;
    }

    /**
     * 改变用户激活状态
     * @param shopId
     * @param enable
     * @return
     */
    @Override
    public BaseResponse enable(@PathVariable("shopId") Long shopId, @RequestParam("enable") Integer enable) {
        BaseResponse ret = null;
        ShopActiveEnum activeEnum = ShopActiveEnum.findByCode(enable);
        if(activeEnum==null)
        {
            ret = new BaseResponse("激活状态不正确",false);
        }
        else{
            shopInnerService.saveShopActive(shopId,activeEnum);
            ret = new BaseResponse();
        }
        return ret;
    }

    /**
     * 判断字段长度
     * @param dto
     * @return
     */
    private String checkParamters(ShopChangeDTO dto)
    {
        String emptyError = "[%s]不能为空";
        String maxLenError = "[%s]最大长度不超过%s个字符";
        if(StringUtils.isEmpty(dto.getMobile()))
        {
            return String.format(emptyError,"手机号码");
        }
        else if(dto.getMobile().length()>15)
        {
            return String.format(maxLenError,"手机号码",15);
        }

        if(StringUtils.isEmpty(dto.getKeeper()))
        {
            return String.format(emptyError,"店主姓名");
        }
        else if(dto.getKeeper().length()>30)
        {
            return String.format(maxLenError,"店主姓名",30);
        }

        if(StringUtils.isEmpty(dto.getName()))
        {
            return String.format(emptyError,"店铺名称");
        }
        else if(dto.getName().length()>50)
        {
            return String.format(maxLenError,"店铺名称",50);
        }

        if(dto.getProvince().length()>15)
        {
            return String.format(maxLenError,"省/直辖市编码",15);
        }
        if(dto.getCity().length()>15)
        {
            return String.format(maxLenError,"市编码",15);
        }
        if(dto.getCity().length()>15)
        {
            return String.format(maxLenError,"区/县编码",15);
        }

        if(dto.getAddress().length()>100)
        {
            return String.format(maxLenError,"详细地址",100);
        }

        if(dto.getTobaccoLicense().length()>30)
        {
            return String.format(maxLenError,"烟草许可证",30);
        }

        if(dto.getBizLicense().length()>30)
        {
            return String.format(maxLenError,"营业许可证",30);
        }

        return null;
    }
}
