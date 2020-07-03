package com.halfsummer.business.domain;

import java.util.ArrayList;
import java.util.List;

public class PictureExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public PictureExample() {
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

        public Criteria andPictureIdIsNull() {
            addCriterion("picture_id is null");
            return (Criteria) this;
        }

        public Criteria andPictureIdIsNotNull() {
            addCriterion("picture_id is not null");
            return (Criteria) this;
        }

        public Criteria andPictureIdEqualTo(String value) {
            addCriterion("picture_id =", value, "pictureId");
            return (Criteria) this;
        }

        public Criteria andPictureIdNotEqualTo(String value) {
            addCriterion("picture_id <>", value, "pictureId");
            return (Criteria) this;
        }

        public Criteria andPictureIdGreaterThan(String value) {
            addCriterion("picture_id >", value, "pictureId");
            return (Criteria) this;
        }

        public Criteria andPictureIdGreaterThanOrEqualTo(String value) {
            addCriterion("picture_id >=", value, "pictureId");
            return (Criteria) this;
        }

        public Criteria andPictureIdLessThan(String value) {
            addCriterion("picture_id <", value, "pictureId");
            return (Criteria) this;
        }

        public Criteria andPictureIdLessThanOrEqualTo(String value) {
            addCriterion("picture_id <=", value, "pictureId");
            return (Criteria) this;
        }

        public Criteria andPictureIdLike(String value) {
            addCriterion("picture_id like", value, "pictureId");
            return (Criteria) this;
        }

        public Criteria andPictureIdNotLike(String value) {
            addCriterion("picture_id not like", value, "pictureId");
            return (Criteria) this;
        }

        public Criteria andPictureIdIn(List<String> values) {
            addCriterion("picture_id in", values, "pictureId");
            return (Criteria) this;
        }

        public Criteria andPictureIdNotIn(List<String> values) {
            addCriterion("picture_id not in", values, "pictureId");
            return (Criteria) this;
        }

        public Criteria andPictureIdBetween(String value1, String value2) {
            addCriterion("picture_id between", value1, value2, "pictureId");
            return (Criteria) this;
        }

        public Criteria andPictureIdNotBetween(String value1, String value2) {
            addCriterion("picture_id not between", value1, value2, "pictureId");
            return (Criteria) this;
        }

        public Criteria andPictureTitleIsNull() {
            addCriterion("picture_title is null");
            return (Criteria) this;
        }

        public Criteria andPictureTitleIsNotNull() {
            addCriterion("picture_title is not null");
            return (Criteria) this;
        }

        public Criteria andPictureTitleEqualTo(String value) {
            addCriterion("picture_title =", value, "pictureTitle");
            return (Criteria) this;
        }

        public Criteria andPictureTitleNotEqualTo(String value) {
            addCriterion("picture_title <>", value, "pictureTitle");
            return (Criteria) this;
        }

        public Criteria andPictureTitleGreaterThan(String value) {
            addCriterion("picture_title >", value, "pictureTitle");
            return (Criteria) this;
        }

        public Criteria andPictureTitleGreaterThanOrEqualTo(String value) {
            addCriterion("picture_title >=", value, "pictureTitle");
            return (Criteria) this;
        }

        public Criteria andPictureTitleLessThan(String value) {
            addCriterion("picture_title <", value, "pictureTitle");
            return (Criteria) this;
        }

        public Criteria andPictureTitleLessThanOrEqualTo(String value) {
            addCriterion("picture_title <=", value, "pictureTitle");
            return (Criteria) this;
        }

        public Criteria andPictureTitleLike(String value) {
            addCriterion("picture_title like", value, "pictureTitle");
            return (Criteria) this;
        }

        public Criteria andPictureTitleNotLike(String value) {
            addCriterion("picture_title not like", value, "pictureTitle");
            return (Criteria) this;
        }

        public Criteria andPictureTitleIn(List<String> values) {
            addCriterion("picture_title in", values, "pictureTitle");
            return (Criteria) this;
        }

        public Criteria andPictureTitleNotIn(List<String> values) {
            addCriterion("picture_title not in", values, "pictureTitle");
            return (Criteria) this;
        }

        public Criteria andPictureTitleBetween(String value1, String value2) {
            addCriterion("picture_title between", value1, value2, "pictureTitle");
            return (Criteria) this;
        }

