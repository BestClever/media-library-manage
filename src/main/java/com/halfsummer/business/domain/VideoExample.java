package com.halfsummer.business.domain;

import java.util.ArrayList;
import java.util.List;

public class VideoExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public VideoExample() {
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

        public Criteria andVideoIdIsNull() {
            addCriterion("video_id is null");
            return (Criteria) this;
        }

        public Criteria andVideoIdIsNotNull() {
            addCriterion("video_id is not null");
            return (Criteria) this;
        }

        public Criteria andVideoIdEqualTo(String value) {
            addCriterion("video_id =", value, "videoId");
            return (Criteria) this;
        }

        public Criteria andVideoIdNotEqualTo(String value) {
            addCriterion("video_id <>", value, "videoId");
            return (Criteria) this;
        }

        public Criteria andVideoIdGreaterThan(String value) {
            addCriterion("video_id >", value, "videoId");
            return (Criteria) this;
        }

        public Criteria andVideoIdGreaterThanOrEqualTo(String value) {
            addCriterion("video_id >=", value, "videoId");
            return (Criteria) this;
        }

        public Criteria andVideoIdLessThan(String value) {
            addCriterion("video_id <", value, "videoId");
            return (Criteria) this;
        }

        public Criteria andVideoIdLessThanOrEqualTo(String value) {
            addCriterion("video_id <=", value, "videoId");
            return (Criteria) this;
        }

        public Criteria andVideoIdLike(String value) {
            addCriterion("video_id like", value, "videoId");
            return (Criteria) this;
        }

        public Criteria andVideoIdNotLike(String value) {
            addCriterion("video_id not like", value, "videoId");
            return (Criteria) this;
        }

        public Criteria andVideoIdIn(List<String> values) {
            addCriterion("video_id in", values, "videoId");
            return (Criteria) this;
        }

        public Criteria andVideoIdNotIn(List<String> values) {
            addCriterion("video_id not in", values, "videoId");
            return (Criteria) this;
        }

        public Criteria andVideoIdBetween(String value1, String value2) {
            addCriterion("video_id between", value1, value2, "videoId");
            return (Criteria) this;
        }

        public Criteria andVideoIdNotBetween(String value1, String value2) {
            addCriterion("video_id not between", value1, value2, "videoId");
            return (Criteria) this;
        }

        public Criteria andVideoTitleIsNull() {
            addCriterion("video_title is null");
            return (Criteria) this;
        }

        public Criteria andVideoTitleIsNotNull() {
            addCriterion("video_title is not null");
            return (Criteria) this;
        }

        public Criteria andVideoTitleEqualTo(String value) {
            addCriterion("video_title =", value, "videoTitle");
            return (Criteria) this;
        }

        public Criteria andVideoTitleNotEqualTo(String value) {
            addCriterion("video_title <>", value, "videoTitle");
            return (Criteria) this;
        }

        public Criteria andVideoTitleGreaterThan(String value) {
            addCriterion("video_title >", value, "videoTitle");
            return (Criteria) this;
        }

        public Criteria andVideoTitleGreaterThanOrEqualTo(String value) {
            addCriterion("video_title >=", value, "videoTitle");
            return (Criteria) this;
        }

        public Criteria andVideoTitleLessThan(String value) {
            addCriterion("video_title <", value, "videoTitle");
            return (Criteria) this;
        }

        public Criteria andVideoTitleLessThanOrEqualTo(String value) {
            addCriterion("video_title <=", value, "videoTitle");
            return (Criteria) this;
        }

        public Criteria andVideoTitleLike(String value) {
            addCriterion("video_title like", value, "videoTitle");
            return (Criteria) this;
        }

        public Criteria andVideoTitleNotLike(String value) {
            addCriterion("video_title not like", value, "videoTitle");
            return (Criteria) this;
        }

        public Criteria andVideoTitleIn(List<String> values) {
            addCriterion("video_title in", values, "videoTitle");
            return (Criteria) this;
        }

        public Criteria andVideoTitleNotIn(List<String> values) {
            addCriterion("video_title not in", values, "videoTitle");
            return (Criteria) this;
        }

        public Criteria andVideoTitleBetween(String value1, String value2) {
            addCriterion("video_title between", value1, value2, "videoTitle");
            return (Criteria) this;
        }

        public Criteria andVideoTitleNotBetween(String value1, String value2) {
            addCriterion("video_title not between", value1, value2, "videoTitle");
            return (Criteria) this;
        }

        public Criteria andBookAuthorIsNull() {
            addCriterion("book_author is null");
            return (Criteria) this;
        }

        public Criteria andBookAuthorIsNotNull() {
            addCriterion("book_author is not null");
            return (Criteria) this;
        }

        public Criteria andBookAuthorEqualTo(String value) {
            addCriterion("book_author =", value, "bookAuthor");
            return (Criteria) this;
        }

        public Criteria andBookAuthorNotEqualTo(String value) {
            addCriterion("book_author <>", value, "bookAuthor");
            return (Criteria) this;
        }

