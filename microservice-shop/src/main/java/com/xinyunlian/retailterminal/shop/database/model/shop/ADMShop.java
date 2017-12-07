package com.xinyunlian.retailterminal.shop.database.model.shop;

import java.util.Date;

public class ADMShop {
    private Long shopId;

    private String areaId;

    private String shopName;

    private String shopKeeper;

    private String socialCardId;

    private String telephone;

    private String mobile;

    private String qq;

    private String email;

    private String province;

    private String city;

    private String county;

    private String postCode;

    private String address;

    private Float longitude;

    private Float latitude;

    private Integer status;

    private String posNo;

    private String storageNo;

    private String tobaccoLicense;

    private Date createTime;

    private Date lastUpdTime;

    private Integer commitor;

    private Integer approvor;

    private Integer level;

    private String userCenterId;

    private String userCenterShopId;

    private String icon;

    private String deviceIdentify;

    private Integer isOnline;

    private Date lastHeartbeatTime;

    private Long growth;

    private Long points;

    private Integer posAppType;

    private Long tobaccoCustId;

    private String workPort;

    private String saleScope;

    private String businessArea;

    private String saleType;

    private String baseType;

    private String businessLicense;

    private String businessContractPath;

    private Integer active;

    private Long accountId;

    private String shopManager;

    public Long getShopId() {
        return shopId;
    }

    public void setShopId(Long shopId) {
        this.shopId = shopId;
    }

    public String getAreaId() {
        return areaId;
    }

    public void setAreaId(String areaId) {
        this.areaId = areaId == null ? null : areaId.trim();
    }

    public String getShopName() {
        return shopName;
    }

    public void setShopName(String shopName) {
        this.shopName = shopName == null ? null : shopName.trim();
    }

    public String getShopKeeper() {
        return shopKeeper;
    }

    public void setShopKeeper(String shopKeeper) {
        this.shopKeeper = shopKeeper == null ? null : shopKeeper.trim();
    }

    public String getSocialCardId() {
        return socialCardId;
    }

    public void setSocialCardId(String socialCardId) {
        this.socialCardId = socialCardId == null ? null : socialCardId.trim();
    }

    public String getTelephone() {
        return telephone;
    }

    public void setTelephone(String telephone) {
        this.telephone = telephone == null ? null : telephone.trim();
    }

    public String getMobile() {
        return mobile;
    }

    public void setMobile(String mobile) {
        this.mobile = mobile == null ? null : mobile.trim();
    }

    public String getQq() {
        return qq;
    }

    public void setQq(String qq) {
        this.qq = qq == null ? null : qq.trim();
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email == null ? null : email.trim();
    }

    public String getProvince() {
        return province;
    }

    public void setProvince(String province) {
        this.province = province == null ? null : province.trim();
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city == null ? null : city.trim();
    }

    public String getCounty() {
        return county;
    }

    public void setCounty(String county) {
        this.county = county == null ? null : county.trim();
    }

    public String getPostCode() {
        return postCode;
    }

    public void setPostCode(String postCode) {
        this.postCode = postCode == null ? null : postCode.trim();
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address == null ? null : address.trim();
    }

    public Float getLongitude() {
        return longitude;
    }

    public void setLongitude(Float longitude) {
        this.longitude = longitude;
    }

    public Float getLatitude() {
        return latitude;
    }

