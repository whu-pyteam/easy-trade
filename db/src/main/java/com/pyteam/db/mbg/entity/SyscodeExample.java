package com.pyteam.db.mbg.entity;

import java.util.ArrayList;
import java.util.List;

public class SyscodeExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public SyscodeExample() {
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

        public Criteria andSyscodeidIsNull() {
            addCriterion("syscodeid is null");
            return (Criteria) this;
        }

        public Criteria andSyscodeidIsNotNull() {
            addCriterion("syscodeid is not null");
            return (Criteria) this;
        }

        public Criteria andSyscodeidEqualTo(Integer value) {
            addCriterion("syscodeid =", value, "syscodeid");
            return (Criteria) this;
        }

        public Criteria andSyscodeidNotEqualTo(Integer value) {
            addCriterion("syscodeid <>", value, "syscodeid");
            return (Criteria) this;
        }

        public Criteria andSyscodeidGreaterThan(Integer value) {
            addCriterion("syscodeid >", value, "syscodeid");
            return (Criteria) this;
        }

        public Criteria andSyscodeidGreaterThanOrEqualTo(Integer value) {
            addCriterion("syscodeid >=", value, "syscodeid");
            return (Criteria) this;
        }

        public Criteria andSyscodeidLessThan(Integer value) {
            addCriterion("syscodeid <", value, "syscodeid");
            return (Criteria) this;
        }

        public Criteria andSyscodeidLessThanOrEqualTo(Integer value) {
            addCriterion("syscodeid <=", value, "syscodeid");
            return (Criteria) this;
        }

        public Criteria andSyscodeidIn(List<Integer> values) {
            addCriterion("syscodeid in", values, "syscodeid");
            return (Criteria) this;
        }

        public Criteria andSyscodeidNotIn(List<Integer> values) {
            addCriterion("syscodeid not in", values, "syscodeid");
            return (Criteria) this;
        }

        public Criteria andSyscodeidBetween(Integer value1, Integer value2) {
            addCriterion("syscodeid between", value1, value2, "syscodeid");
            return (Criteria) this;
        }

        public Criteria andSyscodeidNotBetween(Integer value1, Integer value2) {
            addCriterion("syscodeid not between", value1, value2, "syscodeid");
            return (Criteria) this;
        }

        public Criteria andIdnameIsNull() {
            addCriterion("idname is null");
            return (Criteria) this;
        }

        public Criteria andIdnameIsNotNull() {
            addCriterion("idname is not null");
            return (Criteria) this;
        }

        public Criteria andIdnameEqualTo(String value) {
            addCriterion("idname =", value, "idname");
            return (Criteria) this;
        }

        public Criteria andIdnameNotEqualTo(String value) {
            addCriterion("idname <>", value, "idname");
            return (Criteria) this;
        }

        public Criteria andIdnameGreaterThan(String value) {
            addCriterion("idname >", value, "idname");
            return (Criteria) this;
        }

        public Criteria andIdnameGreaterThanOrEqualTo(String value) {
            addCriterion("idname >=", value, "idname");
            return (Criteria) this;
        }

        public Criteria andIdnameLessThan(String value) {
            addCriterion("idname <", value, "idname");
            return (Criteria) this;
        }

        public Criteria andIdnameLessThanOrEqualTo(String value) {
            addCriterion("idname <=", value, "idname");
            return (Criteria) this;
        }

        public Criteria andIdnameLike(String value) {
            addCriterion("idname like", value, "idname");
            return (Criteria) this;
        }

        public Criteria andIdnameNotLike(String value) {
            addCriterion("idname not like", value, "idname");
            return (Criteria) this;
        }

        public Criteria andIdnameIn(List<String> values) {
            addCriterion("idname in", values, "idname");
            return (Criteria) this;
        }

        public Criteria andIdnameNotIn(List<String> values) {
            addCriterion("idname not in", values, "idname");
            return (Criteria) this;
        }

        public Criteria andIdnameBetween(String value1, String value2) {
            addCriterion("idname between", value1, value2, "idname");
            return (Criteria) this;
        }

        public Criteria andIdnameNotBetween(String value1, String value2) {
            addCriterion("idname not between", value1, value2, "idname");
            return (Criteria) this;
        }

        public Criteria andParentidIsNull() {
            addCriterion("parentid is null");
            return (Criteria) this;
        }

        public Criteria andParentidIsNotNull() {
            addCriterion("parentid is not null");
            return (Criteria) this;
        }

        public Criteria andParentidEqualTo(String value) {
            addCriterion("parentid =", value, "parentid");
            return (Criteria) this;
        }

        public Criteria andParentidNotEqualTo(String value) {
            addCriterion("parentid <>", value, "parentid");
            return (Criteria) this;
        }

        public Criteria andParentidGreaterThan(String value) {
            addCriterion("parentid >", value, "parentid");
            return (Criteria) this;
        }

        public Criteria andParentidGreaterThanOrEqualTo(String value) {
            addCriterion("parentid >=", value, "parentid");
            return (Criteria) this;
        }

        public Criteria andParentidLessThan(String value) {
            addCriterion("parentid <", value, "parentid");
            return (Criteria) this;
        }

        public Criteria andParentidLessThanOrEqualTo(String value) {
            addCriterion("parentid <=", value, "parentid");
            return (Criteria) this;
        }

        public Criteria andParentidLike(String value) {
            addCriterion("parentid like", value, "parentid");
            return (Criteria) this;
        }

        public Criteria andParentidNotLike(String value) {
            addCriterion("parentid not like", value, "parentid");
            return (Criteria) this;
        }

        public Criteria andParentidIn(List<String> values) {
            addCriterion("parentid in", values, "parentid");
            return (Criteria) this;
        }

        public Criteria andParentidNotIn(List<String> values) {
            addCriterion("parentid not in", values, "parentid");
            return (Criteria) this;
        }

        public Criteria andParentidBetween(String value1, String value2) {
            addCriterion("parentid between", value1, value2, "parentid");
            return (Criteria) this;
        }

        public Criteria andParentidNotBetween(String value1, String value2) {
            addCriterion("parentid not between", value1, value2, "parentid");
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