        public Criteria andBookAuthorGreaterThan(String value) {
            addCriterion("book_author >", value, "bookAuthor");
            return (Criteria) this;
        }

        public Criteria andBookAuthorGreaterThanOrEqualTo(String value) {
            addCriterion("book_author >=", value, "bookAuthor");
            return (Criteria) this;
        }

        public Criteria andBookAuthorLessThan(String value) {
            addCriterion("book_author <", value, "bookAuthor");
            return (Criteria) this;
        }

        public Criteria andBookAuthorLessThanOrEqualTo(String value) {
            addCriterion("book_author <=", value, "bookAuthor");
            return (Criteria) this;
        }

        public Criteria andBookAuthorLike(String value) {
            addCriterion("book_author like", value, "bookAuthor");
            return (Criteria) this;
        }

        public Criteria andBookAuthorNotLike(String value) {
            addCriterion("book_author not like", value, "bookAuthor");
            return (Criteria) this;
        }

        public Criteria andBookAuthorIn(List<String> values) {
            addCriterion("book_author in", values, "bookAuthor");
            return (Criteria) this;
        }

        public Criteria andBookAuthorNotIn(List<String> values) {
            addCriterion("book_author not in", values, "bookAuthor");
            return (Criteria) this;
        }

        public Criteria andBookAuthorBetween(String value1, String value2) {
            addCriterion("book_author between", value1, value2, "bookAuthor");
            return (Criteria) this;
        }

        public Criteria andBookAuthorNotBetween(String value1, String value2) {
            addCriterion("book_author not between", value1, value2, "bookAuthor");
            return (Criteria) this;
        }

        public Criteria andVideoLevelIsNull() {
            addCriterion("video_level is null");
            return (Criteria) this;
        }

        public Criteria andVideoLevelIsNotNull() {
            addCriterion("video_level is not null");
            return (Criteria) this;
        }

        public Criteria andVideoLevelEqualTo(String value) {
            addCriterion("video_level =", value, "videoLevel");
            return (Criteria) this;
        }

        public Criteria andVideoLevelNotEqualTo(String value) {
            addCriterion("video_level <>", value, "videoLevel");
            return (Criteria) this;
        }

        public Criteria andVideoLevelGreaterThan(String value) {
            addCriterion("video_level >", value, "videoLevel");
            return (Criteria) this;
        }

        public Criteria andVideoLevelGreaterThanOrEqualTo(String value) {
            addCriterion("video_level >=", value, "videoLevel");
            return (Criteria) this;
        }

        public Criteria andVideoLevelLessThan(String value) {
            addCriterion("video_level <", value, "videoLevel");
            return (Criteria) this;
        }

        public Criteria andVideoLevelLessThanOrEqualTo(String value) {
            addCriterion("video_level <=", value, "videoLevel");
            return (Criteria) this;
        }

        public Criteria andVideoLevelLike(String value) {
            addCriterion("video_level like", value, "videoLevel");
            return (Criteria) this;
        }

        public Criteria andVideoLevelNotLike(String value) {
            addCriterion("video_level not like", value, "videoLevel");
            return (Criteria) this;
        }

        public Criteria andVideoLevelIn(List<String> values) {
            addCriterion("video_level in", values, "videoLevel");
            return (Criteria) this;
        }

        public Criteria andVideoLevelNotIn(List<String> values) {
            addCriterion("video_level not in", values, "videoLevel");
            return (Criteria) this;
        }

        public Criteria andVideoLevelBetween(String value1, String value2) {
            addCriterion("video_level between", value1, value2, "videoLevel");
            return (Criteria) this;
        }

        public Criteria andVideoLevelNotBetween(String value1, String value2) {
            addCriterion("video_level not between", value1, value2, "videoLevel");
            return (Criteria) this;
        }

        public Criteria andProducerNameIsNull() {
            addCriterion("producer_name is null");
            return (Criteria) this;
        }

        public Criteria andProducerNameIsNotNull() {
            addCriterion("producer_name is not null");
            return (Criteria) this;
        }

        public Criteria andProducerNameEqualTo(String value) {
            addCriterion("producer_name =", value, "producerName");
            return (Criteria) this;
        }

        public Criteria andProducerNameNotEqualTo(String value) {
            addCriterion("producer_name <>", value, "producerName");
            return (Criteria) this;
        }

        public Criteria andProducerNameGreaterThan(String value) {
            addCriterion("producer_name >", value, "producerName");
            return (Criteria) this;
        }

        public Criteria andProducerNameGreaterThanOrEqualTo(String value) {
            addCriterion("producer_name >=", value, "producerName");
            return (Criteria) this;
        }

        public Criteria andProducerNameLessThan(String value) {
            addCriterion("producer_name <", value, "producerName");
            return (Criteria) this;
        }

        public Criteria andProducerNameLessThanOrEqualTo(String value) {
            addCriterion("producer_name <=", value, "producerName");
            return (Criteria) this;
        }

        public Criteria andProducerNameLike(String value) {
            addCriterion("producer_name like", value, "producerName");
            return (Criteria) this;
        }

