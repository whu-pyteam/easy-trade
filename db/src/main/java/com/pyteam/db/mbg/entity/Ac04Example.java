package com.pyteam.db.mbg.entity;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Ac04Example {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public Ac04Example() {
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

        public Criteria andAac401IsNull() {
            addCriterion("aac401 is null");
            return (Criteria) this;
        }

        public Criteria andAac401IsNotNull() {
            addCriterion("aac401 is not null");
            return (Criteria) this;
        }

        public Criteria andAac401EqualTo(Integer value) {
            addCriterion("aac401 =", value, "aac401");
            return (Criteria) this;
        }

        public Criteria andAac401NotEqualTo(Integer value) {
            addCriterion("aac401 <>", value, "aac401");
            return (Criteria) this;
        }

        public Criteria andAac401GreaterThan(Integer value) {
            addCriterion("aac401 >", value, "aac401");
            return (Criteria) this;
        }

        public Criteria andAac401GreaterThanOrEqualTo(Integer value) {
            addCriterion("aac401 >=", value, "aac401");
            return (Criteria) this;
        }

        public Criteria andAac401LessThan(Integer value) {
            addCriterion("aac401 <", value, "aac401");
            return (Criteria) this;
        }

        public Criteria andAac401LessThanOrEqualTo(Integer value) {
            addCriterion("aac401 <=", value, "aac401");
            return (Criteria) this;
        }

        public Criteria andAac401In(List<Integer> values) {
            addCriterion("aac401 in", values, "aac401");
            return (Criteria) this;
        }

        public Criteria andAac401NotIn(List<Integer> values) {
            addCriterion("aac401 not in", values, "aac401");
            return (Criteria) this;
        }

        public Criteria andAac401Between(Integer value1, Integer value2) {
            addCriterion("aac401 between", value1, value2, "aac401");
            return (Criteria) this;
        }

        public Criteria andAac401NotBetween(Integer value1, Integer value2) {
            addCriterion("aac401 not between", value1, value2, "aac401");
            return (Criteria) this;
        }

        public Criteria andAac301IsNull() {
            addCriterion("aac301 is null");
            return (Criteria) this;
        }

        public Criteria andAac301IsNotNull() {
            addCriterion("aac301 is not null");
            return (Criteria) this;
        }

        public Criteria andAac301EqualTo(Integer value) {
            addCriterion("aac301 =", value, "aac301");
            return (Criteria) this;
        }

        public Criteria andAac301NotEqualTo(Integer value) {
            addCriterion("aac301 <>", value, "aac301");
            return (Criteria) this;
        }

        public Criteria andAac301GreaterThan(Integer value) {
            addCriterion("aac301 >", value, "aac301");
            return (Criteria) this;
        }

        public Criteria andAac301GreaterThanOrEqualTo(Integer value) {
            addCriterion("aac301 >=", value, "aac301");
            return (Criteria) this;
        }

        public Criteria andAac301LessThan(Integer value) {
            addCriterion("aac301 <", value, "aac301");
            return (Criteria) this;
        }

        public Criteria andAac301LessThanOrEqualTo(Integer value) {
            addCriterion("aac301 <=", value, "aac301");
            return (Criteria) this;
        }

        public Criteria andAac301In(List<Integer> values) {
            addCriterion("aac301 in", values, "aac301");
            return (Criteria) this;
        }

        public Criteria andAac301NotIn(List<Integer> values) {
            addCriterion("aac301 not in", values, "aac301");
            return (Criteria) this;
        }

        public Criteria andAac301Between(Integer value1, Integer value2) {
            addCriterion("aac301 between", value1, value2, "aac301");
            return (Criteria) this;
        }

        public Criteria andAac301NotBetween(Integer value1, Integer value2) {
            addCriterion("aac301 not between", value1, value2, "aac301");
            return (Criteria) this;
        }

        public Criteria andAac101IsNull() {
            addCriterion("aac101 is null");
            return (Criteria) this;
        }

        public Criteria andAac101IsNotNull() {
            addCriterion("aac101 is not null");
            return (Criteria) this;
        }

        public Criteria andAac101EqualTo(Integer value) {
            addCriterion("aac101 =", value, "aac101");
            return (Criteria) this;
        }

        public Criteria andAac101NotEqualTo(Integer value) {
            addCriterion("aac101 <>", value, "aac101");
            return (Criteria) this;
        }

        public Criteria andAac101GreaterThan(Integer value) {
            addCriterion("aac101 >", value, "aac101");
            return (Criteria) this;
        }

        public Criteria andAac101GreaterThanOrEqualTo(Integer value) {
            addCriterion("aac101 >=", value, "aac101");
            return (Criteria) this;
        }

        public Criteria andAac101LessThan(Integer value) {
            addCriterion("aac101 <", value, "aac101");
            return (Criteria) this;
        }

        public Criteria andAac101LessThanOrEqualTo(Integer value) {
            addCriterion("aac101 <=", value, "aac101");
            return (Criteria) this;
        }

        public Criteria andAac101In(List<Integer> values) {
            addCriterion("aac101 in", values, "aac101");
            return (Criteria) this;
        }

        public Criteria andAac101NotIn(List<Integer> values) {
            addCriterion("aac101 not in", values, "aac101");
            return (Criteria) this;
        }

        public Criteria andAac101Between(Integer value1, Integer value2) {
            addCriterion("aac101 between", value1, value2, "aac101");
            return (Criteria) this;
        }

        public Criteria andAac101NotBetween(Integer value1, Integer value2) {
            addCriterion("aac101 not between", value1, value2, "aac101");
            return (Criteria) this;
        }

        public Criteria andAac402IsNull() {
            addCriterion("aac402 is null");
            return (Criteria) this;
        }

        public Criteria andAac402IsNotNull() {
            addCriterion("aac402 is not null");
            return (Criteria) this;
        }

        public Criteria andAac402EqualTo(Date value) {
            addCriterion("aac402 =", value, "aac402");
            return (Criteria) this;
        }

        public Criteria andAac402NotEqualTo(Date value) {
            addCriterion("aac402 <>", value, "aac402");
            return (Criteria) this;
        }

        public Criteria andAac402GreaterThan(Date value) {
            addCriterion("aac402 >", value, "aac402");
            return (Criteria) this;
        }

        public Criteria andAac402GreaterThanOrEqualTo(Date value) {
            addCriterion("aac402 >=", value, "aac402");
            return (Criteria) this;
        }

        public Criteria andAac402LessThan(Date value) {
            addCriterion("aac402 <", value, "aac402");
            return (Criteria) this;
        }

        public Criteria andAac402LessThanOrEqualTo(Date value) {
            addCriterion("aac402 <=", value, "aac402");
            return (Criteria) this;
        }

        public Criteria andAac402In(List<Date> values) {
            addCriterion("aac402 in", values, "aac402");
            return (Criteria) this;
        }

        public Criteria andAac402NotIn(List<Date> values) {
            addCriterion("aac402 not in", values, "aac402");
            return (Criteria) this;
        }

        public Criteria andAac402Between(Date value1, Date value2) {
            addCriterion("aac402 between", value1, value2, "aac402");
            return (Criteria) this;
        }

        public Criteria andAac402NotBetween(Date value1, Date value2) {
            addCriterion("aac402 not between", value1, value2, "aac402");
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