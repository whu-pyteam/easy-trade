package com.pyteam.db.mbg.entity;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Ad02Example {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public Ad02Example() {
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

        public Criteria andAad202IsNull() {
            addCriterion("aad202 is null");
            return (Criteria) this;
        }

        public Criteria andAad202IsNotNull() {
            addCriterion("aad202 is not null");
            return (Criteria) this;
        }

        public Criteria andAad202EqualTo(String value) {
            addCriterion("aad202 =", value, "aad202");
            return (Criteria) this;
        }

        public Criteria andAad202NotEqualTo(String value) {
            addCriterion("aad202 <>", value, "aad202");
            return (Criteria) this;
        }

        public Criteria andAad202GreaterThan(String value) {
            addCriterion("aad202 >", value, "aad202");
            return (Criteria) this;
        }

        public Criteria andAad202GreaterThanOrEqualTo(String value) {
            addCriterion("aad202 >=", value, "aad202");
            return (Criteria) this;
        }

        public Criteria andAad202LessThan(String value) {
            addCriterion("aad202 <", value, "aad202");
            return (Criteria) this;
        }

        public Criteria andAad202LessThanOrEqualTo(String value) {
            addCriterion("aad202 <=", value, "aad202");
            return (Criteria) this;
        }

        public Criteria andAad202Like(String value) {
            addCriterion("aad202 like", value, "aad202");
            return (Criteria) this;
        }

        public Criteria andAad202NotLike(String value) {
            addCriterion("aad202 not like", value, "aad202");
            return (Criteria) this;
        }

        public Criteria andAad202In(List<String> values) {
            addCriterion("aad202 in", values, "aad202");
            return (Criteria) this;
        }

        public Criteria andAad202NotIn(List<String> values) {
            addCriterion("aad202 not in", values, "aad202");
            return (Criteria) this;
        }

        public Criteria andAad202Between(String value1, String value2) {
            addCriterion("aad202 between", value1, value2, "aad202");
            return (Criteria) this;
        }

        public Criteria andAad202NotBetween(String value1, String value2) {
            addCriterion("aad202 not between", value1, value2, "aad202");
            return (Criteria) this;
        }

        public Criteria andAad203IsNull() {
            addCriterion("aad203 is null");
            return (Criteria) this;
        }

        public Criteria andAad203IsNotNull() {
            addCriterion("aad203 is not null");
            return (Criteria) this;
        }

        public Criteria andAad203EqualTo(String value) {
            addCriterion("aad203 =", value, "aad203");
            return (Criteria) this;
        }

        public Criteria andAad203NotEqualTo(String value) {
            addCriterion("aad203 <>", value, "aad203");
            return (Criteria) this;
        }

        public Criteria andAad203GreaterThan(String value) {
            addCriterion("aad203 >", value, "aad203");
            return (Criteria) this;
        }

        public Criteria andAad203GreaterThanOrEqualTo(String value) {
            addCriterion("aad203 >=", value, "aad203");
            return (Criteria) this;
        }

        public Criteria andAad203LessThan(String value) {
            addCriterion("aad203 <", value, "aad203");
            return (Criteria) this;
        }

        public Criteria andAad203LessThanOrEqualTo(String value) {
            addCriterion("aad203 <=", value, "aad203");
            return (Criteria) this;
        }

        public Criteria andAad203Like(String value) {
            addCriterion("aad203 like", value, "aad203");
            return (Criteria) this;
        }

        public Criteria andAad203NotLike(String value) {
            addCriterion("aad203 not like", value, "aad203");
            return (Criteria) this;
        }

        public Criteria andAad203In(List<String> values) {
            addCriterion("aad203 in", values, "aad203");
            return (Criteria) this;
        }

        public Criteria andAad203NotIn(List<String> values) {
            addCriterion("aad203 not in", values, "aad203");
            return (Criteria) this;
        }

        public Criteria andAad203Between(String value1, String value2) {
            addCriterion("aad203 between", value1, value2, "aad203");
            return (Criteria) this;
        }

        public Criteria andAad203NotBetween(String value1, String value2) {
            addCriterion("aad203 not between", value1, value2, "aad203");
            return (Criteria) this;
        }

        public Criteria andAad204IsNull() {
            addCriterion("aad204 is null");
            return (Criteria) this;
        }

        public Criteria andAad204IsNotNull() {
            addCriterion("aad204 is not null");
            return (Criteria) this;
        }

        public Criteria andAad204EqualTo(String value) {
            addCriterion("aad204 =", value, "aad204");
            return (Criteria) this;
        }

        public Criteria andAad204NotEqualTo(String value) {
            addCriterion("aad204 <>", value, "aad204");
            return (Criteria) this;
        }

        public Criteria andAad204GreaterThan(String value) {
            addCriterion("aad204 >", value, "aad204");
            return (Criteria) this;
        }

        public Criteria andAad204GreaterThanOrEqualTo(String value) {
            addCriterion("aad204 >=", value, "aad204");
            return (Criteria) this;
        }

        public Criteria andAad204LessThan(String value) {
            addCriterion("aad204 <", value, "aad204");
            return (Criteria) this;
        }

        public Criteria andAad204LessThanOrEqualTo(String value) {
            addCriterion("aad204 <=", value, "aad204");
            return (Criteria) this;
        }

        public Criteria andAad204Like(String value) {
            addCriterion("aad204 like", value, "aad204");
            return (Criteria) this;
        }

        public Criteria andAad204NotLike(String value) {
            addCriterion("aad204 not like", value, "aad204");
            return (Criteria) this;
        }

        public Criteria andAad204In(List<String> values) {
            addCriterion("aad204 in", values, "aad204");
            return (Criteria) this;
        }

        public Criteria andAad204NotIn(List<String> values) {
            addCriterion("aad204 not in", values, "aad204");
            return (Criteria) this;
        }

        public Criteria andAad204Between(String value1, String value2) {
            addCriterion("aad204 between", value1, value2, "aad204");
            return (Criteria) this;
        }

        public Criteria andAad204NotBetween(String value1, String value2) {
            addCriterion("aad204 not between", value1, value2, "aad204");
            return (Criteria) this;
        }

        public Criteria andAad205IsNull() {
            addCriterion("aad205 is null");
            return (Criteria) this;
        }

        public Criteria andAad205IsNotNull() {
            addCriterion("aad205 is not null");
            return (Criteria) this;
        }

        public Criteria andAad205EqualTo(String value) {
            addCriterion("aad205 =", value, "aad205");
            return (Criteria) this;
        }

        public Criteria andAad205NotEqualTo(String value) {
            addCriterion("aad205 <>", value, "aad205");
            return (Criteria) this;
        }

        public Criteria andAad205GreaterThan(String value) {
            addCriterion("aad205 >", value, "aad205");
            return (Criteria) this;
        }

        public Criteria andAad205GreaterThanOrEqualTo(String value) {
            addCriterion("aad205 >=", value, "aad205");
            return (Criteria) this;
        }

        public Criteria andAad205LessThan(String value) {
            addCriterion("aad205 <", value, "aad205");
            return (Criteria) this;
        }

        public Criteria andAad205LessThanOrEqualTo(String value) {
            addCriterion("aad205 <=", value, "aad205");
            return (Criteria) this;
        }

        public Criteria andAad205Like(String value) {
            addCriterion("aad205 like", value, "aad205");
            return (Criteria) this;
        }

        public Criteria andAad205NotLike(String value) {
            addCriterion("aad205 not like", value, "aad205");
            return (Criteria) this;
        }

        public Criteria andAad205In(List<String> values) {
            addCriterion("aad205 in", values, "aad205");
            return (Criteria) this;
        }

        public Criteria andAad205NotIn(List<String> values) {
            addCriterion("aad205 not in", values, "aad205");
            return (Criteria) this;
        }

        public Criteria andAad205Between(String value1, String value2) {
            addCriterion("aad205 between", value1, value2, "aad205");
            return (Criteria) this;
        }

        public Criteria andAad205NotBetween(String value1, String value2) {
            addCriterion("aad205 not between", value1, value2, "aad205");
            return (Criteria) this;
        }

        public Criteria andAad206IsNull() {
            addCriterion("aad206 is null");
            return (Criteria) this;
        }

        public Criteria andAad206IsNotNull() {
            addCriterion("aad206 is not null");
            return (Criteria) this;
        }

        public Criteria andAad206EqualTo(BigDecimal value) {
            addCriterion("aad206 =", value, "aad206");
            return (Criteria) this;
        }

        public Criteria andAad206NotEqualTo(BigDecimal value) {
            addCriterion("aad206 <>", value, "aad206");
            return (Criteria) this;
        }

        public Criteria andAad206GreaterThan(BigDecimal value) {
            addCriterion("aad206 >", value, "aad206");
            return (Criteria) this;
        }

        public Criteria andAad206GreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("aad206 >=", value, "aad206");
            return (Criteria) this;
        }

        public Criteria andAad206LessThan(BigDecimal value) {
            addCriterion("aad206 <", value, "aad206");
            return (Criteria) this;
        }

        public Criteria andAad206LessThanOrEqualTo(BigDecimal value) {
            addCriterion("aad206 <=", value, "aad206");
            return (Criteria) this;
        }

        public Criteria andAad206In(List<BigDecimal> values) {
            addCriterion("aad206 in", values, "aad206");
            return (Criteria) this;
        }

        public Criteria andAad206NotIn(List<BigDecimal> values) {
            addCriterion("aad206 not in", values, "aad206");
            return (Criteria) this;
        }

        public Criteria andAad206Between(BigDecimal value1, BigDecimal value2) {
            addCriterion("aad206 between", value1, value2, "aad206");
            return (Criteria) this;
        }

        public Criteria andAad206NotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("aad206 not between", value1, value2, "aad206");
            return (Criteria) this;
        }

        public Criteria andAad207IsNull() {
            addCriterion("aad207 is null");
            return (Criteria) this;
        }

        public Criteria andAad207IsNotNull() {
            addCriterion("aad207 is not null");
            return (Criteria) this;
        }

        public Criteria andAad207EqualTo(BigDecimal value) {
            addCriterion("aad207 =", value, "aad207");
            return (Criteria) this;
        }

        public Criteria andAad207NotEqualTo(BigDecimal value) {
            addCriterion("aad207 <>", value, "aad207");
            return (Criteria) this;
        }

        public Criteria andAad207GreaterThan(BigDecimal value) {
            addCriterion("aad207 >", value, "aad207");
            return (Criteria) this;
        }

        public Criteria andAad207GreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("aad207 >=", value, "aad207");
            return (Criteria) this;
        }

        public Criteria andAad207LessThan(BigDecimal value) {
            addCriterion("aad207 <", value, "aad207");
            return (Criteria) this;
        }

        public Criteria andAad207LessThanOrEqualTo(BigDecimal value) {
            addCriterion("aad207 <=", value, "aad207");
            return (Criteria) this;
        }

        public Criteria andAad207In(List<BigDecimal> values) {
            addCriterion("aad207 in", values, "aad207");
            return (Criteria) this;
        }

        public Criteria andAad207NotIn(List<BigDecimal> values) {
            addCriterion("aad207 not in", values, "aad207");
            return (Criteria) this;
        }

        public Criteria andAad207Between(BigDecimal value1, BigDecimal value2) {
            addCriterion("aad207 between", value1, value2, "aad207");
            return (Criteria) this;
        }

        public Criteria andAad207NotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("aad207 not between", value1, value2, "aad207");
            return (Criteria) this;
        }

        public Criteria andAad208IsNull() {
            addCriterion("aad208 is null");
            return (Criteria) this;
        }

        public Criteria andAad208IsNotNull() {
            addCriterion("aad208 is not null");
            return (Criteria) this;
        }

        public Criteria andAad208EqualTo(BigDecimal value) {
            addCriterion("aad208 =", value, "aad208");
            return (Criteria) this;
        }

        public Criteria andAad208NotEqualTo(BigDecimal value) {
            addCriterion("aad208 <>", value, "aad208");
            return (Criteria) this;
        }

        public Criteria andAad208GreaterThan(BigDecimal value) {
            addCriterion("aad208 >", value, "aad208");
            return (Criteria) this;
        }

        public Criteria andAad208GreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("aad208 >=", value, "aad208");
            return (Criteria) this;
        }

        public Criteria andAad208LessThan(BigDecimal value) {
            addCriterion("aad208 <", value, "aad208");
            return (Criteria) this;
        }

        public Criteria andAad208LessThanOrEqualTo(BigDecimal value) {
            addCriterion("aad208 <=", value, "aad208");
            return (Criteria) this;
        }

        public Criteria andAad208In(List<BigDecimal> values) {
            addCriterion("aad208 in", values, "aad208");
            return (Criteria) this;
        }

        public Criteria andAad208NotIn(List<BigDecimal> values) {
            addCriterion("aad208 not in", values, "aad208");
            return (Criteria) this;
        }

        public Criteria andAad208Between(BigDecimal value1, BigDecimal value2) {
            addCriterion("aad208 between", value1, value2, "aad208");
            return (Criteria) this;
        }

        public Criteria andAad208NotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("aad208 not between", value1, value2, "aad208");
            return (Criteria) this;
        }

        public Criteria andAad209IsNull() {
            addCriterion("aad209 is null");
            return (Criteria) this;
        }

        public Criteria andAad209IsNotNull() {
            addCriterion("aad209 is not null");
            return (Criteria) this;
        }

        public Criteria andAad209EqualTo(String value) {
            addCriterion("aad209 =", value, "aad209");
            return (Criteria) this;
        }

        public Criteria andAad209NotEqualTo(String value) {
            addCriterion("aad209 <>", value, "aad209");
            return (Criteria) this;
        }

        public Criteria andAad209GreaterThan(String value) {
            addCriterion("aad209 >", value, "aad209");
            return (Criteria) this;
        }

        public Criteria andAad209GreaterThanOrEqualTo(String value) {
            addCriterion("aad209 >=", value, "aad209");
            return (Criteria) this;
        }

        public Criteria andAad209LessThan(String value) {
            addCriterion("aad209 <", value, "aad209");
            return (Criteria) this;
        }

        public Criteria andAad209LessThanOrEqualTo(String value) {
            addCriterion("aad209 <=", value, "aad209");
            return (Criteria) this;
        }

        public Criteria andAad209Like(String value) {
            addCriterion("aad209 like", value, "aad209");
            return (Criteria) this;
        }

        public Criteria andAad209NotLike(String value) {
            addCriterion("aad209 not like", value, "aad209");
            return (Criteria) this;
        }

        public Criteria andAad209In(List<String> values) {
            addCriterion("aad209 in", values, "aad209");
            return (Criteria) this;
        }

        public Criteria andAad209NotIn(List<String> values) {
            addCriterion("aad209 not in", values, "aad209");
            return (Criteria) this;
        }

        public Criteria andAad209Between(String value1, String value2) {
            addCriterion("aad209 between", value1, value2, "aad209");
            return (Criteria) this;
        }

        public Criteria andAad209NotBetween(String value1, String value2) {
            addCriterion("aad209 not between", value1, value2, "aad209");
            return (Criteria) this;
        }

        public Criteria andAad210IsNull() {
            addCriterion("aad210 is null");
            return (Criteria) this;
        }

        public Criteria andAad210IsNotNull() {
            addCriterion("aad210 is not null");
            return (Criteria) this;
        }

        public Criteria andAad210EqualTo(Date value) {
            addCriterion("aad210 =", value, "aad210");
            return (Criteria) this;
        }

        public Criteria andAad210NotEqualTo(Date value) {
            addCriterion("aad210 <>", value, "aad210");
            return (Criteria) this;
        }

        public Criteria andAad210GreaterThan(Date value) {
            addCriterion("aad210 >", value, "aad210");
            return (Criteria) this;
        }

        public Criteria andAad210GreaterThanOrEqualTo(Date value) {
            addCriterion("aad210 >=", value, "aad210");
            return (Criteria) this;
        }

        public Criteria andAad210LessThan(Date value) {
            addCriterion("aad210 <", value, "aad210");
            return (Criteria) this;
        }

        public Criteria andAad210LessThanOrEqualTo(Date value) {
            addCriterion("aad210 <=", value, "aad210");
            return (Criteria) this;
        }

        public Criteria andAad210In(List<Date> values) {
            addCriterion("aad210 in", values, "aad210");
            return (Criteria) this;
        }

        public Criteria andAad210NotIn(List<Date> values) {
            addCriterion("aad210 not in", values, "aad210");
            return (Criteria) this;
        }

        public Criteria andAad210Between(Date value1, Date value2) {
            addCriterion("aad210 between", value1, value2, "aad210");
            return (Criteria) this;
        }

        public Criteria andAad210NotBetween(Date value1, Date value2) {
            addCriterion("aad210 not between", value1, value2, "aad210");
            return (Criteria) this;
        }

        public Criteria andAad211IsNull() {
            addCriterion("aad211 is null");
            return (Criteria) this;
        }

        public Criteria andAad211IsNotNull() {
            addCriterion("aad211 is not null");
            return (Criteria) this;
        }

        public Criteria andAad211EqualTo(Date value) {
            addCriterion("aad211 =", value, "aad211");
            return (Criteria) this;
        }

        public Criteria andAad211NotEqualTo(Date value) {
            addCriterion("aad211 <>", value, "aad211");
            return (Criteria) this;
        }

        public Criteria andAad211GreaterThan(Date value) {
            addCriterion("aad211 >", value, "aad211");
            return (Criteria) this;
        }

        public Criteria andAad211GreaterThanOrEqualTo(Date value) {
            addCriterion("aad211 >=", value, "aad211");
            return (Criteria) this;
        }

        public Criteria andAad211LessThan(Date value) {
            addCriterion("aad211 <", value, "aad211");
            return (Criteria) this;
        }

        public Criteria andAad211LessThanOrEqualTo(Date value) {
            addCriterion("aad211 <=", value, "aad211");
            return (Criteria) this;
        }

        public Criteria andAad211In(List<Date> values) {
            addCriterion("aad211 in", values, "aad211");
            return (Criteria) this;
        }

        public Criteria andAad211NotIn(List<Date> values) {
            addCriterion("aad211 not in", values, "aad211");
            return (Criteria) this;
        }

        public Criteria andAad211Between(Date value1, Date value2) {
            addCriterion("aad211 between", value1, value2, "aad211");
            return (Criteria) this;
        }

        public Criteria andAad211NotBetween(Date value1, Date value2) {
            addCriterion("aad211 not between", value1, value2, "aad211");
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