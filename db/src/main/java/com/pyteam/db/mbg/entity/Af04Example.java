package com.pyteam.db.mbg.entity;

import java.util.ArrayList;
import java.util.List;

public class Af04Example {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public Af04Example() {
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

        public Criteria andAaf402IsNull() {
            addCriterion("aaf402 is null");
            return (Criteria) this;
        }

        public Criteria andAaf402IsNotNull() {
            addCriterion("aaf402 is not null");
            return (Criteria) this;
        }

        public Criteria andAaf402EqualTo(String value) {
            addCriterion("aaf402 =", value, "aaf402");
            return (Criteria) this;
        }

        public Criteria andAaf402NotEqualTo(String value) {
            addCriterion("aaf402 <>", value, "aaf402");
            return (Criteria) this;
        }

        public Criteria andAaf402GreaterThan(String value) {
            addCriterion("aaf402 >", value, "aaf402");
            return (Criteria) this;
        }

        public Criteria andAaf402GreaterThanOrEqualTo(String value) {
            addCriterion("aaf402 >=", value, "aaf402");
            return (Criteria) this;
        }

        public Criteria andAaf402LessThan(String value) {
            addCriterion("aaf402 <", value, "aaf402");
            return (Criteria) this;
        }

        public Criteria andAaf402LessThanOrEqualTo(String value) {
            addCriterion("aaf402 <=", value, "aaf402");
            return (Criteria) this;
        }

        public Criteria andAaf402Like(String value) {
            addCriterion("aaf402 like", value, "aaf402");
            return (Criteria) this;
        }

        public Criteria andAaf402NotLike(String value) {
            addCriterion("aaf402 not like", value, "aaf402");
            return (Criteria) this;
        }

        public Criteria andAaf402In(List<String> values) {
            addCriterion("aaf402 in", values, "aaf402");
            return (Criteria) this;
        }

        public Criteria andAaf402NotIn(List<String> values) {
            addCriterion("aaf402 not in", values, "aaf402");
            return (Criteria) this;
        }

        public Criteria andAaf402Between(String value1, String value2) {
            addCriterion("aaf402 between", value1, value2, "aaf402");
            return (Criteria) this;
        }

        public Criteria andAaf402NotBetween(String value1, String value2) {
            addCriterion("aaf402 not between", value1, value2, "aaf402");
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