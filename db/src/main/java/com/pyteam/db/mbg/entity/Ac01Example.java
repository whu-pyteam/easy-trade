package com.pyteam.db.mbg.entity;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Ac01Example {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public Ac01Example() {
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

        public Criteria andAac201IsNull() {
            addCriterion("aac201 is null");
            return (Criteria) this;
        }

        public Criteria andAac201IsNotNull() {
            addCriterion("aac201 is not null");
            return (Criteria) this;
        }

        public Criteria andAac201EqualTo(Integer value) {
            addCriterion("aac201 =", value, "aac201");
            return (Criteria) this;
        }

        public Criteria andAac201NotEqualTo(Integer value) {
            addCriterion("aac201 <>", value, "aac201");
            return (Criteria) this;
        }

        public Criteria andAac201GreaterThan(Integer value) {
            addCriterion("aac201 >", value, "aac201");
            return (Criteria) this;
        }

        public Criteria andAac201GreaterThanOrEqualTo(Integer value) {
            addCriterion("aac201 >=", value, "aac201");
            return (Criteria) this;
        }

        public Criteria andAac201LessThan(Integer value) {
            addCriterion("aac201 <", value, "aac201");
            return (Criteria) this;
        }

        public Criteria andAac201LessThanOrEqualTo(Integer value) {
            addCriterion("aac201 <=", value, "aac201");
            return (Criteria) this;
        }

        public Criteria andAac201In(List<Integer> values) {
            addCriterion("aac201 in", values, "aac201");
            return (Criteria) this;
        }

        public Criteria andAac201NotIn(List<Integer> values) {
            addCriterion("aac201 not in", values, "aac201");
            return (Criteria) this;
        }

        public Criteria andAac201Between(Integer value1, Integer value2) {
            addCriterion("aac201 between", value1, value2, "aac201");
            return (Criteria) this;
        }

        public Criteria andAac201NotBetween(Integer value1, Integer value2) {
            addCriterion("aac201 not between", value1, value2, "aac201");
            return (Criteria) this;
        }

        public Criteria andAac102IsNull() {
            addCriterion("aac102 is null");
            return (Criteria) this;
        }

        public Criteria andAac102IsNotNull() {
            addCriterion("aac102 is not null");
            return (Criteria) this;
        }

        public Criteria andAac102EqualTo(String value) {
            addCriterion("aac102 =", value, "aac102");
            return (Criteria) this;
        }

        public Criteria andAac102NotEqualTo(String value) {
            addCriterion("aac102 <>", value, "aac102");
            return (Criteria) this;
        }

        public Criteria andAac102GreaterThan(String value) {
            addCriterion("aac102 >", value, "aac102");
            return (Criteria) this;
        }

        public Criteria andAac102GreaterThanOrEqualTo(String value) {
            addCriterion("aac102 >=", value, "aac102");
            return (Criteria) this;
        }

        public Criteria andAac102LessThan(String value) {
            addCriterion("aac102 <", value, "aac102");
            return (Criteria) this;
        }

        public Criteria andAac102LessThanOrEqualTo(String value) {
            addCriterion("aac102 <=", value, "aac102");
            return (Criteria) this;
        }

        public Criteria andAac102Like(String value) {
            addCriterion("aac102 like", value, "aac102");
            return (Criteria) this;
        }

        public Criteria andAac102NotLike(String value) {
            addCriterion("aac102 not like", value, "aac102");
            return (Criteria) this;
        }

        public Criteria andAac102In(List<String> values) {
            addCriterion("aac102 in", values, "aac102");
            return (Criteria) this;
        }

        public Criteria andAac102NotIn(List<String> values) {
            addCriterion("aac102 not in", values, "aac102");
            return (Criteria) this;
        }

        public Criteria andAac102Between(String value1, String value2) {
            addCriterion("aac102 between", value1, value2, "aac102");
            return (Criteria) this;
        }

        public Criteria andAac102NotBetween(String value1, String value2) {
            addCriterion("aac102 not between", value1, value2, "aac102");
            return (Criteria) this;
        }

        public Criteria andAac103IsNull() {
            addCriterion("aac103 is null");
            return (Criteria) this;
        }

        public Criteria andAac103IsNotNull() {
            addCriterion("aac103 is not null");
            return (Criteria) this;
        }

        public Criteria andAac103EqualTo(String value) {
            addCriterion("aac103 =", value, "aac103");
            return (Criteria) this;
        }

        public Criteria andAac103NotEqualTo(String value) {
            addCriterion("aac103 <>", value, "aac103");
            return (Criteria) this;
        }

        public Criteria andAac103GreaterThan(String value) {
            addCriterion("aac103 >", value, "aac103");
            return (Criteria) this;
        }

        public Criteria andAac103GreaterThanOrEqualTo(String value) {
            addCriterion("aac103 >=", value, "aac103");
            return (Criteria) this;
        }

        public Criteria andAac103LessThan(String value) {
            addCriterion("aac103 <", value, "aac103");
            return (Criteria) this;
        }

        public Criteria andAac103LessThanOrEqualTo(String value) {
            addCriterion("aac103 <=", value, "aac103");
            return (Criteria) this;
        }

        public Criteria andAac103Like(String value) {
            addCriterion("aac103 like", value, "aac103");
            return (Criteria) this;
        }

        public Criteria andAac103NotLike(String value) {
            addCriterion("aac103 not like", value, "aac103");
            return (Criteria) this;
        }

        public Criteria andAac103In(List<String> values) {
            addCriterion("aac103 in", values, "aac103");
            return (Criteria) this;
        }

        public Criteria andAac103NotIn(List<String> values) {
            addCriterion("aac103 not in", values, "aac103");
            return (Criteria) this;
        }

        public Criteria andAac103Between(String value1, String value2) {
            addCriterion("aac103 between", value1, value2, "aac103");
            return (Criteria) this;
        }

        public Criteria andAac103NotBetween(String value1, String value2) {
            addCriterion("aac103 not between", value1, value2, "aac103");
            return (Criteria) this;
        }

        public Criteria andAac104IsNull() {
            addCriterion("aac104 is null");
            return (Criteria) this;
        }

        public Criteria andAac104IsNotNull() {
            addCriterion("aac104 is not null");
            return (Criteria) this;
        }

        public Criteria andAac104EqualTo(String value) {
            addCriterion("aac104 =", value, "aac104");
            return (Criteria) this;
        }

        public Criteria andAac104NotEqualTo(String value) {
            addCriterion("aac104 <>", value, "aac104");
            return (Criteria) this;
        }

        public Criteria andAac104GreaterThan(String value) {
            addCriterion("aac104 >", value, "aac104");
            return (Criteria) this;
        }

        public Criteria andAac104GreaterThanOrEqualTo(String value) {
            addCriterion("aac104 >=", value, "aac104");
            return (Criteria) this;
        }

        public Criteria andAac104LessThan(String value) {
            addCriterion("aac104 <", value, "aac104");
            return (Criteria) this;
        }

        public Criteria andAac104LessThanOrEqualTo(String value) {
            addCriterion("aac104 <=", value, "aac104");
            return (Criteria) this;
        }

        public Criteria andAac104Like(String value) {
            addCriterion("aac104 like", value, "aac104");
            return (Criteria) this;
        }

        public Criteria andAac104NotLike(String value) {
            addCriterion("aac104 not like", value, "aac104");
            return (Criteria) this;
        }

        public Criteria andAac104In(List<String> values) {
            addCriterion("aac104 in", values, "aac104");
            return (Criteria) this;
        }

        public Criteria andAac104NotIn(List<String> values) {
            addCriterion("aac104 not in", values, "aac104");
            return (Criteria) this;
        }

        public Criteria andAac104Between(String value1, String value2) {
            addCriterion("aac104 between", value1, value2, "aac104");
            return (Criteria) this;
        }

        public Criteria andAac104NotBetween(String value1, String value2) {
            addCriterion("aac104 not between", value1, value2, "aac104");
            return (Criteria) this;
        }

        public Criteria andAac105IsNull() {
            addCriterion("aac105 is null");
            return (Criteria) this;
        }

        public Criteria andAac105IsNotNull() {
            addCriterion("aac105 is not null");
            return (Criteria) this;
        }

        public Criteria andAac105EqualTo(Long value) {
            addCriterion("aac105 =", value, "aac105");
            return (Criteria) this;
        }

        public Criteria andAac105NotEqualTo(Long value) {
            addCriterion("aac105 <>", value, "aac105");
            return (Criteria) this;
        }

        public Criteria andAac105GreaterThan(Long value) {
            addCriterion("aac105 >", value, "aac105");
            return (Criteria) this;
        }

        public Criteria andAac105GreaterThanOrEqualTo(Long value) {
            addCriterion("aac105 >=", value, "aac105");
            return (Criteria) this;
        }

        public Criteria andAac105LessThan(Long value) {
            addCriterion("aac105 <", value, "aac105");
            return (Criteria) this;
        }

        public Criteria andAac105LessThanOrEqualTo(Long value) {
            addCriterion("aac105 <=", value, "aac105");
            return (Criteria) this;
        }

        public Criteria andAac105In(List<Long> values) {
            addCriterion("aac105 in", values, "aac105");
            return (Criteria) this;
        }

        public Criteria andAac105NotIn(List<Long> values) {
            addCriterion("aac105 not in", values, "aac105");
            return (Criteria) this;
        }

        public Criteria andAac105Between(BigDecimal value1, BigDecimal value2) {
            addCriterion("aac105 between", value1, value2, "aac105");
            return (Criteria) this;
        }

        public Criteria andAac105NotBetween(Long value1, Long value2) {
            addCriterion("aac105 not between", value1, value2, "aac105");
            return (Criteria) this;
        }

        public Criteria andAac106IsNull() {
            addCriterion("aac106 is null");
            return (Criteria) this;
        }

        public Criteria andAac106IsNotNull() {
            addCriterion("aac106 is not null");
            return (Criteria) this;
        }

        public Criteria andAac106EqualTo(String value) {
            addCriterion("aac106 =", value, "aac106");
            return (Criteria) this;
        }

        public Criteria andAac106NotEqualTo(String value) {
            addCriterion("aac106 <>", value, "aac106");
            return (Criteria) this;
        }

        public Criteria andAac106GreaterThan(String value) {
            addCriterion("aac106 >", value, "aac106");
            return (Criteria) this;
        }

        public Criteria andAac106GreaterThanOrEqualTo(String value) {
            addCriterion("aac106 >=", value, "aac106");
            return (Criteria) this;
        }

        public Criteria andAac106LessThan(String value) {
            addCriterion("aac106 <", value, "aac106");
            return (Criteria) this;
        }

        public Criteria andAac106LessThanOrEqualTo(String value) {
            addCriterion("aac106 <=", value, "aac106");
            return (Criteria) this;
        }

        public Criteria andAac106Like(String value) {
            addCriterion("aac106 like", value, "aac106");
            return (Criteria) this;
        }

        public Criteria andAac106NotLike(String value) {
            addCriterion("aac106 not like", value, "aac106");
            return (Criteria) this;
        }

        public Criteria andAac106In(List<String> values) {
            addCriterion("aac106 in", values, "aac106");
            return (Criteria) this;
        }

        public Criteria andAac106NotIn(List<String> values) {
            addCriterion("aac106 not in", values, "aac106");
            return (Criteria) this;
        }

        public Criteria andAac106Between(String value1, String value2) {
            addCriterion("aac106 between", value1, value2, "aac106");
            return (Criteria) this;
        }

        public Criteria andAac106NotBetween(String value1, String value2) {
            addCriterion("aac106 not between", value1, value2, "aac106");
            return (Criteria) this;
        }

        public Criteria andAac107IsNull() {
            addCriterion("aac107 is null");
            return (Criteria) this;
        }

        public Criteria andAac107IsNotNull() {
            addCriterion("aac107 is not null");
            return (Criteria) this;
        }

        public Criteria andAac107EqualTo(Date value) {
            addCriterion("aac107 =", value, "aac107");
            return (Criteria) this;
        }

        public Criteria andAac107NotEqualTo(Date value) {
            addCriterion("aac107 <>", value, "aac107");
            return (Criteria) this;
        }

        public Criteria andAac107GreaterThan(Date value) {
            addCriterion("aac107 >", value, "aac107");
            return (Criteria) this;
        }

        public Criteria andAac107GreaterThanOrEqualTo(Date value) {
            addCriterion("aac107 >=", value, "aac107");
            return (Criteria) this;
        }

        public Criteria andAac107LessThan(Date value) {
            addCriterion("aac107 <", value, "aac107");
            return (Criteria) this;
        }

        public Criteria andAac107LessThanOrEqualTo(Date value) {
            addCriterion("aac107 <=", value, "aac107");
            return (Criteria) this;
        }

        public Criteria andAac107In(List<Date> values) {
            addCriterion("aac107 in", values, "aac107");
            return (Criteria) this;
        }

        public Criteria andAac107NotIn(List<Date> values) {
            addCriterion("aac107 not in", values, "aac107");
            return (Criteria) this;
        }

        public Criteria andAac107Between(Date value1, Date value2) {
            addCriterion("aac107 between", value1, value2, "aac107");
            return (Criteria) this;
        }

        public Criteria andAac107NotBetween(Date value1, Date value2) {
            addCriterion("aac107 not between", value1, value2, "aac107");
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