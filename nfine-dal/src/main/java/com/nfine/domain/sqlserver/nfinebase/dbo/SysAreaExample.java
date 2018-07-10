package com.nfine.domain.sqlserver.nfinebase.dbo;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class SysAreaExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public SysAreaExample() {
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

        public Criteria andF_IdIsNull() {
            addCriterion("F_Id is null");
            return (Criteria) this;
        }

        public Criteria andF_IdIsNotNull() {
            addCriterion("F_Id is not null");
            return (Criteria) this;
        }

        public Criteria andF_IdEqualTo(String value) {
            addCriterion("F_Id =", value, "f_Id");
            return (Criteria) this;
        }

        public Criteria andF_IdNotEqualTo(String value) {
            addCriterion("F_Id <>", value, "f_Id");
            return (Criteria) this;
        }

        public Criteria andF_IdGreaterThan(String value) {
            addCriterion("F_Id >", value, "f_Id");
            return (Criteria) this;
        }

        public Criteria andF_IdGreaterThanOrEqualTo(String value) {
            addCriterion("F_Id >=", value, "f_Id");
            return (Criteria) this;
        }

        public Criteria andF_IdLessThan(String value) {
            addCriterion("F_Id <", value, "f_Id");
            return (Criteria) this;
        }

        public Criteria andF_IdLessThanOrEqualTo(String value) {
            addCriterion("F_Id <=", value, "f_Id");
            return (Criteria) this;
        }

        public Criteria andF_IdLike(String value) {
            addCriterion("F_Id like", value, "f_Id");
            return (Criteria) this;
        }

        public Criteria andF_IdNotLike(String value) {
            addCriterion("F_Id not like", value, "f_Id");
            return (Criteria) this;
        }

        public Criteria andF_IdIn(List<String> values) {
            addCriterion("F_Id in", values, "f_Id");
            return (Criteria) this;
        }

        public Criteria andF_IdNotIn(List<String> values) {
            addCriterion("F_Id not in", values, "f_Id");
            return (Criteria) this;
        }

        public Criteria andF_IdBetween(String value1, String value2) {
            addCriterion("F_Id between", value1, value2, "f_Id");
            return (Criteria) this;
        }

        public Criteria andF_IdNotBetween(String value1, String value2) {
            addCriterion("F_Id not between", value1, value2, "f_Id");
            return (Criteria) this;
        }

        public Criteria andF_ParentIdIsNull() {
            addCriterion("F_ParentId is null");
            return (Criteria) this;
        }

        public Criteria andF_ParentIdIsNotNull() {
            addCriterion("F_ParentId is not null");
            return (Criteria) this;
        }

        public Criteria andF_ParentIdEqualTo(String value) {
            addCriterion("F_ParentId =", value, "f_ParentId");
            return (Criteria) this;
        }

        public Criteria andF_ParentIdNotEqualTo(String value) {
            addCriterion("F_ParentId <>", value, "f_ParentId");
            return (Criteria) this;
        }

        public Criteria andF_ParentIdGreaterThan(String value) {
            addCriterion("F_ParentId >", value, "f_ParentId");
            return (Criteria) this;
        }

        public Criteria andF_ParentIdGreaterThanOrEqualTo(String value) {
            addCriterion("F_ParentId >=", value, "f_ParentId");
            return (Criteria) this;
        }

        public Criteria andF_ParentIdLessThan(String value) {
            addCriterion("F_ParentId <", value, "f_ParentId");
            return (Criteria) this;
        }

        public Criteria andF_ParentIdLessThanOrEqualTo(String value) {
            addCriterion("F_ParentId <=", value, "f_ParentId");
            return (Criteria) this;
        }

        public Criteria andF_ParentIdLike(String value) {
            addCriterion("F_ParentId like", value, "f_ParentId");
            return (Criteria) this;
        }

        public Criteria andF_ParentIdNotLike(String value) {
            addCriterion("F_ParentId not like", value, "f_ParentId");
            return (Criteria) this;
        }

        public Criteria andF_ParentIdIn(List<String> values) {
            addCriterion("F_ParentId in", values, "f_ParentId");
            return (Criteria) this;
        }

        public Criteria andF_ParentIdNotIn(List<String> values) {
            addCriterion("F_ParentId not in", values, "f_ParentId");
            return (Criteria) this;
        }

        public Criteria andF_ParentIdBetween(String value1, String value2) {
            addCriterion("F_ParentId between", value1, value2, "f_ParentId");
            return (Criteria) this;
        }

        public Criteria andF_ParentIdNotBetween(String value1, String value2) {
            addCriterion("F_ParentId not between", value1, value2, "f_ParentId");
            return (Criteria) this;
        }

        public Criteria andF_LayersIsNull() {
            addCriterion("F_Layers is null");
            return (Criteria) this;
        }

        public Criteria andF_LayersIsNotNull() {
            addCriterion("F_Layers is not null");
            return (Criteria) this;
        }

        public Criteria andF_LayersEqualTo(Integer value) {
            addCriterion("F_Layers =", value, "f_Layers");
            return (Criteria) this;
        }

        public Criteria andF_LayersNotEqualTo(Integer value) {
            addCriterion("F_Layers <>", value, "f_Layers");
            return (Criteria) this;
        }

        public Criteria andF_LayersGreaterThan(Integer value) {
            addCriterion("F_Layers >", value, "f_Layers");
            return (Criteria) this;
        }

        public Criteria andF_LayersGreaterThanOrEqualTo(Integer value) {
            addCriterion("F_Layers >=", value, "f_Layers");
            return (Criteria) this;
        }

        public Criteria andF_LayersLessThan(Integer value) {
            addCriterion("F_Layers <", value, "f_Layers");
            return (Criteria) this;
        }

        public Criteria andF_LayersLessThanOrEqualTo(Integer value) {
            addCriterion("F_Layers <=", value, "f_Layers");
            return (Criteria) this;
        }

        public Criteria andF_LayersIn(List<Integer> values) {
            addCriterion("F_Layers in", values, "f_Layers");
            return (Criteria) this;
        }

        public Criteria andF_LayersNotIn(List<Integer> values) {
            addCriterion("F_Layers not in", values, "f_Layers");
            return (Criteria) this;
        }

        public Criteria andF_LayersBetween(Integer value1, Integer value2) {
            addCriterion("F_Layers between", value1, value2, "f_Layers");
            return (Criteria) this;
        }

        public Criteria andF_LayersNotBetween(Integer value1, Integer value2) {
            addCriterion("F_Layers not between", value1, value2, "f_Layers");
            return (Criteria) this;
        }

        public Criteria andF_EnCodeIsNull() {
            addCriterion("F_EnCode is null");
            return (Criteria) this;
        }

        public Criteria andF_EnCodeIsNotNull() {
            addCriterion("F_EnCode is not null");
            return (Criteria) this;
        }

        public Criteria andF_EnCodeEqualTo(String value) {
            addCriterion("F_EnCode =", value, "f_EnCode");
            return (Criteria) this;
        }

        public Criteria andF_EnCodeNotEqualTo(String value) {
            addCriterion("F_EnCode <>", value, "f_EnCode");
            return (Criteria) this;
        }

        public Criteria andF_EnCodeGreaterThan(String value) {
            addCriterion("F_EnCode >", value, "f_EnCode");
            return (Criteria) this;
        }

        public Criteria andF_EnCodeGreaterThanOrEqualTo(String value) {
            addCriterion("F_EnCode >=", value, "f_EnCode");
            return (Criteria) this;
        }

        public Criteria andF_EnCodeLessThan(String value) {
            addCriterion("F_EnCode <", value, "f_EnCode");
            return (Criteria) this;
        }

        public Criteria andF_EnCodeLessThanOrEqualTo(String value) {
            addCriterion("F_EnCode <=", value, "f_EnCode");
            return (Criteria) this;
        }

        public Criteria andF_EnCodeLike(String value) {
            addCriterion("F_EnCode like", value, "f_EnCode");
            return (Criteria) this;
        }

        public Criteria andF_EnCodeNotLike(String value) {
            addCriterion("F_EnCode not like", value, "f_EnCode");
            return (Criteria) this;
        }

        public Criteria andF_EnCodeIn(List<String> values) {
            addCriterion("F_EnCode in", values, "f_EnCode");
            return (Criteria) this;
        }

        public Criteria andF_EnCodeNotIn(List<String> values) {
            addCriterion("F_EnCode not in", values, "f_EnCode");
            return (Criteria) this;
        }

        public Criteria andF_EnCodeBetween(String value1, String value2) {
            addCriterion("F_EnCode between", value1, value2, "f_EnCode");
            return (Criteria) this;
        }

        public Criteria andF_EnCodeNotBetween(String value1, String value2) {
            addCriterion("F_EnCode not between", value1, value2, "f_EnCode");
            return (Criteria) this;
        }

        public Criteria andF_FullNameIsNull() {
            addCriterion("F_FullName is null");
            return (Criteria) this;
        }

        public Criteria andF_FullNameIsNotNull() {
            addCriterion("F_FullName is not null");
            return (Criteria) this;
        }

        public Criteria andF_FullNameEqualTo(String value) {
            addCriterion("F_FullName =", value, "f_FullName");
            return (Criteria) this;
        }

        public Criteria andF_FullNameNotEqualTo(String value) {
            addCriterion("F_FullName <>", value, "f_FullName");
            return (Criteria) this;
        }

        public Criteria andF_FullNameGreaterThan(String value) {
            addCriterion("F_FullName >", value, "f_FullName");
            return (Criteria) this;
        }

        public Criteria andF_FullNameGreaterThanOrEqualTo(String value) {
            addCriterion("F_FullName >=", value, "f_FullName");
            return (Criteria) this;
        }

        public Criteria andF_FullNameLessThan(String value) {
            addCriterion("F_FullName <", value, "f_FullName");
            return (Criteria) this;
        }

        public Criteria andF_FullNameLessThanOrEqualTo(String value) {
            addCriterion("F_FullName <=", value, "f_FullName");
            return (Criteria) this;
        }

        public Criteria andF_FullNameLike(String value) {
            addCriterion("F_FullName like", value, "f_FullName");
            return (Criteria) this;
        }

        public Criteria andF_FullNameNotLike(String value) {
            addCriterion("F_FullName not like", value, "f_FullName");
            return (Criteria) this;
        }

        public Criteria andF_FullNameIn(List<String> values) {
            addCriterion("F_FullName in", values, "f_FullName");
            return (Criteria) this;
        }

        public Criteria andF_FullNameNotIn(List<String> values) {
            addCriterion("F_FullName not in", values, "f_FullName");
            return (Criteria) this;
        }

        public Criteria andF_FullNameBetween(String value1, String value2) {
            addCriterion("F_FullName between", value1, value2, "f_FullName");
            return (Criteria) this;
        }

        public Criteria andF_FullNameNotBetween(String value1, String value2) {
            addCriterion("F_FullName not between", value1, value2, "f_FullName");
            return (Criteria) this;
        }

        public Criteria andF_SimpleSpellingIsNull() {
            addCriterion("F_SimpleSpelling is null");
            return (Criteria) this;
        }

        public Criteria andF_SimpleSpellingIsNotNull() {
            addCriterion("F_SimpleSpelling is not null");
            return (Criteria) this;
        }

        public Criteria andF_SimpleSpellingEqualTo(String value) {
            addCriterion("F_SimpleSpelling =", value, "f_SimpleSpelling");
            return (Criteria) this;
        }

        public Criteria andF_SimpleSpellingNotEqualTo(String value) {
            addCriterion("F_SimpleSpelling <>", value, "f_SimpleSpelling");
            return (Criteria) this;
        }

        public Criteria andF_SimpleSpellingGreaterThan(String value) {
            addCriterion("F_SimpleSpelling >", value, "f_SimpleSpelling");
            return (Criteria) this;
        }

        public Criteria andF_SimpleSpellingGreaterThanOrEqualTo(String value) {
            addCriterion("F_SimpleSpelling >=", value, "f_SimpleSpelling");
            return (Criteria) this;
        }

        public Criteria andF_SimpleSpellingLessThan(String value) {
            addCriterion("F_SimpleSpelling <", value, "f_SimpleSpelling");
            return (Criteria) this;
        }

        public Criteria andF_SimpleSpellingLessThanOrEqualTo(String value) {
            addCriterion("F_SimpleSpelling <=", value, "f_SimpleSpelling");
            return (Criteria) this;
        }

        public Criteria andF_SimpleSpellingLike(String value) {
            addCriterion("F_SimpleSpelling like", value, "f_SimpleSpelling");
            return (Criteria) this;
        }

        public Criteria andF_SimpleSpellingNotLike(String value) {
            addCriterion("F_SimpleSpelling not like", value, "f_SimpleSpelling");
            return (Criteria) this;
        }

        public Criteria andF_SimpleSpellingIn(List<String> values) {
            addCriterion("F_SimpleSpelling in", values, "f_SimpleSpelling");
            return (Criteria) this;
        }

        public Criteria andF_SimpleSpellingNotIn(List<String> values) {
            addCriterion("F_SimpleSpelling not in", values, "f_SimpleSpelling");
            return (Criteria) this;
        }

        public Criteria andF_SimpleSpellingBetween(String value1, String value2) {
            addCriterion("F_SimpleSpelling between", value1, value2, "f_SimpleSpelling");
            return (Criteria) this;
        }

        public Criteria andF_SimpleSpellingNotBetween(String value1, String value2) {
            addCriterion("F_SimpleSpelling not between", value1, value2, "f_SimpleSpelling");
            return (Criteria) this;
        }

        public Criteria andF_SortCodeIsNull() {
            addCriterion("F_SortCode is null");
            return (Criteria) this;
        }

        public Criteria andF_SortCodeIsNotNull() {
            addCriterion("F_SortCode is not null");
            return (Criteria) this;
        }

        public Criteria andF_SortCodeEqualTo(Integer value) {
            addCriterion("F_SortCode =", value, "f_SortCode");
            return (Criteria) this;
        }

        public Criteria andF_SortCodeNotEqualTo(Integer value) {
            addCriterion("F_SortCode <>", value, "f_SortCode");
            return (Criteria) this;
        }

        public Criteria andF_SortCodeGreaterThan(Integer value) {
            addCriterion("F_SortCode >", value, "f_SortCode");
            return (Criteria) this;
        }

        public Criteria andF_SortCodeGreaterThanOrEqualTo(Integer value) {
            addCriterion("F_SortCode >=", value, "f_SortCode");
            return (Criteria) this;
        }

        public Criteria andF_SortCodeLessThan(Integer value) {
            addCriterion("F_SortCode <", value, "f_SortCode");
            return (Criteria) this;
        }

        public Criteria andF_SortCodeLessThanOrEqualTo(Integer value) {
            addCriterion("F_SortCode <=", value, "f_SortCode");
            return (Criteria) this;
        }

        public Criteria andF_SortCodeIn(List<Integer> values) {
            addCriterion("F_SortCode in", values, "f_SortCode");
            return (Criteria) this;
        }

        public Criteria andF_SortCodeNotIn(List<Integer> values) {
            addCriterion("F_SortCode not in", values, "f_SortCode");
            return (Criteria) this;
        }

        public Criteria andF_SortCodeBetween(Integer value1, Integer value2) {
            addCriterion("F_SortCode between", value1, value2, "f_SortCode");
            return (Criteria) this;
        }

        public Criteria andF_SortCodeNotBetween(Integer value1, Integer value2) {
            addCriterion("F_SortCode not between", value1, value2, "f_SortCode");
            return (Criteria) this;
        }

        public Criteria andF_DeleteMarkIsNull() {
            addCriterion("F_DeleteMark is null");
            return (Criteria) this;
        }

        public Criteria andF_DeleteMarkIsNotNull() {
            addCriterion("F_DeleteMark is not null");
            return (Criteria) this;
        }

        public Criteria andF_DeleteMarkEqualTo(Boolean value) {
            addCriterion("F_DeleteMark =", value, "f_DeleteMark");
            return (Criteria) this;
        }

        public Criteria andF_DeleteMarkNotEqualTo(Boolean value) {
            addCriterion("F_DeleteMark <>", value, "f_DeleteMark");
            return (Criteria) this;
        }

        public Criteria andF_DeleteMarkGreaterThan(Boolean value) {
            addCriterion("F_DeleteMark >", value, "f_DeleteMark");
            return (Criteria) this;
        }

        public Criteria andF_DeleteMarkGreaterThanOrEqualTo(Boolean value) {
            addCriterion("F_DeleteMark >=", value, "f_DeleteMark");
            return (Criteria) this;
        }

        public Criteria andF_DeleteMarkLessThan(Boolean value) {
            addCriterion("F_DeleteMark <", value, "f_DeleteMark");
            return (Criteria) this;
        }

        public Criteria andF_DeleteMarkLessThanOrEqualTo(Boolean value) {
            addCriterion("F_DeleteMark <=", value, "f_DeleteMark");
            return (Criteria) this;
        }

        public Criteria andF_DeleteMarkIn(List<Boolean> values) {
            addCriterion("F_DeleteMark in", values, "f_DeleteMark");
            return (Criteria) this;
        }

        public Criteria andF_DeleteMarkNotIn(List<Boolean> values) {
            addCriterion("F_DeleteMark not in", values, "f_DeleteMark");
            return (Criteria) this;
        }

        public Criteria andF_DeleteMarkBetween(Boolean value1, Boolean value2) {
            addCriterion("F_DeleteMark between", value1, value2, "f_DeleteMark");
            return (Criteria) this;
        }

        public Criteria andF_DeleteMarkNotBetween(Boolean value1, Boolean value2) {
            addCriterion("F_DeleteMark not between", value1, value2, "f_DeleteMark");
            return (Criteria) this;
        }

        public Criteria andF_EnabledMarkIsNull() {
            addCriterion("F_EnabledMark is null");
            return (Criteria) this;
        }

        public Criteria andF_EnabledMarkIsNotNull() {
            addCriterion("F_EnabledMark is not null");
            return (Criteria) this;
        }

        public Criteria andF_EnabledMarkEqualTo(Boolean value) {
            addCriterion("F_EnabledMark =", value, "f_EnabledMark");
            return (Criteria) this;
        }

        public Criteria andF_EnabledMarkNotEqualTo(Boolean value) {
            addCriterion("F_EnabledMark <>", value, "f_EnabledMark");
            return (Criteria) this;
        }

        public Criteria andF_EnabledMarkGreaterThan(Boolean value) {
            addCriterion("F_EnabledMark >", value, "f_EnabledMark");
            return (Criteria) this;
        }

        public Criteria andF_EnabledMarkGreaterThanOrEqualTo(Boolean value) {
            addCriterion("F_EnabledMark >=", value, "f_EnabledMark");
            return (Criteria) this;
        }

        public Criteria andF_EnabledMarkLessThan(Boolean value) {
            addCriterion("F_EnabledMark <", value, "f_EnabledMark");
            return (Criteria) this;
        }

        public Criteria andF_EnabledMarkLessThanOrEqualTo(Boolean value) {
            addCriterion("F_EnabledMark <=", value, "f_EnabledMark");
            return (Criteria) this;
        }

        public Criteria andF_EnabledMarkIn(List<Boolean> values) {
            addCriterion("F_EnabledMark in", values, "f_EnabledMark");
            return (Criteria) this;
        }

        public Criteria andF_EnabledMarkNotIn(List<Boolean> values) {
            addCriterion("F_EnabledMark not in", values, "f_EnabledMark");
            return (Criteria) this;
        }

        public Criteria andF_EnabledMarkBetween(Boolean value1, Boolean value2) {
            addCriterion("F_EnabledMark between", value1, value2, "f_EnabledMark");
            return (Criteria) this;
        }

        public Criteria andF_EnabledMarkNotBetween(Boolean value1, Boolean value2) {
            addCriterion("F_EnabledMark not between", value1, value2, "f_EnabledMark");
            return (Criteria) this;
        }

        public Criteria andF_DescriptionIsNull() {
            addCriterion("F_Description is null");
            return (Criteria) this;
        }

        public Criteria andF_DescriptionIsNotNull() {
            addCriterion("F_Description is not null");
            return (Criteria) this;
        }

        public Criteria andF_DescriptionEqualTo(String value) {
            addCriterion("F_Description =", value, "f_Description");
            return (Criteria) this;
        }

        public Criteria andF_DescriptionNotEqualTo(String value) {
            addCriterion("F_Description <>", value, "f_Description");
            return (Criteria) this;
        }

        public Criteria andF_DescriptionGreaterThan(String value) {
            addCriterion("F_Description >", value, "f_Description");
            return (Criteria) this;
        }

        public Criteria andF_DescriptionGreaterThanOrEqualTo(String value) {
            addCriterion("F_Description >=", value, "f_Description");
            return (Criteria) this;
        }

        public Criteria andF_DescriptionLessThan(String value) {
            addCriterion("F_Description <", value, "f_Description");
            return (Criteria) this;
        }

        public Criteria andF_DescriptionLessThanOrEqualTo(String value) {
            addCriterion("F_Description <=", value, "f_Description");
            return (Criteria) this;
        }

        public Criteria andF_DescriptionLike(String value) {
            addCriterion("F_Description like", value, "f_Description");
            return (Criteria) this;
        }

        public Criteria andF_DescriptionNotLike(String value) {
            addCriterion("F_Description not like", value, "f_Description");
            return (Criteria) this;
        }

        public Criteria andF_DescriptionIn(List<String> values) {
            addCriterion("F_Description in", values, "f_Description");
            return (Criteria) this;
        }

        public Criteria andF_DescriptionNotIn(List<String> values) {
            addCriterion("F_Description not in", values, "f_Description");
            return (Criteria) this;
        }

        public Criteria andF_DescriptionBetween(String value1, String value2) {
            addCriterion("F_Description between", value1, value2, "f_Description");
            return (Criteria) this;
        }

        public Criteria andF_DescriptionNotBetween(String value1, String value2) {
            addCriterion("F_Description not between", value1, value2, "f_Description");
            return (Criteria) this;
        }

        public Criteria andF_CreatorTimeIsNull() {
            addCriterion("F_CreatorTime is null");
            return (Criteria) this;
        }

        public Criteria andF_CreatorTimeIsNotNull() {
            addCriterion("F_CreatorTime is not null");
            return (Criteria) this;
        }

        public Criteria andF_CreatorTimeEqualTo(Date value) {
            addCriterion("F_CreatorTime =", value, "f_CreatorTime");
            return (Criteria) this;
        }

        public Criteria andF_CreatorTimeNotEqualTo(Date value) {
            addCriterion("F_CreatorTime <>", value, "f_CreatorTime");
            return (Criteria) this;
        }

        public Criteria andF_CreatorTimeGreaterThan(Date value) {
            addCriterion("F_CreatorTime >", value, "f_CreatorTime");
            return (Criteria) this;
        }

        public Criteria andF_CreatorTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("F_CreatorTime >=", value, "f_CreatorTime");
            return (Criteria) this;
        }

        public Criteria andF_CreatorTimeLessThan(Date value) {
            addCriterion("F_CreatorTime <", value, "f_CreatorTime");
            return (Criteria) this;
        }

        public Criteria andF_CreatorTimeLessThanOrEqualTo(Date value) {
            addCriterion("F_CreatorTime <=", value, "f_CreatorTime");
            return (Criteria) this;
        }

        public Criteria andF_CreatorTimeIn(List<Date> values) {
            addCriterion("F_CreatorTime in", values, "f_CreatorTime");
            return (Criteria) this;
        }

        public Criteria andF_CreatorTimeNotIn(List<Date> values) {
            addCriterion("F_CreatorTime not in", values, "f_CreatorTime");
            return (Criteria) this;
        }

        public Criteria andF_CreatorTimeBetween(Date value1, Date value2) {
            addCriterion("F_CreatorTime between", value1, value2, "f_CreatorTime");
            return (Criteria) this;
        }

        public Criteria andF_CreatorTimeNotBetween(Date value1, Date value2) {
            addCriterion("F_CreatorTime not between", value1, value2, "f_CreatorTime");
            return (Criteria) this;
        }

        public Criteria andF_CreatorUserIdIsNull() {
            addCriterion("F_CreatorUserId is null");
            return (Criteria) this;
        }

        public Criteria andF_CreatorUserIdIsNotNull() {
            addCriterion("F_CreatorUserId is not null");
            return (Criteria) this;
        }

        public Criteria andF_CreatorUserIdEqualTo(String value) {
            addCriterion("F_CreatorUserId =", value, "f_CreatorUserId");
            return (Criteria) this;
        }

        public Criteria andF_CreatorUserIdNotEqualTo(String value) {
            addCriterion("F_CreatorUserId <>", value, "f_CreatorUserId");
            return (Criteria) this;
        }

        public Criteria andF_CreatorUserIdGreaterThan(String value) {
            addCriterion("F_CreatorUserId >", value, "f_CreatorUserId");
            return (Criteria) this;
        }

        public Criteria andF_CreatorUserIdGreaterThanOrEqualTo(String value) {
            addCriterion("F_CreatorUserId >=", value, "f_CreatorUserId");
            return (Criteria) this;
        }

        public Criteria andF_CreatorUserIdLessThan(String value) {
            addCriterion("F_CreatorUserId <", value, "f_CreatorUserId");
            return (Criteria) this;
        }

        public Criteria andF_CreatorUserIdLessThanOrEqualTo(String value) {
            addCriterion("F_CreatorUserId <=", value, "f_CreatorUserId");
            return (Criteria) this;
        }

        public Criteria andF_CreatorUserIdLike(String value) {
            addCriterion("F_CreatorUserId like", value, "f_CreatorUserId");
            return (Criteria) this;
        }

        public Criteria andF_CreatorUserIdNotLike(String value) {
            addCriterion("F_CreatorUserId not like", value, "f_CreatorUserId");
            return (Criteria) this;
        }

        public Criteria andF_CreatorUserIdIn(List<String> values) {
            addCriterion("F_CreatorUserId in", values, "f_CreatorUserId");
            return (Criteria) this;
        }

        public Criteria andF_CreatorUserIdNotIn(List<String> values) {
            addCriterion("F_CreatorUserId not in", values, "f_CreatorUserId");
            return (Criteria) this;
        }

        public Criteria andF_CreatorUserIdBetween(String value1, String value2) {
            addCriterion("F_CreatorUserId between", value1, value2, "f_CreatorUserId");
            return (Criteria) this;
        }

        public Criteria andF_CreatorUserIdNotBetween(String value1, String value2) {
            addCriterion("F_CreatorUserId not between", value1, value2, "f_CreatorUserId");
            return (Criteria) this;
        }

        public Criteria andF_LastModifyTimeIsNull() {
            addCriterion("F_LastModifyTime is null");
            return (Criteria) this;
        }

        public Criteria andF_LastModifyTimeIsNotNull() {
            addCriterion("F_LastModifyTime is not null");
            return (Criteria) this;
        }

        public Criteria andF_LastModifyTimeEqualTo(Date value) {
            addCriterion("F_LastModifyTime =", value, "f_LastModifyTime");
            return (Criteria) this;
        }

        public Criteria andF_LastModifyTimeNotEqualTo(Date value) {
            addCriterion("F_LastModifyTime <>", value, "f_LastModifyTime");
            return (Criteria) this;
        }

        public Criteria andF_LastModifyTimeGreaterThan(Date value) {
            addCriterion("F_LastModifyTime >", value, "f_LastModifyTime");
            return (Criteria) this;
        }

        public Criteria andF_LastModifyTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("F_LastModifyTime >=", value, "f_LastModifyTime");
            return (Criteria) this;
        }

        public Criteria andF_LastModifyTimeLessThan(Date value) {
            addCriterion("F_LastModifyTime <", value, "f_LastModifyTime");
            return (Criteria) this;
        }

        public Criteria andF_LastModifyTimeLessThanOrEqualTo(Date value) {
            addCriterion("F_LastModifyTime <=", value, "f_LastModifyTime");
            return (Criteria) this;
        }

        public Criteria andF_LastModifyTimeIn(List<Date> values) {
            addCriterion("F_LastModifyTime in", values, "f_LastModifyTime");
            return (Criteria) this;
        }

        public Criteria andF_LastModifyTimeNotIn(List<Date> values) {
            addCriterion("F_LastModifyTime not in", values, "f_LastModifyTime");
            return (Criteria) this;
        }

        public Criteria andF_LastModifyTimeBetween(Date value1, Date value2) {
            addCriterion("F_LastModifyTime between", value1, value2, "f_LastModifyTime");
            return (Criteria) this;
        }

        public Criteria andF_LastModifyTimeNotBetween(Date value1, Date value2) {
            addCriterion("F_LastModifyTime not between", value1, value2, "f_LastModifyTime");
            return (Criteria) this;
        }

        public Criteria andF_LastModifyUserIdIsNull() {
            addCriterion("F_LastModifyUserId is null");
            return (Criteria) this;
        }

        public Criteria andF_LastModifyUserIdIsNotNull() {
            addCriterion("F_LastModifyUserId is not null");
            return (Criteria) this;
        }

        public Criteria andF_LastModifyUserIdEqualTo(String value) {
            addCriterion("F_LastModifyUserId =", value, "f_LastModifyUserId");
            return (Criteria) this;
        }

        public Criteria andF_LastModifyUserIdNotEqualTo(String value) {
            addCriterion("F_LastModifyUserId <>", value, "f_LastModifyUserId");
            return (Criteria) this;
        }

        public Criteria andF_LastModifyUserIdGreaterThan(String value) {
            addCriterion("F_LastModifyUserId >", value, "f_LastModifyUserId");
            return (Criteria) this;
        }

        public Criteria andF_LastModifyUserIdGreaterThanOrEqualTo(String value) {
            addCriterion("F_LastModifyUserId >=", value, "f_LastModifyUserId");
            return (Criteria) this;
        }

        public Criteria andF_LastModifyUserIdLessThan(String value) {
            addCriterion("F_LastModifyUserId <", value, "f_LastModifyUserId");
            return (Criteria) this;
        }

        public Criteria andF_LastModifyUserIdLessThanOrEqualTo(String value) {
            addCriterion("F_LastModifyUserId <=", value, "f_LastModifyUserId");
            return (Criteria) this;
        }

        public Criteria andF_LastModifyUserIdLike(String value) {
            addCriterion("F_LastModifyUserId like", value, "f_LastModifyUserId");
            return (Criteria) this;
        }

        public Criteria andF_LastModifyUserIdNotLike(String value) {
            addCriterion("F_LastModifyUserId not like", value, "f_LastModifyUserId");
            return (Criteria) this;
        }

        public Criteria andF_LastModifyUserIdIn(List<String> values) {
            addCriterion("F_LastModifyUserId in", values, "f_LastModifyUserId");
            return (Criteria) this;
        }

        public Criteria andF_LastModifyUserIdNotIn(List<String> values) {
            addCriterion("F_LastModifyUserId not in", values, "f_LastModifyUserId");
            return (Criteria) this;
        }

        public Criteria andF_LastModifyUserIdBetween(String value1, String value2) {
            addCriterion("F_LastModifyUserId between", value1, value2, "f_LastModifyUserId");
            return (Criteria) this;
        }

        public Criteria andF_LastModifyUserIdNotBetween(String value1, String value2) {
            addCriterion("F_LastModifyUserId not between", value1, value2, "f_LastModifyUserId");
            return (Criteria) this;
        }

        public Criteria andF_DeleteTimeIsNull() {
            addCriterion("F_DeleteTime is null");
            return (Criteria) this;
        }

        public Criteria andF_DeleteTimeIsNotNull() {
            addCriterion("F_DeleteTime is not null");
            return (Criteria) this;
        }

        public Criteria andF_DeleteTimeEqualTo(Date value) {
            addCriterion("F_DeleteTime =", value, "f_DeleteTime");
            return (Criteria) this;
        }

        public Criteria andF_DeleteTimeNotEqualTo(Date value) {
            addCriterion("F_DeleteTime <>", value, "f_DeleteTime");
            return (Criteria) this;
        }

        public Criteria andF_DeleteTimeGreaterThan(Date value) {
            addCriterion("F_DeleteTime >", value, "f_DeleteTime");
            return (Criteria) this;
        }

        public Criteria andF_DeleteTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("F_DeleteTime >=", value, "f_DeleteTime");
            return (Criteria) this;
        }

        public Criteria andF_DeleteTimeLessThan(Date value) {
            addCriterion("F_DeleteTime <", value, "f_DeleteTime");
            return (Criteria) this;
        }

        public Criteria andF_DeleteTimeLessThanOrEqualTo(Date value) {
            addCriterion("F_DeleteTime <=", value, "f_DeleteTime");
            return (Criteria) this;
        }

        public Criteria andF_DeleteTimeIn(List<Date> values) {
            addCriterion("F_DeleteTime in", values, "f_DeleteTime");
            return (Criteria) this;
        }

        public Criteria andF_DeleteTimeNotIn(List<Date> values) {
            addCriterion("F_DeleteTime not in", values, "f_DeleteTime");
            return (Criteria) this;
        }

        public Criteria andF_DeleteTimeBetween(Date value1, Date value2) {
            addCriterion("F_DeleteTime between", value1, value2, "f_DeleteTime");
            return (Criteria) this;
        }

        public Criteria andF_DeleteTimeNotBetween(Date value1, Date value2) {
            addCriterion("F_DeleteTime not between", value1, value2, "f_DeleteTime");
            return (Criteria) this;
        }

        public Criteria andF_DeleteUserIdIsNull() {
            addCriterion("F_DeleteUserId is null");
            return (Criteria) this;
        }

        public Criteria andF_DeleteUserIdIsNotNull() {
            addCriterion("F_DeleteUserId is not null");
            return (Criteria) this;
        }

        public Criteria andF_DeleteUserIdEqualTo(String value) {
            addCriterion("F_DeleteUserId =", value, "f_DeleteUserId");
            return (Criteria) this;
        }

        public Criteria andF_DeleteUserIdNotEqualTo(String value) {
            addCriterion("F_DeleteUserId <>", value, "f_DeleteUserId");
            return (Criteria) this;
        }

        public Criteria andF_DeleteUserIdGreaterThan(String value) {
            addCriterion("F_DeleteUserId >", value, "f_DeleteUserId");
            return (Criteria) this;
        }

        public Criteria andF_DeleteUserIdGreaterThanOrEqualTo(String value) {
            addCriterion("F_DeleteUserId >=", value, "f_DeleteUserId");
            return (Criteria) this;
        }

        public Criteria andF_DeleteUserIdLessThan(String value) {
            addCriterion("F_DeleteUserId <", value, "f_DeleteUserId");
            return (Criteria) this;
        }

        public Criteria andF_DeleteUserIdLessThanOrEqualTo(String value) {
            addCriterion("F_DeleteUserId <=", value, "f_DeleteUserId");
            return (Criteria) this;
        }

        public Criteria andF_DeleteUserIdLike(String value) {
            addCriterion("F_DeleteUserId like", value, "f_DeleteUserId");
            return (Criteria) this;
        }

        public Criteria andF_DeleteUserIdNotLike(String value) {
            addCriterion("F_DeleteUserId not like", value, "f_DeleteUserId");
            return (Criteria) this;
        }

        public Criteria andF_DeleteUserIdIn(List<String> values) {
            addCriterion("F_DeleteUserId in", values, "f_DeleteUserId");
            return (Criteria) this;
        }

        public Criteria andF_DeleteUserIdNotIn(List<String> values) {
            addCriterion("F_DeleteUserId not in", values, "f_DeleteUserId");
            return (Criteria) this;
        }

        public Criteria andF_DeleteUserIdBetween(String value1, String value2) {
            addCriterion("F_DeleteUserId between", value1, value2, "f_DeleteUserId");
            return (Criteria) this;
        }

        public Criteria andF_DeleteUserIdNotBetween(String value1, String value2) {
            addCriterion("F_DeleteUserId not between", value1, value2, "f_DeleteUserId");
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