package com.pyteam.db.mbg.entity;

import java.util.ArrayList;
import java.util.List;

public class Ad03Example {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public Ad03Example() {
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

        public Criteria andAad301IsNull() {
            addCriterion("aad301 is null");
            return (Criteria) this;
        }

        public Criteria andAad301IsNotNull() {
            addCriterion("aad301 is not null");
            return (Criteria) this;
        }

        public Criteria andAad301EqualTo(Integer value) {
            addCriterion("aad301 =", value, "aad301");
            return (Criteria) this;
        }

        public Criteria andAad301NotEqualTo(Integer value) {
            addCriterion("aad301 <>", value, "aad301");
            return (Criteria) this;
        }

        public Criteria andAad301GreaterThan(Integer value) {
            addCriterion("aad301 >", value, "aad301");
            return (Criteria) this;
        }

        public Criteria andAad301GreaterThanOrEqualTo(Integer value) {
            addCriterion("aad301 >=", value, "aad301");
            return (Criteria) this;
        }

        public Criteria andAad301LessThan(Integer value) {
            addCriterion("aad301 <", value, "aad301");
            return (Criteria) this;
        }

        public Criteria andAad301LessThanOrEqualTo(Integer value) {
            addCriterion("aad301 <=", value, "aad301");
            return (Criteria) this;
        }

        public Criteria andAad301In(List<Integer> values) {
            addCriterion("aad301 in", values, "aad301");
            return (Criteria) this;
        }

        public Criteria andAad301NotIn(List<Integer> values) {
            addCriterion("aad301 not in", values, "aad301");
            return (Criteria) this;
        }

        public Criteria andAad301Between(Integer value1, Integer value2) {
            addCriterion("aad301 between", value1, value2, "aad301");
            return (Criteria) this;
        }

