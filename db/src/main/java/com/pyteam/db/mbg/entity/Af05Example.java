package com.pyteam.db.mbg.entity;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Af05Example {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public Af05Example() {
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

        public Criteria andAaf501IsNull() {
            addCriterion("aaf501 is null");
            return (Criteria) this;
        }

        public Criteria andAaf501IsNotNull() {
            addCriterion("aaf501 is not null");
            return (Criteria) this;
        }

        public Criteria andAaf501EqualTo(Integer value) {
            addCriterion("aaf501 =", value, "aaf501");
            return (Criteria) this;
        }

        public Criteria andAaf501NotEqualTo(Integer value) {
            addCriterion("aaf501 <>", value, "aaf501");
            return (Criteria) this;
        }

        public Criteria andAaf501GreaterThan(Integer value) {
            addCriterion("aaf501 >", value, "aaf501");
            return (Criteria) this;
        }

        public Criteria andAaf501GreaterThanOrEqualTo(Integer value) {
            addCriterion("aaf501 >=", value, "aaf501");
            return (Criteria) this;
        }

        public Criteria andAaf501LessThan(Integer value) {
            addCriterion("aaf501 <", value, "aaf501");
            return (Criteria) this;
        }

        public Criteria andAaf501LessThanOrEqualTo(Integer value) {
            addCriterion("aaf501 <=", value, "aaf501");
            return (Criteria) this;
        }

        public Criteria andAaf501In(List<Integer> values) {
            addCriterion("aaf501 in", values, "aaf501");
            return (Criteria) this;
        }

        public Criteria andAaf501NotIn(List<Integer> values) {
            addCriterion("aaf501 not in", values, "aaf501");
            return (Criteria) this;
        }

        public Criteria andAaf501Between(Integer value1, Integer value2) {
            addCriterion("aaf501 between", value1, value2, "aaf501");
            return (Criteria) this;
        }

        public Criteria andAaf501NotBetween(Integer value1, Integer value2) {
            addCriterion("aaf501 not between", value1, value2, "aaf501");
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

        public Criteria andAaf502IsNull() {
            addCriterion("aaf502 is null");
            return (Criteria) this;
        }

        public Criteria andAaf502IsNotNull() {
            addCriterion("aaf502 is not null");
            return (Criteria) this;
        }

        public Criteria andAaf502EqualTo(String value) {
            addCriterion("aaf502 =", value, "aaf502");
            return (Criteria) this;
        }

        public Criteria andAaf502NotEqualTo(String value) {
            addCriterion("aaf502 <>", value, "aaf502");
            return (Criteria) this;
        }

        public Criteria andAaf502GreaterThan(String value) {
            addCriterion("aaf502 >", value, "aaf502");
            return (Criteria) this;
        }

        public Criteria andAaf502GreaterThanOrEqualTo(String value) {
            addCriterion("aaf502 >=", value, "aaf502");
            return (Criteria) this;
        }

        public Criteria andAaf502LessThan(String value) {
            addCriterion("aaf502 <", value, "aaf502");
            return (Criteria) this;
        }

        public Criteria andAaf502LessThanOrEqualTo(String value) {
            addCriterion("aaf502 <=", value, "aaf502");
            return (Criteria) this;
        }

        public Criteria andAaf502Like(String value) {
            addCriterion("aaf502 like", value, "aaf502");
            return (Criteria) this;
        }

        public Criteria andAaf502NotLike(String value) {
            addCriterion("aaf502 not like", value, "aaf502");
            return (Criteria) this;
        }

        public Criteria andAaf502In(List<String> values) {
            addCriterion("aaf502 in", values, "aaf502");
            return (Criteria) this;
        }

        public Criteria andAaf502NotIn(List<String> values) {
            addCriterion("aaf502 not in", values, "aaf502");
            return (Criteria) this;
        }

        public Criteria andAaf502Between(String value1, String value2) {
            addCriterion("aaf502 between", value1, value2, "aaf502");
            return (Criteria) this;
        }

        public Criteria andAaf502NotBetween(String value1, String value2) {
            addCriterion("aaf502 not between", value1, value2, "aaf502");
            return (Criteria) this;
        }

        public Criteria andAaf503IsNull() {
            addCriterion("aaf503 is null");
            return (Criteria) this;
        }

        public Criteria andAaf503IsNotNull() {
            addCriterion("aaf503 is not null");
            return (Criteria) this;
        }

        public Criteria andAaf503EqualTo(Date value) {
            addCriterion("aaf503 =", value, "aaf503");
            return (Criteria) this;
        }

        public Criteria andAaf503NotEqualTo(Date value) {
            addCriterion("aaf503 <>", value, "aaf503");
            return (Criteria) this;
        }

        public Criteria andAaf503GreaterThan(Date value) {
            addCriterion("aaf503 >", value, "aaf503");
            return (Criteria) this;
        }

        public Criteria andAaf503GreaterThanOrEqualTo(Date value) {
            addCriterion("aaf503 >=", value, "aaf503");
            return (Criteria) this;
        }

        public Criteria andAaf503LessThan(Date value) {
            addCriterion("aaf503 <", value, "aaf503");
            return (Criteria) this;
        }

        public Criteria andAaf503LessThanOrEqualTo(Date value) {
            addCriterion("aaf503 <=", value, "aaf503");
            return (Criteria) this;
        }

        public Criteria andAaf503In(List<Date> values) {
            addCriterion("aaf503 in", values, "aaf503");
            return (Criteria) this;
        }

        public Criteria andAaf503NotIn(List<Date> values) {
            addCriterion("aaf503 not in", values, "aaf503");
            return (Criteria) this;
        }

        public Criteria andAaf503Between(Date value1, Date value2) {
            addCriterion("aaf503 between", value1, value2, "aaf503");
            return (Criteria) this;
        }

        public Criteria andAaf503NotBetween(Date value1, Date value2) {
            addCriterion("aaf503 not between", value1, value2, "aaf503");
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