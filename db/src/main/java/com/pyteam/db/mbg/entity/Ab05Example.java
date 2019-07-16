package com.pyteam.db.mbg.entity;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Ab05Example {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public Ab05Example() {
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

        public Criteria andAab501IsNull() {
            addCriterion("aab501 is null");
            return (Criteria) this;
        }

        public Criteria andAab501IsNotNull() {
            addCriterion("aab501 is not null");
            return (Criteria) this;
        }

        public Criteria andAab501EqualTo(Integer value) {
            addCriterion("aab501 =", value, "aab501");
            return (Criteria) this;
        }

        public Criteria andAab501NotEqualTo(Integer value) {
            addCriterion("aab501 <>", value, "aab501");
            return (Criteria) this;
        }

        public Criteria andAab501GreaterThan(Integer value) {
            addCriterion("aab501 >", value, "aab501");
            return (Criteria) this;
        }

        public Criteria andAab501GreaterThanOrEqualTo(Integer value) {
            addCriterion("aab501 >=", value, "aab501");
            return (Criteria) this;
        }

        public Criteria andAab501LessThan(Integer value) {
            addCriterion("aab501 <", value, "aab501");
            return (Criteria) this;
        }

        public Criteria andAab501LessThanOrEqualTo(Integer value) {
            addCriterion("aab501 <=", value, "aab501");
            return (Criteria) this;
        }

        public Criteria andAab501In(List<Integer> values) {
            addCriterion("aab501 in", values, "aab501");
            return (Criteria) this;
        }

        public Criteria andAab501NotIn(List<Integer> values) {
            addCriterion("aab501 not in", values, "aab501");
            return (Criteria) this;
        }

        public Criteria andAab501Between(Integer value1, Integer value2) {
            addCriterion("aab501 between", value1, value2, "aab501");
            return (Criteria) this;
        }

        public Criteria andAab501NotBetween(Integer value1, Integer value2) {
            addCriterion("aab501 not between", value1, value2, "aab501");
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

        public Criteria andAab502IsNull() {
            addCriterion("aab502 is null");
            return (Criteria) this;
        }

        public Criteria andAab502IsNotNull() {
            addCriterion("aab502 is not null");
            return (Criteria) this;
        }

        public Criteria andAab502EqualTo(String value) {
            addCriterion("aab502 =", value, "aab502");
            return (Criteria) this;
        }

        public Criteria andAab502NotEqualTo(String value) {
            addCriterion("aab502 <>", value, "aab502");
            return (Criteria) this;
        }

        public Criteria andAab502GreaterThan(String value) {
            addCriterion("aab502 >", value, "aab502");
            return (Criteria) this;
        }

        public Criteria andAab502GreaterThanOrEqualTo(String value) {
            addCriterion("aab502 >=", value, "aab502");
            return (Criteria) this;
        }

        public Criteria andAab502LessThan(String value) {
            addCriterion("aab502 <", value, "aab502");
            return (Criteria) this;
        }

        public Criteria andAab502LessThanOrEqualTo(String value) {
            addCriterion("aab502 <=", value, "aab502");
            return (Criteria) this;
        }

        public Criteria andAab502Like(String value) {
            addCriterion("aab502 like", value, "aab502");
            return (Criteria) this;
        }

        public Criteria andAab502NotLike(String value) {
            addCriterion("aab502 not like", value, "aab502");
            return (Criteria) this;
        }

        public Criteria andAab502In(List<String> values) {
            addCriterion("aab502 in", values, "aab502");
            return (Criteria) this;
        }

        public Criteria andAab502NotIn(List<String> values) {
            addCriterion("aab502 not in", values, "aab502");
            return (Criteria) this;
        }

        public Criteria andAab502Between(String value1, String value2) {
            addCriterion("aab502 between", value1, value2, "aab502");
            return (Criteria) this;
        }

        public Criteria andAab502NotBetween(String value1, String value2) {
            addCriterion("aab502 not between", value1, value2, "aab502");
            return (Criteria) this;
        }

        public Criteria andAab503IsNull() {
            addCriterion("aab503 is null");
            return (Criteria) this;
        }

        public Criteria andAab503IsNotNull() {
            addCriterion("aab503 is not null");
            return (Criteria) this;
        }

        public Criteria andAab503EqualTo(String value) {
            addCriterion("aab503 =", value, "aab503");
            return (Criteria) this;
        }

        public Criteria andAab503NotEqualTo(String value) {
            addCriterion("aab503 <>", value, "aab503");
            return (Criteria) this;
        }

        public Criteria andAab503GreaterThan(String value) {
            addCriterion("aab503 >", value, "aab503");
            return (Criteria) this;
        }

        public Criteria andAab503GreaterThanOrEqualTo(String value) {
            addCriterion("aab503 >=", value, "aab503");
            return (Criteria) this;
        }

        public Criteria andAab503LessThan(String value) {
            addCriterion("aab503 <", value, "aab503");
            return (Criteria) this;
        }

        public Criteria andAab503LessThanOrEqualTo(String value) {
            addCriterion("aab503 <=", value, "aab503");
            return (Criteria) this;
        }

        public Criteria andAab503Like(String value) {
            addCriterion("aab503 like", value, "aab503");
            return (Criteria) this;
        }

        public Criteria andAab503NotLike(String value) {
            addCriterion("aab503 not like", value, "aab503");
            return (Criteria) this;
        }

        public Criteria andAab503In(List<String> values) {
            addCriterion("aab503 in", values, "aab503");
            return (Criteria) this;
        }

        public Criteria andAab503NotIn(List<String> values) {
            addCriterion("aab503 not in", values, "aab503");
            return (Criteria) this;
        }

        public Criteria andAab503Between(String value1, String value2) {
            addCriterion("aab503 between", value1, value2, "aab503");
            return (Criteria) this;
        }

        public Criteria andAab503NotBetween(String value1, String value2) {
            addCriterion("aab503 not between", value1, value2, "aab503");
            return (Criteria) this;
        }

        public Criteria andAab504IsNull() {
            addCriterion("aab504 is null");
            return (Criteria) this;
        }

        public Criteria andAab504IsNotNull() {
            addCriterion("aab504 is not null");
            return (Criteria) this;
        }

        public Criteria andAab504EqualTo(String value) {
            addCriterion("aab504 =", value, "aab504");
            return (Criteria) this;
        }

        public Criteria andAab504NotEqualTo(String value) {
            addCriterion("aab504 <>", value, "aab504");
            return (Criteria) this;
        }

        public Criteria andAab504GreaterThan(String value) {
            addCriterion("aab504 >", value, "aab504");
            return (Criteria) this;
        }

        public Criteria andAab504GreaterThanOrEqualTo(String value) {
            addCriterion("aab504 >=", value, "aab504");
            return (Criteria) this;
        }

        public Criteria andAab504LessThan(String value) {
            addCriterion("aab504 <", value, "aab504");
            return (Criteria) this;
        }

        public Criteria andAab504LessThanOrEqualTo(String value) {
            addCriterion("aab504 <=", value, "aab504");
            return (Criteria) this;
        }

        public Criteria andAab504Like(String value) {
            addCriterion("aab504 like", value, "aab504");
            return (Criteria) this;
        }

        public Criteria andAab504NotLike(String value) {
            addCriterion("aab504 not like", value, "aab504");
            return (Criteria) this;
        }

        public Criteria andAab504In(List<String> values) {
            addCriterion("aab504 in", values, "aab504");
            return (Criteria) this;
        }

        public Criteria andAab504NotIn(List<String> values) {
            addCriterion("aab504 not in", values, "aab504");
            return (Criteria) this;
        }

        public Criteria andAab504Between(String value1, String value2) {
            addCriterion("aab504 between", value1, value2, "aab504");
            return (Criteria) this;
        }

        public Criteria andAab504NotBetween(String value1, String value2) {
            addCriterion("aab504 not between", value1, value2, "aab504");
            return (Criteria) this;
        }

        public Criteria andAab505IsNull() {
            addCriterion("aab505 is null");
            return (Criteria) this;
        }

        public Criteria andAab505IsNotNull() {
            addCriterion("aab505 is not null");
            return (Criteria) this;
        }

        public Criteria andAab505EqualTo(Date value) {
            addCriterion("aab505 =", value, "aab505");
            return (Criteria) this;
        }

        public Criteria andAab505NotEqualTo(Date value) {
            addCriterion("aab505 <>", value, "aab505");
            return (Criteria) this;
        }

        public Criteria andAab505GreaterThan(Date value) {
            addCriterion("aab505 >", value, "aab505");
            return (Criteria) this;
        }

        public Criteria andAab505GreaterThanOrEqualTo(Date value) {
            addCriterion("aab505 >=", value, "aab505");
            return (Criteria) this;
        }

        public Criteria andAab505LessThan(Date value) {
            addCriterion("aab505 <", value, "aab505");
            return (Criteria) this;
        }

        public Criteria andAab505LessThanOrEqualTo(Date value) {
            addCriterion("aab505 <=", value, "aab505");
            return (Criteria) this;
        }

        public Criteria andAab505In(List<Date> values) {
            addCriterion("aab505 in", values, "aab505");
            return (Criteria) this;
        }

        public Criteria andAab505NotIn(List<Date> values) {
            addCriterion("aab505 not in", values, "aab505");
            return (Criteria) this;
        }

        public Criteria andAab505Between(Date value1, Date value2) {
            addCriterion("aab505 between", value1, value2, "aab505");
            return (Criteria) this;
        }

        public Criteria andAab505NotBetween(Date value1, Date value2) {
            addCriterion("aab505 not between", value1, value2, "aab505");
            return (Criteria) this;
        }
<<<<<<< HEAD
=======

        public Criteria andAab506IsNull() {
            addCriterion("aab506 is null");
            return (Criteria) this;
        }

        public Criteria andAab506IsNotNull() {
            addCriterion("aab506 is not null");
            return (Criteria) this;
        }

        public Criteria andAab506EqualTo(String value) {
            addCriterion("aab506 =", value, "aab506");
            return (Criteria) this;
        }

        public Criteria andAab506NotEqualTo(String value) {
            addCriterion("aab506 <>", value, "aab506");
            return (Criteria) this;
        }

        public Criteria andAab506GreaterThan(String value) {
            addCriterion("aab506 >", value, "aab506");
            return (Criteria) this;
        }

        public Criteria andAab506GreaterThanOrEqualTo(String value) {
            addCriterion("aab506 >=", value, "aab506");
            return (Criteria) this;
        }

        public Criteria andAab506LessThan(String value) {
            addCriterion("aab506 <", value, "aab506");
            return (Criteria) this;
        }

        public Criteria andAab506LessThanOrEqualTo(String value) {
            addCriterion("aab506 <=", value, "aab506");
            return (Criteria) this;
        }

        public Criteria andAab506Like(String value) {
            addCriterion("aab506 like", value, "aab506");
            return (Criteria) this;
        }

        public Criteria andAab506NotLike(String value) {
            addCriterion("aab506 not like", value, "aab506");
            return (Criteria) this;
        }

        public Criteria andAab506In(List<String> values) {
            addCriterion("aab506 in", values, "aab506");
            return (Criteria) this;
        }

        public Criteria andAab506NotIn(List<String> values) {
            addCriterion("aab506 not in", values, "aab506");
            return (Criteria) this;
        }

        public Criteria andAab506Between(String value1, String value2) {
            addCriterion("aab506 between", value1, value2, "aab506");
            return (Criteria) this;
        }

        public Criteria andAab506NotBetween(String value1, String value2) {
            addCriterion("aab506 not between", value1, value2, "aab506");
            return (Criteria) this;
        }
>>>>>>> ff3b309713350261d60686edffb3697e5622358b
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