        public Criteria andAad301NotBetween(Integer value1, Integer value2) {
            addCriterion("aad301 not between", value1, value2, "aad301");
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

        public Criteria andAad302IsNull() {
            addCriterion("aad302 is null");
            return (Criteria) this;
        }

        public Criteria andAad302IsNotNull() {
            addCriterion("aad302 is not null");
            return (Criteria) this;
        }

        public Criteria andAad302EqualTo(String value) {
            addCriterion("aad302 =", value, "aad302");
            return (Criteria) this;
        }

        public Criteria andAad302NotEqualTo(String value) {
            addCriterion("aad302 <>", value, "aad302");
            return (Criteria) this;
        }

        public Criteria andAad302GreaterThan(String value) {
            addCriterion("aad302 >", value, "aad302");
            return (Criteria) this;
        }

        public Criteria andAad302GreaterThanOrEqualTo(String value) {
            addCriterion("aad302 >=", value, "aad302");
            return (Criteria) this;
        }

        public Criteria andAad302LessThan(String value) {
            addCriterion("aad302 <", value, "aad302");
            return (Criteria) this;
        }

        public Criteria andAad302LessThanOrEqualTo(String value) {
            addCriterion("aad302 <=", value, "aad302");
            return (Criteria) this;
        }

        public Criteria andAad302Like(String value) {
            addCriterion("aad302 like", value, "aad302");
            return (Criteria) this;
        }

        public Criteria andAad302NotLike(String value) {
            addCriterion("aad302 not like", value, "aad302");
            return (Criteria) this;
        }

        public Criteria andAad302In(List<String> values) {
            addCriterion("aad302 in", values, "aad302");
            return (Criteria) this;
        }

        public Criteria andAad302NotIn(List<String> values) {
            addCriterion("aad302 not in", values, "aad302");
            return (Criteria) this;
        }

        public Criteria andAad302Between(String value1, String value2) {
            addCriterion("aad302 between", value1, value2, "aad302");
            return (Criteria) this;
        }

        public Criteria andAad302NotBetween(String value1, String value2) {
            addCriterion("aad302 not between", value1, value2, "aad302");
            return (Criteria) this;
        }

        public Criteria andAad303IsNull() {
            addCriterion("aad303 is null");
            return (Criteria) this;
        }

        public Criteria andAad303IsNotNull() {
            addCriterion("aad303 is not null");
            return (Criteria) this;
        }

        public Criteria andAad303EqualTo(String value) {
            addCriterion("aad303 =", value, "aad303");
            return (Criteria) this;
        }

        public Criteria andAad303NotEqualTo(String value) {
            addCriterion("aad303 <>", value, "aad303");
            return (Criteria) this;
        }

        public Criteria andAad303GreaterThan(String value) {
            addCriterion("aad303 >", value, "aad303");
            return (Criteria) this;
        }

        public Criteria andAad303GreaterThanOrEqualTo(String value) {
            addCriterion("aad303 >=", value, "aad303");
            return (Criteria) this;
        }

        public Criteria andAad303LessThan(String value) {
            addCriterion("aad303 <", value, "aad303");
            return (Criteria) this;
        }

        public Criteria andAad303LessThanOrEqualTo(String value) {
            addCriterion("aad303 <=", value, "aad303");
            return (Criteria) this;
        }

        public Criteria andAad303Like(String value) {
            addCriterion("aad303 like", value, "aad303");
            return (Criteria) this;
        }

        public Criteria andAad303NotLike(String value) {
            addCriterion("aad303 not like", value, "aad303");
            return (Criteria) this;
        }

        public Criteria andAad303In(List<String> values) {
            addCriterion("aad303 in", values, "aad303");
            return (Criteria) this;
        }

        public Criteria andAad303NotIn(List<String> values) {
            addCriterion("aad303 not in", values, "aad303");
            return (Criteria) this;
        }

        public Criteria andAad303Between(String value1, String value2) {
            addCriterion("aad303 between", value1, value2, "aad303");
            return (Criteria) this;
        }

        public Criteria andAad303NotBetween(String value1, String value2) {
            addCriterion("aad303 not between", value1, value2, "aad303");
            return (Criteria) this;
        }

        public Criteria andAad304IsNull() {
            addCriterion("aad304 is null");
            return (Criteria) this;
        }

        public Criteria andAad304IsNotNull() {
            addCriterion("aad304 is not null");
            return (Criteria) this;
        }

        public Criteria andAad304EqualTo(String value) {
            addCriterion("aad304 =", value, "aad304");
            return (Criteria) this;
        }

        public Criteria andAad304NotEqualTo(String value) {
            addCriterion("aad304 <>", value, "aad304");
            return (Criteria) this;
        }

        public Criteria andAad304GreaterThan(String value) {
            addCriterion("aad304 >", value, "aad304");
            return (Criteria) this;
        }

        public Criteria andAad304GreaterThanOrEqualTo(String value) {
            addCriterion("aad304 >=", value, "aad304");
            return (Criteria) this;
        }

        public Criteria andAad304LessThan(String value) {
            addCriterion("aad304 <", value, "aad304");
            return (Criteria) this;
        }

        public Criteria andAad304LessThanOrEqualTo(String value) {
            addCriterion("aad304 <=", value, "aad304");
            return (Criteria) this;
        }

        public Criteria andAad304Like(String value) {
            addCriterion("aad304 like", value, "aad304");
            return (Criteria) this;
        }

        public Criteria andAad304NotLike(String value) {
            addCriterion("aad304 not like", value, "aad304");
            return (Criteria) this;
        }

        public Criteria andAad304In(List<String> values) {
            addCriterion("aad304 in", values, "aad304");
            return (Criteria) this;
        }

        public Criteria andAad304NotIn(List<String> values) {
            addCriterion("aad304 not in", values, "aad304");
            return (Criteria) this;
        }

        public Criteria andAad304Between(String value1, String value2) {
            addCriterion("aad304 between", value1, value2, "aad304");
            return (Criteria) this;
        }

        public Criteria andAad304NotBetween(String value1, String value2) {
            addCriterion("aad304 not between", value1, value2, "aad304");
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