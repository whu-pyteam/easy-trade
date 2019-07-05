package com.pyteam.db.mbg.entity;

import java.util.ArrayList;
import java.util.List;

public class Af01Example {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public Af01Example() {
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

        public Criteria andAaf101IsNull() {
            addCriterion("aaf101 is null");
            return (Criteria) this;
        }

        public Criteria andAaf101IsNotNull() {
            addCriterion("aaf101 is not null");
            return (Criteria) this;
        }

        public Criteria andAaf101EqualTo(Integer value) {
            addCriterion("aaf101 =", value, "aaf101");
            return (Criteria) this;
        }

        public Criteria andAaf101NotEqualTo(Integer value) {
            addCriterion("aaf101 <>", value, "aaf101");
            return (Criteria) this;
        }

        public Criteria andAaf101GreaterThan(Integer value) {
            addCriterion("aaf101 >", value, "aaf101");
            return (Criteria) this;
        }

        public Criteria andAaf101GreaterThanOrEqualTo(Integer value) {
            addCriterion("aaf101 >=", value, "aaf101");
            return (Criteria) this;
        }

        public Criteria andAaf101LessThan(Integer value) {
            addCriterion("aaf101 <", value, "aaf101");
            return (Criteria) this;
        }

        public Criteria andAaf101LessThanOrEqualTo(Integer value) {
            addCriterion("aaf101 <=", value, "aaf101");
            return (Criteria) this;
        }

        public Criteria andAaf101In(List<Integer> values) {
            addCriterion("aaf101 in", values, "aaf101");
            return (Criteria) this;
        }

        public Criteria andAaf101NotIn(List<Integer> values) {
            addCriterion("aaf101 not in", values, "aaf101");
            return (Criteria) this;
        }

        public Criteria andAaf101Between(Integer value1, Integer value2) {
            addCriterion("aaf101 between", value1, value2, "aaf101");
            return (Criteria) this;
        }

        public Criteria andAaf101NotBetween(Integer value1, Integer value2) {
            addCriterion("aaf101 not between", value1, value2, "aaf101");
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

        public Criteria andAaf102IsNull() {
            addCriterion("aaf102 is null");
            return (Criteria) this;
        }

        public Criteria andAaf102IsNotNull() {
            addCriterion("aaf102 is not null");
            return (Criteria) this;
        }

        public Criteria andAaf102EqualTo(String value) {
            addCriterion("aaf102 =", value, "aaf102");
            return (Criteria) this;
        }

        public Criteria andAaf102NotEqualTo(String value) {
            addCriterion("aaf102 <>", value, "aaf102");
            return (Criteria) this;
        }

        public Criteria andAaf102GreaterThan(String value) {
            addCriterion("aaf102 >", value, "aaf102");
            return (Criteria) this;
        }

        public Criteria andAaf102GreaterThanOrEqualTo(String value) {
            addCriterion("aaf102 >=", value, "aaf102");
            return (Criteria) this;
        }

        public Criteria andAaf102LessThan(String value) {
            addCriterion("aaf102 <", value, "aaf102");
            return (Criteria) this;
        }

        public Criteria andAaf102LessThanOrEqualTo(String value) {
            addCriterion("aaf102 <=", value, "aaf102");
            return (Criteria) this;
        }

        public Criteria andAaf102Like(String value) {
            addCriterion("aaf102 like", value, "aaf102");
            return (Criteria) this;
        }

        public Criteria andAaf102NotLike(String value) {
            addCriterion("aaf102 not like", value, "aaf102");
            return (Criteria) this;
        }

        public Criteria andAaf102In(List<String> values) {
            addCriterion("aaf102 in", values, "aaf102");
            return (Criteria) this;
        }

        public Criteria andAaf102NotIn(List<String> values) {
            addCriterion("aaf102 not in", values, "aaf102");
            return (Criteria) this;
        }

        public Criteria andAaf102Between(String value1, String value2) {
            addCriterion("aaf102 between", value1, value2, "aaf102");
            return (Criteria) this;
        }

        public Criteria andAaf102NotBetween(String value1, String value2) {
            addCriterion("aaf102 not between", value1, value2, "aaf102");
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