        public Criteria andProducerNameNotLike(String value) {
            addCriterion("producer_name not like", value, "producerName");
            return (Criteria) this;
        }

        public Criteria andProducerNameIn(List<String> values) {
            addCriterion("producer_name in", values, "producerName");
            return (Criteria) this;
        }

        public Criteria andProducerNameNotIn(List<String> values) {
            addCriterion("producer_name not in", values, "producerName");
            return (Criteria) this;
        }

        public Criteria andProducerNameBetween(String value1, String value2) {
            addCriterion("producer_name between", value1, value2, "producerName");
            return (Criteria) this;
        }

        public Criteria andProducerNameNotBetween(String value1, String value2) {
            addCriterion("producer_name not between", value1, value2, "producerName");
            return (Criteria) this;
        }

        public Criteria andProducerYearIsNull() {
            addCriterion("producer_year is null");
            return (Criteria) this;
        }

        public Criteria andProducerYearIsNotNull() {
            addCriterion("producer_year is not null");
            return (Criteria) this;
        }

        public Criteria andProducerYearEqualTo(String value) {
            addCriterion("producer_year =", value, "producerYear");
            return (Criteria) this;
        }

        public Criteria andProducerYearNotEqualTo(String value) {
            addCriterion("producer_year <>", value, "producerYear");
            return (Criteria) this;
        }

        public Criteria andProducerYearGreaterThan(String value) {
            addCriterion("producer_year >", value, "producerYear");
            return (Criteria) this;
        }

        public Criteria andProducerYearGreaterThanOrEqualTo(String value) {
            addCriterion("producer_year >=", value, "producerYear");
            return (Criteria) this;
        }

        public Criteria andProducerYearLessThan(String value) {
            addCriterion("producer_year <", value, "producerYear");
            return (Criteria) this;
        }

        public Criteria andProducerYearLessThanOrEqualTo(String value) {
            addCriterion("producer_year <=", value, "producerYear");
            return (Criteria) this;
        }

        public Criteria andProducerYearLike(String value) {
            addCriterion("producer_year like", value, "producerYear");
            return (Criteria) this;
        }

        public Criteria andProducerYearNotLike(String value) {
            addCriterion("producer_year not like", value, "producerYear");
            return (Criteria) this;
        }

        public Criteria andProducerYearIn(List<String> values) {
            addCriterion("producer_year in", values, "producerYear");
            return (Criteria) this;
        }

        public Criteria andProducerYearNotIn(List<String> values) {
            addCriterion("producer_year not in", values, "producerYear");
            return (Criteria) this;
        }

        public Criteria andProducerYearBetween(String value1, String value2) {
            addCriterion("producer_year between", value1, value2, "producerYear");
            return (Criteria) this;
        }

        public Criteria andProducerYearNotBetween(String value1, String value2) {
            addCriterion("producer_year not between", value1, value2, "producerYear");
            return (Criteria) this;
        }

        public Criteria andVideoTimeIsNull() {
            addCriterion("video_time is null");
            return (Criteria) this;
        }

        public Criteria andVideoTimeIsNotNull() {
            addCriterion("video_time is not null");
            return (Criteria) this;
        }

        public Criteria andVideoTimeEqualTo(String value) {
            addCriterion("video_time =", value, "videoTime");
            return (Criteria) this;
        }

        public Criteria andVideoTimeNotEqualTo(String value) {
            addCriterion("video_time <>", value, "videoTime");
            return (Criteria) this;
        }

        public Criteria andVideoTimeGreaterThan(String value) {
            addCriterion("video_time >", value, "videoTime");
            return (Criteria) this;
        }

        public Criteria andVideoTimeGreaterThanOrEqualTo(String value) {
            addCriterion("video_time >=", value, "videoTime");
            return (Criteria) this;
        }

        public Criteria andVideoTimeLessThan(String value) {
            addCriterion("video_time <", value, "videoTime");
            return (Criteria) this;
        }

        public Criteria andVideoTimeLessThanOrEqualTo(String value) {
            addCriterion("video_time <=", value, "videoTime");
            return (Criteria) this;
        }

        public Criteria andVideoTimeLike(String value) {
            addCriterion("video_time like", value, "videoTime");
            return (Criteria) this;
        }

        public Criteria andVideoTimeNotLike(String value) {
            addCriterion("video_time not like", value, "videoTime");
            return (Criteria) this;
        }

        public Criteria andVideoTimeIn(List<String> values) {
            addCriterion("video_time in", values, "videoTime");
            return (Criteria) this;
        }

        public Criteria andVideoTimeNotIn(List<String> values) {
            addCriterion("video_time not in", values, "videoTime");
            return (Criteria) this;
        }

        public Criteria andVideoTimeBetween(String value1, String value2) {
            addCriterion("video_time between", value1, value2, "videoTime");
            return (Criteria) this;
        }

        public Criteria andVideoTimeNotBetween(String value1, String value2) {
            addCriterion("video_time not between", value1, value2, "videoTime");
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