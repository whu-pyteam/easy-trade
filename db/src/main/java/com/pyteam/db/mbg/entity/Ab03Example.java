package com.pyteam.db.mbg.entity;

import java.util.ArrayList;
import java.util.List;

public class Ab03Example {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public Ab03Example() {
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

        public Criteria andAab301IsNull() {
            addCriterion("aab301 is null");
            return (Criteria) this;
        }

        public Criteria andAab301IsNotNull() {
            addCriterion("aab301 is not null");
            return (Criteria) this;
        }

        public Criteria andAab301EqualTo(Integer value) {
            addCriterion("aab301 =", value, "aab301");
            return (Criteria) this;
        }

        public Criteria andAab301NotEqualTo(Integer value) {
            addCriterion("aab301 <>", value, "aab301");
            return (Criteria) this;
        }

        public Criteria andAab301GreaterThan(Integer value) {
            addCriterion("aab301 >", value, "aab301");
            return (Criteria) this;
        }

        public Criteria andAab301GreaterThanOrEqualTo(Integer value) {
            addCriterion("aab301 >=", value, "aab301");
            return (Criteria) this;
        }

        public Criteria andAab301LessThan(Integer value) {
            addCriterion("aab301 <", value, "aab301");
            return (Criteria) this;
        }

        public Criteria andAab301LessThanOrEqualTo(Integer value) {
            addCriterion("aab301 <=", value, "aab301");
            return (Criteria) this;
        }

        public Criteria andAab301In(List<Integer> values) {
            addCriterion("aab301 in", values, "aab301");
            return (Criteria) this;
        }

        public Criteria andAab301NotIn(List<Integer> values) {
            addCriterion("aab301 not in", values, "aab301");
            return (Criteria) this;
        }

        public Criteria andAab301Between(Integer value1, Integer value2) {
            addCriterion("aab301 between", value1, value2, "aab301");
            return (Criteria) this;
        }

        public Criteria andAab301NotBetween(Integer value1, Integer value2) {
            addCriterion("aab301 not between", value1, value2, "aab301");
            return (Criteria) this;
        }

        public Criteria andAab101IsNull() {
            addCriterion("aab101 is null");
            return (Criteria) this;
        }

        public Criteria andAab101IsNotNull() {
            addCriterion("aab101 is not null");
            return (Criteria) this;
        }

        public Criteria andAab101EqualTo(Integer value) {
            addCriterion("aab101 =", value, "aab101");
            return (Criteria) this;
        }

        public Criteria andAab101NotEqualTo(Integer value) {
            addCriterion("aab101 <>", value, "aab101");
            return (Criteria) this;
        }

        public Criteria andAab101GreaterThan(Integer value) {
            addCriterion("aab101 >", value, "aab101");
            return (Criteria) this;
        }

        public Criteria andAab101GreaterThanOrEqualTo(Integer value) {
            addCriterion("aab101 >=", value, "aab101");
            return (Criteria) this;
        }

        public Criteria andAab101LessThan(Integer value) {
            addCriterion("aab101 <", value, "aab101");
            return (Criteria) this;
        }

        public Criteria andAab101LessThanOrEqualTo(Integer value) {
            addCriterion("aab101 <=", value, "aab101");
            return (Criteria) this;
        }

        public Criteria andAab101In(List<Integer> values) {
            addCriterion("aab101 in", values, "aab101");
            return (Criteria) this;
        }

        public Criteria andAab101NotIn(List<Integer> values) {
            addCriterion("aab101 not in", values, "aab101");
            return (Criteria) this;
        }

        public Criteria andAab101Between(Integer value1, Integer value2) {
            addCriterion("aab101 between", value1, value2, "aab101");
            return (Criteria) this;
        }

        public Criteria andAab101NotBetween(Integer value1, Integer value2) {
            addCriterion("aab101 not between", value1, value2, "aab101");
            return (Criteria) this;
        }

        public Criteria andAab302IsNull() {
            addCriterion("aab302 is null");
            return (Criteria) this;
        }

        public Criteria andAab302IsNotNull() {
            addCriterion("aab302 is not null");
            return (Criteria) this;
        }

        public Criteria andAab302EqualTo(String value) {
            addCriterion("aab302 =", value, "aab302");
            return (Criteria) this;
        }

        public Criteria andAab302NotEqualTo(String value) {
            addCriterion("aab302 <>", value, "aab302");
            return (Criteria) this;
        }

        public Criteria andAab302GreaterThan(String value) {
            addCriterion("aab302 >", value, "aab302");
            return (Criteria) this;
        }

        public Criteria andAab302GreaterThanOrEqualTo(String value) {
            addCriterion("aab302 >=", value, "aab302");
            return (Criteria) this;
        }

        public Criteria andAab302LessThan(String value) {
            addCriterion("aab302 <", value, "aab302");
            return (Criteria) this;
        }

        public Criteria andAab302LessThanOrEqualTo(String value) {
            addCriterion("aab302 <=", value, "aab302");
            return (Criteria) this;
        }

        public Criteria andAab302Like(String value) {
            addCriterion("aab302 like", value, "aab302");
            return (Criteria) this;
        }

