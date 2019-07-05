package com.pyteam.db.mbg.entity;

import java.util.ArrayList;
import java.util.List;

public class Ae07Example {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public Ae07Example() {
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

        public Criteria andAae701IsNull() {
            addCriterion("aae701 is null");
            return (Criteria) this;
        }

        public Criteria andAae701IsNotNull() {
            addCriterion("aae701 is not null");
            return (Criteria) this;
        }

        public Criteria andAae701EqualTo(Integer value) {
            addCriterion("aae701 =", value, "aae701");
            return (Criteria) this;
        }

        public Criteria andAae701NotEqualTo(Integer value) {
            addCriterion("aae701 <>", value, "aae701");
            return (Criteria) this;
        }

        public Criteria andAae701GreaterThan(Integer value) {
            addCriterion("aae701 >", value, "aae701");
            return (Criteria) this;
        }

        public Criteria andAae701GreaterThanOrEqualTo(Integer value) {
            addCriterion("aae701 >=", value, "aae701");
            return (Criteria) this;
        }

        public Criteria andAae701LessThan(Integer value) {
            addCriterion("aae701 <", value, "aae701");
            return (Criteria) this;
        }

        public Criteria andAae701LessThanOrEqualTo(Integer value) {
            addCriterion("aae701 <=", value, "aae701");
            return (Criteria) this;
        }

        public Criteria andAae701In(List<Integer> values) {
            addCriterion("aae701 in", values, "aae701");
            return (Criteria) this;
        }

        public Criteria andAae701NotIn(List<Integer> values) {
            addCriterion("aae701 not in", values, "aae701");
            return (Criteria) this;
        }

        public Criteria andAae701Between(Integer value1, Integer value2) {
            addCriterion("aae701 between", value1, value2, "aae701");
            return (Criteria) this;
        }

        public Criteria andAae701NotBetween(Integer value1, Integer value2) {
            addCriterion("aae701 not between", value1, value2, "aae701");
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

        public Criteria andAac501IsNull() {
            addCriterion("aac501 is null");
            return (Criteria) this;
        }

        public Criteria andAac501IsNotNull() {
            addCriterion("aac501 is not null");
            return (Criteria) this;
        }

        public Criteria andAac501EqualTo(Integer value) {
            addCriterion("aac501 =", value, "aac501");
            return (Criteria) this;
        }

        public Criteria andAac501NotEqualTo(Integer value) {
            addCriterion("aac501 <>", value, "aac501");
            return (Criteria) this;
        }

        public Criteria andAac501GreaterThan(Integer value) {
            addCriterion("aac501 >", value, "aac501");
            return (Criteria) this;
        }

        public Criteria andAac501GreaterThanOrEqualTo(Integer value) {
            addCriterion("aac501 >=", value, "aac501");
            return (Criteria) this;
        }

        public Criteria andAac501LessThan(Integer value) {
            addCriterion("aac501 <", value, "aac501");
            return (Criteria) this;
        }

        public Criteria andAac501LessThanOrEqualTo(Integer value) {
            addCriterion("aac501 <=", value, "aac501");
            return (Criteria) this;
        }

        public Criteria andAac501In(List<Integer> values) {
            addCriterion("aac501 in", values, "aac501");
            return (Criteria) this;
        }

        public Criteria andAac501NotIn(List<Integer> values) {
            addCriterion("aac501 not in", values, "aac501");
            return (Criteria) this;
        }

        public Criteria andAac501Between(Integer value1, Integer value2) {
            addCriterion("aac501 between", value1, value2, "aac501");
            return (Criteria) this;
        }

        public Criteria andAac501NotBetween(Integer value1, Integer value2) {
            addCriterion("aac501 not between", value1, value2, "aac501");
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