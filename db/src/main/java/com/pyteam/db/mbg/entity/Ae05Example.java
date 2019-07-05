package com.pyteam.db.mbg.entity;

import java.util.ArrayList;
import java.util.List;

public class Ae05Example {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public Ae05Example() {
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

        public Criteria andAae501IsNull() {
            addCriterion("aae501 is null");
            return (Criteria) this;
        }

        public Criteria andAae501IsNotNull() {
            addCriterion("aae501 is not null");
            return (Criteria) this;
        }

        public Criteria andAae501EqualTo(Integer value) {
            addCriterion("aae501 =", value, "aae501");
            return (Criteria) this;
        }

        public Criteria andAae501NotEqualTo(Integer value) {
            addCriterion("aae501 <>", value, "aae501");
            return (Criteria) this;
        }

        public Criteria andAae501GreaterThan(Integer value) {
            addCriterion("aae501 >", value, "aae501");
            return (Criteria) this;
        }

        public Criteria andAae501GreaterThanOrEqualTo(Integer value) {
            addCriterion("aae501 >=", value, "aae501");
            return (Criteria) this;
        }

        public Criteria andAae501LessThan(Integer value) {
            addCriterion("aae501 <", value, "aae501");
            return (Criteria) this;
        }

        public Criteria andAae501LessThanOrEqualTo(Integer value) {
            addCriterion("aae501 <=", value, "aae501");
            return (Criteria) this;
        }

        public Criteria andAae501In(List<Integer> values) {
            addCriterion("aae501 in", values, "aae501");
            return (Criteria) this;
        }

        public Criteria andAae501NotIn(List<Integer> values) {
            addCriterion("aae501 not in", values, "aae501");
            return (Criteria) this;
        }

        public Criteria andAae501Between(Integer value1, Integer value2) {
            addCriterion("aae501 between", value1, value2, "aae501");
            return (Criteria) this;
        }

        public Criteria andAae501NotBetween(Integer value1, Integer value2) {
            addCriterion("aae501 not between", value1, value2, "aae501");
            return (Criteria) this;
        }

        public Criteria andAad401IsNull() {
            addCriterion("aad401 is null");
            return (Criteria) this;
        }

        public Criteria andAad401IsNotNull() {
            addCriterion("aad401 is not null");
            return (Criteria) this;
        }

        public Criteria andAad401EqualTo(Integer value) {
            addCriterion("aad401 =", value, "aad401");
            return (Criteria) this;
        }

        public Criteria andAad401NotEqualTo(Integer value) {
            addCriterion("aad401 <>", value, "aad401");
            return (Criteria) this;
        }

        public Criteria andAad401GreaterThan(Integer value) {
            addCriterion("aad401 >", value, "aad401");
            return (Criteria) this;
        }

        public Criteria andAad401GreaterThanOrEqualTo(Integer value) {
            addCriterion("aad401 >=", value, "aad401");
            return (Criteria) this;
        }

        public Criteria andAad401LessThan(Integer value) {
            addCriterion("aad401 <", value, "aad401");
            return (Criteria) this;
        }

        public Criteria andAad401LessThanOrEqualTo(Integer value) {
            addCriterion("aad401 <=", value, "aad401");
            return (Criteria) this;
        }

        public Criteria andAad401In(List<Integer> values) {
            addCriterion("aad401 in", values, "aad401");
            return (Criteria) this;
        }

        public Criteria andAad401NotIn(List<Integer> values) {
            addCriterion("aad401 not in", values, "aad401");
            return (Criteria) this;
        }

        public Criteria andAad401Between(Integer value1, Integer value2) {
            addCriterion("aad401 between", value1, value2, "aad401");
            return (Criteria) this;
        }

        public Criteria andAad401NotBetween(Integer value1, Integer value2) {
            addCriterion("aad401 not between", value1, value2, "aad401");
            return (Criteria) this;
        }

        public Criteria andAad201IsNull() {
            addCriterion("aad201 is null");
            return (Criteria) this;
        }

        public Criteria andAad201IsNotNull() {
            addCriterion("aad201 is not null");
            return (Criteria) this;
        }

        public Criteria andAad201EqualTo(Integer value) {
            addCriterion("aad201 =", value, "aad201");
            return (Criteria) this;
        }

        public Criteria andAad201NotEqualTo(Integer value) {
            addCriterion("aad201 <>", value, "aad201");
            return (Criteria) this;
        }

        public Criteria andAad201GreaterThan(Integer value) {
            addCriterion("aad201 >", value, "aad201");
            return (Criteria) this;
        }

        public Criteria andAad201GreaterThanOrEqualTo(Integer value) {
            addCriterion("aad201 >=", value, "aad201");
            return (Criteria) this;
        }

        public Criteria andAad201LessThan(Integer value) {
            addCriterion("aad201 <", value, "aad201");
            return (Criteria) this;
        }

        public Criteria andAad201LessThanOrEqualTo(Integer value) {
            addCriterion("aad201 <=", value, "aad201");
            return (Criteria) this;
        }

        public Criteria andAad201In(List<Integer> values) {
            addCriterion("aad201 in", values, "aad201");
            return (Criteria) this;
        }

        public Criteria andAad201NotIn(List<Integer> values) {
            addCriterion("aad201 not in", values, "aad201");
            return (Criteria) this;
        }

        public Criteria andAad201Between(Integer value1, Integer value2) {
            addCriterion("aad201 between", value1, value2, "aad201");
            return (Criteria) this;
        }

        public Criteria andAad201NotBetween(Integer value1, Integer value2) {
            addCriterion("aad201 not between", value1, value2, "aad201");
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