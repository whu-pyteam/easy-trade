package com.pyteam.db.mbg.entity;

import java.util.ArrayList;
import java.util.List;

public class Af09Example {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public Af09Example() {
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

        public Criteria andAaf901IsNull() {
            addCriterion("aaf901 is null");
            return (Criteria) this;
        }

        public Criteria andAaf901IsNotNull() {
            addCriterion("aaf901 is not null");
            return (Criteria) this;
        }

        public Criteria andAaf901EqualTo(Integer value) {
            addCriterion("aaf901 =", value, "aaf901");
            return (Criteria) this;
        }

        public Criteria andAaf901NotEqualTo(Integer value) {
            addCriterion("aaf901 <>", value, "aaf901");
            return (Criteria) this;
        }

        public Criteria andAaf901GreaterThan(Integer value) {
            addCriterion("aaf901 >", value, "aaf901");
            return (Criteria) this;
        }

        public Criteria andAaf901GreaterThanOrEqualTo(Integer value) {
            addCriterion("aaf901 >=", value, "aaf901");
            return (Criteria) this;
        }

        public Criteria andAaf901LessThan(Integer value) {
            addCriterion("aaf901 <", value, "aaf901");
            return (Criteria) this;
        }

        public Criteria andAaf901LessThanOrEqualTo(Integer value) {
            addCriterion("aaf901 <=", value, "aaf901");
            return (Criteria) this;
        }

        public Criteria andAaf901In(List<Integer> values) {
            addCriterion("aaf901 in", values, "aaf901");
            return (Criteria) this;
        }

        public Criteria andAaf901NotIn(List<Integer> values) {
            addCriterion("aaf901 not in", values, "aaf901");
            return (Criteria) this;
        }

        public Criteria andAaf901Between(Integer value1, Integer value2) {
            addCriterion("aaf901 between", value1, value2, "aaf901");
            return (Criteria) this;
        }

        public Criteria andAaf901NotBetween(Integer value1, Integer value2) {
            addCriterion("aaf901 not between", value1, value2, "aaf901");
            return (Criteria) this;
        }

        public Criteria andAaf902IsNull() {
            addCriterion("aaf902 is null");
            return (Criteria) this;
        }

        public Criteria andAaf902IsNotNull() {
            addCriterion("aaf902 is not null");
            return (Criteria) this;
        }

        public Criteria andAaf902EqualTo(String value) {
            addCriterion("aaf902 =", value, "aaf902");
            return (Criteria) this;
        }

        public Criteria andAaf902NotEqualTo(String value) {
            addCriterion("aaf902 <>", value, "aaf902");
            return (Criteria) this;
        }

        public Criteria andAaf902GreaterThan(String value) {
            addCriterion("aaf902 >", value, "aaf902");
            return (Criteria) this;
        }

        public Criteria andAaf902GreaterThanOrEqualTo(String value) {
            addCriterion("aaf902 >=", value, "aaf902");
            return (Criteria) this;
        }

        public Criteria andAaf902LessThan(String value) {
            addCriterion("aaf902 <", value, "aaf902");
            return (Criteria) this;
        }

        public Criteria andAaf902LessThanOrEqualTo(String value) {
            addCriterion("aaf902 <=", value, "aaf902");
            return (Criteria) this;
        }

        public Criteria andAaf902Like(String value) {
            addCriterion("aaf902 like", value, "aaf902");
            return (Criteria) this;
        }

        public Criteria andAaf902NotLike(String value) {
            addCriterion("aaf902 not like", value, "aaf902");
            return (Criteria) this;
        }

        public Criteria andAaf902In(List<String> values) {
            addCriterion("aaf902 in", values, "aaf902");
            return (Criteria) this;
        }

        public Criteria andAaf902NotIn(List<String> values) {
            addCriterion("aaf902 not in", values, "aaf902");
            return (Criteria) this;
        }

        public Criteria andAaf902Between(String value1, String value2) {
            addCriterion("aaf902 between", value1, value2, "aaf902");
            return (Criteria) this;
        }

        public Criteria andAaf902NotBetween(String value1, String value2) {
            addCriterion("aaf902 not between", value1, value2, "aaf902");
            return (Criteria) this;
        }

