package com.pyteam.db.mbg.entity;

import java.util.ArrayList;
import java.util.List;

public class Af03Example {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public Af03Example() {
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

        public Criteria andAaf301IsNull() {
            addCriterion("aaf301 is null");
            return (Criteria) this;
        }

        public Criteria andAaf301IsNotNull() {
            addCriterion("aaf301 is not null");
            return (Criteria) this;
        }

        public Criteria andAaf301EqualTo(Integer value) {
            addCriterion("aaf301 =", value, "aaf301");
            return (Criteria) this;
        }

        public Criteria andAaf301NotEqualTo(Integer value) {
            addCriterion("aaf301 <>", value, "aaf301");
            return (Criteria) this;
        }

        public Criteria andAaf301GreaterThan(Integer value) {
            addCriterion("aaf301 >", value, "aaf301");
            return (Criteria) this;
        }

        public Criteria andAaf301GreaterThanOrEqualTo(Integer value) {
            addCriterion("aaf301 >=", value, "aaf301");
            return (Criteria) this;
        }

        public Criteria andAaf301LessThan(Integer value) {
            addCriterion("aaf301 <", value, "aaf301");
            return (Criteria) this;
        }

        public Criteria andAaf301LessThanOrEqualTo(Integer value) {
            addCriterion("aaf301 <=", value, "aaf301");
            return (Criteria) this;
        }

        public Criteria andAaf301In(List<Integer> values) {
            addCriterion("aaf301 in", values, "aaf301");
            return (Criteria) this;
        }

        public Criteria andAaf301NotIn(List<Integer> values) {
            addCriterion("aaf301 not in", values, "aaf301");
            return (Criteria) this;
        }

        public Criteria andAaf301Between(Integer value1, Integer value2) {
            addCriterion("aaf301 between", value1, value2, "aaf301");
            return (Criteria) this;
        }

        public Criteria andAaf301NotBetween(Integer value1, Integer value2) {
            addCriterion("aaf301 not between", value1, value2, "aaf301");
            return (Criteria) this;
        }

        public Criteria andAaf401IsNull() {
            addCriterion("aaf401 is null");
            return (Criteria) this;
        }

        public Criteria andAaf401IsNotNull() {
            addCriterion("aaf401 is not null");
            return (Criteria) this;
        }

        public Criteria andAaf401EqualTo(Integer value) {
            addCriterion("aaf401 =", value, "aaf401");
            return (Criteria) this;
        }

        public Criteria andAaf401NotEqualTo(Integer value) {
            addCriterion("aaf401 <>", value, "aaf401");
            return (Criteria) this;
        }

        public Criteria andAaf401GreaterThan(Integer value) {
            addCriterion("aaf401 >", value, "aaf401");
            return (Criteria) this;
        }

        public Criteria andAaf401GreaterThanOrEqualTo(Integer value) {
            addCriterion("aaf401 >=", value, "aaf401");
            return (Criteria) this;
        }

        public Criteria andAaf401LessThan(Integer value) {
            addCriterion("aaf401 <", value, "aaf401");
            return (Criteria) this;
        }

        public Criteria andAaf401LessThanOrEqualTo(Integer value) {
            addCriterion("aaf401 <=", value, "aaf401");
            return (Criteria) this;
        }

        public Criteria andAaf401In(List<Integer> values) {
            addCriterion("aaf401 in", values, "aaf401");
            return (Criteria) this;
        }

        public Criteria andAaf401NotIn(List<Integer> values) {
            addCriterion("aaf401 not in", values, "aaf401");
            return (Criteria) this;
        }

        public Criteria andAaf401Between(Integer value1, Integer value2) {
            addCriterion("aaf401 between", value1, value2, "aaf401");
            return (Criteria) this;
        }

        public Criteria andAaf401NotBetween(Integer value1, Integer value2) {
            addCriterion("aaf401 not between", value1, value2, "aaf401");
            return (Criteria) this;
        }

