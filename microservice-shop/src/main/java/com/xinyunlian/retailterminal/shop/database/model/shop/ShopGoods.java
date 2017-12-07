package com.xinyunlian.retailterminal.shop.database.model.shop;

import java.util.Date;

/**
 * Created by Discover on 2017/11/29.
 */

public class ShopGoods {

    private String goodsShopId;

    private Integer shopId;

    private Integer basegoodsId;

    private String categoryShopId;

    private String barcode;

    private String name;

    private String mnemonic;

    private Integer allowStock;

    private Integer initStock;

    private Integer lowerLimit;

    private Integer brandId;

    private String brandName;

    private Integer state;

    private Integer type;

    private String spec;

    private String comment;

    private String manufacturer;

    private String productionPlace;

    private Integer expirationDate;

    private Integer expirationUnit;

    private Date createTime;

    private String ico;

    public String getGoodsShopId() {
        return goodsShopId;
    }

    public void setGoodsShopId(String goodsShopId) {
        this.goodsShopId = goodsShopId;
    }

    public Integer getShopId() {
        return shopId;
    }

    public void setShopId(Integer shopId) {
        this.shopId = shopId;
    }

    public Integer getBasegoodsId() {
        return basegoodsId;
    }

    public void setBasegoodsId(Integer basegoodsId) {
        this.basegoodsId = basegoodsId;
    }

    public String getCategoryShopId() {
        return categoryShopId;
    }

    public void setCategoryShopId(String categoryShopId) {
        this.categoryShopId = categoryShopId;
    }

    public String getBarcode() {
        return barcode;
    }

    public void setBarcode(String barcode) {
        this.barcode = barcode;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getMnemonic() {
        return mnemonic;
    }

    public void setMnemonic(String mnemonic) {
        this.mnemonic = mnemonic;
    }

    public Integer getAllowStock() {
        return allowStock;
    }

    public void setAllowStock(Integer allowStock) {
        this.allowStock = allowStock;
    }

    public Integer getInitStock() {
        return initStock;
    }

    public void setInitStock(Integer initStock) {
        this.initStock = initStock;
    }

    public Integer getLowerLimit() {
        return lowerLimit;
    }

    public void setLowerLimit(Integer lowerLimit) {
        this.lowerLimit = lowerLimit;
    }

    public Integer getBrandId() {
        return brandId;
    }

    public void setBrandId(Integer brandId) {
        this.brandId = brandId;
    }

    public String getBrandName() {
        return brandName;
    }

    public void setBrandName(String brandName) {
        this.brandName = brandName;
    }

    public Integer getState() {
        return state;
    }

    public void setState(Integer state) {
        this.state = state;
    }

    public Integer getType() {
        return type;
    }

    public void setType(Integer type) {
        this.type = type;
    }

    public String getSpec() {
        return spec;
    }

    public void setSpec(String spec) {
        this.spec = spec;
    }

    public String getComment() {
        return comment;
    }

    public void setComment(String comment) {
        this.comment = comment;
    }

    public String getManufacturer() {
        return manufacturer;
    }

    public void setManufacturer(String manufacturer) {
        this.manufacturer = manufacturer;
    }

    public String getProductionPlace() {
        return productionPlace;
    }

    public void setProductionPlace(String productionPlace) {
        this.productionPlace = productionPlace;
    }

    public Integer getExpirationDate() {
        return expirationDate;
    }

    public void setExpirationDate(Integer expirationDate) {
        this.expirationDate = expirationDate;
    }

    public Integer getExpirationUnit() {
        return expirationUnit;
    }

    public void setExpirationUnit(Integer expirationUnit) {
        this.expirationUnit = expirationUnit;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public String getIco() {
        return ico;
    }

    public void setIco(String ico) {
        this.ico = ico;
    }
}