        public Criteria andAaf903IsNull() {
            addCriterion("aaf903 is null");
            return (Criteria) this;
        }

        public Criteria andAaf903IsNotNull() {
            addCriterion("aaf903 is not null");
            return (Criteria) this;
        }

        public Criteria andAaf903EqualTo(String value) {
            addCriterion("aaf903 =", value, "aaf903");
            return (Criteria) this;
        }

        public Criteria andAaf903NotEqualTo(String value) {
            addCriterion("aaf903 <>", value, "aaf903");
            return (Criteria) this;
        }

        public Criteria andAaf903GreaterThan(String value) {
            addCriterion("aaf903 >", value, "aaf903");
            return (Criteria) this;
        }

        public Criteria andAaf903GreaterThanOrEqualTo(String value) {
            addCriterion("aaf903 >=", value, "aaf903");
            return (Criteria) this;
        }

        public Criteria andAaf903LessThan(String value) {
            addCriterion("aaf903 <", value, "aaf903");
            return (Criteria) this;
        }

        public Criteria andAaf903LessThanOrEqualTo(String value) {
            addCriterion("aaf903 <=", value, "aaf903");
            return (Criteria) this;
        }

        public Criteria andAaf903Like(String value) {
            addCriterion("aaf903 like", value, "aaf903");
            return (Criteria) this;
        }

        public Criteria andAaf903NotLike(String value) {
            addCriterion("aaf903 not like", value, "aaf903");
            return (Criteria) this;
        }

        public Criteria andAaf903In(List<String> values) {
            addCriterion("aaf903 in", values, "aaf903");
            return (Criteria) this;
        }

        public Criteria andAaf903NotIn(List<String> values) {
            addCriterion("aaf903 not in", values, "aaf903");
            return (Criteria) this;
        }

        public Criteria andAaf903Between(String value1, String value2) {
            addCriterion("aaf903 between", value1, value2, "aaf903");
            return (Criteria) this;
        }

        public Criteria andAaf903NotBetween(String value1, String value2) {
            addCriterion("aaf903 not between", value1, value2, "aaf903");
            return (Criteria) this;
        }

        public Criteria andAaf904IsNull() {
            addCriterion("aaf904 is null");
            return (Criteria) this;
        }

        public Criteria andAaf904IsNotNull() {
            addCriterion("aaf904 is not null");
            return (Criteria) this;
        }

        public Criteria andAaf904EqualTo(String value) {
            addCriterion("aaf904 =", value, "aaf904");
            return (Criteria) this;
        }

        public Criteria andAaf904NotEqualTo(String value) {
            addCriterion("aaf904 <>", value, "aaf904");
            return (Criteria) this;
        }

        public Criteria andAaf904GreaterThan(String value) {
            addCriterion("aaf904 >", value, "aaf904");
            return (Criteria) this;
        }

        public Criteria andAaf904GreaterThanOrEqualTo(String value) {
            addCriterion("aaf904 >=", value, "aaf904");
            return (Criteria) this;
        }

        public Criteria andAaf904LessThan(String value) {
            addCriterion("aaf904 <", value, "aaf904");
            return (Criteria) this;
        }

        public Criteria andAaf904LessThanOrEqualTo(String value) {
            addCriterion("aaf904 <=", value, "aaf904");
            return (Criteria) this;
        }

        public Criteria andAaf904Like(String value) {
            addCriterion("aaf904 like", value, "aaf904");
            return (Criteria) this;
        }

        public Criteria andAaf904NotLike(String value) {
            addCriterion("aaf904 not like", value, "aaf904");
            return (Criteria) this;
        }

        public Criteria andAaf904In(List<String> values) {
            addCriterion("aaf904 in", values, "aaf904");
            return (Criteria) this;
        }

        public Criteria andAaf904NotIn(List<String> values) {
            addCriterion("aaf904 not in", values, "aaf904");
            return (Criteria) this;
        }

        public Criteria andAaf904Between(String value1, String value2) {
            addCriterion("aaf904 between", value1, value2, "aaf904");
            return (Criteria) this;
        }

        public Criteria andAaf904NotBetween(String value1, String value2) {
            addCriterion("aaf904 not between", value1, value2, "aaf904");
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