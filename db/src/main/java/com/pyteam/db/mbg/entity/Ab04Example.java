package com.pyteam.db.mbg.entity;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Ab04Example {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public Ab04Example() {
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

        public Criteria andAab401IsNull() {
            addCriterion("aab401 is null");
            return (Criteria) this;
        }

        public Criteria andAab401IsNotNull() {
            addCriterion("aab401 is not null");
            return (Criteria) this;
        }

        public Criteria andAab401EqualTo(Integer value) {
            addCriterion("aab401 =", value, "aab401");
            return (Criteria) this;
        }

        public Criteria andAab401NotEqualTo(Integer value) {
            addCriterion("aab401 <>", value, "aab401");
            return (Criteria) this;
        }

        public Criteria andAab401GreaterThan(Integer value) {
            addCriterion("aab401 >", value, "aab401");
            return (Criteria) this;
        }

        public Criteria andAab401GreaterThanOrEqualTo(Integer value) {
            addCriterion("aab401 >=", value, "aab401");
            return (Criteria) this;
        }

        public Criteria andAab401LessThan(Integer value) {
            addCriterion("aab401 <", value, "aab401");
            return (Criteria) this;
        }

        public Criteria andAab401LessThanOrEqualTo(Integer value) {
            addCriterion("aab401 <=", value, "aab401");
            return (Criteria) this;
        }

        public Criteria andAab401In(List<Integer> values) {
            addCriterion("aab401 in", values, "aab401");
            return (Criteria) this;
        }

        public Criteria andAab401NotIn(List<Integer> values) {
            addCriterion("aab401 not in", values, "aab401");
            return (Criteria) this;
        }

        public Criteria andAab401Between(Integer value1, Integer value2) {
            addCriterion("aab401 between", value1, value2, "aab401");
            return (Criteria) this;
        }

        public Criteria andAab401NotBetween(Integer value1, Integer value2) {
            addCriterion("aab401 not between", value1, value2, "aab401");
            return (Criteria) this;
        }

        public Criteria andSaab101IsNull() {
            addCriterion("saab101 is null");
            return (Criteria) this;
        }

        public Criteria andSaab101IsNotNull() {
            addCriterion("saab101 is not null");
            return (Criteria) this;
        }

        public Criteria andSaab101EqualTo(Integer value) {
            addCriterion("saab101 =", value, "saab101");
            return (Criteria) this;
        }

        public Criteria andSaab101NotEqualTo(Integer value) {
            addCriterion("saab101 <>", value, "saab101");
            return (Criteria) this;
        }

        public Criteria andSaab101GreaterThan(Integer value) {
            addCriterion("saab101 >", value, "saab101");
            return (Criteria) this;
        }

        public Criteria andSaab101GreaterThanOrEqualTo(Integer value) {
            addCriterion("saab101 >=", value, "saab101");
            return (Criteria) this;
        }

        public Criteria andSaab101LessThan(Integer value) {
            addCriterion("saab101 <", value, "saab101");
            return (Criteria) this;
        }

        public Criteria andSaab101LessThanOrEqualTo(Integer value) {
            addCriterion("saab101 <=", value, "saab101");
            return (Criteria) this;
        }

        public Criteria andSaab101In(List<Integer> values) {
            addCriterion("saab101 in", values, "saab101");
            return (Criteria) this;
        }

        public Criteria andSaab101NotIn(List<Integer> values) {
            addCriterion("saab101 not in", values, "saab101");
            return (Criteria) this;
        }

        public Criteria andSaab101Between(Integer value1, Integer value2) {
            addCriterion("saab101 between", value1, value2, "saab101");
            return (Criteria) this;
        }

        public Criteria andSaab101NotBetween(Integer value1, Integer value2) {
            addCriterion("saab101 not between", value1, value2, "saab101");
            return (Criteria) this;
        }

        public Criteria andRaab101IsNull() {
            addCriterion("raab101 is null");
            return (Criteria) this;
        }

        public Criteria andRaab101IsNotNull() {
            addCriterion("raab101 is not null");
            return (Criteria) this;
        }

        public Criteria andRaab101EqualTo(Integer value) {
            addCriterion("raab101 =", value, "raab101");
            return (Criteria) this;
        }

        public Criteria andRaab101NotEqualTo(Integer value) {
            addCriterion("raab101 <>", value, "raab101");
            return (Criteria) this;
        }

        public Criteria andRaab101GreaterThan(Integer value) {
            addCriterion("raab101 >", value, "raab101");
            return (Criteria) this;
        }

        public Criteria andRaab101GreaterThanOrEqualTo(Integer value) {
            addCriterion("raab101 >=", value, "raab101");
            return (Criteria) this;
        }

        public Criteria andRaab101LessThan(Integer value) {
            addCriterion("raab101 <", value, "raab101");
            return (Criteria) this;
        }

        public Criteria andRaab101LessThanOrEqualTo(Integer value) {
            addCriterion("raab101 <=", value, "raab101");
            return (Criteria) this;
        }

        public Criteria andRaab101In(List<Integer> values) {
            addCriterion("raab101 in", values, "raab101");
            return (Criteria) this;
        }

        public Criteria andRaab101NotIn(List<Integer> values) {
            addCriterion("raab101 not in", values, "raab101");
            return (Criteria) this;
        }

        public Criteria andRaab101Between(Integer value1, Integer value2) {
            addCriterion("raab101 between", value1, value2, "raab101");
            return (Criteria) this;
        }

        public Criteria andRaab101NotBetween(Integer value1, Integer value2) {
            addCriterion("raab101 not between", value1, value2, "raab101");
            return (Criteria) this;
        }

        public Criteria andAab402IsNull() {
            addCriterion("aab402 is null");
            return (Criteria) this;
        }

        public Criteria andAab402IsNotNull() {
            addCriterion("aab402 is not null");
            return (Criteria) this;
        }

        public Criteria andAab402EqualTo(String value) {
            addCriterion("aab402 =", value, "aab402");
            return (Criteria) this;
        }

        public Criteria andAab402NotEqualTo(String value) {
            addCriterion("aab402 <>", value, "aab402");
            return (Criteria) this;
        }

        public Criteria andAab402GreaterThan(String value) {
            addCriterion("aab402 >", value, "aab402");
            return (Criteria) this;
        }

        public Criteria andAab402GreaterThanOrEqualTo(String value) {
            addCriterion("aab402 >=", value, "aab402");
            return (Criteria) this;
        }

        public Criteria andAab402LessThan(String value) {
            addCriterion("aab402 <", value, "aab402");
            return (Criteria) this;
        }

        public Criteria andAab402LessThanOrEqualTo(String value) {
            addCriterion("aab402 <=", value, "aab402");
            return (Criteria) this;
        }

        public Criteria andAab402Like(String value) {
            addCriterion("aab402 like", value, "aab402");
            return (Criteria) this;
        }

        public Criteria andAab402NotLike(String value) {
            addCriterion("aab402 not like", value, "aab402");
            return (Criteria) this;
        }

        public Criteria andAab402In(List<String> values) {
            addCriterion("aab402 in", values, "aab402");
            return (Criteria) this;
        }

        public Criteria andAab402NotIn(List<String> values) {
            addCriterion("aab402 not in", values, "aab402");
            return (Criteria) this;
        }

        public Criteria andAab402Between(String value1, String value2) {
            addCriterion("aab402 between", value1, value2, "aab402");
            return (Criteria) this;
        }

        public Criteria andAab402NotBetween(String value1, String value2) {
            addCriterion("aab402 not between", value1, value2, "aab402");
            return (Criteria) this;
        }

        public Criteria andAab403IsNull() {
            addCriterion("aab403 is null");
            return (Criteria) this;
        }

        public Criteria andAab403IsNotNull() {
            addCriterion("aab403 is not null");
            return (Criteria) this;
        }

        public Criteria andAab403EqualTo(Date value) {
            addCriterion("aab403 =", value, "aab403");
            return (Criteria) this;
        }

        public Criteria andAab403NotEqualTo(Date value) {
            addCriterion("aab403 <>", value, "aab403");
            return (Criteria) this;
        }

        public Criteria andAab403GreaterThan(Date value) {
            addCriterion("aab403 >", value, "aab403");
            return (Criteria) this;
        }

        public Criteria andAab403GreaterThanOrEqualTo(Date value) {
            addCriterion("aab403 >=", value, "aab403");
            return (Criteria) this;
        }

        public Criteria andAab403LessThan(Date value) {
            addCriterion("aab403 <", value, "aab403");
            return (Criteria) this;
        }

        public Criteria andAab403LessThanOrEqualTo(Date value) {
            addCriterion("aab403 <=", value, "aab403");
            return (Criteria) this;
        }

        public Criteria andAab403In(List<Date> values) {
            addCriterion("aab403 in", values, "aab403");
            return (Criteria) this;
        }

        public Criteria andAab403NotIn(List<Date> values) {
            addCriterion("aab403 not in", values, "aab403");
            return (Criteria) this;
        }

        public Criteria andAab403Between(Date value1, Date value2) {
            addCriterion("aab403 between", value1, value2, "aab403");
            return (Criteria) this;
        }

        public Criteria andAab403NotBetween(Date value1, Date value2) {
            addCriterion("aab403 not between", value1, value2, "aab403");
            return (Criteria) this;
        }

        public Criteria andAab404IsNull() {
            addCriterion("aab404 is null");
            return (Criteria) this;
        }

        public Criteria andAab404IsNotNull() {
            addCriterion("aab404 is not null");
            return (Criteria) this;
        }

        public Criteria andAab404EqualTo(String value) {
            addCriterion("aab404 =", value, "aab404");
            return (Criteria) this;
        }

        public Criteria andAab404NotEqualTo(String value) {
            addCriterion("aab404 <>", value, "aab404");
            return (Criteria) this;
        }

        public Criteria andAab404GreaterThan(String value) {
            addCriterion("aab404 >", value, "aab404");
            return (Criteria) this;
        }

        public Criteria andAab404GreaterThanOrEqualTo(String value) {
            addCriterion("aab404 >=", value, "aab404");
            return (Criteria) this;
        }

        public Criteria andAab404LessThan(String value) {
            addCriterion("aab404 <", value, "aab404");
            return (Criteria) this;
        }

        public Criteria andAab404LessThanOrEqualTo(String value) {
            addCriterion("aab404 <=", value, "aab404");
            return (Criteria) this;
        }

        public Criteria andAab404Like(String value) {
            addCriterion("aab404 like", value, "aab404");
            return (Criteria) this;
        }

        public Criteria andAab404NotLike(String value) {
            addCriterion("aab404 not like", value, "aab404");
            return (Criteria) this;
        }

        public Criteria andAab404In(List<String> values) {
            addCriterion("aab404 in", values, "aab404");
            return (Criteria) this;
        }

        public Criteria andAab404NotIn(List<String> values) {
            addCriterion("aab404 not in", values, "aab404");
            return (Criteria) this;
        }

        public Criteria andAab404Between(String value1, String value2) {
            addCriterion("aab404 between", value1, value2, "aab404");
            return (Criteria) this;
        }

        public Criteria andAab404NotBetween(String value1, String value2) {
            addCriterion("aab404 not between", value1, value2, "aab404");
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