        public Criteria andPictureTitleNotBetween(String value1, String value2) {
            addCriterion("picture_title not between", value1, value2, "pictureTitle");
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

        public Criteria andPictureLevelIsNull() {
            addCriterion("picture_level is null");
            return (Criteria) this;
        }

        public Criteria andPictureLevelIsNotNull() {
            addCriterion("picture_level is not null");
            return (Criteria) this;
        }

        public Criteria andPictureLevelEqualTo(String value) {
            addCriterion("picture_level =", value, "pictureLevel");
            return (Criteria) this;
        }

        public Criteria andPictureLevelNotEqualTo(String value) {
            addCriterion("picture_level <>", value, "pictureLevel");
            return (Criteria) this;
        }

        public Criteria andPictureLevelGreaterThan(String value) {
            addCriterion("picture_level >", value, "pictureLevel");
            return (Criteria) this;
        }

        public Criteria andPictureLevelGreaterThanOrEqualTo(String value) {
            addCriterion("picture_level >=", value, "pictureLevel");
            return (Criteria) this;
        }

        public Criteria andPictureLevelLessThan(String value) {
            addCriterion("picture_level <", value, "pictureLevel");
            return (Criteria) this;
        }

        public Criteria andPictureLevelLessThanOrEqualTo(String value) {
            addCriterion("picture_level <=", value, "pictureLevel");
            return (Criteria) this;
        }

        public Criteria andPictureLevelLike(String value) {
            addCriterion("picture_level like", value, "pictureLevel");
            return (Criteria) this;
        }

        public Criteria andPictureLevelNotLike(String value) {
            addCriterion("picture_level not like", value, "pictureLevel");
            return (Criteria) this;
        }

        public Criteria andPictureLevelIn(List<String> values) {
            addCriterion("picture_level in", values, "pictureLevel");
            return (Criteria) this;
        }

        public Criteria andPictureLevelNotIn(List<String> values) {
            addCriterion("picture_level not in", values, "pictureLevel");
            return (Criteria) this;
        }

        public Criteria andPictureLevelBetween(String value1, String value2) {
            addCriterion("picture_level between", value1, value2, "pictureLevel");
            return (Criteria) this;
        }

        public Criteria andPictureLevelNotBetween(String value1, String value2) {
            addCriterion("picture_level not between", value1, value2, "pictureLevel");
            return (Criteria) this;
        }

        public Criteria andProducerNationalIsNull() {
            addCriterion("producer_national is null");
            return (Criteria) this;
        }

        public Criteria andProducerNationalIsNotNull() {
            addCriterion("producer_national is not null");
            return (Criteria) this;
        }

        public Criteria andProducerNationalEqualTo(String value) {
            addCriterion("producer_national =", value, "producerNational");
            return (Criteria) this;
        }

        public Criteria andProducerNationalNotEqualTo(String value) {
            addCriterion("producer_national <>", value, "producerNational");
            return (Criteria) this;
        }

        public Criteria andProducerNationalGreaterThan(String value) {
            addCriterion("producer_national >", value, "producerNational");
            return (Criteria) this;
        }

        public Criteria andProducerNationalGreaterThanOrEqualTo(String value) {
            addCriterion("producer_national >=", value, "producerNational");
            return (Criteria) this;
        }

        public Criteria andProducerNationalLessThan(String value) {
            addCriterion("producer_national <", value, "producerNational");
            return (Criteria) this;
        }

        public Criteria andProducerNationalLessThanOrEqualTo(String value) {
            addCriterion("producer_national <=", value, "producerNational");
            return (Criteria) this;
        }

        public Criteria andProducerNationalLike(String value) {
            addCriterion("producer_national like", value, "producerNational");
            return (Criteria) this;
        }

        public Criteria andProducerNationalNotLike(String value) {
            addCriterion("producer_national not like", value, "producerNational");
            return (Criteria) this;
        }

        public Criteria andProducerNationalIn(List<String> values) {
            addCriterion("producer_national in", values, "producerNational");
            return (Criteria) this;
        }

        public Criteria andProducerNationalNotIn(List<String> values) {
            addCriterion("producer_national not in", values, "producerNational");
            return (Criteria) this;
        }

        public Criteria andProducerNationalBetween(String value1, String value2) {
            addCriterion("producer_national between", value1, value2, "producerNational");
            return (Criteria) this;
        }

        public Criteria andProducerNationalNotBetween(String value1, String value2) {
            addCriterion("producer_national not between", value1, value2, "producerNational");
            return (Criteria) this;
        }

        public Criteria andWorkLongIsNull() {
            addCriterion("work_long is null");
            return (Criteria) this;
        }

        public Criteria andWorkLongIsNotNull() {
            addCriterion("work_long is not null");
            return (Criteria) this;
        }

        public Criteria andWorkLongEqualTo(String value) {
            addCriterion("work_long =", value, "workLong");
            return (Criteria) this;
        }

        public Criteria andWorkLongNotEqualTo(String value) {
            addCriterion("work_long <>", value, "workLong");
            return (Criteria) this;
        }

        public Criteria andWorkLongGreaterThan(String value) {
            addCriterion("work_long >", value, "workLong");
            return (Criteria) this;
        }

        public Criteria andWorkLongGreaterThanOrEqualTo(String value) {
            addCriterion("work_long >=", value, "workLong");
            return (Criteria) this;
        }

        public Criteria andWorkLongLessThan(String value) {
            addCriterion("work_long <", value, "workLong");
            return (Criteria) this;
        }

        public Criteria andWorkLongLessThanOrEqualTo(String value) {
            addCriterion("work_long <=", value, "workLong");
            return (Criteria) this;
        }

        public Criteria andWorkLongLike(String value) {
            addCriterion("work_long like", value, "workLong");
            return (Criteria) this;
        }

        public Criteria andWorkLongNotLike(String value) {
            addCriterion("work_long not like", value, "workLong");
            return (Criteria) this;
        }

        public Criteria andWorkLongIn(List<String> values) {
            addCriterion("work_long in", values, "workLong");
            return (Criteria) this;
        }

        public Criteria andWorkLongNotIn(List<String> values) {
            addCriterion("work_long not in", values, "workLong");
            return (Criteria) this;
        }

        public Criteria andWorkLongBetween(String value1, String value2) {
            addCriterion("work_long between", value1, value2, "workLong");
            return (Criteria) this;
        }

        public Criteria andWorkLongNotBetween(String value1, String value2) {
            addCriterion("work_long not between", value1, value2, "workLong");
            return (Criteria) this;
        }

        public Criteria andWorkWidthIsNull() {
            addCriterion("work_width is null");
            return (Criteria) this;
        }

        public Criteria andWorkWidthIsNotNull() {
            addCriterion("work_width is not null");
            return (Criteria) this;
        }

        public Criteria andWorkWidthEqualTo(String value) {
            addCriterion("work_width =", value, "workWidth");
            return (Criteria) this;
        }

        public Criteria andWorkWidthNotEqualTo(String value) {
            addCriterion("work_width <>", value, "workWidth");
            return (Criteria) this;
        }

        public Criteria andWorkWidthGreaterThan(String value) {
            addCriterion("work_width >", value, "workWidth");
            return (Criteria) this;
        }

        public Criteria andWorkWidthGreaterThanOrEqualTo(String value) {
            addCriterion("work_width >=", value, "workWidth");
            return (Criteria) this;
        }

        public Criteria andWorkWidthLessThan(String value) {
            addCriterion("work_width <", value, "workWidth");
            return (Criteria) this;
        }

        public Criteria andWorkWidthLessThanOrEqualTo(String value) {
            addCriterion("work_width <=", value, "workWidth");
            return (Criteria) this;
        }

        public Criteria andWorkWidthLike(String value) {
            addCriterion("work_width like", value, "workWidth");
            return (Criteria) this;
        }

        public Criteria andWorkWidthNotLike(String value) {
            addCriterion("work_width not like", value, "workWidth");
            return (Criteria) this;
        }

        public Criteria andWorkWidthIn(List<String> values) {
            addCriterion("work_width in", values, "workWidth");
            return (Criteria) this;
        }

        public Criteria andWorkWidthNotIn(List<String> values) {
            addCriterion("work_width not in", values, "workWidth");
            return (Criteria) this;
        }

        public Criteria andWorkWidthBetween(String value1, String value2) {
            addCriterion("work_width between", value1, value2, "workWidth");
            return (Criteria) this;
        }

        public Criteria andWorkWidthNotBetween(String value1, String value2) {
            addCriterion("work_width not between", value1, value2, "workWidth");
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