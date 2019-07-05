package com.pyteam.db.mbg.entity;

import java.util.ArrayList;
import java.util.List;

public class Af06Example {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public Af06Example() {
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

        public Criteria andAaf601IsNull() {
            addCriterion("aaf601 is null");
            return (Criteria) this;
        }

        public Criteria andAaf601IsNotNull() {
            addCriterion("aaf601 is not null");
            return (Criteria) this;
        }

        public Criteria andAaf601EqualTo(Integer value) {
            addCriterion("aaf601 =", value, "aaf601");
            return (Criteria) this;
        }

        public Criteria andAaf601NotEqualTo(Integer value) {
            addCriterion("aaf601 <>", value, "aaf601");
            return (Criteria) this;
        }

        public Criteria andAaf601GreaterThan(Integer value) {
            addCriterion("aaf601 >", value, "aaf601");
            return (Criteria) this;
        }

        public Criteria andAaf601GreaterThanOrEqualTo(Integer value) {
            addCriterion("aaf601 >=", value, "aaf601");
            return (Criteria) this;
        }

        public Criteria andAaf601LessThan(Integer value) {
            addCriterion("aaf601 <", value, "aaf601");
            return (Criteria) this;
        }

        public Criteria andAaf601LessThanOrEqualTo(Integer value) {
            addCriterion("aaf601 <=", value, "aaf601");
            return (Criteria) this;
        }

        public Criteria andAaf601In(List<Integer> values) {
            addCriterion("aaf601 in", values, "aaf601");
            return (Criteria) this;
        }

        public Criteria andAaf601NotIn(List<Integer> values) {
            addCriterion("aaf601 not in", values, "aaf601");
            return (Criteria) this;
        }

        public Criteria andAaf601Between(Integer value1, Integer value2) {
            addCriterion("aaf601 between", value1, value2, "aaf601");
            return (Criteria) this;
        }

        public Criteria andAaf601NotBetween(Integer value1, Integer value2) {
            addCriterion("aaf601 not between", value1, value2, "aaf601");
            return (Criteria) this;
        }

        public Criteria andAaf602IsNull() {
            addCriterion("aaf602 is null");
            return (Criteria) this;
        }

        public Criteria andAaf602IsNotNull() {
            addCriterion("aaf602 is not null");
            return (Criteria) this;
        }

        public Criteria andAaf602EqualTo(String value) {
            addCriterion("aaf602 =", value, "aaf602");
            return (Criteria) this;
        }

        public Criteria andAaf602NotEqualTo(String value) {
            addCriterion("aaf602 <>", value, "aaf602");
            return (Criteria) this;
        }

        public Criteria andAaf602GreaterThan(String value) {
            addCriterion("aaf602 >", value, "aaf602");
            return (Criteria) this;
        }

        public Criteria andAaf602GreaterThanOrEqualTo(String value) {
            addCriterion("aaf602 >=", value, "aaf602");
            return (Criteria) this;
        }

        public Criteria andAaf602LessThan(String value) {
            addCriterion("aaf602 <", value, "aaf602");
            return (Criteria) this;
        }

        public Criteria andAaf602LessThanOrEqualTo(String value) {
            addCriterion("aaf602 <=", value, "aaf602");
            return (Criteria) this;
        }

        public Criteria andAaf602Like(String value) {
            addCriterion("aaf602 like", value, "aaf602");
            return (Criteria) this;
        }

        public Criteria andAaf602NotLike(String value) {
            addCriterion("aaf602 not like", value, "aaf602");
            return (Criteria) this;
        }

        public Criteria andAaf602In(List<String> values) {
            addCriterion("aaf602 in", values, "aaf602");
            return (Criteria) this;
        }

        public Criteria andAaf602NotIn(List<String> values) {
            addCriterion("aaf602 not in", values, "aaf602");
            return (Criteria) this;
        }

        public Criteria andAaf602Between(String value1, String value2) {
            addCriterion("aaf602 between", value1, value2, "aaf602");
            return (Criteria) this;
        }

        public Criteria andAaf602NotBetween(String value1, String value2) {
            addCriterion("aaf602 not between", value1, value2, "aaf602");
            return (Criteria) this;
        }

        public Criteria andAaf603IsNull() {
            addCriterion("aaf603 is null");
            return (Criteria) this;
        }

        public Criteria andAaf603IsNotNull() {
            addCriterion("aaf603 is not null");
            return (Criteria) this;
        }

        public Criteria andAaf603EqualTo(Integer value) {
            addCriterion("aaf603 =", value, "aaf603");
            return (Criteria) this;
        }

        public Criteria andAaf603NotEqualTo(Integer value) {
            addCriterion("aaf603 <>", value, "aaf603");
            return (Criteria) this;
        }

        public Criteria andAaf603GreaterThan(Integer value) {
            addCriterion("aaf603 >", value, "aaf603");
            return (Criteria) this;
        }

        public Criteria andAaf603GreaterThanOrEqualTo(Integer value) {
            addCriterion("aaf603 >=", value, "aaf603");
            return (Criteria) this;
        }

        public Criteria andAaf603LessThan(Integer value) {
            addCriterion("aaf603 <", value, "aaf603");
            return (Criteria) this;
        }

        public Criteria andAaf603LessThanOrEqualTo(Integer value) {
            addCriterion("aaf603 <=", value, "aaf603");
            return (Criteria) this;
        }

        public Criteria andAaf603In(List<Integer> values) {
            addCriterion("aaf603 in", values, "aaf603");
            return (Criteria) this;
        }

        public Criteria andAaf603NotIn(List<Integer> values) {
            addCriterion("aaf603 not in", values, "aaf603");
            return (Criteria) this;
        }

        public Criteria andAaf603Between(Integer value1, Integer value2) {
            addCriterion("aaf603 between", value1, value2, "aaf603");
            return (Criteria) this;
        }

        public Criteria andAaf603NotBetween(Integer value1, Integer value2) {
            addCriterion("aaf603 not between", value1, value2, "aaf603");
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