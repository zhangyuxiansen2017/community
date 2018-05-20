package cn.zhangguimin.community.po;

import java.util.ArrayList;
import java.util.List;

public class OpenOauthPoExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public OpenOauthPoExample() {
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

        public Criteria andIdIsNull() {
            addCriterion("id is null");
            return (Criteria) this;
        }

        public Criteria andIdIsNotNull() {
            addCriterion("id is not null");
            return (Criteria) this;
        }

        public Criteria andIdEqualTo(Long value) {
            addCriterion("id =", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotEqualTo(Long value) {
            addCriterion("id <>", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThan(Long value) {
            addCriterion("id >", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThanOrEqualTo(Long value) {
            addCriterion("id >=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThan(Long value) {
            addCriterion("id <", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThanOrEqualTo(Long value) {
            addCriterion("id <=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdIn(List<Long> values) {
            addCriterion("id in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotIn(List<Long> values) {
            addCriterion("id not in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdBetween(Long value1, Long value2) {
            addCriterion("id between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotBetween(Long value1, Long value2) {
            addCriterion("id not between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andAccessTokenIsNull() {
            addCriterion("access_token is null");
            return (Criteria) this;
        }

        public Criteria andAccessTokenIsNotNull() {
            addCriterion("access_token is not null");
            return (Criteria) this;
        }

        public Criteria andAccessTokenEqualTo(String value) {
            addCriterion("access_token =", value, "accessToken");
            return (Criteria) this;
        }

        public Criteria andAccessTokenNotEqualTo(String value) {
            addCriterion("access_token <>", value, "accessToken");
            return (Criteria) this;
        }

        public Criteria andAccessTokenGreaterThan(String value) {
            addCriterion("access_token >", value, "accessToken");
            return (Criteria) this;
        }

        public Criteria andAccessTokenGreaterThanOrEqualTo(String value) {
            addCriterion("access_token >=", value, "accessToken");
            return (Criteria) this;
        }

        public Criteria andAccessTokenLessThan(String value) {
            addCriterion("access_token <", value, "accessToken");
            return (Criteria) this;
        }

        public Criteria andAccessTokenLessThanOrEqualTo(String value) {
            addCriterion("access_token <=", value, "accessToken");
            return (Criteria) this;
        }

        public Criteria andAccessTokenLike(String value) {
            addCriterion("access_token like", value, "accessToken");
            return (Criteria) this;
        }

        public Criteria andAccessTokenNotLike(String value) {
            addCriterion("access_token not like", value, "accessToken");
            return (Criteria) this;
        }

        public Criteria andAccessTokenIn(List<String> values) {
            addCriterion("access_token in", values, "accessToken");
            return (Criteria) this;
        }

        public Criteria andAccessTokenNotIn(List<String> values) {
            addCriterion("access_token not in", values, "accessToken");
            return (Criteria) this;
        }

        public Criteria andAccessTokenBetween(String value1, String value2) {
            addCriterion("access_token between", value1, value2, "accessToken");
            return (Criteria) this;
        }

        public Criteria andAccessTokenNotBetween(String value1, String value2) {
            addCriterion("access_token not between", value1, value2, "accessToken");
            return (Criteria) this;
        }

        public Criteria andExpireInIsNull() {
            addCriterion("expire_in is null");
            return (Criteria) this;
        }

        public Criteria andExpireInIsNotNull() {
            addCriterion("expire_in is not null");
            return (Criteria) this;
        }

        public Criteria andExpireInEqualTo(String value) {
            addCriterion("expire_in =", value, "expireIn");
            return (Criteria) this;
        }

        public Criteria andExpireInNotEqualTo(String value) {
            addCriterion("expire_in <>", value, "expireIn");
            return (Criteria) this;
        }

        public Criteria andExpireInGreaterThan(String value) {
            addCriterion("expire_in >", value, "expireIn");
            return (Criteria) this;
        }

        public Criteria andExpireInGreaterThanOrEqualTo(String value) {
            addCriterion("expire_in >=", value, "expireIn");
            return (Criteria) this;
        }

        public Criteria andExpireInLessThan(String value) {
            addCriterion("expire_in <", value, "expireIn");
            return (Criteria) this;
        }

        public Criteria andExpireInLessThanOrEqualTo(String value) {
            addCriterion("expire_in <=", value, "expireIn");
            return (Criteria) this;
        }

        public Criteria andExpireInLike(String value) {
            addCriterion("expire_in like", value, "expireIn");
            return (Criteria) this;
        }

        public Criteria andExpireInNotLike(String value) {
            addCriterion("expire_in not like", value, "expireIn");
            return (Criteria) this;
        }

        public Criteria andExpireInIn(List<String> values) {
            addCriterion("expire_in in", values, "expireIn");
            return (Criteria) this;
        }

        public Criteria andExpireInNotIn(List<String> values) {
            addCriterion("expire_in not in", values, "expireIn");
            return (Criteria) this;
        }

        public Criteria andExpireInBetween(String value1, String value2) {
            addCriterion("expire_in between", value1, value2, "expireIn");
            return (Criteria) this;
        }

        public Criteria andExpireInNotBetween(String value1, String value2) {
            addCriterion("expire_in not between", value1, value2, "expireIn");
            return (Criteria) this;
        }

        public Criteria andOauthCodeIsNull() {
            addCriterion("oauth_code is null");
            return (Criteria) this;
        }

        public Criteria andOauthCodeIsNotNull() {
            addCriterion("oauth_code is not null");
            return (Criteria) this;
        }

        public Criteria andOauthCodeEqualTo(String value) {
            addCriterion("oauth_code =", value, "oauthCode");
            return (Criteria) this;
        }

        public Criteria andOauthCodeNotEqualTo(String value) {
            addCriterion("oauth_code <>", value, "oauthCode");
            return (Criteria) this;
        }

        public Criteria andOauthCodeGreaterThan(String value) {
            addCriterion("oauth_code >", value, "oauthCode");
            return (Criteria) this;
        }

        public Criteria andOauthCodeGreaterThanOrEqualTo(String value) {
            addCriterion("oauth_code >=", value, "oauthCode");
            return (Criteria) this;
        }

        public Criteria andOauthCodeLessThan(String value) {
            addCriterion("oauth_code <", value, "oauthCode");
            return (Criteria) this;
        }

        public Criteria andOauthCodeLessThanOrEqualTo(String value) {
            addCriterion("oauth_code <=", value, "oauthCode");
            return (Criteria) this;
        }

        public Criteria andOauthCodeLike(String value) {
            addCriterion("oauth_code like", value, "oauthCode");
            return (Criteria) this;
        }

        public Criteria andOauthCodeNotLike(String value) {
            addCriterion("oauth_code not like", value, "oauthCode");
            return (Criteria) this;
        }

        public Criteria andOauthCodeIn(List<String> values) {
            addCriterion("oauth_code in", values, "oauthCode");
            return (Criteria) this;
        }

        public Criteria andOauthCodeNotIn(List<String> values) {
            addCriterion("oauth_code not in", values, "oauthCode");
            return (Criteria) this;
        }

        public Criteria andOauthCodeBetween(String value1, String value2) {
            addCriterion("oauth_code between", value1, value2, "oauthCode");
            return (Criteria) this;
        }

        public Criteria andOauthCodeNotBetween(String value1, String value2) {
            addCriterion("oauth_code not between", value1, value2, "oauthCode");
            return (Criteria) this;
        }

        public Criteria andOauthTypeIsNull() {
            addCriterion("oauth_type is null");
            return (Criteria) this;
        }

        public Criteria andOauthTypeIsNotNull() {
            addCriterion("oauth_type is not null");
            return (Criteria) this;
        }

        public Criteria andOauthTypeEqualTo(Integer value) {
            addCriterion("oauth_type =", value, "oauthType");
            return (Criteria) this;
        }

        public Criteria andOauthTypeNotEqualTo(Integer value) {
            addCriterion("oauth_type <>", value, "oauthType");
            return (Criteria) this;
        }

        public Criteria andOauthTypeGreaterThan(Integer value) {
            addCriterion("oauth_type >", value, "oauthType");
            return (Criteria) this;
        }

        public Criteria andOauthTypeGreaterThanOrEqualTo(Integer value) {
            addCriterion("oauth_type >=", value, "oauthType");
            return (Criteria) this;
        }

        public Criteria andOauthTypeLessThan(Integer value) {
            addCriterion("oauth_type <", value, "oauthType");
            return (Criteria) this;
        }

        public Criteria andOauthTypeLessThanOrEqualTo(Integer value) {
            addCriterion("oauth_type <=", value, "oauthType");
            return (Criteria) this;
        }

        public Criteria andOauthTypeIn(List<Integer> values) {
            addCriterion("oauth_type in", values, "oauthType");
            return (Criteria) this;
        }

        public Criteria andOauthTypeNotIn(List<Integer> values) {
            addCriterion("oauth_type not in", values, "oauthType");
            return (Criteria) this;
        }

        public Criteria andOauthTypeBetween(Integer value1, Integer value2) {
            addCriterion("oauth_type between", value1, value2, "oauthType");
            return (Criteria) this;
        }

        public Criteria andOauthTypeNotBetween(Integer value1, Integer value2) {
            addCriterion("oauth_type not between", value1, value2, "oauthType");
            return (Criteria) this;
        }

        public Criteria andOauthUserIdIsNull() {
            addCriterion("oauth_user_id is null");
            return (Criteria) this;
        }

        public Criteria andOauthUserIdIsNotNull() {
            addCriterion("oauth_user_id is not null");
            return (Criteria) this;
        }

        public Criteria andOauthUserIdEqualTo(String value) {
            addCriterion("oauth_user_id =", value, "oauthUserId");
            return (Criteria) this;
        }

        public Criteria andOauthUserIdNotEqualTo(String value) {
            addCriterion("oauth_user_id <>", value, "oauthUserId");
            return (Criteria) this;
        }

        public Criteria andOauthUserIdGreaterThan(String value) {
            addCriterion("oauth_user_id >", value, "oauthUserId");
            return (Criteria) this;
        }

        public Criteria andOauthUserIdGreaterThanOrEqualTo(String value) {
            addCriterion("oauth_user_id >=", value, "oauthUserId");
            return (Criteria) this;
        }

        public Criteria andOauthUserIdLessThan(String value) {
            addCriterion("oauth_user_id <", value, "oauthUserId");
            return (Criteria) this;
        }

        public Criteria andOauthUserIdLessThanOrEqualTo(String value) {
            addCriterion("oauth_user_id <=", value, "oauthUserId");
            return (Criteria) this;
        }

        public Criteria andOauthUserIdLike(String value) {
            addCriterion("oauth_user_id like", value, "oauthUserId");
            return (Criteria) this;
        }

        public Criteria andOauthUserIdNotLike(String value) {
            addCriterion("oauth_user_id not like", value, "oauthUserId");
            return (Criteria) this;
        }

        public Criteria andOauthUserIdIn(List<String> values) {
            addCriterion("oauth_user_id in", values, "oauthUserId");
            return (Criteria) this;
        }

        public Criteria andOauthUserIdNotIn(List<String> values) {
            addCriterion("oauth_user_id not in", values, "oauthUserId");
            return (Criteria) this;
        }

        public Criteria andOauthUserIdBetween(String value1, String value2) {
            addCriterion("oauth_user_id between", value1, value2, "oauthUserId");
            return (Criteria) this;
        }

        public Criteria andOauthUserIdNotBetween(String value1, String value2) {
            addCriterion("oauth_user_id not between", value1, value2, "oauthUserId");
            return (Criteria) this;
        }

        public Criteria andRefreshTokenIsNull() {
            addCriterion("refresh_token is null");
            return (Criteria) this;
        }

        public Criteria andRefreshTokenIsNotNull() {
            addCriterion("refresh_token is not null");
            return (Criteria) this;
        }

        public Criteria andRefreshTokenEqualTo(String value) {
            addCriterion("refresh_token =", value, "refreshToken");
            return (Criteria) this;
        }

        public Criteria andRefreshTokenNotEqualTo(String value) {
            addCriterion("refresh_token <>", value, "refreshToken");
            return (Criteria) this;
        }

        public Criteria andRefreshTokenGreaterThan(String value) {
            addCriterion("refresh_token >", value, "refreshToken");
            return (Criteria) this;
        }

        public Criteria andRefreshTokenGreaterThanOrEqualTo(String value) {
            addCriterion("refresh_token >=", value, "refreshToken");
            return (Criteria) this;
        }

        public Criteria andRefreshTokenLessThan(String value) {
            addCriterion("refresh_token <", value, "refreshToken");
            return (Criteria) this;
        }

        public Criteria andRefreshTokenLessThanOrEqualTo(String value) {
            addCriterion("refresh_token <=", value, "refreshToken");
            return (Criteria) this;
        }

        public Criteria andRefreshTokenLike(String value) {
            addCriterion("refresh_token like", value, "refreshToken");
            return (Criteria) this;
        }

        public Criteria andRefreshTokenNotLike(String value) {
            addCriterion("refresh_token not like", value, "refreshToken");
            return (Criteria) this;
        }

        public Criteria andRefreshTokenIn(List<String> values) {
            addCriterion("refresh_token in", values, "refreshToken");
            return (Criteria) this;
        }

        public Criteria andRefreshTokenNotIn(List<String> values) {
            addCriterion("refresh_token not in", values, "refreshToken");
            return (Criteria) this;
        }

        public Criteria andRefreshTokenBetween(String value1, String value2) {
            addCriterion("refresh_token between", value1, value2, "refreshToken");
            return (Criteria) this;
        }

        public Criteria andRefreshTokenNotBetween(String value1, String value2) {
            addCriterion("refresh_token not between", value1, value2, "refreshToken");
            return (Criteria) this;
        }

        public Criteria andUserIdIsNull() {
            addCriterion("user_id is null");
            return (Criteria) this;
        }

        public Criteria andUserIdIsNotNull() {
            addCriterion("user_id is not null");
            return (Criteria) this;
        }

        public Criteria andUserIdEqualTo(Long value) {
            addCriterion("user_id =", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdNotEqualTo(Long value) {
            addCriterion("user_id <>", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdGreaterThan(Long value) {
            addCriterion("user_id >", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdGreaterThanOrEqualTo(Long value) {
            addCriterion("user_id >=", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdLessThan(Long value) {
            addCriterion("user_id <", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdLessThanOrEqualTo(Long value) {
            addCriterion("user_id <=", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdIn(List<Long> values) {
            addCriterion("user_id in", values, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdNotIn(List<Long> values) {
            addCriterion("user_id not in", values, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdBetween(Long value1, Long value2) {
            addCriterion("user_id between", value1, value2, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdNotBetween(Long value1, Long value2) {
            addCriterion("user_id not between", value1, value2, "userId");
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