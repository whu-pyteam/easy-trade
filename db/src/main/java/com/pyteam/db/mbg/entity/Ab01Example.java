package com.pyteam.db.mbg.entity;

import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;

public class Ab01Example {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public Ab01Example() {
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

        protected void addCriterionForJDBCDate(String condition, Date value, String property) {
            if (value == null) {
                throw new RuntimeException("Value for " + property + " cannot be null");
            }
            addCriterion(condition, new java.sql.Date(value.getTime()), property);
        }

        protected void addCriterionForJDBCDate(String condition, List<Date> values, String property) {
            if (values == null || values.size() == 0) {
                throw new RuntimeException("Value list for " + property + " cannot be null or empty");
            }
            List<java.sql.Date> dateList = new ArrayList<java.sql.Date>();
            Iterator<Date> iter = values.iterator();
            while (iter.hasNext()) {
                dateList.add(new java.sql.Date(iter.next().getTime()));
            }
            addCriterion(condition, dateList, property);
        }

        protected void addCriterionForJDBCDate(String condition, Date value1, Date value2, String property) {
            if (value1 == null || value2 == null) {
                throw new RuntimeException("Between values for " + property + " cannot be null");
            }
            addCriterion(condition, new java.sql.Date(value1.getTime()), new java.sql.Date(value2.getTime()), property);
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

        public Criteria andAab102IsNull() {
            addCriterion("aab102 is null");
            return (Criteria) this;
        }

        public Criteria andAab102IsNotNull() {
            addCriterion("aab102 is not null");
            return (Criteria) this;
        }

        public Criteria andAab102EqualTo(String value) {
            addCriterion("aab102 =", value, "aab102");
            return (Criteria) this;
        }

        public Criteria andAab102NotEqualTo(String value) {
            addCriterion("aab102 <>", value, "aab102");
            return (Criteria) this;
        }

        public Criteria andAab102GreaterThan(String value) {
            addCriterion("aab102 >", value, "aab102");
            return (Criteria) this;
        }

        public Criteria andAab102GreaterThanOrEqualTo(String value) {
            addCriterion("aab102 >=", value, "aab102");
            return (Criteria) this;
        }

        public Criteria andAab102LessThan(String value) {
            addCriterion("aab102 <", value, "aab102");
            return (Criteria) this;
        }

        public Criteria andAab102LessThanOrEqualTo(String value) {
            addCriterion("aab102 <=", value, "aab102");
            return (Criteria) this;
        }

        public Criteria andAab102Like(String value) {
            addCriterion("aab102 like", value, "aab102");
            return (Criteria) this;
        }

        public Criteria andAab102NotLike(String value) {
            addCriterion("aab102 not like", value, "aab102");
            return (Criteria) this;
        }

        public Criteria andAab102In(List<String> values) {
            addCriterion("aab102 in", values, "aab102");
            return (Criteria) this;
        }

        public Criteria andAab102NotIn(List<String> values) {
            addCriterion("aab102 not in", values, "aab102");
            return (Criteria) this;
        }

        public Criteria andAab102Between(String value1, String value2) {
            addCriterion("aab102 between", value1, value2, "aab102");
            return (Criteria) this;
        }

        public Criteria andAab102NotBetween(String value1, String value2) {
            addCriterion("aab102 not between", value1, value2, "aab102");
            return (Criteria) this;
        }

        public Criteria andAab103IsNull() {
            addCriterion("aab103 is null");
            return (Criteria) this;
        }

        public Criteria andAab103IsNotNull() {
            addCriterion("aab103 is not null");
            return (Criteria) this;
        }

        public Criteria andAab103EqualTo(String value) {
            addCriterion("aab103 =", value, "aab103");
            return (Criteria) this;
        }

        public Criteria andAab103NotEqualTo(String value) {
            addCriterion("aab103 <>", value, "aab103");
            return (Criteria) this;
        }

        public Criteria andAab103GreaterThan(String value) {
            addCriterion("aab103 >", value, "aab103");
            return (Criteria) this;
        }

        public Criteria andAab103GreaterThanOrEqualTo(String value) {
            addCriterion("aab103 >=", value, "aab103");
            return (Criteria) this;
        }

        public Criteria andAab103LessThan(String value) {
            addCriterion("aab103 <", value, "aab103");
            return (Criteria) this;
        }

        public Criteria andAab103LessThanOrEqualTo(String value) {
            addCriterion("aab103 <=", value, "aab103");
            return (Criteria) this;
        }

        public Criteria andAab103Like(String value) {
            addCriterion("aab103 like", value, "aab103");
            return (Criteria) this;
        }

        public Criteria andAab103NotLike(String value) {
            addCriterion("aab103 not like", value, "aab103");
            return (Criteria) this;
        }

        public Criteria andAab103In(List<String> values) {
            addCriterion("aab103 in", values, "aab103");
            return (Criteria) this;
        }

        public Criteria andAab103NotIn(List<String> values) {
            addCriterion("aab103 not in", values, "aab103");
            return (Criteria) this;
        }

        public Criteria andAab103Between(String value1, String value2) {
            addCriterion("aab103 between", value1, value2, "aab103");
            return (Criteria) this;
        }

        public Criteria andAab103NotBetween(String value1, String value2) {
            addCriterion("aab103 not between", value1, value2, "aab103");
            return (Criteria) this;
        }

        public Criteria andAab104IsNull() {
            addCriterion("aab104 is null");
            return (Criteria) this;
        }

        public Criteria andAab104IsNotNull() {
            addCriterion("aab104 is not null");
            return (Criteria) this;
        }

        public Criteria andAab104EqualTo(String value) {
            addCriterion("aab104 =", value, "aab104");
            return (Criteria) this;
        }

        public Criteria andAab104NotEqualTo(String value) {
            addCriterion("aab104 <>", value, "aab104");
            return (Criteria) this;
        }

        public Criteria andAab104GreaterThan(String value) {
            addCriterion("aab104 >", value, "aab104");
            return (Criteria) this;
        }

        public Criteria andAab104GreaterThanOrEqualTo(String value) {
            addCriterion("aab104 >=", value, "aab104");
            return (Criteria) this;
        }

        public Criteria andAab104LessThan(String value) {
            addCriterion("aab104 <", value, "aab104");
            return (Criteria) this;
        }

        public Criteria andAab104LessThanOrEqualTo(String value) {
            addCriterion("aab104 <=", value, "aab104");
            return (Criteria) this;
        }

        public Criteria andAab104Like(String value) {
            addCriterion("aab104 like", value, "aab104");
            return (Criteria) this;
        }

        public Criteria andAab104NotLike(String value) {
            addCriterion("aab104 not like", value, "aab104");
            return (Criteria) this;
        }

        public Criteria andAab104In(List<String> values) {
            addCriterion("aab104 in", values, "aab104");
            return (Criteria) this;
        }

        public Criteria andAab104NotIn(List<String> values) {
            addCriterion("aab104 not in", values, "aab104");
            return (Criteria) this;
        }

        public Criteria andAab104Between(String value1, String value2) {
            addCriterion("aab104 between", value1, value2, "aab104");
            return (Criteria) this;
        }

        public Criteria andAab104NotBetween(String value1, String value2) {
            addCriterion("aab104 not between", value1, value2, "aab104");
            return (Criteria) this;
        }

        public Criteria andAab105IsNull() {
            addCriterion("aab105 is null");
            return (Criteria) this;
        }

        public Criteria andAab105IsNotNull() {
            addCriterion("aab105 is not null");
            return (Criteria) this;
        }

        public Criteria andAab105EqualTo(Date value) {
            addCriterionForJDBCDate("aab105 =", value, "aab105");
            return (Criteria) this;
        }

        public Criteria andAab105NotEqualTo(Date value) {
            addCriterionForJDBCDate("aab105 <>", value, "aab105");
            return (Criteria) this;
        }

        public Criteria andAab105GreaterThan(Date value) {
            addCriterionForJDBCDate("aab105 >", value, "aab105");
            return (Criteria) this;
        }

        public Criteria andAab105GreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("aab105 >=", value, "aab105");
            return (Criteria) this;
        }

