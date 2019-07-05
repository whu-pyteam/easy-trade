package com.pyteam.db.mbg.entity;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Ac05Example {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public Ac05Example() {
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

        public Criteria andAac501IsNull() {
            addCriterion("aac501 is null");
            return (Criteria) this;
        }

        public Criteria andAac501IsNotNull() {
            addCriterion("aac501 is not null");
            return (Criteria) this;
        }

        public Criteria andAac501EqualTo(Integer value) {
            addCriterion("aac501 =", value, "aac501");
            return (Criteria) this;
        }

        public Criteria andAac501NotEqualTo(Integer value) {
            addCriterion("aac501 <>", value, "aac501");
            return (Criteria) this;
        }

        public Criteria andAac501GreaterThan(Integer value) {
            addCriterion("aac501 >", value, "aac501");
            return (Criteria) this;
        }

        public Criteria andAac501GreaterThanOrEqualTo(Integer value) {
            addCriterion("aac501 >=", value, "aac501");
            return (Criteria) this;
        }

        public Criteria andAac501LessThan(Integer value) {
            addCriterion("aac501 <", value, "aac501");
            return (Criteria) this;
        }

        public Criteria andAac501LessThanOrEqualTo(Integer value) {
            addCriterion("aac501 <=", value, "aac501");
            return (Criteria) this;
        }

        public Criteria andAac501In(List<Integer> values) {
            addCriterion("aac501 in", values, "aac501");
            return (Criteria) this;
        }

        public Criteria andAac501NotIn(List<Integer> values) {
            addCriterion("aac501 not in", values, "aac501");
            return (Criteria) this;
        }

        public Criteria andAac501Between(Integer value1, Integer value2) {
            addCriterion("aac501 between", value1, value2, "aac501");
            return (Criteria) this;
        }

        public Criteria andAac501NotBetween(Integer value1, Integer value2) {
            addCriterion("aac501 not between", value1, value2, "aac501");
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

        public Criteria andAac502IsNull() {
            addCriterion("aac502 is null");
            return (Criteria) this;
        }

        public Criteria andAac502IsNotNull() {
            addCriterion("aac502 is not null");
            return (Criteria) this;
        }

        public Criteria andAac502EqualTo(String value) {
            addCriterion("aac502 =", value, "aac502");
            return (Criteria) this;
        }

        public Criteria andAac502NotEqualTo(String value) {
            addCriterion("aac502 <>", value, "aac502");
            return (Criteria) this;
        }

        public Criteria andAac502GreaterThan(String value) {
            addCriterion("aac502 >", value, "aac502");
            return (Criteria) this;
        }

        public Criteria andAac502GreaterThanOrEqualTo(String value) {
            addCriterion("aac502 >=", value, "aac502");
            return (Criteria) this;
        }

        public Criteria andAac502LessThan(String value) {
            addCriterion("aac502 <", value, "aac502");
            return (Criteria) this;
        }

        public Criteria andAac502LessThanOrEqualTo(String value) {
            addCriterion("aac502 <=", value, "aac502");
            return (Criteria) this;
        }

        public Criteria andAac502Like(String value) {
            addCriterion("aac502 like", value, "aac502");
            return (Criteria) this;
        }

        public Criteria andAac502NotLike(String value) {
            addCriterion("aac502 not like", value, "aac502");
            return (Criteria) this;
        }

        public Criteria andAac502In(List<String> values) {
            addCriterion("aac502 in", values, "aac502");
            return (Criteria) this;
        }

        public Criteria andAac502NotIn(List<String> values) {
            addCriterion("aac502 not in", values, "aac502");
            return (Criteria) this;
        }

        public Criteria andAac502Between(String value1, String value2) {
            addCriterion("aac502 between", value1, value2, "aac502");
            return (Criteria) this;
        }

        public Criteria andAac502NotBetween(String value1, String value2) {
            addCriterion("aac502 not between", value1, value2, "aac502");
            return (Criteria) this;
        }

        public Criteria andAac503IsNull() {
            addCriterion("aac503 is null");
            return (Criteria) this;
        }

        public Criteria andAac503IsNotNull() {
            addCriterion("aac503 is not null");
            return (Criteria) this;
        }

        public Criteria andAac503EqualTo(Integer value) {
            addCriterion("aac503 =", value, "aac503");
            return (Criteria) this;
        }

        public Criteria andAac503NotEqualTo(Integer value) {
            addCriterion("aac503 <>", value, "aac503");
            return (Criteria) this;
        }

        public Criteria andAac503GreaterThan(Integer value) {
            addCriterion("aac503 >", value, "aac503");
            return (Criteria) this;
        }

        public Criteria andAac503GreaterThanOrEqualTo(Integer value) {
            addCriterion("aac503 >=", value, "aac503");
            return (Criteria) this;
        }

        public Criteria andAac503LessThan(Integer value) {
            addCriterion("aac503 <", value, "aac503");
            return (Criteria) this;
        }

        public Criteria andAac503LessThanOrEqualTo(Integer value) {
            addCriterion("aac503 <=", value, "aac503");
            return (Criteria) this;
        }

        public Criteria andAac503In(List<Integer> values) {
            addCriterion("aac503 in", values, "aac503");
            return (Criteria) this;
        }

        public Criteria andAac503NotIn(List<Integer> values) {
            addCriterion("aac503 not in", values, "aac503");
            return (Criteria) this;
        }

        public Criteria andAac503Between(Integer value1, Integer value2) {
            addCriterion("aac503 between", value1, value2, "aac503");
            return (Criteria) this;
        }

        public Criteria andAac503NotBetween(Integer value1, Integer value2) {
            addCriterion("aac503 not between", value1, value2, "aac503");
            return (Criteria) this;
        }

        public Criteria andAac504IsNull() {
            addCriterion("aac504 is null");
            return (Criteria) this;
        }

        public Criteria andAac504IsNotNull() {
            addCriterion("aac504 is not null");
            return (Criteria) this;
        }

        public Criteria andAac504EqualTo(Integer value) {
            addCriterion("aac504 =", value, "aac504");
            return (Criteria) this;
        }

        public Criteria andAac504NotEqualTo(Integer value) {
            addCriterion("aac504 <>", value, "aac504");
            return (Criteria) this;
        }

        public Criteria andAac504GreaterThan(Integer value) {
            addCriterion("aac504 >", value, "aac504");
            return (Criteria) this;
        }

        public Criteria andAac504GreaterThanOrEqualTo(Integer value) {
            addCriterion("aac504 >=", value, "aac504");
            return (Criteria) this;
        }

        public Criteria andAac504LessThan(Integer value) {
            addCriterion("aac504 <", value, "aac504");
            return (Criteria) this;
        }

        public Criteria andAac504LessThanOrEqualTo(Integer value) {
            addCriterion("aac504 <=", value, "aac504");
            return (Criteria) this;
        }

        public Criteria andAac504In(List<Integer> values) {
            addCriterion("aac504 in", values, "aac504");
            return (Criteria) this;
        }

        public Criteria andAac504NotIn(List<Integer> values) {
            addCriterion("aac504 not in", values, "aac504");
            return (Criteria) this;
        }

        public Criteria andAac504Between(Integer value1, Integer value2) {
            addCriterion("aac504 between", value1, value2, "aac504");
            return (Criteria) this;
        }

        public Criteria andAac504NotBetween(Integer value1, Integer value2) {
            addCriterion("aac504 not between", value1, value2, "aac504");
            return (Criteria) this;
        }

        public Criteria andAac505IsNull() {
            addCriterion("aac505 is null");
            return (Criteria) this;
        }

        public Criteria andAac505IsNotNull() {
            addCriterion("aac505 is not null");
            return (Criteria) this;
        }

        public Criteria andAac505EqualTo(Long value) {
            addCriterion("aac505 =", value, "aac505");
            return (Criteria) this;
        }

        public Criteria andAac505NotEqualTo(Long value) {
            addCriterion("aac505 <>", value, "aac505");
            return (Criteria) this;
        }

        public Criteria andAac505GreaterThan(Long value) {
            addCriterion("aac505 >", value, "aac505");
            return (Criteria) this;
        }

        public Criteria andAac505GreaterThanOrEqualTo(Long value) {
            addCriterion("aac505 >=", value, "aac505");
            return (Criteria) this;
        }

        public Criteria andAac505LessThan(Long value) {
            addCriterion("aac505 <", value, "aac505");
            return (Criteria) this;
        }

        public Criteria andAac505LessThanOrEqualTo(Long value) {
            addCriterion("aac505 <=", value, "aac505");
            return (Criteria) this;
        }

        public Criteria andAac505In(List<Long> values) {
            addCriterion("aac505 in", values, "aac505");
            return (Criteria) this;
        }

        public Criteria andAac505NotIn(List<Long> values) {
            addCriterion("aac505 not in", values, "aac505");
            return (Criteria) this;
        }

        public Criteria andAac505Between(Long value1, Long value2) {
            addCriterion("aac505 between", value1, value2, "aac505");
            return (Criteria) this;
        }

        public Criteria andAac505NotBetween(Long value1, Long value2) {
            addCriterion("aac505 not between", value1, value2, "aac505");
            return (Criteria) this;
        }

        public Criteria andAac506IsNull() {
            addCriterion("aac506 is null");
            return (Criteria) this;
        }

        public Criteria andAac506IsNotNull() {
            addCriterion("aac506 is not null");
            return (Criteria) this;
        }

        public Criteria andAac506EqualTo(String value) {
            addCriterion("aac506 =", value, "aac506");
            return (Criteria) this;
        }

        public Criteria andAac506NotEqualTo(String value) {
            addCriterion("aac506 <>", value, "aac506");
            return (Criteria) this;
        }

        public Criteria andAac506GreaterThan(String value) {
            addCriterion("aac506 >", value, "aac506");
            return (Criteria) this;
        }

        public Criteria andAac506GreaterThanOrEqualTo(String value) {
            addCriterion("aac506 >=", value, "aac506");
            return (Criteria) this;
        }

        public Criteria andAac506LessThan(String value) {
            addCriterion("aac506 <", value, "aac506");
            return (Criteria) this;
        }

        public Criteria andAac506LessThanOrEqualTo(String value) {
            addCriterion("aac506 <=", value, "aac506");
            return (Criteria) this;
        }

        public Criteria andAac506Like(String value) {
            addCriterion("aac506 like", value, "aac506");
            return (Criteria) this;
        }

        public Criteria andAac506NotLike(String value) {
            addCriterion("aac506 not like", value, "aac506");
            return (Criteria) this;
        }

        public Criteria andAac506In(List<String> values) {
            addCriterion("aac506 in", values, "aac506");
            return (Criteria) this;
        }

        public Criteria andAac506NotIn(List<String> values) {
            addCriterion("aac506 not in", values, "aac506");
            return (Criteria) this;
        }

        public Criteria andAac506Between(String value1, String value2) {
            addCriterion("aac506 between", value1, value2, "aac506");
            return (Criteria) this;
        }

        public Criteria andAac506NotBetween(String value1, String value2) {
            addCriterion("aac506 not between", value1, value2, "aac506");
            return (Criteria) this;
        }

        public Criteria andAac507IsNull() {
            addCriterion("aac507 is null");
            return (Criteria) this;
        }

        public Criteria andAac507IsNotNull() {
            addCriterion("aac507 is not null");
            return (Criteria) this;
        }

        public Criteria andAac507EqualTo(String value) {
            addCriterion("aac507 =", value, "aac507");
            return (Criteria) this;
        }

        public Criteria andAac507NotEqualTo(String value) {
            addCriterion("aac507 <>", value, "aac507");
            return (Criteria) this;
        }

        public Criteria andAac507GreaterThan(String value) {
            addCriterion("aac507 >", value, "aac507");
            return (Criteria) this;
        }

        public Criteria andAac507GreaterThanOrEqualTo(String value) {
            addCriterion("aac507 >=", value, "aac507");
            return (Criteria) this;
        }

        public Criteria andAac507LessThan(String value) {
            addCriterion("aac507 <", value, "aac507");
            return (Criteria) this;
        }

        public Criteria andAac507LessThanOrEqualTo(String value) {
            addCriterion("aac507 <=", value, "aac507");
            return (Criteria) this;
        }

        public Criteria andAac507Like(String value) {
            addCriterion("aac507 like", value, "aac507");
            return (Criteria) this;
        }

        public Criteria andAac507NotLike(String value) {
            addCriterion("aac507 not like", value, "aac507");
            return (Criteria) this;
        }

        public Criteria andAac507In(List<String> values) {
            addCriterion("aac507 in", values, "aac507");
            return (Criteria) this;
        }

        public Criteria andAac507NotIn(List<String> values) {
            addCriterion("aac507 not in", values, "aac507");
            return (Criteria) this;
        }

        public Criteria andAac507Between(String value1, String value2) {
            addCriterion("aac507 between", value1, value2, "aac507");
            return (Criteria) this;
        }

        public Criteria andAac507NotBetween(String value1, String value2) {
            addCriterion("aac507 not between", value1, value2, "aac507");
            return (Criteria) this;
        }

        public Criteria andAac508IsNull() {
            addCriterion("aac508 is null");
            return (Criteria) this;
        }

        public Criteria andAac508IsNotNull() {
            addCriterion("aac508 is not null");
            return (Criteria) this;
        }

        public Criteria andAac508EqualTo(String value) {
            addCriterion("aac508 =", value, "aac508");
            return (Criteria) this;
        }

        public Criteria andAac508NotEqualTo(String value) {
            addCriterion("aac508 <>", value, "aac508");
            return (Criteria) this;
        }

        public Criteria andAac508GreaterThan(String value) {
            addCriterion("aac508 >", value, "aac508");
            return (Criteria) this;
        }

        public Criteria andAac508GreaterThanOrEqualTo(String value) {
            addCriterion("aac508 >=", value, "aac508");
            return (Criteria) this;
        }

        public Criteria andAac508LessThan(String value) {
            addCriterion("aac508 <", value, "aac508");
            return (Criteria) this;
        }

        public Criteria andAac508LessThanOrEqualTo(String value) {
            addCriterion("aac508 <=", value, "aac508");
            return (Criteria) this;
        }

        public Criteria andAac508Like(String value) {
            addCriterion("aac508 like", value, "aac508");
            return (Criteria) this;
        }

        public Criteria andAac508NotLike(String value) {
            addCriterion("aac508 not like", value, "aac508");
            return (Criteria) this;
        }

        public Criteria andAac508In(List<String> values) {
            addCriterion("aac508 in", values, "aac508");
            return (Criteria) this;
        }

        public Criteria andAac508NotIn(List<String> values) {
            addCriterion("aac508 not in", values, "aac508");
            return (Criteria) this;
        }

        public Criteria andAac508Between(String value1, String value2) {
            addCriterion("aac508 between", value1, value2, "aac508");
            return (Criteria) this;
        }

        public Criteria andAac508NotBetween(String value1, String value2) {
            addCriterion("aac508 not between", value1, value2, "aac508");
            return (Criteria) this;
        }

        public Criteria andAac509IsNull() {
            addCriterion("aac509 is null");
            return (Criteria) this;
        }

        public Criteria andAac509IsNotNull() {
            addCriterion("aac509 is not null");
            return (Criteria) this;
        }

        public Criteria andAac509EqualTo(String value) {
            addCriterion("aac509 =", value, "aac509");
            return (Criteria) this;
        }

        public Criteria andAac509NotEqualTo(String value) {
            addCriterion("aac509 <>", value, "aac509");
            return (Criteria) this;
        }

        public Criteria andAac509GreaterThan(String value) {
            addCriterion("aac509 >", value, "aac509");
            return (Criteria) this;
        }

        public Criteria andAac509GreaterThanOrEqualTo(String value) {
            addCriterion("aac509 >=", value, "aac509");
            return (Criteria) this;
        }

        public Criteria andAac509LessThan(String value) {
            addCriterion("aac509 <", value, "aac509");
            return (Criteria) this;
        }

        public Criteria andAac509LessThanOrEqualTo(String value) {
            addCriterion("aac509 <=", value, "aac509");
            return (Criteria) this;
        }

        public Criteria andAac509Like(String value) {
            addCriterion("aac509 like", value, "aac509");
            return (Criteria) this;
        }

        public Criteria andAac509NotLike(String value) {
            addCriterion("aac509 not like", value, "aac509");
            return (Criteria) this;
        }

        public Criteria andAac509In(List<String> values) {
            addCriterion("aac509 in", values, "aac509");
            return (Criteria) this;
        }

        public Criteria andAac509NotIn(List<String> values) {
            addCriterion("aac509 not in", values, "aac509");
            return (Criteria) this;
        }

        public Criteria andAac509Between(String value1, String value2) {
            addCriterion("aac509 between", value1, value2, "aac509");
            return (Criteria) this;
        }

        public Criteria andAac509NotBetween(String value1, String value2) {
            addCriterion("aac509 not between", value1, value2, "aac509");
            return (Criteria) this;
        }

        public Criteria andAac510IsNull() {
            addCriterion("aac510 is null");
            return (Criteria) this;
        }

        public Criteria andAac510IsNotNull() {
            addCriterion("aac510 is not null");
            return (Criteria) this;
        }

        public Criteria andAac510EqualTo(String value) {
            addCriterion("aac510 =", value, "aac510");
            return (Criteria) this;
        }

        public Criteria andAac510NotEqualTo(String value) {
            addCriterion("aac510 <>", value, "aac510");
            return (Criteria) this;
        }

        public Criteria andAac510GreaterThan(String value) {
            addCriterion("aac510 >", value, "aac510");
            return (Criteria) this;
        }

        public Criteria andAac510GreaterThanOrEqualTo(String value) {
            addCriterion("aac510 >=", value, "aac510");
            return (Criteria) this;
        }

        public Criteria andAac510LessThan(String value) {
            addCriterion("aac510 <", value, "aac510");
            return (Criteria) this;
        }

        public Criteria andAac510LessThanOrEqualTo(String value) {
            addCriterion("aac510 <=", value, "aac510");
            return (Criteria) this;
        }

        public Criteria andAac510Like(String value) {
            addCriterion("aac510 like", value, "aac510");
            return (Criteria) this;
        }

        public Criteria andAac510NotLike(String value) {
            addCriterion("aac510 not like", value, "aac510");
            return (Criteria) this;
        }

        public Criteria andAac510In(List<String> values) {
            addCriterion("aac510 in", values, "aac510");
            return (Criteria) this;
        }

        public Criteria andAac510NotIn(List<String> values) {
            addCriterion("aac510 not in", values, "aac510");
            return (Criteria) this;
        }

        public Criteria andAac510Between(String value1, String value2) {
            addCriterion("aac510 between", value1, value2, "aac510");
            return (Criteria) this;
        }

        public Criteria andAac510NotBetween(String value1, String value2) {
            addCriterion("aac510 not between", value1, value2, "aac510");
            return (Criteria) this;
        }

        public Criteria andAac511IsNull() {
            addCriterion("aac511 is null");
            return (Criteria) this;
        }

        public Criteria andAac511IsNotNull() {
            addCriterion("aac511 is not null");
            return (Criteria) this;
        }

        public Criteria andAac511EqualTo(Date value) {
            addCriterion("aac511 =", value, "aac511");
            return (Criteria) this;
        }

        public Criteria andAac511NotEqualTo(Date value) {
            addCriterion("aac511 <>", value, "aac511");
            return (Criteria) this;
        }

        public Criteria andAac511GreaterThan(Date value) {
            addCriterion("aac511 >", value, "aac511");
            return (Criteria) this;
        }

        public Criteria andAac511GreaterThanOrEqualTo(Date value) {
            addCriterion("aac511 >=", value, "aac511");
            return (Criteria) this;
        }

        public Criteria andAac511LessThan(Date value) {
            addCriterion("aac511 <", value, "aac511");
            return (Criteria) this;
        }

        public Criteria andAac511LessThanOrEqualTo(Date value) {
            addCriterion("aac511 <=", value, "aac511");
            return (Criteria) this;
        }

        public Criteria andAac511In(List<Date> values) {
            addCriterion("aac511 in", values, "aac511");
            return (Criteria) this;
        }

        public Criteria andAac511NotIn(List<Date> values) {
            addCriterion("aac511 not in", values, "aac511");
            return (Criteria) this;
        }

        public Criteria andAac511Between(Date value1, Date value2) {
            addCriterion("aac511 between", value1, value2, "aac511");
            return (Criteria) this;
        }

        public Criteria andAac511NotBetween(Date value1, Date value2) {
            addCriterion("aac511 not between", value1, value2, "aac511");
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