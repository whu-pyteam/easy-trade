package com.pyteam.db.mbg.entity;

import java.util.ArrayList;
import java.util.List;

public class Ad04Example {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public Ad04Example() {
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

        public Criteria andAad402IsNull() {
            addCriterion("aad402 is null");
            return (Criteria) this;
        }

        public Criteria andAad402IsNotNull() {
            addCriterion("aad402 is not null");
            return (Criteria) this;
        }

        public Criteria andAad402EqualTo(String value) {
            addCriterion("aad402 =", value, "aad402");
            return (Criteria) this;
        }

        public Criteria andAad402NotEqualTo(String value) {
            addCriterion("aad402 <>", value, "aad402");
            return (Criteria) this;
        }

        public Criteria andAad402GreaterThan(String value) {
            addCriterion("aad402 >", value, "aad402");
            return (Criteria) this;
        }

        public Criteria andAad402GreaterThanOrEqualTo(String value) {
            addCriterion("aad402 >=", value, "aad402");
            return (Criteria) this;
        }

        public Criteria andAad402LessThan(String value) {
            addCriterion("aad402 <", value, "aad402");
            return (Criteria) this;
        }

        public Criteria andAad402LessThanOrEqualTo(String value) {
            addCriterion("aad402 <=", value, "aad402");
            return (Criteria) this;
        }

        public Criteria andAad402Like(String value) {
            addCriterion("aad402 like", value, "aad402");
            return (Criteria) this;
        }

        public Criteria andAad402NotLike(String value) {
            addCriterion("aad402 not like", value, "aad402");
            return (Criteria) this;
        }

        public Criteria andAad402In(List<String> values) {
            addCriterion("aad402 in", values, "aad402");
            return (Criteria) this;
        }

        public Criteria andAad402NotIn(List<String> values) {
            addCriterion("aad402 not in", values, "aad402");
            return (Criteria) this;
        }

        public Criteria andAad402Between(String value1, String value2) {
            addCriterion("aad402 between", value1, value2, "aad402");
            return (Criteria) this;
        }

        public Criteria andAad402NotBetween(String value1, String value2) {
            addCriterion("aad402 not between", value1, value2, "aad402");
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