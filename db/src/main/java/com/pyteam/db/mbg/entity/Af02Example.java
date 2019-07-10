package com.pyteam.db.mbg.entity;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Af02Example {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public Af02Example() {
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

        public Criteria andAaf201IsNull() {
            addCriterion("aaf201 is null");
            return (Criteria) this;
        }

        public Criteria andAaf201IsNotNull() {
            addCriterion("aaf201 is not null");
            return (Criteria) this;
        }

        public Criteria andAaf201EqualTo(Integer value) {
            addCriterion("aaf201 =", value, "aaf201");
            return (Criteria) this;
        }

        public Criteria andAaf201NotEqualTo(Integer value) {
            addCriterion("aaf201 <>", value, "aaf201");
            return (Criteria) this;
        }

        public Criteria andAaf201GreaterThan(Integer value) {
            addCriterion("aaf201 >", value, "aaf201");
            return (Criteria) this;
        }

        public Criteria andAaf201GreaterThanOrEqualTo(Integer value) {
            addCriterion("aaf201 >=", value, "aaf201");
            return (Criteria) this;
        }

        public Criteria andAaf201LessThan(Integer value) {
            addCriterion("aaf201 <", value, "aaf201");
            return (Criteria) this;
        }

        public Criteria andAaf201LessThanOrEqualTo(Integer value) {
            addCriterion("aaf201 <=", value, "aaf201");
            return (Criteria) this;
        }

        public Criteria andAaf201In(List<Integer> values) {
            addCriterion("aaf201 in", values, "aaf201");
            return (Criteria) this;
        }

        public Criteria andAaf201NotIn(List<Integer> values) {
            addCriterion("aaf201 not in", values, "aaf201");
            return (Criteria) this;
        }

        public Criteria andAaf201Between(Integer value1, Integer value2) {
            addCriterion("aaf201 between", value1, value2, "aaf201");
            return (Criteria) this;
        }

        public Criteria andAaf201NotBetween(Integer value1, Integer value2) {
            addCriterion("aaf201 not between", value1, value2, "aaf201");
            return (Criteria) this;
        }

        public Criteria andAaf202IsNull() {
            addCriterion("aaf202 is null");
            return (Criteria) this;
        }

        public Criteria andAaf202IsNotNull() {
            addCriterion("aaf202 is not null");
            return (Criteria) this;
        }

        public Criteria andAaf202EqualTo(String value) {
            addCriterion("aaf202 =", value, "aaf202");
            return (Criteria) this;
        }

        public Criteria andAaf202NotEqualTo(String value) {
            addCriterion("aaf202 <>", value, "aaf202");
            return (Criteria) this;
        }

        public Criteria andAaf202GreaterThan(String value) {
            addCriterion("aaf202 >", value, "aaf202");
            return (Criteria) this;
        }

        public Criteria andAaf202GreaterThanOrEqualTo(String value) {
            addCriterion("aaf202 >=", value, "aaf202");
            return (Criteria) this;
        }

        public Criteria andAaf202LessThan(String value) {
            addCriterion("aaf202 <", value, "aaf202");
            return (Criteria) this;
        }

        public Criteria andAaf202LessThanOrEqualTo(String value) {
            addCriterion("aaf202 <=", value, "aaf202");
            return (Criteria) this;
        }

        public Criteria andAaf202Like(String value) {
            addCriterion("aaf202 like", value, "aaf202");
            return (Criteria) this;
        }

        public Criteria andAaf202NotLike(String value) {
            addCriterion("aaf202 not like", value, "aaf202");
            return (Criteria) this;
        }

        public Criteria andAaf202In(List<String> values) {
            addCriterion("aaf202 in", values, "aaf202");
            return (Criteria) this;
        }

        public Criteria andAaf202NotIn(List<String> values) {
            addCriterion("aaf202 not in", values, "aaf202");
            return (Criteria) this;
        }

        public Criteria andAaf202Between(String value1, String value2) {
            addCriterion("aaf202 between", value1, value2, "aaf202");
            return (Criteria) this;
        }

        public Criteria andAaf202NotBetween(String value1, String value2) {
            addCriterion("aaf202 not between", value1, value2, "aaf202");
            return (Criteria) this;
        }

        public Criteria andAaf203IsNull() {
            addCriterion("aaf203 is null");
            return (Criteria) this;
        }

        public Criteria andAaf203IsNotNull() {
            addCriterion("aaf203 is not null");
            return (Criteria) this;
        }

        public Criteria andAaf203EqualTo(String value) {
            addCriterion("aaf203 =", value, "aaf203");
            return (Criteria) this;
        }

        public Criteria andAaf203NotEqualTo(String value) {
            addCriterion("aaf203 <>", value, "aaf203");
            return (Criteria) this;
        }

        public Criteria andAaf203GreaterThan(String value) {
            addCriterion("aaf203 >", value, "aaf203");
            return (Criteria) this;
        }

        public Criteria andAaf203GreaterThanOrEqualTo(String value) {
            addCriterion("aaf203 >=", value, "aaf203");
            return (Criteria) this;
        }

        public Criteria andAaf203LessThan(String value) {
            addCriterion("aaf203 <", value, "aaf203");
            return (Criteria) this;
        }

        public Criteria andAaf203LessThanOrEqualTo(String value) {
            addCriterion("aaf203 <=", value, "aaf203");
            return (Criteria) this;
        }

        public Criteria andAaf203Like(String value) {
            addCriterion("aaf203 like", value, "aaf203");
            return (Criteria) this;
        }

        public Criteria andAaf203NotLike(String value) {
            addCriterion("aaf203 not like", value, "aaf203");
            return (Criteria) this;
        }

        public Criteria andAaf203In(List<String> values) {
            addCriterion("aaf203 in", values, "aaf203");
            return (Criteria) this;
        }

        public Criteria andAaf203NotIn(List<String> values) {
            addCriterion("aaf203 not in", values, "aaf203");
            return (Criteria) this;
        }

        public Criteria andAaf203Between(String value1, String value2) {
            addCriterion("aaf203 between", value1, value2, "aaf203");
            return (Criteria) this;
        }

        public Criteria andAaf203NotBetween(String value1, String value2) {
            addCriterion("aaf203 not between", value1, value2, "aaf203");
            return (Criteria) this;
        }

        public Criteria andAaf204IsNull() {
            addCriterion("aaf204 is null");
            return (Criteria) this;
        }

        public Criteria andAaf204IsNotNull() {
            addCriterion("aaf204 is not null");
            return (Criteria) this;
        }

        public Criteria andAaf204EqualTo(String value) {
            addCriterion("aaf204 =", value, "aaf204");
            return (Criteria) this;
        }

        public Criteria andAaf204NotEqualTo(String value) {
            addCriterion("aaf204 <>", value, "aaf204");
            return (Criteria) this;
        }

        public Criteria andAaf204GreaterThan(String value) {
            addCriterion("aaf204 >", value, "aaf204");
            return (Criteria) this;
        }

        public Criteria andAaf204GreaterThanOrEqualTo(String value) {
            addCriterion("aaf204 >=", value, "aaf204");
            return (Criteria) this;
        }

        public Criteria andAaf204LessThan(String value) {
            addCriterion("aaf204 <", value, "aaf204");
            return (Criteria) this;
        }

        public Criteria andAaf204LessThanOrEqualTo(String value) {
            addCriterion("aaf204 <=", value, "aaf204");
            return (Criteria) this;
        }

        public Criteria andAaf204Like(String value) {
            addCriterion("aaf204 like", value, "aaf204");
            return (Criteria) this;
        }

        public Criteria andAaf204NotLike(String value) {
            addCriterion("aaf204 not like", value, "aaf204");
            return (Criteria) this;
        }

        public Criteria andAaf204In(List<String> values) {
            addCriterion("aaf204 in", values, "aaf204");
            return (Criteria) this;
        }

        public Criteria andAaf204NotIn(List<String> values) {
            addCriterion("aaf204 not in", values, "aaf204");
            return (Criteria) this;
        }

        public Criteria andAaf204Between(String value1, String value2) {
            addCriterion("aaf204 between", value1, value2, "aaf204");
            return (Criteria) this;
        }

        public Criteria andAaf204NotBetween(String value1, String value2) {
            addCriterion("aaf204 not between", value1, value2, "aaf204");
            return (Criteria) this;
        }

        public Criteria andAaf205IsNull() {
            addCriterion("aaf205 is null");
            return (Criteria) this;
        }

        public Criteria andAaf205IsNotNull() {
            addCriterion("aaf205 is not null");
            return (Criteria) this;
        }

        public Criteria andAaf205EqualTo(Date value) {
            addCriterion("aaf205 =", value, "aaf205");
            return (Criteria) this;
        }

        public Criteria andAaf205NotEqualTo(Date value) {
            addCriterion("aaf205 <>", value, "aaf205");
            return (Criteria) this;
        }

        public Criteria andAaf205GreaterThan(Date value) {
            addCriterion("aaf205 >", value, "aaf205");
            return (Criteria) this;
        }

        public Criteria andAaf205GreaterThanOrEqualTo(Date value) {
            addCriterion("aaf205 >=", value, "aaf205");
            return (Criteria) this;
        }

        public Criteria andAaf205LessThan(Date value) {
            addCriterion("aaf205 <", value, "aaf205");
            return (Criteria) this;
        }

        public Criteria andAaf205LessThanOrEqualTo(Date value) {
            addCriterion("aaf205 <=", value, "aaf205");
            return (Criteria) this;
        }

        public Criteria andAaf205In(List<Date> values) {
            addCriterion("aaf205 in", values, "aaf205");
            return (Criteria) this;
        }

        public Criteria andAaf205NotIn(List<Date> values) {
            addCriterion("aaf205 not in", values, "aaf205");
            return (Criteria) this;
        }

        public Criteria andAaf205Between(Date value1, Date value2) {
            addCriterion("aaf205 between", value1, value2, "aaf205");
            return (Criteria) this;
        }

        public Criteria andAaf205NotBetween(Date value1, Date value2) {
            addCriterion("aaf205 not between", value1, value2, "aaf205");
            return (Criteria) this;
        }

        public Criteria andAaf206IsNull() {
            addCriterion("aaf206 is null");
            return (Criteria) this;
        }

        public Criteria andAaf206IsNotNull() {
            addCriterion("aaf206 is not null");
            return (Criteria) this;
        }

        public Criteria andAaf206EqualTo(Date value) {
            addCriterion("aaf206 =", value, "aaf206");
            return (Criteria) this;
        }

        public Criteria andAaf206NotEqualTo(Date value) {
            addCriterion("aaf206 <>", value, "aaf206");
            return (Criteria) this;
        }

        public Criteria andAaf206GreaterThan(Date value) {
            addCriterion("aaf206 >", value, "aaf206");
            return (Criteria) this;
        }

        public Criteria andAaf206GreaterThanOrEqualTo(Date value) {
            addCriterion("aaf206 >=", value, "aaf206");
            return (Criteria) this;
        }

        public Criteria andAaf206LessThan(Date value) {
            addCriterion("aaf206 <", value, "aaf206");
            return (Criteria) this;
        }

        public Criteria andAaf206LessThanOrEqualTo(Date value) {
            addCriterion("aaf206 <=", value, "aaf206");
            return (Criteria) this;
        }

        public Criteria andAaf206In(List<Date> values) {
            addCriterion("aaf206 in", values, "aaf206");
            return (Criteria) this;
        }

        public Criteria andAaf206NotIn(List<Date> values) {
            addCriterion("aaf206 not in", values, "aaf206");
            return (Criteria) this;
        }

        public Criteria andAaf206Between(Date value1, Date value2) {
            addCriterion("aaf206 between", value1, value2, "aaf206");
            return (Criteria) this;
        }

        public Criteria andAaf206NotBetween(Date value1, Date value2) {
            addCriterion("aaf206 not between", value1, value2, "aaf206");
            return (Criteria) this;
        }

        public Criteria andAaf207IsNull() {
            addCriterion("aaf207 is null");
            return (Criteria) this;
        }

        public Criteria andAaf207IsNotNull() {
            addCriterion("aaf207 is not null");
            return (Criteria) this;
        }

        public Criteria andAaf207EqualTo(Integer value) {
            addCriterion("aaf207 =", value, "aaf207");
            return (Criteria) this;
        }

        public Criteria andAaf207NotEqualTo(Integer value) {
            addCriterion("aaf207 <>", value, "aaf207");
            return (Criteria) this;
        }

        public Criteria andAaf207GreaterThan(Integer value) {
            addCriterion("aaf207 >", value, "aaf207");
            return (Criteria) this;
        }

        public Criteria andAaf207GreaterThanOrEqualTo(Integer value) {
            addCriterion("aaf207 >=", value, "aaf207");
            return (Criteria) this;
        }

        public Criteria andAaf207LessThan(Integer value) {
            addCriterion("aaf207 <", value, "aaf207");
            return (Criteria) this;
        }

        public Criteria andAaf207LessThanOrEqualTo(Integer value) {
            addCriterion("aaf207 <=", value, "aaf207");
            return (Criteria) this;
        }

        public Criteria andAaf207In(List<Integer> values) {
            addCriterion("aaf207 in", values, "aaf207");
            return (Criteria) this;
        }

        public Criteria andAaf207NotIn(List<Integer> values) {
            addCriterion("aaf207 not in", values, "aaf207");
            return (Criteria) this;
        }

        public Criteria andAaf207Between(Integer value1, Integer value2) {
            addCriterion("aaf207 between", value1, value2, "aaf207");
            return (Criteria) this;
        }

        public Criteria andAaf207NotBetween(Integer value1, Integer value2) {
            addCriterion("aaf207 not between", value1, value2, "aaf207");
            return (Criteria) this;
        }

        public Criteria andAaf208IsNull() {
            addCriterion("aaf208 is null");
            return (Criteria) this;
        }

        public Criteria andAaf208IsNotNull() {
            addCriterion("aaf208 is not null");
            return (Criteria) this;
        }

        public Criteria andAaf208EqualTo(String value) {
            addCriterion("aaf208 =", value, "aaf208");
            return (Criteria) this;
        }

        public Criteria andAaf208NotEqualTo(String value) {
            addCriterion("aaf208 <>", value, "aaf208");
            return (Criteria) this;
        }

        public Criteria andAaf208GreaterThan(String value) {
            addCriterion("aaf208 >", value, "aaf208");
            return (Criteria) this;
        }

        public Criteria andAaf208GreaterThanOrEqualTo(String value) {
            addCriterion("aaf208 >=", value, "aaf208");
            return (Criteria) this;
        }

        public Criteria andAaf208LessThan(String value) {
            addCriterion("aaf208 <", value, "aaf208");
            return (Criteria) this;
        }

        public Criteria andAaf208LessThanOrEqualTo(String value) {
            addCriterion("aaf208 <=", value, "aaf208");
            return (Criteria) this;
        }

        public Criteria andAaf208Like(String value) {
            addCriterion("aaf208 like", value, "aaf208");
            return (Criteria) this;
        }

        public Criteria andAaf208NotLike(String value) {
            addCriterion("aaf208 not like", value, "aaf208");
            return (Criteria) this;
        }

        public Criteria andAaf208In(List<String> values) {
            addCriterion("aaf208 in", values, "aaf208");
            return (Criteria) this;
        }

        public Criteria andAaf208NotIn(List<String> values) {
            addCriterion("aaf208 not in", values, "aaf208");
            return (Criteria) this;
        }

        public Criteria andAaf208Between(String value1, String value2) {
            addCriterion("aaf208 between", value1, value2, "aaf208");
            return (Criteria) this;
        }

        public Criteria andAaf208NotBetween(String value1, String value2) {
            addCriterion("aaf208 not between", value1, value2, "aaf208");
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