        public Criteria andAab302NotLike(String value) {
            addCriterion("aab302 not like", value, "aab302");
            return (Criteria) this;
        }

        public Criteria andAab302In(List<String> values) {
            addCriterion("aab302 in", values, "aab302");
            return (Criteria) this;
        }

        public Criteria andAab302NotIn(List<String> values) {
            addCriterion("aab302 not in", values, "aab302");
            return (Criteria) this;
        }

        public Criteria andAab302Between(String value1, String value2) {
            addCriterion("aab302 between", value1, value2, "aab302");
            return (Criteria) this;
        }

        public Criteria andAab302NotBetween(String value1, String value2) {
            addCriterion("aab302 not between", value1, value2, "aab302");
            return (Criteria) this;
        }

        public Criteria andAab303IsNull() {
            addCriterion("aab303 is null");
            return (Criteria) this;
        }

        public Criteria andAab303IsNotNull() {
            addCriterion("aab303 is not null");
            return (Criteria) this;
        }

        public Criteria andAab303EqualTo(String value) {
            addCriterion("aab303 =", value, "aab303");
            return (Criteria) this;
        }

        public Criteria andAab303NotEqualTo(String value) {
            addCriterion("aab303 <>", value, "aab303");
            return (Criteria) this;
        }

        public Criteria andAab303GreaterThan(String value) {
            addCriterion("aab303 >", value, "aab303");
            return (Criteria) this;
        }

        public Criteria andAab303GreaterThanOrEqualTo(String value) {
            addCriterion("aab303 >=", value, "aab303");
            return (Criteria) this;
        }

        public Criteria andAab303LessThan(String value) {
            addCriterion("aab303 <", value, "aab303");
            return (Criteria) this;
        }

        public Criteria andAab303LessThanOrEqualTo(String value) {
            addCriterion("aab303 <=", value, "aab303");
            return (Criteria) this;
        }

        public Criteria andAab303Like(String value) {
            addCriterion("aab303 like", value, "aab303");
            return (Criteria) this;
        }

        public Criteria andAab303NotLike(String value) {
            addCriterion("aab303 not like", value, "aab303");
            return (Criteria) this;
        }

        public Criteria andAab303In(List<String> values) {
            addCriterion("aab303 in", values, "aab303");
            return (Criteria) this;
        }

        public Criteria andAab303NotIn(List<String> values) {
            addCriterion("aab303 not in", values, "aab303");
            return (Criteria) this;
        }

        public Criteria andAab303Between(String value1, String value2) {
            addCriterion("aab303 between", value1, value2, "aab303");
            return (Criteria) this;
        }

        public Criteria andAab303NotBetween(String value1, String value2) {
            addCriterion("aab303 not between", value1, value2, "aab303");
            return (Criteria) this;
        }

        public Criteria andAab304IsNull() {
            addCriterion("aab304 is null");
            return (Criteria) this;
        }

        public Criteria andAab304IsNotNull() {
            addCriterion("aab304 is not null");
            return (Criteria) this;
        }

        public Criteria andAab304EqualTo(Integer value) {
            addCriterion("aab304 =", value, "aab304");
            return (Criteria) this;
        }

        public Criteria andAab304NotEqualTo(Integer value) {
            addCriterion("aab304 <>", value, "aab304");
            return (Criteria) this;
        }

        public Criteria andAab304GreaterThan(Integer value) {
            addCriterion("aab304 >", value, "aab304");
            return (Criteria) this;
        }

        public Criteria andAab304GreaterThanOrEqualTo(Integer value) {
            addCriterion("aab304 >=", value, "aab304");
            return (Criteria) this;
        }

        public Criteria andAab304LessThan(Integer value) {
            addCriterion("aab304 <", value, "aab304");
            return (Criteria) this;
        }

        public Criteria andAab304LessThanOrEqualTo(Integer value) {
            addCriterion("aab304 <=", value, "aab304");
            return (Criteria) this;
        }

        public Criteria andAab304In(List<Integer> values) {
            addCriterion("aab304 in", values, "aab304");
            return (Criteria) this;
        }

        public Criteria andAab304NotIn(List<Integer> values) {
            addCriterion("aab304 not in", values, "aab304");
            return (Criteria) this;
        }

        public Criteria andAab304Between(Integer value1, Integer value2) {
            addCriterion("aab304 between", value1, value2, "aab304");
            return (Criteria) this;
        }

        public Criteria andAab304NotBetween(Integer value1, Integer value2) {
            addCriterion("aab304 not between", value1, value2, "aab304");
            return (Criteria) this;
        }

        public Criteria andAab305IsNull() {
            addCriterion("aab305 is null");
            return (Criteria) this;
        }

        public Criteria andAab305IsNotNull() {
            addCriterion("aab305 is not null");
            return (Criteria) this;
        }

        public Criteria andAab305EqualTo(Integer value) {
            addCriterion("aab305 =", value, "aab305");
            return (Criteria) this;
        }

        public Criteria andAab305NotEqualTo(Integer value) {
            addCriterion("aab305 <>", value, "aab305");
            return (Criteria) this;
        }

