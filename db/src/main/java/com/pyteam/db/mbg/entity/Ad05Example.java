package com.pyteam.db.mbg.entity;

import java.util.ArrayList;
import java.util.List;

public class Ad05Example {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public Ad05Example() {
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

        public Criteria andAad501IsNull() {
            addCriterion("aad501 is null");
            return (Criteria) this;
        }

        public Criteria andAad501IsNotNull() {
            addCriterion("aad501 is not null");
            return (Criteria) this;
        }

        public Criteria andAad501EqualTo(Integer value) {
            addCriterion("aad501 =", value, "aad501");
            return (Criteria) this;
        }

        public Criteria andAad501NotEqualTo(Integer value) {
            addCriterion("aad501 <>", value, "aad501");
            return (Criteria) this;
        }

        public Criteria andAad501GreaterThan(Integer value) {
            addCriterion("aad501 >", value, "aad501");
            return (Criteria) this;
        }

        public Criteria andAad501GreaterThanOrEqualTo(Integer value) {
            addCriterion("aad501 >=", value, "aad501");
            return (Criteria) this;
        }

        public Criteria andAad501LessThan(Integer value) {
            addCriterion("aad501 <", value, "aad501");
            return (Criteria) this;
        }

        public Criteria andAad501LessThanOrEqualTo(Integer value) {
            addCriterion("aad501 <=", value, "aad501");
            return (Criteria) this;
        }

        public Criteria andAad501In(List<Integer> values) {
            addCriterion("aad501 in", values, "aad501");
            return (Criteria) this;
        }

        public Criteria andAad501NotIn(List<Integer> values) {
            addCriterion("aad501 not in", values, "aad501");
            return (Criteria) this;
        }

        public Criteria andAad501Between(Integer value1, Integer value2) {
            addCriterion("aad501 between", value1, value2, "aad501");
            return (Criteria) this;
        }

        public Criteria andAad501NotBetween(Integer value1, Integer value2) {
            addCriterion("aad501 not between", value1, value2, "aad501");
            return (Criteria) this;
        }

        public Criteria andAad101IsNull() {
            addCriterion("aad101 is null");
            return (Criteria) this;
        }

        public Criteria andAad101IsNotNull() {
            addCriterion("aad101 is not null");
            return (Criteria) this;
        }

        public Criteria andAad101EqualTo(Integer value) {
            addCriterion("aad101 =", value, "aad101");
            return (Criteria) this;
        }

        public Criteria andAad101NotEqualTo(Integer value) {
            addCriterion("aad101 <>", value, "aad101");
            return (Criteria) this;
        }

        public Criteria andAad101GreaterThan(Integer value) {
            addCriterion("aad101 >", value, "aad101");
            return (Criteria) this;
        }

        public Criteria andAad101GreaterThanOrEqualTo(Integer value) {
            addCriterion("aad101 >=", value, "aad101");
            return (Criteria) this;
        }

        public Criteria andAad101LessThan(Integer value) {
            addCriterion("aad101 <", value, "aad101");
            return (Criteria) this;
        }

        public Criteria andAad101LessThanOrEqualTo(Integer value) {
            addCriterion("aad101 <=", value, "aad101");
            return (Criteria) this;
        }

        public Criteria andAad101In(List<Integer> values) {
            addCriterion("aad101 in", values, "aad101");
            return (Criteria) this;
        }

        public Criteria andAad101NotIn(List<Integer> values) {
            addCriterion("aad101 not in", values, "aad101");
            return (Criteria) this;
        }

        public Criteria andAad101Between(Integer value1, Integer value2) {
            addCriterion("aad101 between", value1, value2, "aad101");
            return (Criteria) this;
        }

        public Criteria andAad101NotBetween(Integer value1, Integer value2) {
            addCriterion("aad101 not between", value1, value2, "aad101");
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