    public void setLatitude(Float latitude) {
        this.latitude = latitude;
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    public String getPosNo() {
        return posNo;
    }

    public void setPosNo(String posNo) {
        this.posNo = posNo == null ? null : posNo.trim();
    }

    public String getStorageNo() {
        return storageNo;
    }

    public void setStorageNo(String storageNo) {
        this.storageNo = storageNo == null ? null : storageNo.trim();
    }

    public String getTobaccoLicense() {
        return tobaccoLicense;
    }

    public void setTobaccoLicense(String tobaccoLicense) {
        this.tobaccoLicense = tobaccoLicense == null ? null : tobaccoLicense.trim();
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public Date getLastUpdTime() {
        return lastUpdTime;
    }

    public void setLastUpdTime(Date lastUpdTime) {
        this.lastUpdTime = lastUpdTime;
    }

    public Integer getCommitor() {
        return commitor;
    }

    public void setCommitor(Integer commitor) {
        this.commitor = commitor;
    }

    public Integer getApprovor() {
        return approvor;
    }

    public void setApprovor(Integer approvor) {
        this.approvor = approvor;
    }

    public Integer getLevel() {
        return level;
    }

    public void setLevel(Integer level) {
        this.level = level;
    }

    public String getUserCenterId() {
        return userCenterId;
    }

    public void setUserCenterId(String userCenterId) {
        this.userCenterId = userCenterId == null ? null : userCenterId.trim();
    }

    public String getUserCenterShopId() {
        return userCenterShopId;
    }

    public void setUserCenterShopId(String userCenterShopId) {
        this.userCenterShopId = userCenterShopId == null ? null : userCenterShopId.trim();
    }

    public String getIcon() {
        return icon;
    }

    public void setIcon(String icon) {
        this.icon = icon == null ? null : icon.trim();
    }

    public String getDeviceIdentify() {
        return deviceIdentify;
    }

    public void setDeviceIdentify(String deviceIdentify) {
        this.deviceIdentify = deviceIdentify == null ? null : deviceIdentify.trim();
    }

    public Integer getIsOnline() {
        return isOnline;
    }

    public void setIsOnline(Integer isOnline) {
        this.isOnline = isOnline;
    }

    public Date getLastHeartbeatTime() {
        return lastHeartbeatTime;
    }

    public void setLastHeartbeatTime(Date lastHeartbeatTime) {
        this.lastHeartbeatTime = lastHeartbeatTime;
    }

    public Long getGrowth() {
        return growth;
    }

    public void setGrowth(Long growth) {
        this.growth = growth;
    }

    public Long getPoints() {
        return points;
    }

    public void setPoints(Long points) {
        this.points = points;
    }

    public Integer getPosAppType() {
        return posAppType;
    }

    public void setPosAppType(Integer posAppType) {
        this.posAppType = posAppType;
    }

    public Long getTobaccoCustId() {
        return tobaccoCustId;
    }

    public void setTobaccoCustId(Long tobaccoCustId) {
        this.tobaccoCustId = tobaccoCustId;
    }

    public String getWorkPort() {
        return workPort;
    }

    public void setWorkPort(String workPort) {
        this.workPort = workPort == null ? null : workPort.trim();
    }

    public String getSaleScope() {
        return saleScope;
    }

    public void setSaleScope(String saleScope) {
        this.saleScope = saleScope == null ? null : saleScope.trim();
    }

    public String getBusinessArea() {
        return businessArea;
    }

    public void setBusinessArea(String businessArea) {
        this.businessArea = businessArea == null ? null : businessArea.trim();
    }

    public String getSaleType() {
        return saleType;
    }

    public void setSaleType(String saleType) {
        this.saleType = saleType == null ? null : saleType.trim();
    }

    public String getBaseType() {
        return baseType;
    }

    public void setBaseType(String baseType) {
        this.baseType = baseType == null ? null : baseType.trim();
    }

    public String getBusinessLicense() {
        return businessLicense;
    }

    public void setBusinessLicense(String businessLicense) {
        this.businessLicense = businessLicense == null ? null : businessLicense.trim();
    }

    public String getBusinessContractPath() {
        return businessContractPath;
    }

    public void setBusinessContractPath(String businessContractPath) {
        this.businessContractPath = businessContractPath == null ? null : businessContractPath.trim();
    }

    public Integer getActive() {
        return active;
    }

    public void setActive(Integer active) {
        this.active = active;
    }

    public Long getAccountId() {
        return accountId;
    }

    public void setAccountId(Long accountId) {
        this.accountId = accountId;
    }

    public String getShopManager() {
        return shopManager;
    }

    public void setShopManager(String shopManager) {
        this.shopManager = shopManager == null ? null : shopManager.trim();
    }
}