package com.pyteam.db.mbg.entity;

import java.util.ArrayList;
import java.util.List;

public class Ae01Example {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public Ae01Example() {
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

        public Criteria andAae101IsNull() {
            addCriterion("aae101 is null");
            return (Criteria) this;
        }

        public Criteria andAae101IsNotNull() {
            addCriterion("aae101 is not null");
            return (Criteria) this;
        }

        public Criteria andAae101EqualTo(Integer value) {
            addCriterion("aae101 =", value, "aae101");
            return (Criteria) this;
        }

        public Criteria andAae101NotEqualTo(Integer value) {
            addCriterion("aae101 <>", value, "aae101");
            return (Criteria) this;
        }

        public Criteria andAae101GreaterThan(Integer value) {
            addCriterion("aae101 >", value, "aae101");
            return (Criteria) this;
        }

        public Criteria andAae101GreaterThanOrEqualTo(Integer value) {
            addCriterion("aae101 >=", value, "aae101");
            return (Criteria) this;
        }

        public Criteria andAae101LessThan(Integer value) {
            addCriterion("aae101 <", value, "aae101");
            return (Criteria) this;
        }

        public Criteria andAae101LessThanOrEqualTo(Integer value) {
            addCriterion("aae101 <=", value, "aae101");
            return (Criteria) this;
        }

        public Criteria andAae101In(List<Integer> values) {
            addCriterion("aae101 in", values, "aae101");
            return (Criteria) this;
        }

        public Criteria andAae101NotIn(List<Integer> values) {
            addCriterion("aae101 not in", values, "aae101");
            return (Criteria) this;
        }

        public Criteria andAae101Between(Integer value1, Integer value2) {
            addCriterion("aae101 between", value1, value2, "aae101");
            return (Criteria) this;
        }

        public Criteria andAae101NotBetween(Integer value1, Integer value2) {
            addCriterion("aae101 not between", value1, value2, "aae101");
            return (Criteria) this;
        }

        public Criteria andAad301IsNull() {
            addCriterion("aad301 is null");
            return (Criteria) this;
        }

        public Criteria andAad301IsNotNull() {
            addCriterion("aad301 is not null");
            return (Criteria) this;
        }

        public Criteria andAad301EqualTo(Integer value) {
            addCriterion("aad301 =", value, "aad301");
            return (Criteria) this;
        }

        public Criteria andAad301NotEqualTo(Integer value) {
            addCriterion("aad301 <>", value, "aad301");
            return (Criteria) this;
        }

        public Criteria andAad301GreaterThan(Integer value) {
            addCriterion("aad301 >", value, "aad301");
            return (Criteria) this;
        }

        public Criteria andAad301GreaterThanOrEqualTo(Integer value) {
            addCriterion("aad301 >=", value, "aad301");
            return (Criteria) this;
        }

        public Criteria andAad301LessThan(Integer value) {
            addCriterion("aad301 <", value, "aad301");
            return (Criteria) this;
        }

        public Criteria andAad301LessThanOrEqualTo(Integer value) {
            addCriterion("aad301 <=", value, "aad301");
            return (Criteria) this;
        }

        public Criteria andAad301In(List<Integer> values) {
            addCriterion("aad301 in", values, "aad301");
            return (Criteria) this;
        }

        public Criteria andAad301NotIn(List<Integer> values) {
            addCriterion("aad301 not in", values, "aad301");
            return (Criteria) this;
        }

        public Criteria andAad301Between(Integer value1, Integer value2) {
            addCriterion("aad301 between", value1, value2, "aad301");
            return (Criteria) this;
        }

        public Criteria andAad301NotBetween(Integer value1, Integer value2) {
            addCriterion("aad301 not between", value1, value2, "aad301");
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