        public Criteria andAaf201IsNull() {
            addCriterion("aaf201 is null");
            return (Criteria) this;
        }

        public Criteria andAaf201IsNotNull() {
            addCriterion("aaf201 is not null");
            return (Criteria) this;
        }

        public Criteria andAaf201EqualTo(Integer value) {
            addCriterion("aaf201 =", value, "aaf201");
            return (Criteria) this;
        }

        public Criteria andAaf201NotEqualTo(Integer value) {
            addCriterion("aaf201 <>", value, "aaf201");
            return (Criteria) this;
        }

        public Criteria andAaf201GreaterThan(Integer value) {
            addCriterion("aaf201 >", value, "aaf201");
            return (Criteria) this;
        }

        public Criteria andAaf201GreaterThanOrEqualTo(Integer value) {
            addCriterion("aaf201 >=", value, "aaf201");
            return (Criteria) this;
        }

        public Criteria andAaf201LessThan(Integer value) {
            addCriterion("aaf201 <", value, "aaf201");
            return (Criteria) this;
        }

        public Criteria andAaf201LessThanOrEqualTo(Integer value) {
            addCriterion("aaf201 <=", value, "aaf201");
            return (Criteria) this;
        }

        public Criteria andAaf201In(List<Integer> values) {
            addCriterion("aaf201 in", values, "aaf201");
            return (Criteria) this;
        }

        public Criteria andAaf201NotIn(List<Integer> values) {
            addCriterion("aaf201 not in", values, "aaf201");
            return (Criteria) this;
        }

        public Criteria andAaf201Between(Integer value1, Integer value2) {
            addCriterion("aaf201 between", value1, value2, "aaf201");
            return (Criteria) this;
        }

        public Criteria andAaf201NotBetween(Integer value1, Integer value2) {
            addCriterion("aaf201 not between", value1, value2, "aaf201");
            return (Criteria) this;
        }

        public Criteria andAaf302IsNull() {
            addCriterion("aaf302 is null");
            return (Criteria) this;
        }

        public Criteria andAaf302IsNotNull() {
            addCriterion("aaf302 is not null");
            return (Criteria) this;
        }

        public Criteria andAaf302EqualTo(String value) {
            addCriterion("aaf302 =", value, "aaf302");
            return (Criteria) this;
        }

        public Criteria andAaf302NotEqualTo(String value) {
            addCriterion("aaf302 <>", value, "aaf302");
            return (Criteria) this;
        }

        public Criteria andAaf302GreaterThan(String value) {
            addCriterion("aaf302 >", value, "aaf302");
            return (Criteria) this;
        }

        public Criteria andAaf302GreaterThanOrEqualTo(String value) {
            addCriterion("aaf302 >=", value, "aaf302");
            return (Criteria) this;
        }

        public Criteria andAaf302LessThan(String value) {
            addCriterion("aaf302 <", value, "aaf302");
            return (Criteria) this;
        }

        public Criteria andAaf302LessThanOrEqualTo(String value) {
            addCriterion("aaf302 <=", value, "aaf302");
            return (Criteria) this;
        }

        public Criteria andAaf302Like(String value) {
            addCriterion("aaf302 like", value, "aaf302");
            return (Criteria) this;
        }

        public Criteria andAaf302NotLike(String value) {
            addCriterion("aaf302 not like", value, "aaf302");
            return (Criteria) this;
        }

        public Criteria andAaf302In(List<String> values) {
            addCriterion("aaf302 in", values, "aaf302");
            return (Criteria) this;
        }

        public Criteria andAaf302NotIn(List<String> values) {
            addCriterion("aaf302 not in", values, "aaf302");
            return (Criteria) this;
        }

        public Criteria andAaf302Between(String value1, String value2) {
            addCriterion("aaf302 between", value1, value2, "aaf302");
            return (Criteria) this;
        }

        public Criteria andAaf302NotBetween(String value1, String value2) {
            addCriterion("aaf302 not between", value1, value2, "aaf302");
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