package com.pyteam.db.mbg.entity;

import java.util.ArrayList;
import java.util.List;

public class Ac02Example {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public Ac02Example() {
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

        public Criteria andAac201IsNull() {
            addCriterion("aac201 is null");
            return (Criteria) this;
        }

        public Criteria andAac201IsNotNull() {
            addCriterion("aac201 is not null");
            return (Criteria) this;
        }

        public Criteria andAac201EqualTo(Integer value) {
            addCriterion("aac201 =", value, "aac201");
            return (Criteria) this;
        }

        public Criteria andAac201NotEqualTo(Integer value) {
            addCriterion("aac201 <>", value, "aac201");
            return (Criteria) this;
        }

        public Criteria andAac201GreaterThan(Integer value) {
            addCriterion("aac201 >", value, "aac201");
            return (Criteria) this;
        }

        public Criteria andAac201GreaterThanOrEqualTo(Integer value) {
            addCriterion("aac201 >=", value, "aac201");
            return (Criteria) this;
        }

        public Criteria andAac201LessThan(Integer value) {
            addCriterion("aac201 <", value, "aac201");
            return (Criteria) this;
        }

        public Criteria andAac201LessThanOrEqualTo(Integer value) {
            addCriterion("aac201 <=", value, "aac201");
            return (Criteria) this;
        }

        public Criteria andAac201In(List<Integer> values) {
            addCriterion("aac201 in", values, "aac201");
            return (Criteria) this;
        }

        public Criteria andAac201NotIn(List<Integer> values) {
            addCriterion("aac201 not in", values, "aac201");
            return (Criteria) this;
        }

        public Criteria andAac201Between(Integer value1, Integer value2) {
            addCriterion("aac201 between", value1, value2, "aac201");
            return (Criteria) this;
        }

        public Criteria andAac201NotBetween(Integer value1, Integer value2) {
            addCriterion("aac201 not between", value1, value2, "aac201");
            return (Criteria) this;
        }

        public Criteria andAac202IsNull() {
            addCriterion("aac202 is null");
            return (Criteria) this;
        }

        public Criteria andAac202IsNotNull() {
            addCriterion("aac202 is not null");
            return (Criteria) this;
        }

        public Criteria andAac202EqualTo(String value) {
            addCriterion("aac202 =", value, "aac202");
            return (Criteria) this;
        }

        public Criteria andAac202NotEqualTo(String value) {
            addCriterion("aac202 <>", value, "aac202");
            return (Criteria) this;
        }

        public Criteria andAac202GreaterThan(String value) {
            addCriterion("aac202 >", value, "aac202");
            return (Criteria) this;
        }

        public Criteria andAac202GreaterThanOrEqualTo(String value) {
            addCriterion("aac202 >=", value, "aac202");
            return (Criteria) this;
        }

        public Criteria andAac202LessThan(String value) {
            addCriterion("aac202 <", value, "aac202");
            return (Criteria) this;
        }

        public Criteria andAac202LessThanOrEqualTo(String value) {
            addCriterion("aac202 <=", value, "aac202");
            return (Criteria) this;
        }

        public Criteria andAac202Like(String value) {
            addCriterion("aac202 like", value, "aac202");
            return (Criteria) this;
        }

        public Criteria andAac202NotLike(String value) {
            addCriterion("aac202 not like", value, "aac202");
            return (Criteria) this;
        }

        public Criteria andAac202In(List<String> values) {
            addCriterion("aac202 in", values, "aac202");
            return (Criteria) this;
        }

        public Criteria andAac202NotIn(List<String> values) {
            addCriterion("aac202 not in", values, "aac202");
            return (Criteria) this;
        }

        public Criteria andAac202Between(String value1, String value2) {
            addCriterion("aac202 between", value1, value2, "aac202");
            return (Criteria) this;
        }

        public Criteria andAac202NotBetween(String value1, String value2) {
            addCriterion("aac202 not between", value1, value2, "aac202");
            return (Criteria) this;
        }

        public Criteria andAac203IsNull() {
            addCriterion("aac203 is null");
            return (Criteria) this;
        }

        public Criteria andAac203IsNotNull() {
            addCriterion("aac203 is not null");
            return (Criteria) this;
        }

        public Criteria andAac203EqualTo(Integer value) {
            addCriterion("aac203 =", value, "aac203");
            return (Criteria) this;
        }

        public Criteria andAac203NotEqualTo(Integer value) {
            addCriterion("aac203 <>", value, "aac203");
            return (Criteria) this;
        }

        public Criteria andAac203GreaterThan(Integer value) {
            addCriterion("aac203 >", value, "aac203");
            return (Criteria) this;
        }

        public Criteria andAac203GreaterThanOrEqualTo(Integer value) {
            addCriterion("aac203 >=", value, "aac203");
            return (Criteria) this;
        }

        public Criteria andAac203LessThan(Integer value) {
            addCriterion("aac203 <", value, "aac203");
            return (Criteria) this;
        }

        public Criteria andAac203LessThanOrEqualTo(Integer value) {
            addCriterion("aac203 <=", value, "aac203");
            return (Criteria) this;
        }

        public Criteria andAac203In(List<Integer> values) {
            addCriterion("aac203 in", values, "aac203");
            return (Criteria) this;
        }

        public Criteria andAac203NotIn(List<Integer> values) {
            addCriterion("aac203 not in", values, "aac203");
            return (Criteria) this;
        }

        public Criteria andAac203Between(Integer value1, Integer value2) {
            addCriterion("aac203 between", value1, value2, "aac203");
            return (Criteria) this;
        }

        public Criteria andAac203NotBetween(Integer value1, Integer value2) {
            addCriterion("aac203 not between", value1, value2, "aac203");
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