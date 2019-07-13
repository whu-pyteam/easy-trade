package com.pyteam.db.mbg.entity;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Ad01Example {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public Ad01Example() {
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

        public Criteria andAad101IsNull() {
            addCriterion("aad101 is null");
            return (Criteria) this;
        }

        public Criteria andAad101IsNotNull() {
            addCriterion("aad101 is not null");
            return (Criteria) this;
        }

        public Criteria andAad101EqualTo(Integer value) {
            addCriterion("aad101 =", value, "aad101");
            return (Criteria) this;
        }

        public Criteria andAad101NotEqualTo(Integer value) {
            addCriterion("aad101 <>", value, "aad101");
            return (Criteria) this;
        }

        public Criteria andAad101GreaterThan(Integer value) {
            addCriterion("aad101 >", value, "aad101");
            return (Criteria) this;
        }

        public Criteria andAad101GreaterThanOrEqualTo(Integer value) {
            addCriterion("aad101 >=", value, "aad101");
            return (Criteria) this;
        }

        public Criteria andAad101LessThan(Integer value) {
            addCriterion("aad101 <", value, "aad101");
            return (Criteria) this;
        }

        public Criteria andAad101LessThanOrEqualTo(Integer value) {
            addCriterion("aad101 <=", value, "aad101");
            return (Criteria) this;
        }

        public Criteria andAad101In(List<Integer> values) {
            addCriterion("aad101 in", values, "aad101");
            return (Criteria) this;
        }

        public Criteria andAad101NotIn(List<Integer> values) {
            addCriterion("aad101 not in", values, "aad101");
            return (Criteria) this;
        }

        public Criteria andAad101Between(Integer value1, Integer value2) {
            addCriterion("aad101 between", value1, value2, "aad101");
            return (Criteria) this;
        }

        public Criteria andAad101NotBetween(Integer value1, Integer value2) {
            addCriterion("aad101 not between", value1, value2, "aad101");
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

        public Criteria andAad102IsNull() {
            addCriterion("aad102 is null");
            return (Criteria) this;
        }

        public Criteria andAad102IsNotNull() {
            addCriterion("aad102 is not null");
            return (Criteria) this;
        }

        public Criteria andAad102EqualTo(String value) {
            addCriterion("aad102 =", value, "aad102");
            return (Criteria) this;
        }

        public Criteria andAad102NotEqualTo(String value) {
            addCriterion("aad102 <>", value, "aad102");
            return (Criteria) this;
        }

        public Criteria andAad102GreaterThan(String value) {
            addCriterion("aad102 >", value, "aad102");
            return (Criteria) this;
        }

        public Criteria andAad102GreaterThanOrEqualTo(String value) {
            addCriterion("aad102 >=", value, "aad102");
            return (Criteria) this;
        }

        public Criteria andAad102LessThan(String value) {
            addCriterion("aad102 <", value, "aad102");
            return (Criteria) this;
        }

        public Criteria andAad102LessThanOrEqualTo(String value) {
            addCriterion("aad102 <=", value, "aad102");
            return (Criteria) this;
        }

        public Criteria andAad102Like(String value) {
            addCriterion("aad102 like", value, "aad102");
            return (Criteria) this;
        }

        public Criteria andAad102NotLike(String value) {
            addCriterion("aad102 not like", value, "aad102");
            return (Criteria) this;
        }

        public Criteria andAad102In(List<String> values) {
            addCriterion("aad102 in", values, "aad102");
            return (Criteria) this;
        }

        public Criteria andAad102NotIn(List<String> values) {
            addCriterion("aad102 not in", values, "aad102");
            return (Criteria) this;
        }

        public Criteria andAad102Between(String value1, String value2) {
            addCriterion("aad102 between", value1, value2, "aad102");
            return (Criteria) this;
        }

        public Criteria andAad102NotBetween(String value1, String value2) {
            addCriterion("aad102 not between", value1, value2, "aad102");
            return (Criteria) this;
        }

        public Criteria andAad103IsNull() {
            addCriterion("aad103 is null");
            return (Criteria) this;
        }

        public Criteria andAad103IsNotNull() {
            addCriterion("aad103 is not null");
            return (Criteria) this;
        }

        public Criteria andAad103EqualTo(String value) {
            addCriterion("aad103 =", value, "aad103");
            return (Criteria) this;
        }

        public Criteria andAad103NotEqualTo(String value) {
            addCriterion("aad103 <>", value, "aad103");
            return (Criteria) this;
        }

        public Criteria andAad103GreaterThan(String value) {
            addCriterion("aad103 >", value, "aad103");
            return (Criteria) this;
        }

        public Criteria andAad103GreaterThanOrEqualTo(String value) {
            addCriterion("aad103 >=", value, "aad103");
            return (Criteria) this;
        }

        public Criteria andAad103LessThan(String value) {
            addCriterion("aad103 <", value, "aad103");
            return (Criteria) this;
        }

        public Criteria andAad103LessThanOrEqualTo(String value) {
            addCriterion("aad103 <=", value, "aad103");
            return (Criteria) this;
        }

        public Criteria andAad103Like(String value) {
            addCriterion("aad103 like", value, "aad103");
            return (Criteria) this;
        }

        public Criteria andAad103NotLike(String value) {
            addCriterion("aad103 not like", value, "aad103");
            return (Criteria) this;
        }

        public Criteria andAad103In(List<String> values) {
            addCriterion("aad103 in", values, "aad103");
            return (Criteria) this;
        }

        public Criteria andAad103NotIn(List<String> values) {
            addCriterion("aad103 not in", values, "aad103");
            return (Criteria) this;
        }

        public Criteria andAad103Between(String value1, String value2) {
            addCriterion("aad103 between", value1, value2, "aad103");
            return (Criteria) this;
        }

        public Criteria andAad103NotBetween(String value1, String value2) {
            addCriterion("aad103 not between", value1, value2, "aad103");
            return (Criteria) this;
        }

        public Criteria andAad104IsNull() {
            addCriterion("aad104 is null");
            return (Criteria) this;
        }

        public Criteria andAad104IsNotNull() {
            addCriterion("aad104 is not null");
            return (Criteria) this;
        }

        public Criteria andAad104EqualTo(Long value) {
            addCriterion("aad104 =", value, "aad104");
            return (Criteria) this;
        }

        public Criteria andAad104NotEqualTo(Long value) {
            addCriterion("aad104 <>", value, "aad104");
            return (Criteria) this;
        }

        public Criteria andAad104GreaterThan(Long value) {
            addCriterion("aad104 >", value, "aad104");
            return (Criteria) this;
        }

        public Criteria andAad104GreaterThanOrEqualTo(Long value) {
            addCriterion("aad104 >=", value, "aad104");
            return (Criteria) this;
        }

        public Criteria andAad104LessThan(Long value) {
            addCriterion("aad104 <", value, "aad104");
            return (Criteria) this;
        }

        public Criteria andAad104LessThanOrEqualTo(Long value) {
            addCriterion("aad104 <=", value, "aad104");
            return (Criteria) this;
        }

        public Criteria andAad104In(List<Long> values) {
            addCriterion("aad104 in", values, "aad104");
            return (Criteria) this;
        }

        public Criteria andAad104NotIn(List<Long> values) {
            addCriterion("aad104 not in", values, "aad104");
            return (Criteria) this;
        }

        public Criteria andAad104Between(Long value1, Long value2) {
            addCriterion("aad104 between", value1, value2, "aad104");
            return (Criteria) this;
        }

        public Criteria andAad104NotBetween(Long value1, Long value2) {
            addCriterion("aad104 not between", value1, value2, "aad104");
            return (Criteria) this;
        }

        public Criteria andAad106IsNull() {
            addCriterion("aad106 is null");
            return (Criteria) this;
        }

        public Criteria andAad106IsNotNull() {
            addCriterion("aad106 is not null");
            return (Criteria) this;
        }

        public Criteria andAad106EqualTo(Integer value) {
            addCriterion("aad106 =", value, "aad106");
            return (Criteria) this;
        }

        public Criteria andAad106NotEqualTo(Integer value) {
            addCriterion("aad106 <>", value, "aad106");
            return (Criteria) this;
        }

        public Criteria andAad106GreaterThan(Integer value) {
            addCriterion("aad106 >", value, "aad106");
            return (Criteria) this;
        }

        public Criteria andAad106GreaterThanOrEqualTo(Integer value) {
            addCriterion("aad106 >=", value, "aad106");
            return (Criteria) this;
        }

        public Criteria andAad106LessThan(Integer value) {
            addCriterion("aad106 <", value, "aad106");
            return (Criteria) this;
        }

        public Criteria andAad106LessThanOrEqualTo(Integer value) {
            addCriterion("aad106 <=", value, "aad106");
            return (Criteria) this;
        }

        public Criteria andAad106In(List<Integer> values) {
            addCriterion("aad106 in", values, "aad106");
            return (Criteria) this;
        }

        public Criteria andAad106NotIn(List<Integer> values) {
            addCriterion("aad106 not in", values, "aad106");
            return (Criteria) this;
        }

        public Criteria andAad106Between(Integer value1, Integer value2) {
            addCriterion("aad106 between", value1, value2, "aad106");
            return (Criteria) this;
        }

        public Criteria andAad106NotBetween(Integer value1, Integer value2) {
            addCriterion("aad106 not between", value1, value2, "aad106");
            return (Criteria) this;
        }

        public Criteria andAad107IsNull() {
            addCriterion("aad107 is null");
            return (Criteria) this;
        }

        public Criteria andAad107IsNotNull() {
            addCriterion("aad107 is not null");
            return (Criteria) this;
        }

        public Criteria andAad107EqualTo(Date value) {
            addCriterion("aad107 =", value, "aad107");
            return (Criteria) this;
        }

        public Criteria andAad107NotEqualTo(Date value) {
            addCriterion("aad107 <>", value, "aad107");
            return (Criteria) this;
        }

        public Criteria andAad107GreaterThan(Date value) {
            addCriterion("aad107 >", value, "aad107");
            return (Criteria) this;
        }

        public Criteria andAad107GreaterThanOrEqualTo(Date value) {
            addCriterion("aad107 >=", value, "aad107");
            return (Criteria) this;
        }

        public Criteria andAad107LessThan(Date value) {
            addCriterion("aad107 <", value, "aad107");
            return (Criteria) this;
        }

        public Criteria andAad107LessThanOrEqualTo(Date value) {
            addCriterion("aad107 <=", value, "aad107");
            return (Criteria) this;
        }

        public Criteria andAad107In(List<Date> values) {
            addCriterion("aad107 in", values, "aad107");
            return (Criteria) this;
        }

        public Criteria andAad107NotIn(List<Date> values) {
            addCriterion("aad107 not in", values, "aad107");
            return (Criteria) this;
        }

        public Criteria andAad107Between(Date value1, Date value2) {
            addCriterion("aad107 between", value1, value2, "aad107");
            return (Criteria) this;
        }

        public Criteria andAad107NotBetween(Date value1, Date value2) {
            addCriterion("aad107 not between", value1, value2, "aad107");
            return (Criteria) this;
        }

        public Criteria andAad108IsNull() {
            addCriterion("aad108 is null");
            return (Criteria) this;
        }

        public Criteria andAad108IsNotNull() {
            addCriterion("aad108 is not null");
            return (Criteria) this;
        }

        public Criteria andAad108EqualTo(Date value) {
            addCriterion("aad108 =", value, "aad108");
            return (Criteria) this;
        }

        public Criteria andAad108NotEqualTo(Date value) {
            addCriterion("aad108 <>", value, "aad108");
            return (Criteria) this;
        }

        public Criteria andAad108GreaterThan(Date value) {
            addCriterion("aad108 >", value, "aad108");
            return (Criteria) this;
        }

        public Criteria andAad108GreaterThanOrEqualTo(Date value) {
            addCriterion("aad108 >=", value, "aad108");
            return (Criteria) this;
        }

        public Criteria andAad108LessThan(Date value) {
            addCriterion("aad108 <", value, "aad108");
            return (Criteria) this;
        }

        public Criteria andAad108LessThanOrEqualTo(Date value) {
            addCriterion("aad108 <=", value, "aad108");
            return (Criteria) this;
        }

        public Criteria andAad108In(List<Date> values) {
            addCriterion("aad108 in", values, "aad108");
            return (Criteria) this;
        }

        public Criteria andAad108NotIn(List<Date> values) {
            addCriterion("aad108 not in", values, "aad108");
            return (Criteria) this;
        }

        public Criteria andAad108Between(Date value1, Date value2) {
            addCriterion("aad108 between", value1, value2, "aad108");
            return (Criteria) this;
        }

        public Criteria andAad108NotBetween(Date value1, Date value2) {
            addCriterion("aad108 not between", value1, value2, "aad108");
            return (Criteria) this;
        }

        public Criteria andAad105IsNull() {
            addCriterion("aad105 is null");
            return (Criteria) this;
        }

        public Criteria andAad105IsNotNull() {
            addCriterion("aad105 is not null");
            return (Criteria) this;
        }

        public Criteria andAad105EqualTo(String value) {
            addCriterion("aad105 =", value, "aad105");
            return (Criteria) this;
        }

        public Criteria andAad105NotEqualTo(String value) {
            addCriterion("aad105 <>", value, "aad105");
            return (Criteria) this;
        }

        public Criteria andAad105GreaterThan(String value) {
            addCriterion("aad105 >", value, "aad105");
            return (Criteria) this;
        }

        public Criteria andAad105GreaterThanOrEqualTo(String value) {
            addCriterion("aad105 >=", value, "aad105");
            return (Criteria) this;
        }

        public Criteria andAad105LessThan(String value) {
            addCriterion("aad105 <", value, "aad105");
            return (Criteria) this;
        }

        public Criteria andAad105LessThanOrEqualTo(String value) {
            addCriterion("aad105 <=", value, "aad105");
            return (Criteria) this;
        }

        public Criteria andAad105Like(String value) {
            addCriterion("aad105 like", value, "aad105");
            return (Criteria) this;
        }

        public Criteria andAad105NotLike(String value) {
            addCriterion("aad105 not like", value, "aad105");
            return (Criteria) this;
        }

        public Criteria andAad105In(List<String> values) {
            addCriterion("aad105 in", values, "aad105");
            return (Criteria) this;
        }

        public Criteria andAad105NotIn(List<String> values) {
            addCriterion("aad105 not in", values, "aad105");
            return (Criteria) this;
        }

        public Criteria andAad105Between(String value1, String value2) {
            addCriterion("aad105 between", value1, value2, "aad105");
            return (Criteria) this;
        }

        public Criteria andAad105NotBetween(String value1, String value2) {
            addCriterion("aad105 not between", value1, value2, "aad105");
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