        public Criteria andAab305GreaterThan(Integer value) {
            addCriterion("aab305 >", value, "aab305");
            return (Criteria) this;
        }

        public Criteria andAab305GreaterThanOrEqualTo(Integer value) {
            addCriterion("aab305 >=", value, "aab305");
            return (Criteria) this;
        }

        public Criteria andAab305LessThan(Integer value) {
            addCriterion("aab305 <", value, "aab305");
            return (Criteria) this;
        }

        public Criteria andAab305LessThanOrEqualTo(Integer value) {
            addCriterion("aab305 <=", value, "aab305");
            return (Criteria) this;
        }

        public Criteria andAab305In(List<Integer> values) {
            addCriterion("aab305 in", values, "aab305");
            return (Criteria) this;
        }

        public Criteria andAab305NotIn(List<Integer> values) {
            addCriterion("aab305 not in", values, "aab305");
            return (Criteria) this;
        }

        public Criteria andAab305Between(Integer value1, Integer value2) {
            addCriterion("aab305 between", value1, value2, "aab305");
            return (Criteria) this;
        }

        public Criteria andAab305NotBetween(Integer value1, Integer value2) {
            addCriterion("aab305 not between", value1, value2, "aab305");
            return (Criteria) this;
        }

        public Criteria andAab306IsNull() {
            addCriterion("aab306 is null");
            return (Criteria) this;
        }

        public Criteria andAab306IsNotNull() {
            addCriterion("aab306 is not null");
            return (Criteria) this;
        }

        public Criteria andAab306EqualTo(Integer value) {
            addCriterion("aab306 =", value, "aab306");
            return (Criteria) this;
        }

        public Criteria andAab306NotEqualTo(Integer value) {
            addCriterion("aab306 <>", value, "aab306");
            return (Criteria) this;
        }

        public Criteria andAab306GreaterThan(Integer value) {
            addCriterion("aab306 >", value, "aab306");
            return (Criteria) this;
        }

        public Criteria andAab306GreaterThanOrEqualTo(Integer value) {
            addCriterion("aab306 >=", value, "aab306");
            return (Criteria) this;
        }

        public Criteria andAab306LessThan(Integer value) {
            addCriterion("aab306 <", value, "aab306");
            return (Criteria) this;
        }

        public Criteria andAab306LessThanOrEqualTo(Integer value) {
            addCriterion("aab306 <=", value, "aab306");
            return (Criteria) this;
        }

        public Criteria andAab306In(List<Integer> values) {
            addCriterion("aab306 in", values, "aab306");
            return (Criteria) this;
        }

        public Criteria andAab306NotIn(List<Integer> values) {
            addCriterion("aab306 not in", values, "aab306");
            return (Criteria) this;
        }

        public Criteria andAab306Between(Integer value1, Integer value2) {
            addCriterion("aab306 between", value1, value2, "aab306");
            return (Criteria) this;
        }

        public Criteria andAab306NotBetween(Integer value1, Integer value2) {
            addCriterion("aab306 not between", value1, value2, "aab306");
            return (Criteria) this;
        }

        public Criteria andAab307IsNull() {
            addCriterion("aab307 is null");
            return (Criteria) this;
        }

        public Criteria andAab307IsNotNull() {
            addCriterion("aab307 is not null");
            return (Criteria) this;
        }

        public Criteria andAab307EqualTo(String value) {
            addCriterion("aab307 =", value, "aab307");
            return (Criteria) this;
        }

        public Criteria andAab307NotEqualTo(String value) {
            addCriterion("aab307 <>", value, "aab307");
            return (Criteria) this;
        }

        public Criteria andAab307GreaterThan(String value) {
            addCriterion("aab307 >", value, "aab307");
            return (Criteria) this;
        }

        public Criteria andAab307GreaterThanOrEqualTo(String value) {
            addCriterion("aab307 >=", value, "aab307");
            return (Criteria) this;
        }

        public Criteria andAab307LessThan(String value) {
            addCriterion("aab307 <", value, "aab307");
            return (Criteria) this;
        }

        public Criteria andAab307LessThanOrEqualTo(String value) {
            addCriterion("aab307 <=", value, "aab307");
            return (Criteria) this;
        }

        public Criteria andAab307Like(String value) {
            addCriterion("aab307 like", value, "aab307");
            return (Criteria) this;
        }

        public Criteria andAab307NotLike(String value) {
            addCriterion("aab307 not like", value, "aab307");
            return (Criteria) this;
        }

        public Criteria andAab307In(List<String> values) {
            addCriterion("aab307 in", values, "aab307");
            return (Criteria) this;
        }

        public Criteria andAab307NotIn(List<String> values) {
            addCriterion("aab307 not in", values, "aab307");
            return (Criteria) this;
        }

        public Criteria andAab307Between(String value1, String value2) {
            addCriterion("aab307 between", value1, value2, "aab307");
            return (Criteria) this;
        }

        public Criteria andAab307NotBetween(String value1, String value2) {
            addCriterion("aab307 not between", value1, value2, "aab307");
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