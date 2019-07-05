package com.pyteam.db.mbg.entity;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Ab02Example {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public Ab02Example() {
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

        public Criteria andAab201IsNull() {
            addCriterion("aab201 is null");
            return (Criteria) this;
        }

        public Criteria andAab201IsNotNull() {
            addCriterion("aab201 is not null");
            return (Criteria) this;
        }

        public Criteria andAab201EqualTo(Integer value) {
            addCriterion("aab201 =", value, "aab201");
            return (Criteria) this;
        }

        public Criteria andAab201NotEqualTo(Integer value) {
            addCriterion("aab201 <>", value, "aab201");
            return (Criteria) this;
        }

        public Criteria andAab201GreaterThan(Integer value) {
            addCriterion("aab201 >", value, "aab201");
            return (Criteria) this;
        }

        public Criteria andAab201GreaterThanOrEqualTo(Integer value) {
            addCriterion("aab201 >=", value, "aab201");
            return (Criteria) this;
        }

        public Criteria andAab201LessThan(Integer value) {
            addCriterion("aab201 <", value, "aab201");
            return (Criteria) this;
        }

        public Criteria andAab201LessThanOrEqualTo(Integer value) {
            addCriterion("aab201 <=", value, "aab201");
            return (Criteria) this;
        }

        public Criteria andAab201In(List<Integer> values) {
            addCriterion("aab201 in", values, "aab201");
            return (Criteria) this;
        }

        public Criteria andAab201NotIn(List<Integer> values) {
            addCriterion("aab201 not in", values, "aab201");
            return (Criteria) this;
        }

        public Criteria andAab201Between(Integer value1, Integer value2) {
            addCriterion("aab201 between", value1, value2, "aab201");
            return (Criteria) this;
        }

        public Criteria andAab201NotBetween(Integer value1, Integer value2) {
            addCriterion("aab201 not between", value1, value2, "aab201");
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

        public Criteria andAab202IsNull() {
            addCriterion("aab202 is null");
            return (Criteria) this;
        }

        public Criteria andAab202IsNotNull() {
            addCriterion("aab202 is not null");
            return (Criteria) this;
        }

        public Criteria andAab202EqualTo(String value) {
            addCriterion("aab202 =", value, "aab202");
            return (Criteria) this;
        }

        public Criteria andAab202NotEqualTo(String value) {
            addCriterion("aab202 <>", value, "aab202");
            return (Criteria) this;
        }

        public Criteria andAab202GreaterThan(String value) {
            addCriterion("aab202 >", value, "aab202");
            return (Criteria) this;
        }

        public Criteria andAab202GreaterThanOrEqualTo(String value) {
            addCriterion("aab202 >=", value, "aab202");
            return (Criteria) this;
        }

        public Criteria andAab202LessThan(String value) {
            addCriterion("aab202 <", value, "aab202");
            return (Criteria) this;
        }

        public Criteria andAab202LessThanOrEqualTo(String value) {
            addCriterion("aab202 <=", value, "aab202");
            return (Criteria) this;
        }

        public Criteria andAab202Like(String value) {
            addCriterion("aab202 like", value, "aab202");
            return (Criteria) this;
        }

        public Criteria andAab202NotLike(String value) {
            addCriterion("aab202 not like", value, "aab202");
            return (Criteria) this;
        }

        public Criteria andAab202In(List<String> values) {
            addCriterion("aab202 in", values, "aab202");
            return (Criteria) this;
        }

        public Criteria andAab202NotIn(List<String> values) {
            addCriterion("aab202 not in", values, "aab202");
            return (Criteria) this;
        }

        public Criteria andAab202Between(String value1, String value2) {
            addCriterion("aab202 between", value1, value2, "aab202");
            return (Criteria) this;
        }

        public Criteria andAab202NotBetween(String value1, String value2) {
            addCriterion("aab202 not between", value1, value2, "aab202");
            return (Criteria) this;
        }

        public Criteria andAab203IsNull() {
            addCriterion("aab203 is null");
            return (Criteria) this;
        }

        public Criteria andAab203IsNotNull() {
            addCriterion("aab203 is not null");
            return (Criteria) this;
        }

        public Criteria andAab203EqualTo(Date value) {
            addCriterion("aab203 =", value, "aab203");
            return (Criteria) this;
        }

        public Criteria andAab203NotEqualTo(Date value) {
            addCriterion("aab203 <>", value, "aab203");
            return (Criteria) this;
        }

        public Criteria andAab203GreaterThan(Date value) {
            addCriterion("aab203 >", value, "aab203");
            return (Criteria) this;
        }

        public Criteria andAab203GreaterThanOrEqualTo(Date value) {
            addCriterion("aab203 >=", value, "aab203");
            return (Criteria) this;
        }

        public Criteria andAab203LessThan(Date value) {
            addCriterion("aab203 <", value, "aab203");
            return (Criteria) this;
        }

        public Criteria andAab203LessThanOrEqualTo(Date value) {
            addCriterion("aab203 <=", value, "aab203");
            return (Criteria) this;
        }

        public Criteria andAab203In(List<Date> values) {
            addCriterion("aab203 in", values, "aab203");
            return (Criteria) this;
        }

        public Criteria andAab203NotIn(List<Date> values) {
            addCriterion("aab203 not in", values, "aab203");
            return (Criteria) this;
        }

        public Criteria andAab203Between(Date value1, Date value2) {
            addCriterion("aab203 between", value1, value2, "aab203");
            return (Criteria) this;
        }

        public Criteria andAab203NotBetween(Date value1, Date value2) {
            addCriterion("aab203 not between", value1, value2, "aab203");
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