package com.pyteam.db.mbg.entity;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Ad06Example {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public Ad06Example() {
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

        public Criteria andAad601IsNull() {
            addCriterion("aad601 is null");
            return (Criteria) this;
        }

        public Criteria andAad601IsNotNull() {
            addCriterion("aad601 is not null");
            return (Criteria) this;
        }

        public Criteria andAad601EqualTo(Integer value) {
            addCriterion("aad601 =", value, "aad601");
            return (Criteria) this;
        }

        public Criteria andAad601NotEqualTo(Integer value) {
            addCriterion("aad601 <>", value, "aad601");
            return (Criteria) this;
        }

        public Criteria andAad601GreaterThan(Integer value) {
            addCriterion("aad601 >", value, "aad601");
            return (Criteria) this;
        }

        public Criteria andAad601GreaterThanOrEqualTo(Integer value) {
            addCriterion("aad601 >=", value, "aad601");
            return (Criteria) this;
        }

        public Criteria andAad601LessThan(Integer value) {
            addCriterion("aad601 <", value, "aad601");
            return (Criteria) this;
        }

        public Criteria andAad601LessThanOrEqualTo(Integer value) {
            addCriterion("aad601 <=", value, "aad601");
            return (Criteria) this;
        }

        public Criteria andAad601In(List<Integer> values) {
            addCriterion("aad601 in", values, "aad601");
            return (Criteria) this;
        }

        public Criteria andAad601NotIn(List<Integer> values) {
            addCriterion("aad601 not in", values, "aad601");
            return (Criteria) this;
        }

        public Criteria andAad601Between(Integer value1, Integer value2) {
            addCriterion("aad601 between", value1, value2, "aad601");
            return (Criteria) this;
        }

        public Criteria andAad601NotBetween(Integer value1, Integer value2) {
            addCriterion("aad601 not between", value1, value2, "aad601");
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

        public Criteria andAad602IsNull() {
            addCriterion("aad602 is null");
            return (Criteria) this;
        }

        public Criteria andAad602IsNotNull() {
            addCriterion("aad602 is not null");
            return (Criteria) this;
        }

        public Criteria andAad602EqualTo(BigDecimal value) {
            addCriterion("aad602 =", value, "aad602");
            return (Criteria) this;
        }

        public Criteria andAad602NotEqualTo(BigDecimal value) {
            addCriterion("aad602 <>", value, "aad602");
            return (Criteria) this;
        }

        public Criteria andAad602GreaterThan(BigDecimal value) {
            addCriterion("aad602 >", value, "aad602");
            return (Criteria) this;
        }

        public Criteria andAad602GreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("aad602 >=", value, "aad602");
            return (Criteria) this;
        }

        public Criteria andAad602LessThan(BigDecimal value) {
            addCriterion("aad602 <", value, "aad602");
            return (Criteria) this;
        }

        public Criteria andAad602LessThanOrEqualTo(BigDecimal value) {
            addCriterion("aad602 <=", value, "aad602");
            return (Criteria) this;
        }

        public Criteria andAad602In(List<BigDecimal> values) {
            addCriterion("aad602 in", values, "aad602");
            return (Criteria) this;
        }

        public Criteria andAad602NotIn(List<BigDecimal> values) {
            addCriterion("aad602 not in", values, "aad602");
            return (Criteria) this;
        }

        public Criteria andAad602Between(BigDecimal value1, BigDecimal value2) {
            addCriterion("aad602 between", value1, value2, "aad602");
            return (Criteria) this;
        }

        public Criteria andAad602NotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("aad602 not between", value1, value2, "aad602");
            return (Criteria) this;
        }

        public Criteria andAad603IsNull() {
            addCriterion("aad603 is null");
            return (Criteria) this;
        }

        public Criteria andAad603IsNotNull() {
            addCriterion("aad603 is not null");
            return (Criteria) this;
        }

        public Criteria andAad603EqualTo(String value) {
            addCriterion("aad603 =", value, "aad603");
            return (Criteria) this;
        }

        public Criteria andAad603NotEqualTo(String value) {
            addCriterion("aad603 <>", value, "aad603");
            return (Criteria) this;
        }

        public Criteria andAad603GreaterThan(String value) {
            addCriterion("aad603 >", value, "aad603");
            return (Criteria) this;
        }

        public Criteria andAad603GreaterThanOrEqualTo(String value) {
            addCriterion("aad603 >=", value, "aad603");
            return (Criteria) this;
        }

        public Criteria andAad603LessThan(String value) {
            addCriterion("aad603 <", value, "aad603");
            return (Criteria) this;
        }

        public Criteria andAad603LessThanOrEqualTo(String value) {
            addCriterion("aad603 <=", value, "aad603");
            return (Criteria) this;
        }

        public Criteria andAad603Like(String value) {
            addCriterion("aad603 like", value, "aad603");
            return (Criteria) this;
        }

        public Criteria andAad603NotLike(String value) {
            addCriterion("aad603 not like", value, "aad603");
            return (Criteria) this;
        }

        public Criteria andAad603In(List<String> values) {
            addCriterion("aad603 in", values, "aad603");
            return (Criteria) this;
        }

        public Criteria andAad603NotIn(List<String> values) {
            addCriterion("aad603 not in", values, "aad603");
            return (Criteria) this;
        }

        public Criteria andAad603Between(String value1, String value2) {
            addCriterion("aad603 between", value1, value2, "aad603");
            return (Criteria) this;
        }

        public Criteria andAad603NotBetween(String value1, String value2) {
            addCriterion("aad603 not between", value1, value2, "aad603");
            return (Criteria) this;
        }

        public Criteria andAad604IsNull() {
            addCriterion("aad604 is null");
            return (Criteria) this;
        }

        public Criteria andAad604IsNotNull() {
            addCriterion("aad604 is not null");
            return (Criteria) this;
        }

        public Criteria andAad604EqualTo(Date value) {
            addCriterion("aad604 =", value, "aad604");
            return (Criteria) this;
        }

        public Criteria andAad604NotEqualTo(Date value) {
            addCriterion("aad604 <>", value, "aad604");
            return (Criteria) this;
        }

        public Criteria andAad604GreaterThan(Date value) {
            addCriterion("aad604 >", value, "aad604");
            return (Criteria) this;
        }

        public Criteria andAad604GreaterThanOrEqualTo(Date value) {
            addCriterion("aad604 >=", value, "aad604");
            return (Criteria) this;
        }

        public Criteria andAad604LessThan(Date value) {
            addCriterion("aad604 <", value, "aad604");
            return (Criteria) this;
        }

        public Criteria andAad604LessThanOrEqualTo(Date value) {
            addCriterion("aad604 <=", value, "aad604");
            return (Criteria) this;
        }

        public Criteria andAad604In(List<Date> values) {
            addCriterion("aad604 in", values, "aad604");
            return (Criteria) this;
        }

        public Criteria andAad604NotIn(List<Date> values) {
            addCriterion("aad604 not in", values, "aad604");
            return (Criteria) this;
        }

        public Criteria andAad604Between(Date value1, Date value2) {
            addCriterion("aad604 between", value1, value2, "aad604");
            return (Criteria) this;
        }

        public Criteria andAad604NotBetween(Date value1, Date value2) {
            addCriterion("aad604 not between", value1, value2, "aad604");
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