package com.xinyunlian.retailterminal.shop.database.model.shop;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class ADMShopExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public ADMShopExample() {
        oredCriteria = new ArrayList<Criteria>();
    }

    public void setOrderByClause(String orderByClause) {
        this.orderByClause = orderByClause;
    }

    public String getOrderByClause() {
        return orderByClause;
    }

    public void setDistinct(boolean distinct) {
        this.distinct = distinct;
    }

    public boolean isDistinct() {
        return distinct;
    }

    public List<Criteria> getOredCriteria() {
        return oredCriteria;
    }

    public void or(Criteria criteria) {
        oredCriteria.add(criteria);
    }

    public Criteria or() {
        Criteria criteria = createCriteriaInternal();
        oredCriteria.add(criteria);
        return criteria;
    }

    public Criteria createCriteria() {
        Criteria criteria = createCriteriaInternal();
        if (oredCriteria.size() == 0) {
            oredCriteria.add(criteria);
        }
        return criteria;
    }

    protected Criteria createCriteriaInternal() {
        Criteria criteria = new Criteria();
        return criteria;
    }

    public void clear() {
        oredCriteria.clear();
        orderByClause = null;
        distinct = false;
    }

    protected abstract static class GeneratedCriteria {
        protected List<Criterion> criteria;

        protected GeneratedCriteria() {
            super();
            criteria = new ArrayList<Criterion>();
        }

        public boolean isValid() {
            return criteria.size() > 0;
        }

        public List<Criterion> getAllCriteria() {
            return criteria;
        }

        public List<Criterion> getCriteria() {
            return criteria;
        }

        protected void addCriterion(String condition) {
            if (condition == null) {
                throw new RuntimeException("Value for condition cannot be null");
            }
            criteria.add(new Criterion(condition));
        }

        protected void addCriterion(String condition, Object value, String property) {
            if (value == null) {
                throw new RuntimeException("Value for " + property + " cannot be null");
            }
            criteria.add(new Criterion(condition, value));
        }

        protected void addCriterion(String condition, Object value1, Object value2, String property) {
            if (value1 == null || value2 == null) {
                throw new RuntimeException("Between values for " + property + " cannot be null");
            }
            criteria.add(new Criterion(condition, value1, value2));
        }

        public Criteria andShopIdIsNull() {
            addCriterion("SHOP_ID is null");
            return (Criteria) this;
        }

        public Criteria andShopIdIsNotNull() {
            addCriterion("SHOP_ID is not null");
            return (Criteria) this;
        }

        public Criteria andShopIdEqualTo(Long value) {
            addCriterion("SHOP_ID =", value, "shopId");
            return (Criteria) this;
        }

        public Criteria andShopIdNotEqualTo(Long value) {
            addCriterion("SHOP_ID <>", value, "shopId");
            return (Criteria) this;
        }

        public Criteria andShopIdGreaterThan(Long value) {
            addCriterion("SHOP_ID >", value, "shopId");
            return (Criteria) this;
        }

        public Criteria andShopIdGreaterThanOrEqualTo(Long value) {
            addCriterion("SHOP_ID >=", value, "shopId");
            return (Criteria) this;
        }

        public Criteria andShopIdLessThan(Long value) {
            addCriterion("SHOP_ID <", value, "shopId");
            return (Criteria) this;
        }

        public Criteria andShopIdLessThanOrEqualTo(Long value) {
            addCriterion("SHOP_ID <=", value, "shopId");
            return (Criteria) this;
        }

        public Criteria andShopIdIn(List<Long> values) {
            addCriterion("SHOP_ID in", values, "shopId");
            return (Criteria) this;
        }

        public Criteria andShopIdNotIn(List<Long> values) {
            addCriterion("SHOP_ID not in", values, "shopId");
            return (Criteria) this;
        }

        public Criteria andShopIdBetween(Long value1, Long value2) {
            addCriterion("SHOP_ID between", value1, value2, "shopId");
            return (Criteria) this;
        }

        public Criteria andShopIdNotBetween(Long value1, Long value2) {
            addCriterion("SHOP_ID not between", value1, value2, "shopId");
            return (Criteria) this;
        }

        public Criteria andAreaIdIsNull() {
            addCriterion("AREA_ID is null");
            return (Criteria) this;
        }

        public Criteria andAreaIdIsNotNull() {
            addCriterion("AREA_ID is not null");
            return (Criteria) this;
        }

        public Criteria andAreaIdEqualTo(String value) {
            addCriterion("AREA_ID =", value, "areaId");
            return (Criteria) this;
        }

        public Criteria andAreaIdNotEqualTo(String value) {
            addCriterion("AREA_ID <>", value, "areaId");
            return (Criteria) this;
        }

        public Criteria andAreaIdGreaterThan(String value) {
            addCriterion("AREA_ID >", value, "areaId");
            return (Criteria) this;
        }

        public Criteria andAreaIdGreaterThanOrEqualTo(String value) {
            addCriterion("AREA_ID >=", value, "areaId");
            return (Criteria) this;
        }

        public Criteria andAreaIdLessThan(String value) {
            addCriterion("AREA_ID <", value, "areaId");
            return (Criteria) this;
        }

        public Criteria andAreaIdLessThanOrEqualTo(String value) {
            addCriterion("AREA_ID <=", value, "areaId");
            return (Criteria) this;
        }

        public Criteria andAreaIdLike(String value) {
            addCriterion("AREA_ID like", value, "areaId");
            return (Criteria) this;
        }

        public Criteria andAreaIdNotLike(String value) {
            addCriterion("AREA_ID not like", value, "areaId");
            return (Criteria) this;
        }

        public Criteria andAreaIdIn(List<String> values) {
            addCriterion("AREA_ID in", values, "areaId");
            return (Criteria) this;
        }

        public Criteria andAreaIdNotIn(List<String> values) {
            addCriterion("AREA_ID not in", values, "areaId");
            return (Criteria) this;
        }

        public Criteria andAreaIdBetween(String value1, String value2) {
            addCriterion("AREA_ID between", value1, value2, "areaId");
            return (Criteria) this;
        }

        public Criteria andAreaIdNotBetween(String value1, String value2) {
            addCriterion("AREA_ID not between", value1, value2, "areaId");
            return (Criteria) this;
        }

        public Criteria andShopNameIsNull() {
            addCriterion("SHOP_NAME is null");
            return (Criteria) this;
        }

        public Criteria andShopNameIsNotNull() {
            addCriterion("SHOP_NAME is not null");
            return (Criteria) this;
        }

        public Criteria andShopNameEqualTo(String value) {
            addCriterion("SHOP_NAME =", value, "shopName");
            return (Criteria) this;
        }

        public Criteria andShopNameNotEqualTo(String value) {
            addCriterion("SHOP_NAME <>", value, "shopName");
            return (Criteria) this;
        }

        public Criteria andShopNameGreaterThan(String value) {
            addCriterion("SHOP_NAME >", value, "shopName");
            return (Criteria) this;
        }

        public Criteria andShopNameGreaterThanOrEqualTo(String value) {
            addCriterion("SHOP_NAME >=", value, "shopName");
            return (Criteria) this;
        }

        public Criteria andShopNameLessThan(String value) {
            addCriterion("SHOP_NAME <", value, "shopName");
            return (Criteria) this;
        }

        public Criteria andShopNameLessThanOrEqualTo(String value) {
            addCriterion("SHOP_NAME <=", value, "shopName");
            return (Criteria) this;
        }

        public Criteria andShopNameLike(String value) {
            addCriterion("SHOP_NAME like", value, "shopName");
            return (Criteria) this;
        }

        public Criteria andShopNameNotLike(String value) {
            addCriterion("SHOP_NAME not like", value, "shopName");
            return (Criteria) this;
        }

        public Criteria andShopNameIn(List<String> values) {
            addCriterion("SHOP_NAME in", values, "shopName");
            return (Criteria) this;
        }

        public Criteria andShopNameNotIn(List<String> values) {
            addCriterion("SHOP_NAME not in", values, "shopName");
            return (Criteria) this;
        }

        public Criteria andShopNameBetween(String value1, String value2) {
            addCriterion("SHOP_NAME between", value1, value2, "shopName");
            return (Criteria) this;
        }

        public Criteria andShopNameNotBetween(String value1, String value2) {
            addCriterion("SHOP_NAME not between", value1, value2, "shopName");
            return (Criteria) this;
        }

        public Criteria andShopKeeperIsNull() {
            addCriterion("SHOP_KEEPER is null");
            return (Criteria) this;
        }

        public Criteria andShopKeeperIsNotNull() {
            addCriterion("SHOP_KEEPER is not null");
            return (Criteria) this;
        }

        public Criteria andShopKeeperEqualTo(String value) {
            addCriterion("SHOP_KEEPER =", value, "shopKeeper");
            return (Criteria) this;
        }

        public Criteria andShopKeeperNotEqualTo(String value) {
            addCriterion("SHOP_KEEPER <>", value, "shopKeeper");
            return (Criteria) this;
        }

        public Criteria andShopKeeperGreaterThan(String value) {
            addCriterion("SHOP_KEEPER >", value, "shopKeeper");
            return (Criteria) this;
        }

        public Criteria andShopKeeperGreaterThanOrEqualTo(String value) {
            addCriterion("SHOP_KEEPER >=", value, "shopKeeper");
            return (Criteria) this;
        }

        public Criteria andShopKeeperLessThan(String value) {
            addCriterion("SHOP_KEEPER <", value, "shopKeeper");
            return (Criteria) this;
        }

        public Criteria andShopKeeperLessThanOrEqualTo(String value) {
            addCriterion("SHOP_KEEPER <=", value, "shopKeeper");
            return (Criteria) this;
        }

        public Criteria andShopKeeperLike(String value) {
            addCriterion("SHOP_KEEPER like", value, "shopKeeper");
            return (Criteria) this;
        }

        public Criteria andShopKeeperNotLike(String value) {
            addCriterion("SHOP_KEEPER not like", value, "shopKeeper");
            return (Criteria) this;
        }

        public Criteria andShopKeeperIn(List<String> values) {
            addCriterion("SHOP_KEEPER in", values, "shopKeeper");
            return (Criteria) this;
        }

        public Criteria andShopKeeperNotIn(List<String> values) {
            addCriterion("SHOP_KEEPER not in", values, "shopKeeper");
            return (Criteria) this;
        }

        public Criteria andShopKeeperBetween(String value1, String value2) {
            addCriterion("SHOP_KEEPER between", value1, value2, "shopKeeper");
            return (Criteria) this;
        }

        public Criteria andShopKeeperNotBetween(String value1, String value2) {
            addCriterion("SHOP_KEEPER not between", value1, value2, "shopKeeper");
            return (Criteria) this;
        }

        public Criteria andSocialCardIdIsNull() {
            addCriterion("SOCIAL_CARD_ID is null");
            return (Criteria) this;
        }

        public Criteria andSocialCardIdIsNotNull() {
            addCriterion("SOCIAL_CARD_ID is not null");
            return (Criteria) this;
        }

        public Criteria andSocialCardIdEqualTo(String value) {
            addCriterion("SOCIAL_CARD_ID =", value, "socialCardId");
            return (Criteria) this;
        }

        public Criteria andSocialCardIdNotEqualTo(String value) {
            addCriterion("SOCIAL_CARD_ID <>", value, "socialCardId");
            return (Criteria) this;
        }

        public Criteria andSocialCardIdGreaterThan(String value) {
            addCriterion("SOCIAL_CARD_ID >", value, "socialCardId");
            return (Criteria) this;
        }

        public Criteria andSocialCardIdGreaterThanOrEqualTo(String value) {
            addCriterion("SOCIAL_CARD_ID >=", value, "socialCardId");
            return (Criteria) this;
        }

        public Criteria andSocialCardIdLessThan(String value) {
            addCriterion("SOCIAL_CARD_ID <", value, "socialCardId");
            return (Criteria) this;
        }

        public Criteria andSocialCardIdLessThanOrEqualTo(String value) {
            addCriterion("SOCIAL_CARD_ID <=", value, "socialCardId");
            return (Criteria) this;
        }

        public Criteria andSocialCardIdLike(String value) {
            addCriterion("SOCIAL_CARD_ID like", value, "socialCardId");
            return (Criteria) this;
        }

        public Criteria andSocialCardIdNotLike(String value) {
            addCriterion("SOCIAL_CARD_ID not like", value, "socialCardId");
            return (Criteria) this;
        }

        public Criteria andSocialCardIdIn(List<String> values) {
            addCriterion("SOCIAL_CARD_ID in", values, "socialCardId");
            return (Criteria) this;
        }

        public Criteria andSocialCardIdNotIn(List<String> values) {
            addCriterion("SOCIAL_CARD_ID not in", values, "socialCardId");
            return (Criteria) this;
        }

        public Criteria andSocialCardIdBetween(String value1, String value2) {
            addCriterion("SOCIAL_CARD_ID between", value1, value2, "socialCardId");
            return (Criteria) this;
        }

        public Criteria andSocialCardIdNotBetween(String value1, String value2) {
            addCriterion("SOCIAL_CARD_ID not between", value1, value2, "socialCardId");
            return (Criteria) this;
        }

        public Criteria andTelephoneIsNull() {
            addCriterion("TELEPHONE is null");
            return (Criteria) this;
        }

        public Criteria andTelephoneIsNotNull() {
            addCriterion("TELEPHONE is not null");
            return (Criteria) this;
        }

        public Criteria andTelephoneEqualTo(String value) {
            addCriterion("TELEPHONE =", value, "telephone");
            return (Criteria) this;
        }

        public Criteria andTelephoneNotEqualTo(String value) {
            addCriterion("TELEPHONE <>", value, "telephone");
            return (Criteria) this;
        }

        public Criteria andTelephoneGreaterThan(String value) {
            addCriterion("TELEPHONE >", value, "telephone");
            return (Criteria) this;
        }

        public Criteria andTelephoneGreaterThanOrEqualTo(String value) {
            addCriterion("TELEPHONE >=", value, "telephone");
            return (Criteria) this;
        }

        public Criteria andTelephoneLessThan(String value) {
            addCriterion("TELEPHONE <", value, "telephone");
            return (Criteria) this;
        }

        public Criteria andTelephoneLessThanOrEqualTo(String value) {
            addCriterion("TELEPHONE <=", value, "telephone");
            return (Criteria) this;
        }

        public Criteria andTelephoneLike(String value) {
            addCriterion("TELEPHONE like", value, "telephone");
            return (Criteria) this;
        }

        public Criteria andTelephoneNotLike(String value) {
            addCriterion("TELEPHONE not like", value, "telephone");
            return (Criteria) this;
        }

        public Criteria andTelephoneIn(List<String> values) {
            addCriterion("TELEPHONE in", values, "telephone");
            return (Criteria) this;
        }

        public Criteria andTelephoneNotIn(List<String> values) {
            addCriterion("TELEPHONE not in", values, "telephone");
            return (Criteria) this;
        }

        public Criteria andTelephoneBetween(String value1, String value2) {
            addCriterion("TELEPHONE between", value1, value2, "telephone");
            return (Criteria) this;
        }

        public Criteria andTelephoneNotBetween(String value1, String value2) {
            addCriterion("TELEPHONE not between", value1, value2, "telephone");
            return (Criteria) this;
        }

        public Criteria andMobileIsNull() {
            addCriterion("MOBILE is null");
            return (Criteria) this;
        }

        public Criteria andMobileIsNotNull() {
            addCriterion("MOBILE is not null");
            return (Criteria) this;
        }

        public Criteria andMobileEqualTo(String value) {
            addCriterion("MOBILE =", value, "mobile");
            return (Criteria) this;
        }

        public Criteria andMobileNotEqualTo(String value) {
            addCriterion("MOBILE <>", value, "mobile");
            return (Criteria) this;
        }

        public Criteria andMobileGreaterThan(String value) {
            addCriterion("MOBILE >", value, "mobile");
            return (Criteria) this;
        }

        public Criteria andMobileGreaterThanOrEqualTo(String value) {
            addCriterion("MOBILE >=", value, "mobile");
            return (Criteria) this;
        }

        public Criteria andMobileLessThan(String value) {
            addCriterion("MOBILE <", value, "mobile");
            return (Criteria) this;
        }

        public Criteria andMobileLessThanOrEqualTo(String value) {
            addCriterion("MOBILE <=", value, "mobile");
            return (Criteria) this;
        }

        public Criteria andMobileLike(String value) {
            addCriterion("MOBILE like", value, "mobile");
            return (Criteria) this;
        }

        public Criteria andMobileNotLike(String value) {
            addCriterion("MOBILE not like", value, "mobile");
            return (Criteria) this;
        }

        public Criteria andMobileIn(List<String> values) {
            addCriterion("MOBILE in", values, "mobile");
            return (Criteria) this;
        }

        public Criteria andMobileNotIn(List<String> values) {
            addCriterion("MOBILE not in", values, "mobile");
            return (Criteria) this;
        }

        public Criteria andMobileBetween(String value1, String value2) {
            addCriterion("MOBILE between", value1, value2, "mobile");
            return (Criteria) this;
        }

        public Criteria andMobileNotBetween(String value1, String value2) {
            addCriterion("MOBILE not between", value1, value2, "mobile");
            return (Criteria) this;
        }

        public Criteria andQqIsNull() {
            addCriterion("QQ is null");
            return (Criteria) this;
        }

        public Criteria andQqIsNotNull() {
            addCriterion("QQ is not null");
            return (Criteria) this;
        }

        public Criteria andQqEqualTo(String value) {
            addCriterion("QQ =", value, "qq");
            return (Criteria) this;
        }

        public Criteria andQqNotEqualTo(String value) {
            addCriterion("QQ <>", value, "qq");
            return (Criteria) this;
        }

        public Criteria andQqGreaterThan(String value) {
            addCriterion("QQ >", value, "qq");
            return (Criteria) this;
        }

        public Criteria andQqGreaterThanOrEqualTo(String value) {
            addCriterion("QQ >=", value, "qq");
            return (Criteria) this;
        }

        public Criteria andQqLessThan(String value) {
            addCriterion("QQ <", value, "qq");
            return (Criteria) this;
        }

        public Criteria andQqLessThanOrEqualTo(String value) {
            addCriterion("QQ <=", value, "qq");
            return (Criteria) this;
        }

        public Criteria andQqLike(String value) {
            addCriterion("QQ like", value, "qq");
            return (Criteria) this;
        }

        public Criteria andQqNotLike(String value) {
            addCriterion("QQ not like", value, "qq");
            return (Criteria) this;
        }

        public Criteria andQqIn(List<String> values) {
            addCriterion("QQ in", values, "qq");
            return (Criteria) this;
        }

        public Criteria andQqNotIn(List<String> values) {
            addCriterion("QQ not in", values, "qq");
            return (Criteria) this;
        }

        public Criteria andQqBetween(String value1, String value2) {
            addCriterion("QQ between", value1, value2, "qq");
            return (Criteria) this;
        }

        public Criteria andQqNotBetween(String value1, String value2) {
            addCriterion("QQ not between", value1, value2, "qq");
            return (Criteria) this;
        }

        public Criteria andEmailIsNull() {
            addCriterion("EMAIL is null");
            return (Criteria) this;
        }

        public Criteria andEmailIsNotNull() {
            addCriterion("EMAIL is not null");
            return (Criteria) this;
        }

        public Criteria andEmailEqualTo(String value) {
            addCriterion("EMAIL =", value, "email");
            return (Criteria) this;
        }

        public Criteria andEmailNotEqualTo(String value) {
            addCriterion("EMAIL <>", value, "email");
            return (Criteria) this;
        }

        public Criteria andEmailGreaterThan(String value) {
            addCriterion("EMAIL >", value, "email");
            return (Criteria) this;
        }

        public Criteria andEmailGreaterThanOrEqualTo(String value) {
            addCriterion("EMAIL >=", value, "email");
            return (Criteria) this;
        }

        public Criteria andEmailLessThan(String value) {
            addCriterion("EMAIL <", value, "email");
            return (Criteria) this;
        }

        public Criteria andEmailLessThanOrEqualTo(String value) {
            addCriterion("EMAIL <=", value, "email");
            return (Criteria) this;
        }

        public Criteria andEmailLike(String value) {
            addCriterion("EMAIL like", value, "email");
            return (Criteria) this;
        }

        public Criteria andEmailNotLike(String value) {
            addCriterion("EMAIL not like", value, "email");
            return (Criteria) this;
        }

        public Criteria andEmailIn(List<String> values) {
            addCriterion("EMAIL in", values, "email");
            return (Criteria) this;
        }

        public Criteria andEmailNotIn(List<String> values) {
            addCriterion("EMAIL not in", values, "email");
            return (Criteria) this;
        }

        public Criteria andEmailBetween(String value1, String value2) {
            addCriterion("EMAIL between", value1, value2, "email");
            return (Criteria) this;
        }

        public Criteria andEmailNotBetween(String value1, String value2) {
            addCriterion("EMAIL not between", value1, value2, "email");
            return (Criteria) this;
        }

        public Criteria andProvinceIsNull() {
            addCriterion("PROVINCE is null");
            return (Criteria) this;
        }

        public Criteria andProvinceIsNotNull() {
            addCriterion("PROVINCE is not null");
            return (Criteria) this;
        }

        public Criteria andProvinceEqualTo(String value) {
            addCriterion("PROVINCE =", value, "province");
            return (Criteria) this;
        }

        public Criteria andProvinceNotEqualTo(String value) {
            addCriterion("PROVINCE <>", value, "province");
            return (Criteria) this;
        }

        public Criteria andProvinceGreaterThan(String value) {
            addCriterion("PROVINCE >", value, "province");
            return (Criteria) this;
        }

        public Criteria andProvinceGreaterThanOrEqualTo(String value) {
            addCriterion("PROVINCE >=", value, "province");
            return (Criteria) this;
        }

        public Criteria andProvinceLessThan(String value) {
            addCriterion("PROVINCE <", value, "province");
            return (Criteria) this;
        }

        public Criteria andProvinceLessThanOrEqualTo(String value) {
            addCriterion("PROVINCE <=", value, "province");
            return (Criteria) this;
        }

        public Criteria andProvinceLike(String value) {
            addCriterion("PROVINCE like", value, "province");
            return (Criteria) this;
        }

        public Criteria andProvinceNotLike(String value) {
            addCriterion("PROVINCE not like", value, "province");
            return (Criteria) this;
        }

        public Criteria andProvinceIn(List<String> values) {
            addCriterion("PROVINCE in", values, "province");
            return (Criteria) this;
        }

        public Criteria andProvinceNotIn(List<String> values) {
            addCriterion("PROVINCE not in", values, "province");
            return (Criteria) this;
        }

        public Criteria andProvinceBetween(String value1, String value2) {
            addCriterion("PROVINCE between", value1, value2, "province");
            return (Criteria) this;
        }

        public Criteria andProvinceNotBetween(String value1, String value2) {
            addCriterion("PROVINCE not between", value1, value2, "province");
            return (Criteria) this;
        }

        public Criteria andCityIsNull() {
            addCriterion("CITY is null");
            return (Criteria) this;
        }

        public Criteria andCityIsNotNull() {
            addCriterion("CITY is not null");
            return (Criteria) this;
        }

        public Criteria andCityEqualTo(String value) {
            addCriterion("CITY =", value, "city");
            return (Criteria) this;
        }

        public Criteria andCityNotEqualTo(String value) {
            addCriterion("CITY <>", value, "city");
            return (Criteria) this;
        }

        public Criteria andCityGreaterThan(String value) {
            addCriterion("CITY >", value, "city");
            return (Criteria) this;
        }

        public Criteria andCityGreaterThanOrEqualTo(String value) {
            addCriterion("CITY >=", value, "city");
            return (Criteria) this;
        }

        public Criteria andCityLessThan(String value) {
            addCriterion("CITY <", value, "city");
            return (Criteria) this;
        }

        public Criteria andCityLessThanOrEqualTo(String value) {
            addCriterion("CITY <=", value, "city");
            return (Criteria) this;
        }

        public Criteria andCityLike(String value) {
            addCriterion("CITY like", value, "city");
            return (Criteria) this;
        }

        public Criteria andCityNotLike(String value) {
            addCriterion("CITY not like", value, "city");
            return (Criteria) this;
        }

        public Criteria andCityIn(List<String> values) {
            addCriterion("CITY in", values, "city");
            return (Criteria) this;
        }

        public Criteria andCityNotIn(List<String> values) {
            addCriterion("CITY not in", values, "city");
            return (Criteria) this;
        }

        public Criteria andCityBetween(String value1, String value2) {
            addCriterion("CITY between", value1, value2, "city");
            return (Criteria) this;
        }

        public Criteria andCityNotBetween(String value1, String value2) {
            addCriterion("CITY not between", value1, value2, "city");
            return (Criteria) this;
        }

        public Criteria andCountyIsNull() {
            addCriterion("COUNTY is null");
            return (Criteria) this;
        }

        public Criteria andCountyIsNotNull() {
            addCriterion("COUNTY is not null");
            return (Criteria) this;
        }

        public Criteria andCountyEqualTo(String value) {
            addCriterion("COUNTY =", value, "county");
            return (Criteria) this;
        }

        public Criteria andCountyNotEqualTo(String value) {
            addCriterion("COUNTY <>", value, "county");
            return (Criteria) this;
        }

        public Criteria andCountyGreaterThan(String value) {
            addCriterion("COUNTY >", value, "county");
            return (Criteria) this;
        }

        public Criteria andCountyGreaterThanOrEqualTo(String value) {
            addCriterion("COUNTY >=", value, "county");
            return (Criteria) this;
        }

        public Criteria andCountyLessThan(String value) {
            addCriterion("COUNTY <", value, "county");
            return (Criteria) this;
        }

        public Criteria andCountyLessThanOrEqualTo(String value) {
            addCriterion("COUNTY <=", value, "county");
            return (Criteria) this;
        }

        public Criteria andCountyLike(String value) {
            addCriterion("COUNTY like", value, "county");
            return (Criteria) this;
        }

        public Criteria andCountyNotLike(String value) {
            addCriterion("COUNTY not like", value, "county");
            return (Criteria) this;
        }

        public Criteria andCountyIn(List<String> values) {
            addCriterion("COUNTY in", values, "county");
            return (Criteria) this;
        }

        public Criteria andCountyNotIn(List<String> values) {
            addCriterion("COUNTY not in", values, "county");
            return (Criteria) this;
        }

        public Criteria andCountyBetween(String value1, String value2) {
            addCriterion("COUNTY between", value1, value2, "county");
            return (Criteria) this;
        }

        public Criteria andCountyNotBetween(String value1, String value2) {
            addCriterion("COUNTY not between", value1, value2, "county");
            return (Criteria) this;
        }

        public Criteria andPostCodeIsNull() {
            addCriterion("POST_CODE is null");
            return (Criteria) this;
        }

        public Criteria andPostCodeIsNotNull() {
            addCriterion("POST_CODE is not null");
            return (Criteria) this;
        }

        public Criteria andPostCodeEqualTo(String value) {
            addCriterion("POST_CODE =", value, "postCode");
            return (Criteria) this;
        }

        public Criteria andPostCodeNotEqualTo(String value) {
            addCriterion("POST_CODE <>", value, "postCode");
            return (Criteria) this;
        }

        public Criteria andPostCodeGreaterThan(String value) {
            addCriterion("POST_CODE >", value, "postCode");
            return (Criteria) this;
        }

        public Criteria andPostCodeGreaterThanOrEqualTo(String value) {
            addCriterion("POST_CODE >=", value, "postCode");
            return (Criteria) this;
        }

        public Criteria andPostCodeLessThan(String value) {
            addCriterion("POST_CODE <", value, "postCode");
            return (Criteria) this;
        }

        public Criteria andPostCodeLessThanOrEqualTo(String value) {
            addCriterion("POST_CODE <=", value, "postCode");
            return (Criteria) this;
        }

        public Criteria andPostCodeLike(String value) {
            addCriterion("POST_CODE like", value, "postCode");
            return (Criteria) this;
        }

        public Criteria andPostCodeNotLike(String value) {
            addCriterion("POST_CODE not like", value, "postCode");
            return (Criteria) this;
        }

        public Criteria andPostCodeIn(List<String> values) {
            addCriterion("POST_CODE in", values, "postCode");
            return (Criteria) this;
        }

        public Criteria andPostCodeNotIn(List<String> values) {
            addCriterion("POST_CODE not in", values, "postCode");
            return (Criteria) this;
        }

        public Criteria andPostCodeBetween(String value1, String value2) {
            addCriterion("POST_CODE between", value1, value2, "postCode");
            return (Criteria) this;
        }

        public Criteria andPostCodeNotBetween(String value1, String value2) {
            addCriterion("POST_CODE not between", value1, value2, "postCode");
            return (Criteria) this;
        }

        public Criteria andAddressIsNull() {
            addCriterion("ADDRESS is null");
            return (Criteria) this;
        }

        public Criteria andAddressIsNotNull() {
            addCriterion("ADDRESS is not null");
            return (Criteria) this;
        }

        public Criteria andAddressEqualTo(String value) {
            addCriterion("ADDRESS =", value, "address");
            return (Criteria) this;
        }

        public Criteria andAddressNotEqualTo(String value) {
            addCriterion("ADDRESS <>", value, "address");
            return (Criteria) this;
        }

        public Criteria andAddressGreaterThan(String value) {
            addCriterion("ADDRESS >", value, "address");
            return (Criteria) this;
        }

        public Criteria andAddressGreaterThanOrEqualTo(String value) {
            addCriterion("ADDRESS >=", value, "address");
            return (Criteria) this;
        }

        public Criteria andAddressLessThan(String value) {
            addCriterion("ADDRESS <", value, "address");
            return (Criteria) this;
        }

        public Criteria andAddressLessThanOrEqualTo(String value) {
            addCriterion("ADDRESS <=", value, "address");
            return (Criteria) this;
        }

        public Criteria andAddressLike(String value) {
            addCriterion("ADDRESS like", value, "address");
            return (Criteria) this;
        }

        public Criteria andAddressNotLike(String value) {
            addCriterion("ADDRESS not like", value, "address");
            return (Criteria) this;
        }

        public Criteria andAddressIn(List<String> values) {
            addCriterion("ADDRESS in", values, "address");
            return (Criteria) this;
        }

        public Criteria andAddressNotIn(List<String> values) {
            addCriterion("ADDRESS not in", values, "address");
            return (Criteria) this;
        }

        public Criteria andAddressBetween(String value1, String value2) {
            addCriterion("ADDRESS between", value1, value2, "address");
            return (Criteria) this;
        }

        public Criteria andAddressNotBetween(String value1, String value2) {
            addCriterion("ADDRESS not between", value1, value2, "address");
            return (Criteria) this;
        }

        public Criteria andLongitudeIsNull() {
            addCriterion("LONGITUDE is null");
            return (Criteria) this;
        }

        public Criteria andLongitudeIsNotNull() {
            addCriterion("LONGITUDE is not null");
            return (Criteria) this;
        }

        public Criteria andLongitudeEqualTo(Float value) {
            addCriterion("LONGITUDE =", value, "longitude");
            return (Criteria) this;
        }

        public Criteria andLongitudeNotEqualTo(Float value) {
            addCriterion("LONGITUDE <>", value, "longitude");
            return (Criteria) this;
        }

        public Criteria andLongitudeGreaterThan(Float value) {
            addCriterion("LONGITUDE >", value, "longitude");
            return (Criteria) this;
        }

        public Criteria andLongitudeGreaterThanOrEqualTo(Float value) {
            addCriterion("LONGITUDE >=", value, "longitude");
            return (Criteria) this;
        }

        public Criteria andLongitudeLessThan(Float value) {
            addCriterion("LONGITUDE <", value, "longitude");
            return (Criteria) this;
        }

        public Criteria andLongitudeLessThanOrEqualTo(Float value) {
            addCriterion("LONGITUDE <=", value, "longitude");
            return (Criteria) this;
        }

        public Criteria andLongitudeIn(List<Float> values) {
            addCriterion("LONGITUDE in", values, "longitude");
            return (Criteria) this;
        }

        public Criteria andLongitudeNotIn(List<Float> values) {
            addCriterion("LONGITUDE not in", values, "longitude");
            return (Criteria) this;
        }

        public Criteria andLongitudeBetween(Float value1, Float value2) {
            addCriterion("LONGITUDE between", value1, value2, "longitude");
            return (Criteria) this;
        }

        public Criteria andLongitudeNotBetween(Float value1, Float value2) {
            addCriterion("LONGITUDE not between", value1, value2, "longitude");
            return (Criteria) this;
        }

        public Criteria andLatitudeIsNull() {
            addCriterion("LATITUDE is null");
            return (Criteria) this;
        }

        public Criteria andLatitudeIsNotNull() {
            addCriterion("LATITUDE is not null");
            return (Criteria) this;
        }

        public Criteria andLatitudeEqualTo(Float value) {
            addCriterion("LATITUDE =", value, "latitude");
            return (Criteria) this;
        }

        public Criteria andLatitudeNotEqualTo(Float value) {
            addCriterion("LATITUDE <>", value, "latitude");
            return (Criteria) this;
        }

        public Criteria andLatitudeGreaterThan(Float value) {
            addCriterion("LATITUDE >", value, "latitude");
            return (Criteria) this;
        }

        public Criteria andLatitudeGreaterThanOrEqualTo(Float value) {
            addCriterion("LATITUDE >=", value, "latitude");
            return (Criteria) this;
        }

        public Criteria andLatitudeLessThan(Float value) {
            addCriterion("LATITUDE <", value, "latitude");
            return (Criteria) this;
        }

        public Criteria andLatitudeLessThanOrEqualTo(Float value) {
            addCriterion("LATITUDE <=", value, "latitude");
            return (Criteria) this;
        }

        public Criteria andLatitudeIn(List<Float> values) {
            addCriterion("LATITUDE in", values, "latitude");
            return (Criteria) this;
        }

        public Criteria andLatitudeNotIn(List<Float> values) {
            addCriterion("LATITUDE not in", values, "latitude");
            return (Criteria) this;
        }

        public Criteria andLatitudeBetween(Float value1, Float value2) {
            addCriterion("LATITUDE between", value1, value2, "latitude");
            return (Criteria) this;
        }

        public Criteria andLatitudeNotBetween(Float value1, Float value2) {
            addCriterion("LATITUDE not between", value1, value2, "latitude");
            return (Criteria) this;
        }

        public Criteria andStatusIsNull() {
            addCriterion("STATUS is null");
            return (Criteria) this;
        }

        public Criteria andStatusIsNotNull() {
            addCriterion("STATUS is not null");
            return (Criteria) this;
        }

        public Criteria andStatusEqualTo(Integer value) {
            addCriterion("STATUS =", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusNotEqualTo(Integer value) {
            addCriterion("STATUS <>", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusGreaterThan(Integer value) {
            addCriterion("STATUS >", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusGreaterThanOrEqualTo(Integer value) {
            addCriterion("STATUS >=", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusLessThan(Integer value) {
            addCriterion("STATUS <", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusLessThanOrEqualTo(Integer value) {
            addCriterion("STATUS <=", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusIn(List<Integer> values) {
            addCriterion("STATUS in", values, "status");
            return (Criteria) this;
        }

        public Criteria andStatusNotIn(List<Integer> values) {
            addCriterion("STATUS not in", values, "status");
            return (Criteria) this;
        }

        public Criteria andStatusBetween(Integer value1, Integer value2) {
            addCriterion("STATUS between", value1, value2, "status");
            return (Criteria) this;
        }

        public Criteria andStatusNotBetween(Integer value1, Integer value2) {
            addCriterion("STATUS not between", value1, value2, "status");
            return (Criteria) this;
        }

        public Criteria andPosNoIsNull() {
            addCriterion("POS_NO is null");
            return (Criteria) this;
        }

        public Criteria andPosNoIsNotNull() {
            addCriterion("POS_NO is not null");
            return (Criteria) this;
        }

        public Criteria andPosNoEqualTo(String value) {
            addCriterion("POS_NO =", value, "posNo");
            return (Criteria) this;
        }

        public Criteria andPosNoNotEqualTo(String value) {
            addCriterion("POS_NO <>", value, "posNo");
            return (Criteria) this;
        }

        public Criteria andPosNoGreaterThan(String value) {
            addCriterion("POS_NO >", value, "posNo");
            return (Criteria) this;
        }

        public Criteria andPosNoGreaterThanOrEqualTo(String value) {
            addCriterion("POS_NO >=", value, "posNo");
            return (Criteria) this;
        }

        public Criteria andPosNoLessThan(String value) {
            addCriterion("POS_NO <", value, "posNo");
            return (Criteria) this;
        }

        public Criteria andPosNoLessThanOrEqualTo(String value) {
            addCriterion("POS_NO <=", value, "posNo");
            return (Criteria) this;
        }

        public Criteria andPosNoLike(String value) {
            addCriterion("POS_NO like", value, "posNo");
            return (Criteria) this;
        }

        public Criteria andPosNoNotLike(String value) {
            addCriterion("POS_NO not like", value, "posNo");
            return (Criteria) this;
        }

        public Criteria andPosNoIn(List<String> values) {
            addCriterion("POS_NO in", values, "posNo");
            return (Criteria) this;
        }

        public Criteria andPosNoNotIn(List<String> values) {
            addCriterion("POS_NO not in", values, "posNo");
            return (Criteria) this;
        }

        public Criteria andPosNoBetween(String value1, String value2) {
            addCriterion("POS_NO between", value1, value2, "posNo");
            return (Criteria) this;
        }

        public Criteria andPosNoNotBetween(String value1, String value2) {
            addCriterion("POS_NO not between", value1, value2, "posNo");
            return (Criteria) this;
        }

        public Criteria andStorageNoIsNull() {
            addCriterion("STORAGE_NO is null");
            return (Criteria) this;
        }

        public Criteria andStorageNoIsNotNull() {
            addCriterion("STORAGE_NO is not null");
            return (Criteria) this;
        }

        public Criteria andStorageNoEqualTo(String value) {
            addCriterion("STORAGE_NO =", value, "storageNo");
            return (Criteria) this;
        }

        public Criteria andStorageNoNotEqualTo(String value) {
            addCriterion("STORAGE_NO <>", value, "storageNo");
            return (Criteria) this;
        }

        public Criteria andStorageNoGreaterThan(String value) {
            addCriterion("STORAGE_NO >", value, "storageNo");
            return (Criteria) this;
        }

        public Criteria andStorageNoGreaterThanOrEqualTo(String value) {
            addCriterion("STORAGE_NO >=", value, "storageNo");
            return (Criteria) this;
        }

        public Criteria andStorageNoLessThan(String value) {
            addCriterion("STORAGE_NO <", value, "storageNo");
            return (Criteria) this;
        }

        public Criteria andStorageNoLessThanOrEqualTo(String value) {
            addCriterion("STORAGE_NO <=", value, "storageNo");
            return (Criteria) this;
        }

        public Criteria andStorageNoLike(String value) {
            addCriterion("STORAGE_NO like", value, "storageNo");
            return (Criteria) this;
        }

        public Criteria andStorageNoNotLike(String value) {
            addCriterion("STORAGE_NO not like", value, "storageNo");
            return (Criteria) this;
        }

        public Criteria andStorageNoIn(List<String> values) {
            addCriterion("STORAGE_NO in", values, "storageNo");
            return (Criteria) this;
        }

        public Criteria andStorageNoNotIn(List<String> values) {
            addCriterion("STORAGE_NO not in", values, "storageNo");
            return (Criteria) this;
        }

        public Criteria andStorageNoBetween(String value1, String value2) {
            addCriterion("STORAGE_NO between", value1, value2, "storageNo");
            return (Criteria) this;
        }

        public Criteria andStorageNoNotBetween(String value1, String value2) {
            addCriterion("STORAGE_NO not between", value1, value2, "storageNo");
            return (Criteria) this;
        }

        public Criteria andTobaccoLicenseIsNull() {
            addCriterion("TOBACCO_LICENSE is null");
            return (Criteria) this;
        }

        public Criteria andTobaccoLicenseIsNotNull() {
            addCriterion("TOBACCO_LICENSE is not null");
            return (Criteria) this;
        }

        public Criteria andTobaccoLicenseEqualTo(String value) {
            addCriterion("TOBACCO_LICENSE =", value, "tobaccoLicense");
            return (Criteria) this;
        }

        public Criteria andTobaccoLicenseNotEqualTo(String value) {
            addCriterion("TOBACCO_LICENSE <>", value, "tobaccoLicense");
            return (Criteria) this;
        }

        public Criteria andTobaccoLicenseGreaterThan(String value) {
            addCriterion("TOBACCO_LICENSE >", value, "tobaccoLicense");
            return (Criteria) this;
        }

        public Criteria andTobaccoLicenseGreaterThanOrEqualTo(String value) {
            addCriterion("TOBACCO_LICENSE >=", value, "tobaccoLicense");
            return (Criteria) this;
        }

        public Criteria andTobaccoLicenseLessThan(String value) {
            addCriterion("TOBACCO_LICENSE <", value, "tobaccoLicense");
            return (Criteria) this;
        }

        public Criteria andTobaccoLicenseLessThanOrEqualTo(String value) {
            addCriterion("TOBACCO_LICENSE <=", value, "tobaccoLicense");
            return (Criteria) this;
        }

        public Criteria andTobaccoLicenseLike(String value) {
            addCriterion("TOBACCO_LICENSE like", value, "tobaccoLicense");
            return (Criteria) this;
        }

        public Criteria andTobaccoLicenseNotLike(String value) {
            addCriterion("TOBACCO_LICENSE not like", value, "tobaccoLicense");
            return (Criteria) this;
        }

        public Criteria andTobaccoLicenseIn(List<String> values) {
            addCriterion("TOBACCO_LICENSE in", values, "tobaccoLicense");
            return (Criteria) this;
        }

        public Criteria andTobaccoLicenseNotIn(List<String> values) {
            addCriterion("TOBACCO_LICENSE not in", values, "tobaccoLicense");
            return (Criteria) this;
        }

        public Criteria andTobaccoLicenseBetween(String value1, String value2) {
            addCriterion("TOBACCO_LICENSE between", value1, value2, "tobaccoLicense");
            return (Criteria) this;
        }

        public Criteria andTobaccoLicenseNotBetween(String value1, String value2) {
            addCriterion("TOBACCO_LICENSE not between", value1, value2, "tobaccoLicense");
            return (Criteria) this;
        }

        public Criteria andCreateTimeIsNull() {
            addCriterion("CREATE_TIME is null");
            return (Criteria) this;
        }

        public Criteria andCreateTimeIsNotNull() {
            addCriterion("CREATE_TIME is not null");
            return (Criteria) this;
        }

        public Criteria andCreateTimeEqualTo(Date value) {
            addCriterion("CREATE_TIME =", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeNotEqualTo(Date value) {
            addCriterion("CREATE_TIME <>", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeGreaterThan(Date value) {
            addCriterion("CREATE_TIME >", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("CREATE_TIME >=", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeLessThan(Date value) {
            addCriterion("CREATE_TIME <", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeLessThanOrEqualTo(Date value) {
            addCriterion("CREATE_TIME <=", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeIn(List<Date> values) {
            addCriterion("CREATE_TIME in", values, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeNotIn(List<Date> values) {
            addCriterion("CREATE_TIME not in", values, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeBetween(Date value1, Date value2) {
            addCriterion("CREATE_TIME between", value1, value2, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeNotBetween(Date value1, Date value2) {
            addCriterion("CREATE_TIME not between", value1, value2, "createTime");
            return (Criteria) this;
        }

        public Criteria andLastUpdTimeIsNull() {
            addCriterion("LAST_UPD_TIME is null");
            return (Criteria) this;
        }

        public Criteria andLastUpdTimeIsNotNull() {
            addCriterion("LAST_UPD_TIME is not null");
            return (Criteria) this;
        }

        public Criteria andLastUpdTimeEqualTo(Date value) {
            addCriterion("LAST_UPD_TIME =", value, "lastUpdTime");
            return (Criteria) this;
        }

        public Criteria andLastUpdTimeNotEqualTo(Date value) {
            addCriterion("LAST_UPD_TIME <>", value, "lastUpdTime");
            return (Criteria) this;
        }

        public Criteria andLastUpdTimeGreaterThan(Date value) {
            addCriterion("LAST_UPD_TIME >", value, "lastUpdTime");
            return (Criteria) this;
        }

        public Criteria andLastUpdTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("LAST_UPD_TIME >=", value, "lastUpdTime");
            return (Criteria) this;
        }

        public Criteria andLastUpdTimeLessThan(Date value) {
            addCriterion("LAST_UPD_TIME <", value, "lastUpdTime");
            return (Criteria) this;
        }

        public Criteria andLastUpdTimeLessThanOrEqualTo(Date value) {
            addCriterion("LAST_UPD_TIME <=", value, "lastUpdTime");
            return (Criteria) this;
        }

        public Criteria andLastUpdTimeIn(List<Date> values) {
            addCriterion("LAST_UPD_TIME in", values, "lastUpdTime");
            return (Criteria) this;
        }

        public Criteria andLastUpdTimeNotIn(List<Date> values) {
            addCriterion("LAST_UPD_TIME not in", values, "lastUpdTime");
            return (Criteria) this;
        }

        public Criteria andLastUpdTimeBetween(Date value1, Date value2) {
            addCriterion("LAST_UPD_TIME between", value1, value2, "lastUpdTime");
            return (Criteria) this;
        }

        public Criteria andLastUpdTimeNotBetween(Date value1, Date value2) {
            addCriterion("LAST_UPD_TIME not between", value1, value2, "lastUpdTime");
            return (Criteria) this;
        }

        public Criteria andCommitorIsNull() {
            addCriterion("COMMITOR is null");
            return (Criteria) this;
        }

        public Criteria andCommitorIsNotNull() {
            addCriterion("COMMITOR is not null");
            return (Criteria) this;
        }

        public Criteria andCommitorEqualTo(Integer value) {
            addCriterion("COMMITOR =", value, "commitor");
            return (Criteria) this;
        }

        public Criteria andCommitorNotEqualTo(Integer value) {
            addCriterion("COMMITOR <>", value, "commitor");
            return (Criteria) this;
        }

        public Criteria andCommitorGreaterThan(Integer value) {
            addCriterion("COMMITOR >", value, "commitor");
            return (Criteria) this;
        }

        public Criteria andCommitorGreaterThanOrEqualTo(Integer value) {
            addCriterion("COMMITOR >=", value, "commitor");
            return (Criteria) this;
        }

        public Criteria andCommitorLessThan(Integer value) {
            addCriterion("COMMITOR <", value, "commitor");
            return (Criteria) this;
        }

        public Criteria andCommitorLessThanOrEqualTo(Integer value) {
            addCriterion("COMMITOR <=", value, "commitor");
            return (Criteria) this;
        }

        public Criteria andCommitorIn(List<Integer> values) {
            addCriterion("COMMITOR in", values, "commitor");
            return (Criteria) this;
        }

        public Criteria andCommitorNotIn(List<Integer> values) {
            addCriterion("COMMITOR not in", values, "commitor");
            return (Criteria) this;
        }

        public Criteria andCommitorBetween(Integer value1, Integer value2) {
            addCriterion("COMMITOR between", value1, value2, "commitor");
            return (Criteria) this;
        }

        public Criteria andCommitorNotBetween(Integer value1, Integer value2) {
            addCriterion("COMMITOR not between", value1, value2, "commitor");
            return (Criteria) this;
        }

        public Criteria andApprovorIsNull() {
            addCriterion("APPROVOR is null");
            return (Criteria) this;
        }

        public Criteria andApprovorIsNotNull() {
            addCriterion("APPROVOR is not null");
            return (Criteria) this;
        }

        public Criteria andApprovorEqualTo(Integer value) {
            addCriterion("APPROVOR =", value, "approvor");
            return (Criteria) this;
        }

        public Criteria andApprovorNotEqualTo(Integer value) {
            addCriterion("APPROVOR <>", value, "approvor");
            return (Criteria) this;
        }

        public Criteria andApprovorGreaterThan(Integer value) {
            addCriterion("APPROVOR >", value, "approvor");
            return (Criteria) this;
        }

        public Criteria andApprovorGreaterThanOrEqualTo(Integer value) {
            addCriterion("APPROVOR >=", value, "approvor");
            return (Criteria) this;
        }

        public Criteria andApprovorLessThan(Integer value) {
            addCriterion("APPROVOR <", value, "approvor");
            return (Criteria) this;
        }

        public Criteria andApprovorLessThanOrEqualTo(Integer value) {
            addCriterion("APPROVOR <=", value, "approvor");
            return (Criteria) this;
        }

        public Criteria andApprovorIn(List<Integer> values) {
            addCriterion("APPROVOR in", values, "approvor");
            return (Criteria) this;
        }

        public Criteria andApprovorNotIn(List<Integer> values) {
            addCriterion("APPROVOR not in", values, "approvor");
            return (Criteria) this;
        }

        public Criteria andApprovorBetween(Integer value1, Integer value2) {
            addCriterion("APPROVOR between", value1, value2, "approvor");
            return (Criteria) this;
        }

        public Criteria andApprovorNotBetween(Integer value1, Integer value2) {
            addCriterion("APPROVOR not between", value1, value2, "approvor");
            return (Criteria) this;
        }

        public Criteria andLevelIsNull() {
            addCriterion("LEVEL is null");
            return (Criteria) this;
        }

        public Criteria andLevelIsNotNull() {
            addCriterion("LEVEL is not null");
            return (Criteria) this;
        }

        public Criteria andLevelEqualTo(Integer value) {
            addCriterion("LEVEL =", value, "level");
            return (Criteria) this;
        }

        public Criteria andLevelNotEqualTo(Integer value) {
            addCriterion("LEVEL <>", value, "level");
            return (Criteria) this;
        }

        public Criteria andLevelGreaterThan(Integer value) {
            addCriterion("LEVEL >", value, "level");
            return (Criteria) this;
        }

        public Criteria andLevelGreaterThanOrEqualTo(Integer value) {
            addCriterion("LEVEL >=", value, "level");
            return (Criteria) this;
        }

        public Criteria andLevelLessThan(Integer value) {
            addCriterion("LEVEL <", value, "level");
            return (Criteria) this;
        }

        public Criteria andLevelLessThanOrEqualTo(Integer value) {
            addCriterion("LEVEL <=", value, "level");
            return (Criteria) this;
        }

        public Criteria andLevelIn(List<Integer> values) {
            addCriterion("LEVEL in", values, "level");
            return (Criteria) this;
        }

        public Criteria andLevelNotIn(List<Integer> values) {
            addCriterion("LEVEL not in", values, "level");
            return (Criteria) this;
        }

        public Criteria andLevelBetween(Integer value1, Integer value2) {
            addCriterion("LEVEL between", value1, value2, "level");
            return (Criteria) this;
        }

        public Criteria andLevelNotBetween(Integer value1, Integer value2) {
            addCriterion("LEVEL not between", value1, value2, "level");
            return (Criteria) this;
        }

        public Criteria andUserCenterIdIsNull() {
            addCriterion("USER_CENTER_ID is null");
            return (Criteria) this;
        }

        public Criteria andUserCenterIdIsNotNull() {
            addCriterion("USER_CENTER_ID is not null");
            return (Criteria) this;
        }

        public Criteria andUserCenterIdEqualTo(String value) {
            addCriterion("USER_CENTER_ID =", value, "userCenterId");
            return (Criteria) this;
        }

        public Criteria andUserCenterIdNotEqualTo(String value) {
            addCriterion("USER_CENTER_ID <>", value, "userCenterId");
            return (Criteria) this;
        }

        public Criteria andUserCenterIdGreaterThan(String value) {
            addCriterion("USER_CENTER_ID >", value, "userCenterId");
            return (Criteria) this;
        }

        public Criteria andUserCenterIdGreaterThanOrEqualTo(String value) {
            addCriterion("USER_CENTER_ID >=", value, "userCenterId");
            return (Criteria) this;
        }

        public Criteria andUserCenterIdLessThan(String value) {
            addCriterion("USER_CENTER_ID <", value, "userCenterId");
            return (Criteria) this;
        }

        public Criteria andUserCenterIdLessThanOrEqualTo(String value) {
            addCriterion("USER_CENTER_ID <=", value, "userCenterId");
            return (Criteria) this;
        }

        public Criteria andUserCenterIdLike(String value) {
            addCriterion("USER_CENTER_ID like", value, "userCenterId");
            return (Criteria) this;
        }

        public Criteria andUserCenterIdNotLike(String value) {
            addCriterion("USER_CENTER_ID not like", value, "userCenterId");
            return (Criteria) this;
        }

        public Criteria andUserCenterIdIn(List<String> values) {
            addCriterion("USER_CENTER_ID in", values, "userCenterId");
            return (Criteria) this;
        }

        public Criteria andUserCenterIdNotIn(List<String> values) {
            addCriterion("USER_CENTER_ID not in", values, "userCenterId");
            return (Criteria) this;
        }

        public Criteria andUserCenterIdBetween(String value1, String value2) {
            addCriterion("USER_CENTER_ID between", value1, value2, "userCenterId");
            return (Criteria) this;
        }

        public Criteria andUserCenterIdNotBetween(String value1, String value2) {
            addCriterion("USER_CENTER_ID not between", value1, value2, "userCenterId");
            return (Criteria) this;
        }

        public Criteria andUserCenterShopIdIsNull() {
            addCriterion("USER_CENTER_SHOP_ID is null");
            return (Criteria) this;
        }

        public Criteria andUserCenterShopIdIsNotNull() {
            addCriterion("USER_CENTER_SHOP_ID is not null");
            return (Criteria) this;
        }

        public Criteria andUserCenterShopIdEqualTo(String value) {
            addCriterion("USER_CENTER_SHOP_ID =", value, "userCenterShopId");
            return (Criteria) this;
        }

        public Criteria andUserCenterShopIdNotEqualTo(String value) {
            addCriterion("USER_CENTER_SHOP_ID <>", value, "userCenterShopId");
            return (Criteria) this;
        }

        public Criteria andUserCenterShopIdGreaterThan(String value) {
            addCriterion("USER_CENTER_SHOP_ID >", value, "userCenterShopId");
            return (Criteria) this;
        }

        public Criteria andUserCenterShopIdGreaterThanOrEqualTo(String value) {
            addCriterion("USER_CENTER_SHOP_ID >=", value, "userCenterShopId");
            return (Criteria) this;
        }

        public Criteria andUserCenterShopIdLessThan(String value) {
            addCriterion("USER_CENTER_SHOP_ID <", value, "userCenterShopId");
            return (Criteria) this;
        }

        public Criteria andUserCenterShopIdLessThanOrEqualTo(String value) {
            addCriterion("USER_CENTER_SHOP_ID <=", value, "userCenterShopId");
            return (Criteria) this;
        }

        public Criteria andUserCenterShopIdLike(String value) {
            addCriterion("USER_CENTER_SHOP_ID like", value, "userCenterShopId");
            return (Criteria) this;
        }

        public Criteria andUserCenterShopIdNotLike(String value) {
            addCriterion("USER_CENTER_SHOP_ID not like", value, "userCenterShopId");
            return (Criteria) this;
        }

        public Criteria andUserCenterShopIdIn(List<String> values) {
            addCriterion("USER_CENTER_SHOP_ID in", values, "userCenterShopId");
            return (Criteria) this;
        }

        public Criteria andUserCenterShopIdNotIn(List<String> values) {
            addCriterion("USER_CENTER_SHOP_ID not in", values, "userCenterShopId");
            return (Criteria) this;
        }

        public Criteria andUserCenterShopIdBetween(String value1, String value2) {
            addCriterion("USER_CENTER_SHOP_ID between", value1, value2, "userCenterShopId");
            return (Criteria) this;
        }

        public Criteria andUserCenterShopIdNotBetween(String value1, String value2) {
            addCriterion("USER_CENTER_SHOP_ID not between", value1, value2, "userCenterShopId");
            return (Criteria) this;
        }

        public Criteria andIconIsNull() {
            addCriterion("ICON is null");
            return (Criteria) this;
        }

        public Criteria andIconIsNotNull() {
            addCriterion("ICON is not null");
            return (Criteria) this;
        }

        public Criteria andIconEqualTo(String value) {
            addCriterion("ICON =", value, "icon");
            return (Criteria) this;
        }

        public Criteria andIconNotEqualTo(String value) {
            addCriterion("ICON <>", value, "icon");
            return (Criteria) this;
        }

        public Criteria andIconGreaterThan(String value) {
            addCriterion("ICON >", value, "icon");
            return (Criteria) this;
        }

        public Criteria andIconGreaterThanOrEqualTo(String value) {
            addCriterion("ICON >=", value, "icon");
            return (Criteria) this;
        }

        public Criteria andIconLessThan(String value) {
            addCriterion("ICON <", value, "icon");
            return (Criteria) this;
        }

        public Criteria andIconLessThanOrEqualTo(String value) {
            addCriterion("ICON <=", value, "icon");
            return (Criteria) this;
        }

        public Criteria andIconLike(String value) {
            addCriterion("ICON like", value, "icon");
            return (Criteria) this;
        }

        public Criteria andIconNotLike(String value) {
            addCriterion("ICON not like", value, "icon");
            return (Criteria) this;
        }

        public Criteria andIconIn(List<String> values) {
            addCriterion("ICON in", values, "icon");
            return (Criteria) this;
        }

        public Criteria andIconNotIn(List<String> values) {
            addCriterion("ICON not in", values, "icon");
            return (Criteria) this;
        }

        public Criteria andIconBetween(String value1, String value2) {
            addCriterion("ICON between", value1, value2, "icon");
            return (Criteria) this;
        }

        public Criteria andIconNotBetween(String value1, String value2) {
            addCriterion("ICON not between", value1, value2, "icon");
            return (Criteria) this;
        }

        public Criteria andDeviceIdentifyIsNull() {
            addCriterion("DEVICE_IDENTIFY is null");
            return (Criteria) this;
        }

        public Criteria andDeviceIdentifyIsNotNull() {
            addCriterion("DEVICE_IDENTIFY is not null");
            return (Criteria) this;
        }

        public Criteria andDeviceIdentifyEqualTo(String value) {
            addCriterion("DEVICE_IDENTIFY =", value, "deviceIdentify");
            return (Criteria) this;
        }

        public Criteria andDeviceIdentifyNotEqualTo(String value) {
            addCriterion("DEVICE_IDENTIFY <>", value, "deviceIdentify");
            return (Criteria) this;
        }

        public Criteria andDeviceIdentifyGreaterThan(String value) {
            addCriterion("DEVICE_IDENTIFY >", value, "deviceIdentify");
            return (Criteria) this;
        }

        public Criteria andDeviceIdentifyGreaterThanOrEqualTo(String value) {
            addCriterion("DEVICE_IDENTIFY >=", value, "deviceIdentify");
            return (Criteria) this;
        }

        public Criteria andDeviceIdentifyLessThan(String value) {
            addCriterion("DEVICE_IDENTIFY <", value, "deviceIdentify");
            return (Criteria) this;
        }

        public Criteria andDeviceIdentifyLessThanOrEqualTo(String value) {
            addCriterion("DEVICE_IDENTIFY <=", value, "deviceIdentify");
            return (Criteria) this;
        }

        public Criteria andDeviceIdentifyLike(String value) {
            addCriterion("DEVICE_IDENTIFY like", value, "deviceIdentify");
            return (Criteria) this;
        }

        public Criteria andDeviceIdentifyNotLike(String value) {
            addCriterion("DEVICE_IDENTIFY not like", value, "deviceIdentify");
            return (Criteria) this;
        }

        public Criteria andDeviceIdentifyIn(List<String> values) {
            addCriterion("DEVICE_IDENTIFY in", values, "deviceIdentify");
            return (Criteria) this;
        }

        public Criteria andDeviceIdentifyNotIn(List<String> values) {
            addCriterion("DEVICE_IDENTIFY not in", values, "deviceIdentify");
            return (Criteria) this;
        }

        public Criteria andDeviceIdentifyBetween(String value1, String value2) {
            addCriterion("DEVICE_IDENTIFY between", value1, value2, "deviceIdentify");
            return (Criteria) this;
        }

        public Criteria andDeviceIdentifyNotBetween(String value1, String value2) {
            addCriterion("DEVICE_IDENTIFY not between", value1, value2, "deviceIdentify");
            return (Criteria) this;
        }

        public Criteria andIsOnlineIsNull() {
            addCriterion("IS_ONLINE is null");
            return (Criteria) this;
        }

        public Criteria andIsOnlineIsNotNull() {
            addCriterion("IS_ONLINE is not null");
            return (Criteria) this;
        }

        public Criteria andIsOnlineEqualTo(Integer value) {
            addCriterion("IS_ONLINE =", value, "isOnline");
            return (Criteria) this;
        }

        public Criteria andIsOnlineNotEqualTo(Integer value) {
            addCriterion("IS_ONLINE <>", value, "isOnline");
            return (Criteria) this;
        }

        public Criteria andIsOnlineGreaterThan(Integer value) {
            addCriterion("IS_ONLINE >", value, "isOnline");
            return (Criteria) this;
        }

        public Criteria andIsOnlineGreaterThanOrEqualTo(Integer value) {
            addCriterion("IS_ONLINE >=", value, "isOnline");
            return (Criteria) this;
        }

        public Criteria andIsOnlineLessThan(Integer value) {
            addCriterion("IS_ONLINE <", value, "isOnline");
            return (Criteria) this;
        }

        public Criteria andIsOnlineLessThanOrEqualTo(Integer value) {
            addCriterion("IS_ONLINE <=", value, "isOnline");
            return (Criteria) this;
        }

        public Criteria andIsOnlineIn(List<Integer> values) {
            addCriterion("IS_ONLINE in", values, "isOnline");
            return (Criteria) this;
        }

        public Criteria andIsOnlineNotIn(List<Integer> values) {
            addCriterion("IS_ONLINE not in", values, "isOnline");
            return (Criteria) this;
        }

        public Criteria andIsOnlineBetween(Integer value1, Integer value2) {
            addCriterion("IS_ONLINE between", value1, value2, "isOnline");
            return (Criteria) this;
        }

        public Criteria andIsOnlineNotBetween(Integer value1, Integer value2) {
            addCriterion("IS_ONLINE not between", value1, value2, "isOnline");
            return (Criteria) this;
        }

        public Criteria andLastHeartbeatTimeIsNull() {
            addCriterion("LAST_HEARTBEAT_TIME is null");
            return (Criteria) this;
        }

        public Criteria andLastHeartbeatTimeIsNotNull() {
            addCriterion("LAST_HEARTBEAT_TIME is not null");
            return (Criteria) this;
        }

        public Criteria andLastHeartbeatTimeEqualTo(Date value) {
            addCriterion("LAST_HEARTBEAT_TIME =", value, "lastHeartbeatTime");
            return (Criteria) this;
        }

        public Criteria andLastHeartbeatTimeNotEqualTo(Date value) {
            addCriterion("LAST_HEARTBEAT_TIME <>", value, "lastHeartbeatTime");
            return (Criteria) this;
        }

        public Criteria andLastHeartbeatTimeGreaterThan(Date value) {
            addCriterion("LAST_HEARTBEAT_TIME >", value, "lastHeartbeatTime");
            return (Criteria) this;
        }

        public Criteria andLastHeartbeatTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("LAST_HEARTBEAT_TIME >=", value, "lastHeartbeatTime");
            return (Criteria) this;
        }

        public Criteria andLastHeartbeatTimeLessThan(Date value) {
            addCriterion("LAST_HEARTBEAT_TIME <", value, "lastHeartbeatTime");
            return (Criteria) this;
        }

        public Criteria andLastHeartbeatTimeLessThanOrEqualTo(Date value) {
            addCriterion("LAST_HEARTBEAT_TIME <=", value, "lastHeartbeatTime");
            return (Criteria) this;
        }

        public Criteria andLastHeartbeatTimeIn(List<Date> values) {
            addCriterion("LAST_HEARTBEAT_TIME in", values, "lastHeartbeatTime");
            return (Criteria) this;
        }

        public Criteria andLastHeartbeatTimeNotIn(List<Date> values) {
            addCriterion("LAST_HEARTBEAT_TIME not in", values, "lastHeartbeatTime");
            return (Criteria) this;
        }

        public Criteria andLastHeartbeatTimeBetween(Date value1, Date value2) {
            addCriterion("LAST_HEARTBEAT_TIME between", value1, value2, "lastHeartbeatTime");
            return (Criteria) this;
        }

        public Criteria andLastHeartbeatTimeNotBetween(Date value1, Date value2) {
            addCriterion("LAST_HEARTBEAT_TIME not between", value1, value2, "lastHeartbeatTime");
            return (Criteria) this;
        }

        public Criteria andGrowthIsNull() {
            addCriterion("GROWTH is null");
            return (Criteria) this;
        }

        public Criteria andGrowthIsNotNull() {
            addCriterion("GROWTH is not null");
            return (Criteria) this;
        }

        public Criteria andGrowthEqualTo(Long value) {
            addCriterion("GROWTH =", value, "growth");
            return (Criteria) this;
        }

        public Criteria andGrowthNotEqualTo(Long value) {
            addCriterion("GROWTH <>", value, "growth");
            return (Criteria) this;
        }

        public Criteria andGrowthGreaterThan(Long value) {
            addCriterion("GROWTH >", value, "growth");
            return (Criteria) this;
        }

        public Criteria andGrowthGreaterThanOrEqualTo(Long value) {
            addCriterion("GROWTH >=", value, "growth");
            return (Criteria) this;
        }

        public Criteria andGrowthLessThan(Long value) {
            addCriterion("GROWTH <", value, "growth");
            return (Criteria) this;
        }

        public Criteria andGrowthLessThanOrEqualTo(Long value) {
            addCriterion("GROWTH <=", value, "growth");
            return (Criteria) this;
        }

        public Criteria andGrowthIn(List<Long> values) {
            addCriterion("GROWTH in", values, "growth");
            return (Criteria) this;
        }

        public Criteria andGrowthNotIn(List<Long> values) {
            addCriterion("GROWTH not in", values, "growth");
            return (Criteria) this;
        }

        public Criteria andGrowthBetween(Long value1, Long value2) {
            addCriterion("GROWTH between", value1, value2, "growth");
            return (Criteria) this;
        }

        public Criteria andGrowthNotBetween(Long value1, Long value2) {
            addCriterion("GROWTH not between", value1, value2, "growth");
            return (Criteria) this;
        }

        public Criteria andPointsIsNull() {
            addCriterion("POINTS is null");
            return (Criteria) this;
        }

        public Criteria andPointsIsNotNull() {
            addCriterion("POINTS is not null");
            return (Criteria) this;
        }

        public Criteria andPointsEqualTo(Long value) {
            addCriterion("POINTS =", value, "points");
            return (Criteria) this;
        }

        public Criteria andPointsNotEqualTo(Long value) {
            addCriterion("POINTS <>", value, "points");
            return (Criteria) this;
        }

        public Criteria andPointsGreaterThan(Long value) {
            addCriterion("POINTS >", value, "points");
            return (Criteria) this;
        }

        public Criteria andPointsGreaterThanOrEqualTo(Long value) {
            addCriterion("POINTS >=", value, "points");
            return (Criteria) this;
        }

        public Criteria andPointsLessThan(Long value) {
            addCriterion("POINTS <", value, "points");
            return (Criteria) this;
        }

        public Criteria andPointsLessThanOrEqualTo(Long value) {
            addCriterion("POINTS <=", value, "points");
            return (Criteria) this;
        }

        public Criteria andPointsIn(List<Long> values) {
            addCriterion("POINTS in", values, "points");
            return (Criteria) this;
        }

        public Criteria andPointsNotIn(List<Long> values) {
            addCriterion("POINTS not in", values, "points");
            return (Criteria) this;
        }

        public Criteria andPointsBetween(Long value1, Long value2) {
            addCriterion("POINTS between", value1, value2, "points");
            return (Criteria) this;
        }

        public Criteria andPointsNotBetween(Long value1, Long value2) {
            addCriterion("POINTS not between", value1, value2, "points");
            return (Criteria) this;
        }

        public Criteria andPosAppTypeIsNull() {
            addCriterion("POS_APP_TYPE is null");
            return (Criteria) this;
        }

        public Criteria andPosAppTypeIsNotNull() {
            addCriterion("POS_APP_TYPE is not null");
            return (Criteria) this;
        }

        public Criteria andPosAppTypeEqualTo(Integer value) {
            addCriterion("POS_APP_TYPE =", value, "posAppType");
            return (Criteria) this;
        }

        public Criteria andPosAppTypeNotEqualTo(Integer value) {
            addCriterion("POS_APP_TYPE <>", value, "posAppType");
            return (Criteria) this;
        }

        public Criteria andPosAppTypeGreaterThan(Integer value) {
            addCriterion("POS_APP_TYPE >", value, "posAppType");
            return (Criteria) this;
        }

        public Criteria andPosAppTypeGreaterThanOrEqualTo(Integer value) {
            addCriterion("POS_APP_TYPE >=", value, "posAppType");
            return (Criteria) this;
        }

        public Criteria andPosAppTypeLessThan(Integer value) {
            addCriterion("POS_APP_TYPE <", value, "posAppType");
            return (Criteria) this;
        }

        public Criteria andPosAppTypeLessThanOrEqualTo(Integer value) {
            addCriterion("POS_APP_TYPE <=", value, "posAppType");
            return (Criteria) this;
        }

        public Criteria andPosAppTypeIn(List<Integer> values) {
            addCriterion("POS_APP_TYPE in", values, "posAppType");
            return (Criteria) this;
        }

        public Criteria andPosAppTypeNotIn(List<Integer> values) {
            addCriterion("POS_APP_TYPE not in", values, "posAppType");
            return (Criteria) this;
        }

        public Criteria andPosAppTypeBetween(Integer value1, Integer value2) {
            addCriterion("POS_APP_TYPE between", value1, value2, "posAppType");
            return (Criteria) this;
        }

        public Criteria andPosAppTypeNotBetween(Integer value1, Integer value2) {
            addCriterion("POS_APP_TYPE not between", value1, value2, "posAppType");
            return (Criteria) this;
        }

        public Criteria andTobaccoCustIdIsNull() {
            addCriterion("TOBACCO_CUST_ID is null");
            return (Criteria) this;
        }

        public Criteria andTobaccoCustIdIsNotNull() {
            addCriterion("TOBACCO_CUST_ID is not null");
            return (Criteria) this;
        }

        public Criteria andTobaccoCustIdEqualTo(Long value) {
            addCriterion("TOBACCO_CUST_ID =", value, "tobaccoCustId");
            return (Criteria) this;
        }

        public Criteria andTobaccoCustIdNotEqualTo(Long value) {
            addCriterion("TOBACCO_CUST_ID <>", value, "tobaccoCustId");
            return (Criteria) this;
        }

        public Criteria andTobaccoCustIdGreaterThan(Long value) {
            addCriterion("TOBACCO_CUST_ID >", value, "tobaccoCustId");
            return (Criteria) this;
        }

        public Criteria andTobaccoCustIdGreaterThanOrEqualTo(Long value) {
            addCriterion("TOBACCO_CUST_ID >=", value, "tobaccoCustId");
            return (Criteria) this;
        }

        public Criteria andTobaccoCustIdLessThan(Long value) {
            addCriterion("TOBACCO_CUST_ID <", value, "tobaccoCustId");
            return (Criteria) this;
        }

        public Criteria andTobaccoCustIdLessThanOrEqualTo(Long value) {
            addCriterion("TOBACCO_CUST_ID <=", value, "tobaccoCustId");
            return (Criteria) this;
        }

        public Criteria andTobaccoCustIdIn(List<Long> values) {
            addCriterion("TOBACCO_CUST_ID in", values, "tobaccoCustId");
            return (Criteria) this;
        }

        public Criteria andTobaccoCustIdNotIn(List<Long> values) {
            addCriterion("TOBACCO_CUST_ID not in", values, "tobaccoCustId");
            return (Criteria) this;
        }

        public Criteria andTobaccoCustIdBetween(Long value1, Long value2) {
            addCriterion("TOBACCO_CUST_ID between", value1, value2, "tobaccoCustId");
            return (Criteria) this;
        }

        public Criteria andTobaccoCustIdNotBetween(Long value1, Long value2) {
            addCriterion("TOBACCO_CUST_ID not between", value1, value2, "tobaccoCustId");
            return (Criteria) this;
        }

        public Criteria andWorkPortIsNull() {
            addCriterion("WORK_PORT is null");
            return (Criteria) this;
        }

        public Criteria andWorkPortIsNotNull() {
            addCriterion("WORK_PORT is not null");
            return (Criteria) this;
        }

        public Criteria andWorkPortEqualTo(String value) {
            addCriterion("WORK_PORT =", value, "workPort");
            return (Criteria) this;
        }

        public Criteria andWorkPortNotEqualTo(String value) {
            addCriterion("WORK_PORT <>", value, "workPort");
            return (Criteria) this;
        }

        public Criteria andWorkPortGreaterThan(String value) {
            addCriterion("WORK_PORT >", value, "workPort");
            return (Criteria) this;
        }

        public Criteria andWorkPortGreaterThanOrEqualTo(String value) {
            addCriterion("WORK_PORT >=", value, "workPort");
            return (Criteria) this;
        }

        public Criteria andWorkPortLessThan(String value) {
            addCriterion("WORK_PORT <", value, "workPort");
            return (Criteria) this;
        }

        public Criteria andWorkPortLessThanOrEqualTo(String value) {
            addCriterion("WORK_PORT <=", value, "workPort");
            return (Criteria) this;
        }

        public Criteria andWorkPortLike(String value) {
            addCriterion("WORK_PORT like", value, "workPort");
            return (Criteria) this;
        }

        public Criteria andWorkPortNotLike(String value) {
            addCriterion("WORK_PORT not like", value, "workPort");
            return (Criteria) this;
        }

        public Criteria andWorkPortIn(List<String> values) {
            addCriterion("WORK_PORT in", values, "workPort");
            return (Criteria) this;
        }

        public Criteria andWorkPortNotIn(List<String> values) {
            addCriterion("WORK_PORT not in", values, "workPort");
            return (Criteria) this;
        }

        public Criteria andWorkPortBetween(String value1, String value2) {
            addCriterion("WORK_PORT between", value1, value2, "workPort");
            return (Criteria) this;
        }

        public Criteria andWorkPortNotBetween(String value1, String value2) {
            addCriterion("WORK_PORT not between", value1, value2, "workPort");
            return (Criteria) this;
        }

        public Criteria andSaleScopeIsNull() {
            addCriterion("SALE_SCOPE is null");
            return (Criteria) this;
        }

        public Criteria andSaleScopeIsNotNull() {
            addCriterion("SALE_SCOPE is not null");
            return (Criteria) this;
        }

        public Criteria andSaleScopeEqualTo(String value) {
            addCriterion("SALE_SCOPE =", value, "saleScope");
            return (Criteria) this;
        }

        public Criteria andSaleScopeNotEqualTo(String value) {
            addCriterion("SALE_SCOPE <>", value, "saleScope");
            return (Criteria) this;
        }

        public Criteria andSaleScopeGreaterThan(String value) {
            addCriterion("SALE_SCOPE >", value, "saleScope");
            return (Criteria) this;
        }

        public Criteria andSaleScopeGreaterThanOrEqualTo(String value) {
            addCriterion("SALE_SCOPE >=", value, "saleScope");
            return (Criteria) this;
        }

        public Criteria andSaleScopeLessThan(String value) {
            addCriterion("SALE_SCOPE <", value, "saleScope");
            return (Criteria) this;
        }

        public Criteria andSaleScopeLessThanOrEqualTo(String value) {
            addCriterion("SALE_SCOPE <=", value, "saleScope");
            return (Criteria) this;
        }

        public Criteria andSaleScopeLike(String value) {
            addCriterion("SALE_SCOPE like", value, "saleScope");
            return (Criteria) this;
        }

        public Criteria andSaleScopeNotLike(String value) {
            addCriterion("SALE_SCOPE not like", value, "saleScope");
            return (Criteria) this;
        }

        public Criteria andSaleScopeIn(List<String> values) {
            addCriterion("SALE_SCOPE in", values, "saleScope");
            return (Criteria) this;
        }

        public Criteria andSaleScopeNotIn(List<String> values) {
            addCriterion("SALE_SCOPE not in", values, "saleScope");
            return (Criteria) this;
        }

        public Criteria andSaleScopeBetween(String value1, String value2) {
            addCriterion("SALE_SCOPE between", value1, value2, "saleScope");
            return (Criteria) this;
        }

        public Criteria andSaleScopeNotBetween(String value1, String value2) {
            addCriterion("SALE_SCOPE not between", value1, value2, "saleScope");
            return (Criteria) this;
        }

        public Criteria andBusinessAreaIsNull() {
            addCriterion("BUSINESS_AREA is null");
            return (Criteria) this;
        }

        public Criteria andBusinessAreaIsNotNull() {
            addCriterion("BUSINESS_AREA is not null");
            return (Criteria) this;
        }

        public Criteria andBusinessAreaEqualTo(String value) {
            addCriterion("BUSINESS_AREA =", value, "businessArea");
            return (Criteria) this;
        }

        public Criteria andBusinessAreaNotEqualTo(String value) {
            addCriterion("BUSINESS_AREA <>", value, "businessArea");
            return (Criteria) this;
        }

        public Criteria andBusinessAreaGreaterThan(String value) {
            addCriterion("BUSINESS_AREA >", value, "businessArea");
            return (Criteria) this;
        }

        public Criteria andBusinessAreaGreaterThanOrEqualTo(String value) {
            addCriterion("BUSINESS_AREA >=", value, "businessArea");
            return (Criteria) this;
        }

        public Criteria andBusinessAreaLessThan(String value) {
            addCriterion("BUSINESS_AREA <", value, "businessArea");
            return (Criteria) this;
        }

        public Criteria andBusinessAreaLessThanOrEqualTo(String value) {
            addCriterion("BUSINESS_AREA <=", value, "businessArea");
            return (Criteria) this;
        }

        public Criteria andBusinessAreaLike(String value) {
            addCriterion("BUSINESS_AREA like", value, "businessArea");
            return (Criteria) this;
        }

        public Criteria andBusinessAreaNotLike(String value) {
            addCriterion("BUSINESS_AREA not like", value, "businessArea");
            return (Criteria) this;
        }

        public Criteria andBusinessAreaIn(List<String> values) {
            addCriterion("BUSINESS_AREA in", values, "businessArea");
            return (Criteria) this;
        }

        public Criteria andBusinessAreaNotIn(List<String> values) {
            addCriterion("BUSINESS_AREA not in", values, "businessArea");
            return (Criteria) this;
        }

        public Criteria andBusinessAreaBetween(String value1, String value2) {
            addCriterion("BUSINESS_AREA between", value1, value2, "businessArea");
            return (Criteria) this;
        }

        public Criteria andBusinessAreaNotBetween(String value1, String value2) {
            addCriterion("BUSINESS_AREA not between", value1, value2, "businessArea");
            return (Criteria) this;
        }

        public Criteria andSaleTypeIsNull() {
            addCriterion("SALE_TYPE is null");
            return (Criteria) this;
        }

        public Criteria andSaleTypeIsNotNull() {
            addCriterion("SALE_TYPE is not null");
            return (Criteria) this;
        }

        public Criteria andSaleTypeEqualTo(String value) {
            addCriterion("SALE_TYPE =", value, "saleType");
            return (Criteria) this;
        }

        public Criteria andSaleTypeNotEqualTo(String value) {
            addCriterion("SALE_TYPE <>", value, "saleType");
            return (Criteria) this;
        }

        public Criteria andSaleTypeGreaterThan(String value) {
            addCriterion("SALE_TYPE >", value, "saleType");
            return (Criteria) this;
        }

        public Criteria andSaleTypeGreaterThanOrEqualTo(String value) {
            addCriterion("SALE_TYPE >=", value, "saleType");
            return (Criteria) this;
        }

        public Criteria andSaleTypeLessThan(String value) {
            addCriterion("SALE_TYPE <", value, "saleType");
            return (Criteria) this;
        }

        public Criteria andSaleTypeLessThanOrEqualTo(String value) {
            addCriterion("SALE_TYPE <=", value, "saleType");
            return (Criteria) this;
        }

        public Criteria andSaleTypeLike(String value) {
            addCriterion("SALE_TYPE like", value, "saleType");
            return (Criteria) this;
        }

        public Criteria andSaleTypeNotLike(String value) {
            addCriterion("SALE_TYPE not like", value, "saleType");
            return (Criteria) this;
        }

        public Criteria andSaleTypeIn(List<String> values) {
            addCriterion("SALE_TYPE in", values, "saleType");
            return (Criteria) this;
        }

        public Criteria andSaleTypeNotIn(List<String> values) {
            addCriterion("SALE_TYPE not in", values, "saleType");
            return (Criteria) this;
        }

        public Criteria andSaleTypeBetween(String value1, String value2) {
            addCriterion("SALE_TYPE between", value1, value2, "saleType");
            return (Criteria) this;
        }

        public Criteria andSaleTypeNotBetween(String value1, String value2) {
            addCriterion("SALE_TYPE not between", value1, value2, "saleType");
            return (Criteria) this;
        }

        public Criteria andBaseTypeIsNull() {
            addCriterion("BASE_TYPE is null");
            return (Criteria) this;
        }

        public Criteria andBaseTypeIsNotNull() {
            addCriterion("BASE_TYPE is not null");
            return (Criteria) this;
        }

        public Criteria andBaseTypeEqualTo(String value) {
            addCriterion("BASE_TYPE =", value, "baseType");
            return (Criteria) this;
        }

        public Criteria andBaseTypeNotEqualTo(String value) {
            addCriterion("BASE_TYPE <>", value, "baseType");
            return (Criteria) this;
        }

        public Criteria andBaseTypeGreaterThan(String value) {
            addCriterion("BASE_TYPE >", value, "baseType");
            return (Criteria) this;
        }

        public Criteria andBaseTypeGreaterThanOrEqualTo(String value) {
            addCriterion("BASE_TYPE >=", value, "baseType");
            return (Criteria) this;
        }

        public Criteria andBaseTypeLessThan(String value) {
            addCriterion("BASE_TYPE <", value, "baseType");
            return (Criteria) this;
        }

        public Criteria andBaseTypeLessThanOrEqualTo(String value) {
            addCriterion("BASE_TYPE <=", value, "baseType");
            return (Criteria) this;
        }

        public Criteria andBaseTypeLike(String value) {
            addCriterion("BASE_TYPE like", value, "baseType");
            return (Criteria) this;
        }

        public Criteria andBaseTypeNotLike(String value) {
            addCriterion("BASE_TYPE not like", value, "baseType");
            return (Criteria) this;
        }

        public Criteria andBaseTypeIn(List<String> values) {
            addCriterion("BASE_TYPE in", values, "baseType");
            return (Criteria) this;
        }

        public Criteria andBaseTypeNotIn(List<String> values) {
            addCriterion("BASE_TYPE not in", values, "baseType");
            return (Criteria) this;
        }

        public Criteria andBaseTypeBetween(String value1, String value2) {
            addCriterion("BASE_TYPE between", value1, value2, "baseType");
            return (Criteria) this;
        }

        public Criteria andBaseTypeNotBetween(String value1, String value2) {
            addCriterion("BASE_TYPE not between", value1, value2, "baseType");
            return (Criteria) this;
        }

        public Criteria andBusinessLicenseIsNull() {
            addCriterion("BUSINESS_LICENSE is null");
            return (Criteria) this;
        }

        public Criteria andBusinessLicenseIsNotNull() {
            addCriterion("BUSINESS_LICENSE is not null");
            return (Criteria) this;
        }

        public Criteria andBusinessLicenseEqualTo(String value) {
            addCriterion("BUSINESS_LICENSE =", value, "businessLicense");
            return (Criteria) this;
        }

        public Criteria andBusinessLicenseNotEqualTo(String value) {
            addCriterion("BUSINESS_LICENSE <>", value, "businessLicense");
            return (Criteria) this;
        }

        public Criteria andBusinessLicenseGreaterThan(String value) {
            addCriterion("BUSINESS_LICENSE >", value, "businessLicense");
            return (Criteria) this;
        }

        public Criteria andBusinessLicenseGreaterThanOrEqualTo(String value) {
            addCriterion("BUSINESS_LICENSE >=", value, "businessLicense");
            return (Criteria) this;
        }

        public Criteria andBusinessLicenseLessThan(String value) {
            addCriterion("BUSINESS_LICENSE <", value, "businessLicense");
            return (Criteria) this;
        }

        public Criteria andBusinessLicenseLessThanOrEqualTo(String value) {
            addCriterion("BUSINESS_LICENSE <=", value, "businessLicense");
            return (Criteria) this;
        }

        public Criteria andBusinessLicenseLike(String value) {
            addCriterion("BUSINESS_LICENSE like", value, "businessLicense");
            return (Criteria) this;
        }

        public Criteria andBusinessLicenseNotLike(String value) {
            addCriterion("BUSINESS_LICENSE not like", value, "businessLicense");
            return (Criteria) this;
        }

        public Criteria andBusinessLicenseIn(List<String> values) {
            addCriterion("BUSINESS_LICENSE in", values, "businessLicense");
            return (Criteria) this;
        }

        public Criteria andBusinessLicenseNotIn(List<String> values) {
            addCriterion("BUSINESS_LICENSE not in", values, "businessLicense");
            return (Criteria) this;
        }

        public Criteria andBusinessLicenseBetween(String value1, String value2) {
            addCriterion("BUSINESS_LICENSE between", value1, value2, "businessLicense");
            return (Criteria) this;
        }

        public Criteria andBusinessLicenseNotBetween(String value1, String value2) {
            addCriterion("BUSINESS_LICENSE not between", value1, value2, "businessLicense");
            return (Criteria) this;
        }

        public Criteria andBusinessContractPathIsNull() {
            addCriterion("BUSINESS_CONTRACT_PATH is null");
            return (Criteria) this;
        }

        public Criteria andBusinessContractPathIsNotNull() {
            addCriterion("BUSINESS_CONTRACT_PATH is not null");
            return (Criteria) this;
        }

        public Criteria andBusinessContractPathEqualTo(String value) {
            addCriterion("BUSINESS_CONTRACT_PATH =", value, "businessContractPath");
            return (Criteria) this;
        }

        public Criteria andBusinessContractPathNotEqualTo(String value) {
            addCriterion("BUSINESS_CONTRACT_PATH <>", value, "businessContractPath");
            return (Criteria) this;
        }

        public Criteria andBusinessContractPathGreaterThan(String value) {
            addCriterion("BUSINESS_CONTRACT_PATH >", value, "businessContractPath");
            return (Criteria) this;
        }

        public Criteria andBusinessContractPathGreaterThanOrEqualTo(String value) {
            addCriterion("BUSINESS_CONTRACT_PATH >=", value, "businessContractPath");
            return (Criteria) this;
        }

        public Criteria andBusinessContractPathLessThan(String value) {
            addCriterion("BUSINESS_CONTRACT_PATH <", value, "businessContractPath");
            return (Criteria) this;
        }

        public Criteria andBusinessContractPathLessThanOrEqualTo(String value) {
            addCriterion("BUSINESS_CONTRACT_PATH <=", value, "businessContractPath");
            return (Criteria) this;
        }

        public Criteria andBusinessContractPathLike(String value) {
            addCriterion("BUSINESS_CONTRACT_PATH like", value, "businessContractPath");
            return (Criteria) this;
        }

        public Criteria andBusinessContractPathNotLike(String value) {
            addCriterion("BUSINESS_CONTRACT_PATH not like", value, "businessContractPath");
            return (Criteria) this;
        }

        public Criteria andBusinessContractPathIn(List<String> values) {
            addCriterion("BUSINESS_CONTRACT_PATH in", values, "businessContractPath");
            return (Criteria) this;
        }

        public Criteria andBusinessContractPathNotIn(List<String> values) {
            addCriterion("BUSINESS_CONTRACT_PATH not in", values, "businessContractPath");
            return (Criteria) this;
        }

        public Criteria andBusinessContractPathBetween(String value1, String value2) {
            addCriterion("BUSINESS_CONTRACT_PATH between", value1, value2, "businessContractPath");
            return (Criteria) this;
        }

        public Criteria andBusinessContractPathNotBetween(String value1, String value2) {
            addCriterion("BUSINESS_CONTRACT_PATH not between", value1, value2, "businessContractPath");
            return (Criteria) this;
        }

        public Criteria andActiveIsNull() {
            addCriterion("ACTIVE is null");
            return (Criteria) this;
        }

        public Criteria andActiveIsNotNull() {
            addCriterion("ACTIVE is not null");
            return (Criteria) this;
        }

        public Criteria andActiveEqualTo(Integer value) {
            addCriterion("ACTIVE =", value, "active");
            return (Criteria) this;
        }

        public Criteria andActiveNotEqualTo(Integer value) {
            addCriterion("ACTIVE <>", value, "active");
            return (Criteria) this;
        }

        public Criteria andActiveGreaterThan(Integer value) {
            addCriterion("ACTIVE >", value, "active");
            return (Criteria) this;
        }

        public Criteria andActiveGreaterThanOrEqualTo(Integer value) {
            addCriterion("ACTIVE >=", value, "active");
            return (Criteria) this;
        }

        public Criteria andActiveLessThan(Integer value) {
            addCriterion("ACTIVE <", value, "active");
            return (Criteria) this;
        }

        public Criteria andActiveLessThanOrEqualTo(Integer value) {
            addCriterion("ACTIVE <=", value, "active");
            return (Criteria) this;
        }

        public Criteria andActiveIn(List<Integer> values) {
            addCriterion("ACTIVE in", values, "active");
            return (Criteria) this;
        }

        public Criteria andActiveNotIn(List<Integer> values) {
            addCriterion("ACTIVE not in", values, "active");
            return (Criteria) this;
        }

        public Criteria andActiveBetween(Integer value1, Integer value2) {
            addCriterion("ACTIVE between", value1, value2, "active");
            return (Criteria) this;
        }

        public Criteria andActiveNotBetween(Integer value1, Integer value2) {
            addCriterion("ACTIVE not between", value1, value2, "active");
            return (Criteria) this;
        }

        public Criteria andAccountIdIsNull() {
            addCriterion("ACCOUNT_ID is null");
            return (Criteria) this;
        }

        public Criteria andAccountIdIsNotNull() {
            addCriterion("ACCOUNT_ID is not null");
            return (Criteria) this;
        }

        public Criteria andAccountIdEqualTo(Long value) {
            addCriterion("ACCOUNT_ID =", value, "accountId");
            return (Criteria) this;
        }

        public Criteria andAccountIdNotEqualTo(Long value) {
            addCriterion("ACCOUNT_ID <>", value, "accountId");
            return (Criteria) this;
        }

        public Criteria andAccountIdGreaterThan(Long value) {
            addCriterion("ACCOUNT_ID >", value, "accountId");
            return (Criteria) this;
        }

        public Criteria andAccountIdGreaterThanOrEqualTo(Long value) {
            addCriterion("ACCOUNT_ID >=", value, "accountId");
            return (Criteria) this;
        }

        public Criteria andAccountIdLessThan(Long value) {
            addCriterion("ACCOUNT_ID <", value, "accountId");
            return (Criteria) this;
        }

        public Criteria andAccountIdLessThanOrEqualTo(Long value) {
            addCriterion("ACCOUNT_ID <=", value, "accountId");
            return (Criteria) this;
        }

        public Criteria andAccountIdIn(List<Long> values) {
            addCriterion("ACCOUNT_ID in", values, "accountId");
            return (Criteria) this;
        }

        public Criteria andAccountIdNotIn(List<Long> values) {
            addCriterion("ACCOUNT_ID not in", values, "accountId");
            return (Criteria) this;
        }

        public Criteria andAccountIdBetween(Long value1, Long value2) {
            addCriterion("ACCOUNT_ID between", value1, value2, "accountId");
            return (Criteria) this;
        }

        public Criteria andAccountIdNotBetween(Long value1, Long value2) {
            addCriterion("ACCOUNT_ID not between", value1, value2, "accountId");
            return (Criteria) this;
        }

        public Criteria andShopManagerIsNull() {
            addCriterion("SHOP_MANAGER is null");
            return (Criteria) this;
        }

        public Criteria andShopManagerIsNotNull() {
            addCriterion("SHOP_MANAGER is not null");
            return (Criteria) this;
        }

        public Criteria andShopManagerEqualTo(String value) {
            addCriterion("SHOP_MANAGER =", value, "shopManager");
            return (Criteria) this;
        }

        public Criteria andShopManagerNotEqualTo(String value) {
            addCriterion("SHOP_MANAGER <>", value, "shopManager");
            return (Criteria) this;
        }

        public Criteria andShopManagerGreaterThan(String value) {
            addCriterion("SHOP_MANAGER >", value, "shopManager");
            return (Criteria) this;
        }

        public Criteria andShopManagerGreaterThanOrEqualTo(String value) {
            addCriterion("SHOP_MANAGER >=", value, "shopManager");
            return (Criteria) this;
        }

        public Criteria andShopManagerLessThan(String value) {
            addCriterion("SHOP_MANAGER <", value, "shopManager");
            return (Criteria) this;
        }

        public Criteria andShopManagerLessThanOrEqualTo(String value) {
            addCriterion("SHOP_MANAGER <=", value, "shopManager");
            return (Criteria) this;
        }

        public Criteria andShopManagerLike(String value) {
            addCriterion("SHOP_MANAGER like", value, "shopManager");
            return (Criteria) this;
        }

        public Criteria andShopManagerNotLike(String value) {
            addCriterion("SHOP_MANAGER not like", value, "shopManager");
            return (Criteria) this;
        }

        public Criteria andShopManagerIn(List<String> values) {
            addCriterion("SHOP_MANAGER in", values, "shopManager");
            return (Criteria) this;
        }

        public Criteria andShopManagerNotIn(List<String> values) {
            addCriterion("SHOP_MANAGER not in", values, "shopManager");
            return (Criteria) this;
        }

        public Criteria andShopManagerBetween(String value1, String value2) {
            addCriterion("SHOP_MANAGER between", value1, value2, "shopManager");
            return (Criteria) this;
        }

        public Criteria andShopManagerNotBetween(String value1, String value2) {
            addCriterion("SHOP_MANAGER not between", value1, value2, "shopManager");
            return (Criteria) this;
        }
    }

    public static class Criteria extends GeneratedCriteria {

        protected Criteria() {
            super();
        }
    }

    public static class Criterion {
        private String condition;

        private Object value;

        private Object secondValue;

        private boolean noValue;

        private boolean singleValue;

        private boolean betweenValue;

        private boolean listValue;

        private String typeHandler;

        public String getCondition() {
            return condition;
        }

        public Object getValue() {
            return value;
        }

        public Object getSecondValue() {
            return secondValue;
        }

        public boolean isNoValue() {
            return noValue;
        }

        public boolean isSingleValue() {
            return singleValue;
        }

        public boolean isBetweenValue() {
            return betweenValue;
        }

        public boolean isListValue() {
            return listValue;
        }

        public String getTypeHandler() {
            return typeHandler;
        }

        protected Criterion(String condition) {
            super();
            this.condition = condition;
            this.typeHandler = null;
            this.noValue = true;
        }

        protected Criterion(String condition, Object value, String typeHandler) {
            super();
            this.condition = condition;
            this.value = value;
            this.typeHandler = typeHandler;
            if (value instanceof List<?>) {
                this.listValue = true;
            } else {
                this.singleValue = true;
            }
        }

        protected Criterion(String condition, Object value) {
            this(condition, value, null);
        }

        protected Criterion(String condition, Object value, Object secondValue, String typeHandler) {
            super();
            this.condition = condition;
            this.value = value;
            this.secondValue = secondValue;
            this.typeHandler = typeHandler;
            this.betweenValue = true;
        }

        protected Criterion(String condition, Object value, Object secondValue) {
            this(condition, value, secondValue, null);
        }
    }
}