        public Criteria andAab105LessThan(Date value) {
            addCriterionForJDBCDate("aab105 <", value, "aab105");
            return (Criteria) this;
        }

        public Criteria andAab105LessThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("aab105 <=", value, "aab105");
            return (Criteria) this;
        }

        public Criteria andAab105In(List<Date> values) {
            addCriterionForJDBCDate("aab105 in", values, "aab105");
            return (Criteria) this;
        }

        public Criteria andAab105NotIn(List<Date> values) {
            addCriterionForJDBCDate("aab105 not in", values, "aab105");
            return (Criteria) this;
        }

        public Criteria andAab105Between(Date value1, Date value2) {
            addCriterionForJDBCDate("aab105 between", value1, value2, "aab105");
            return (Criteria) this;
        }

        public Criteria andAab105NotBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("aab105 not between", value1, value2, "aab105");
            return (Criteria) this;
        }

        public Criteria andAab106IsNull() {
            addCriterion("aab106 is null");
            return (Criteria) this;
        }

        public Criteria andAab106IsNotNull() {
            addCriterion("aab106 is not null");
            return (Criteria) this;
        }

        public Criteria andAab106EqualTo(Integer value) {
            addCriterion("aab106 =", value, "aab106");
            return (Criteria) this;
        }

        public Criteria andAab106NotEqualTo(Integer value) {
            addCriterion("aab106 <>", value, "aab106");
            return (Criteria) this;
        }

        public Criteria andAab106GreaterThan(Integer value) {
            addCriterion("aab106 >", value, "aab106");
            return (Criteria) this;
        }

        public Criteria andAab106GreaterThanOrEqualTo(Integer value) {
            addCriterion("aab106 >=", value, "aab106");
            return (Criteria) this;
        }

        public Criteria andAab106LessThan(Integer value) {
            addCriterion("aab106 <", value, "aab106");
            return (Criteria) this;
        }

        public Criteria andAab106LessThanOrEqualTo(Integer value) {
            addCriterion("aab106 <=", value, "aab106");
            return (Criteria) this;
        }

        public Criteria andAab106In(List<Integer> values) {
            addCriterion("aab106 in", values, "aab106");
            return (Criteria) this;
        }

        public Criteria andAab106NotIn(List<Integer> values) {
            addCriterion("aab106 not in", values, "aab106");
            return (Criteria) this;
        }

        public Criteria andAab106Between(Integer value1, Integer value2) {
            addCriterion("aab106 between", value1, value2, "aab106");
            return (Criteria) this;
        }

        public Criteria andAab106NotBetween(Integer value1, Integer value2) {
            addCriterion("aab106 not between", value1, value2, "aab106");
            return (Criteria) this;
        }

        public Criteria andAab107IsNull() {
            addCriterion("aab107 is null");
            return (Criteria) this;
        }

        public Criteria andAab107IsNotNull() {
            addCriterion("aab107 is not null");
            return (Criteria) this;
        }

        public Criteria andAab107EqualTo(String value) {
            addCriterion("aab107 =", value, "aab107");
            return (Criteria) this;
        }

        public Criteria andAab107NotEqualTo(String value) {
            addCriterion("aab107 <>", value, "aab107");
            return (Criteria) this;
        }

        public Criteria andAab107GreaterThan(String value) {
            addCriterion("aab107 >", value, "aab107");
            return (Criteria) this;
        }

        public Criteria andAab107GreaterThanOrEqualTo(String value) {
            addCriterion("aab107 >=", value, "aab107");
            return (Criteria) this;
        }

        public Criteria andAab107LessThan(String value) {
            addCriterion("aab107 <", value, "aab107");
            return (Criteria) this;
        }

        public Criteria andAab107LessThanOrEqualTo(String value) {
            addCriterion("aab107 <=", value, "aab107");
            return (Criteria) this;
        }

        public Criteria andAab107Like(String value) {
            addCriterion("aab107 like", value, "aab107");
            return (Criteria) this;
        }

        public Criteria andAab107NotLike(String value) {
            addCriterion("aab107 not like", value, "aab107");
            return (Criteria) this;
        }

        public Criteria andAab107In(List<String> values) {
            addCriterion("aab107 in", values, "aab107");
            return (Criteria) this;
        }

        public Criteria andAab107NotIn(List<String> values) {
            addCriterion("aab107 not in", values, "aab107");
            return (Criteria) this;
        }

        public Criteria andAab107Between(String value1, String value2) {
            addCriterion("aab107 between", value1, value2, "aab107");
            return (Criteria) this;
        }

        public Criteria andAab107NotBetween(String value1, String value2) {
            addCriterion("aab107 not between", value1, value2, "aab107");
            return (Criteria) this;
        }

        public Criteria andAab108IsNull() {
            addCriterion("aab108 is null");
            return (Criteria) this;
        }

        public Criteria andAab108IsNotNull() {
            addCriterion("aab108 is not null");
            return (Criteria) this;
        }

        public Criteria andAab108EqualTo(String value) {
            addCriterion("aab108 =", value, "aab108");
            return (Criteria) this;
        }

        public Criteria andAab108NotEqualTo(String value) {
            addCriterion("aab108 <>", value, "aab108");
            return (Criteria) this;
        }

        public Criteria andAab108GreaterThan(String value) {
            addCriterion("aab108 >", value, "aab108");
            return (Criteria) this;
        }

        public Criteria andAab108GreaterThanOrEqualTo(String value) {
            addCriterion("aab108 >=", value, "aab108");
            return (Criteria) this;
        }

        public Criteria andAab108LessThan(String value) {
            addCriterion("aab108 <", value, "aab108");
            return (Criteria) this;
        }

        public Criteria andAab108LessThanOrEqualTo(String value) {
            addCriterion("aab108 <=", value, "aab108");
            return (Criteria) this;
        }

        public Criteria andAab108Like(String value) {
            addCriterion("aab108 like", value, "aab108");
            return (Criteria) this;
        }

        public Criteria andAab108NotLike(String value) {
            addCriterion("aab108 not like", value, "aab108");
            return (Criteria) this;
        }

        public Criteria andAab108In(List<String> values) {
            addCriterion("aab108 in", values, "aab108");
            return (Criteria) this;
        }

        public Criteria andAab108NotIn(List<String> values) {
            addCriterion("aab108 not in", values, "aab108");
            return (Criteria) this;
        }

        public Criteria andAab108Between(String value1, String value2) {
            addCriterion("aab108 between", value1, value2, "aab108");
            return (Criteria) this;
        }

        public Criteria andAab108NotBetween(String value1, String value2) {
            addCriterion("aab108 not between", value1, value2, "aab108");
            return (Criteria) this;
        }

        public Criteria andAab109IsNull() {
            addCriterion("aab109 is null");
            return (Criteria) this;
        }

        public Criteria andAab109IsNotNull() {
            addCriterion("aab109 is not null");
            return (Criteria) this;
        }

        public Criteria andAab109EqualTo(Integer value) {
            addCriterion("aab109 =", value, "aab109");
            return (Criteria) this;
        }

        public Criteria andAab109NotEqualTo(Integer value) {
            addCriterion("aab109 <>", value, "aab109");
            return (Criteria) this;
        }

        public Criteria andAab109GreaterThan(Integer value) {
            addCriterion("aab109 >", value, "aab109");
            return (Criteria) this;
        }

        public Criteria andAab109GreaterThanOrEqualTo(Integer value) {
            addCriterion("aab109 >=", value, "aab109");
            return (Criteria) this;
        }

        public Criteria andAab109LessThan(Integer value) {
            addCriterion("aab109 <", value, "aab109");
            return (Criteria) this;
        }

        public Criteria andAab109LessThanOrEqualTo(Integer value) {
            addCriterion("aab109 <=", value, "aab109");
            return (Criteria) this;
        }

        public Criteria andAab109In(List<Integer> values) {
            addCriterion("aab109 in", values, "aab109");
            return (Criteria) this;
        }

        public Criteria andAab109NotIn(List<Integer> values) {
            addCriterion("aab109 not in", values, "aab109");
            return (Criteria) this;
        }

        public Criteria andAab109Between(Integer value1, Integer value2) {
            addCriterion("aab109 between", value1, value2, "aab109");
            return (Criteria) this;
        }

        public Criteria andAab109NotBetween(Integer value1, Integer value2) {
            addCriterion("aab109 not between", value1, value2, "aab109");
            return (Criteria) this;
        }

        public Criteria andAab110IsNull() {
            addCriterion("aab110 is null");
            return (Criteria) this;
        }

        public Criteria andAab110IsNotNull() {
            addCriterion("aab110 is not null");
            return (Criteria) this;
        }

        public Criteria andAab110EqualTo(String value) {
            addCriterion("aab110 =", value, "aab110");
            return (Criteria) this;
        }

        public Criteria andAab110NotEqualTo(String value) {
            addCriterion("aab110 <>", value, "aab110");
            return (Criteria) this;
        }

        public Criteria andAab110GreaterThan(String value) {
            addCriterion("aab110 >", value, "aab110");
            return (Criteria) this;
        }

        public Criteria andAab110GreaterThanOrEqualTo(String value) {
            addCriterion("aab110 >=", value, "aab110");
            return (Criteria) this;
        }

        public Criteria andAab110LessThan(String value) {
            addCriterion("aab110 <", value, "aab110");
            return (Criteria) this;
        }

        public Criteria andAab110LessThanOrEqualTo(String value) {
            addCriterion("aab110 <=", value, "aab110");
            return (Criteria) this;
        }

        public Criteria andAab110Like(String value) {
            addCriterion("aab110 like", value, "aab110");
            return (Criteria) this;
        }

        public Criteria andAab110NotLike(String value) {
            addCriterion("aab110 not like", value, "aab110");
            return (Criteria) this;
        }

        public Criteria andAab110In(List<String> values) {
            addCriterion("aab110 in", values, "aab110");
            return (Criteria) this;
        }

        public Criteria andAab110NotIn(List<String> values) {
            addCriterion("aab110 not in", values, "aab110");
            return (Criteria) this;
        }

        public Criteria andAab110Between(String value1, String value2) {
            addCriterion("aab110 between", value1, value2, "aab110");
            return (Criteria) this;
        }

        public Criteria andAab110NotBetween(String value1, String value2) {
            addCriterion("aab110 not between", value1, value2, "aab110");
            return (Criteria) this;
        }

        public Criteria andAab111IsNull() {
            addCriterion("aab111 is null");
            return (Criteria) this;
        }

        public Criteria andAab111IsNotNull() {
            addCriterion("aab111 is not null");
            return (Criteria) this;
        }

        public Criteria andAab111EqualTo(String value) {
            addCriterion("aab111 =", value, "aab111");
            return (Criteria) this;
        }

        public Criteria andAab111NotEqualTo(String value) {
            addCriterion("aab111 <>", value, "aab111");
            return (Criteria) this;
        }

        public Criteria andAab111GreaterThan(String value) {
            addCriterion("aab111 >", value, "aab111");
            return (Criteria) this;
        }

        public Criteria andAab111GreaterThanOrEqualTo(String value) {
            addCriterion("aab111 >=", value, "aab111");
            return (Criteria) this;
        }

        public Criteria andAab111LessThan(String value) {
            addCriterion("aab111 <", value, "aab111");
            return (Criteria) this;
        }

        public Criteria andAab111LessThanOrEqualTo(String value) {
            addCriterion("aab111 <=", value, "aab111");
            return (Criteria) this;
        }

        public Criteria andAab111Like(String value) {
            addCriterion("aab111 like", value, "aab111");
            return (Criteria) this;
        }

        public Criteria andAab111NotLike(String value) {
            addCriterion("aab111 not like", value, "aab111");
            return (Criteria) this;
        }

        public Criteria andAab111In(List<String> values) {
            addCriterion("aab111 in", values, "aab111");
            return (Criteria) this;
        }

        public Criteria andAab111NotIn(List<String> values) {
            addCriterion("aab111 not in", values, "aab111");
            return (Criteria) this;
        }

        public Criteria andAab111Between(String value1, String value2) {
            addCriterion("aab111 between", value1, value2, "aab111");
            return (Criteria) this;
        }

        public Criteria andAab111NotBetween(String value1, String value2) {
            addCriterion("aab111 not between", value1, value2, "aab111");
            return (Criteria) this;
        }

        public Criteria andAab112IsNull() {
            addCriterion("aab112 is null");
            return (Criteria) this;
        }

        public Criteria andAab112IsNotNull() {
            addCriterion("aab112 is not null");
            return (Criteria) this;
        }

        public Criteria andAab112EqualTo(String value) {
            addCriterion("aab112 =", value, "aab112");
            return (Criteria) this;
        }

        public Criteria andAab112NotEqualTo(String value) {
            addCriterion("aab112 <>", value, "aab112");
            return (Criteria) this;
        }

        public Criteria andAab112GreaterThan(String value) {
            addCriterion("aab112 >", value, "aab112");
            return (Criteria) this;
        }

        public Criteria andAab112GreaterThanOrEqualTo(String value) {
            addCriterion("aab112 >=", value, "aab112");
            return (Criteria) this;
        }

        public Criteria andAab112LessThan(String value) {
            addCriterion("aab112 <", value, "aab112");
            return (Criteria) this;
        }

        public Criteria andAab112LessThanOrEqualTo(String value) {
            addCriterion("aab112 <=", value, "aab112");
            return (Criteria) this;
        }

        public Criteria andAab112Like(String value) {
            addCriterion("aab112 like", value, "aab112");
            return (Criteria) this;
        }

        public Criteria andAab112NotLike(String value) {
            addCriterion("aab112 not like", value, "aab112");
            return (Criteria) this;
        }

        public Criteria andAab112In(List<String> values) {
            addCriterion("aab112 in", values, "aab112");
            return (Criteria) this;
        }

        public Criteria andAab112NotIn(List<String> values) {
            addCriterion("aab112 not in", values, "aab112");
            return (Criteria) this;
        }

        public Criteria andAab112Between(String value1, String value2) {
            addCriterion("aab112 between", value1, value2, "aab112");
            return (Criteria) this;
        }

        public Criteria andAab112NotBetween(String value1, String value2) {
            addCriterion("aab112 not between", value1, value2, "aab112");
            return (Criteria) this;
        }

        public Criteria andAab113IsNull() {
            addCriterion("aab113 is null");
            return (Criteria) this;
        }

        public Criteria andAab113IsNotNull() {
            addCriterion("aab113 is not null");
            return (Criteria) this;
        }

        public Criteria andAab113EqualTo(Date value) {
            addCriterion("aab113 =", value, "aab113");
            return (Criteria) this;
        }

        public Criteria andAab113NotEqualTo(Date value) {
            addCriterion("aab113 <>", value, "aab113");
            return (Criteria) this;
        }

        public Criteria andAab113GreaterThan(Date value) {
            addCriterion("aab113 >", value, "aab113");
            return (Criteria) this;
        }

        public Criteria andAab113GreaterThanOrEqualTo(Date value) {
            addCriterion("aab113 >=", value, "aab113");
            return (Criteria) this;
        }

        public Criteria andAab113LessThan(Date value) {
            addCriterion("aab113 <", value, "aab113");
            return (Criteria) this;
        }

        public Criteria andAab113LessThanOrEqualTo(Date value) {
            addCriterion("aab113 <=", value, "aab113");
            return (Criteria) this;
        }

        public Criteria andAab113In(List<Date> values) {
            addCriterion("aab113 in", values, "aab113");
            return (Criteria) this;
        }

        public Criteria andAab113NotIn(List<Date> values) {
            addCriterion("aab113 not in", values, "aab113");
            return (Criteria) this;
        }

        public Criteria andAab113Between(Date value1, Date value2) {
            addCriterion("aab113 between", value1, value2, "aab113");
            return (Criteria) this;
        }

        public Criteria andAab113NotBetween(Date value1, Date value2) {
            addCriterion("aab113 not between", value1, value2, "aab113");
            return (Criteria) this;
        }

        public Criteria andAab114IsNull() {
            addCriterion("aab114 is null");
            return (Criteria) this;
        }

        public Criteria andAab114IsNotNull() {
            addCriterion("aab114 is not null");
            return (Criteria) this;
        }

        public Criteria andAab114EqualTo(Date value) {
            addCriterion("aab114 =", value, "aab114");
            return (Criteria) this;
        }

        public Criteria andAab114NotEqualTo(Date value) {
            addCriterion("aab114 <>", value, "aab114");
            return (Criteria) this;
        }

        public Criteria andAab114GreaterThan(Date value) {
            addCriterion("aab114 >", value, "aab114");
            return (Criteria) this;
        }

        public Criteria andAab114GreaterThanOrEqualTo(Date value) {
            addCriterion("aab114 >=", value, "aab114");
            return (Criteria) this;
        }

        public Criteria andAab114LessThan(Date value) {
            addCriterion("aab114 <", value, "aab114");
            return (Criteria) this;
        }

        public Criteria andAab114LessThanOrEqualTo(Date value) {
            addCriterion("aab114 <=", value, "aab114");
            return (Criteria) this;
        }

        public Criteria andAab114In(List<Date> values) {
            addCriterion("aab114 in", values, "aab114");
            return (Criteria) this;
        }

        public Criteria andAab114NotIn(List<Date> values) {
            addCriterion("aab114 not in", values, "aab114");
            return (Criteria) this;
        }

        public Criteria andAab114Between(Date value1, Date value2) {
            addCriterion("aab114 between", value1, value2, "aab114");
            return (Criteria) this;
        }

        public Criteria andAab114NotBetween(Date value1, Date value2) {
            addCriterion("aab114 not between", value1, value2, "aab114");
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