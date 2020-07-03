package com.halfsummer.business.domain;

import java.util.ArrayList;
import java.util.List;

public class BookExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public BookExample() {
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

        public Criteria andBookIdIsNull() {
            addCriterion("book_id is null");
            return (Criteria) this;
        }

        public Criteria andBookIdIsNotNull() {
            addCriterion("book_id is not null");
            return (Criteria) this;
        }

        public Criteria andBookIdEqualTo(String value) {
            addCriterion("book_id =", value, "bookId");
            return (Criteria) this;
        }

        public Criteria andBookIdNotEqualTo(String value) {
            addCriterion("book_id <>", value, "bookId");
            return (Criteria) this;
        }

        public Criteria andBookIdGreaterThan(String value) {
            addCriterion("book_id >", value, "bookId");
            return (Criteria) this;
        }

        public Criteria andBookIdGreaterThanOrEqualTo(String value) {
            addCriterion("book_id >=", value, "bookId");
            return (Criteria) this;
        }

        public Criteria andBookIdLessThan(String value) {
            addCriterion("book_id <", value, "bookId");
            return (Criteria) this;
        }

        public Criteria andBookIdLessThanOrEqualTo(String value) {
            addCriterion("book_id <=", value, "bookId");
            return (Criteria) this;
        }

        public Criteria andBookIdLike(String value) {
            addCriterion("book_id like", value, "bookId");
            return (Criteria) this;
        }

        public Criteria andBookIdNotLike(String value) {
            addCriterion("book_id not like", value, "bookId");
            return (Criteria) this;
        }

        public Criteria andBookIdIn(List<String> values) {
            addCriterion("book_id in", values, "bookId");
            return (Criteria) this;
        }

        public Criteria andBookIdNotIn(List<String> values) {
            addCriterion("book_id not in", values, "bookId");
            return (Criteria) this;
        }

        public Criteria andBookIdBetween(String value1, String value2) {
            addCriterion("book_id between", value1, value2, "bookId");
            return (Criteria) this;
        }

        public Criteria andBookIdNotBetween(String value1, String value2) {
            addCriterion("book_id not between", value1, value2, "bookId");
            return (Criteria) this;
        }

        public Criteria andBookTitleIsNull() {
            addCriterion("book_title is null");
            return (Criteria) this;
        }

        public Criteria andBookTitleIsNotNull() {
            addCriterion("book_title is not null");
            return (Criteria) this;
        }

        public Criteria andBookTitleEqualTo(String value) {
            addCriterion("book_title =", value, "bookTitle");
            return (Criteria) this;
        }

        public Criteria andBookTitleNotEqualTo(String value) {
            addCriterion("book_title <>", value, "bookTitle");
            return (Criteria) this;
        }

        public Criteria andBookTitleGreaterThan(String value) {
            addCriterion("book_title >", value, "bookTitle");
            return (Criteria) this;
        }

        public Criteria andBookTitleGreaterThanOrEqualTo(String value) {
            addCriterion("book_title >=", value, "bookTitle");
            return (Criteria) this;
        }

        public Criteria andBookTitleLessThan(String value) {
            addCriterion("book_title <", value, "bookTitle");
            return (Criteria) this;
        }

        public Criteria andBookTitleLessThanOrEqualTo(String value) {
            addCriterion("book_title <=", value, "bookTitle");
            return (Criteria) this;
        }

        public Criteria andBookTitleLike(String value) {
            addCriterion("book_title like", value, "bookTitle");
            return (Criteria) this;
        }

        public Criteria andBookTitleNotLike(String value) {
            addCriterion("book_title not like", value, "bookTitle");
            return (Criteria) this;
        }

        public Criteria andBookTitleIn(List<String> values) {
            addCriterion("book_title in", values, "bookTitle");
            return (Criteria) this;
        }

        public Criteria andBookTitleNotIn(List<String> values) {
            addCriterion("book_title not in", values, "bookTitle");
            return (Criteria) this;
        }

        public Criteria andBookTitleBetween(String value1, String value2) {
            addCriterion("book_title between", value1, value2, "bookTitle");
            return (Criteria) this;
        }

        public Criteria andBookTitleNotBetween(String value1, String value2) {
            addCriterion("book_title not between", value1, value2, "bookTitle");
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

        public Criteria andBookLevelIsNull() {
            addCriterion("book_level is null");
            return (Criteria) this;
        }

        public Criteria andBookLevelIsNotNull() {
            addCriterion("book_level is not null");
            return (Criteria) this;
        }

        public Criteria andBookLevelEqualTo(String value) {
            addCriterion("book_level =", value, "bookLevel");
            return (Criteria) this;
        }

        public Criteria andBookLevelNotEqualTo(String value) {
            addCriterion("book_level <>", value, "bookLevel");
            return (Criteria) this;
        }

        public Criteria andBookLevelGreaterThan(String value) {
            addCriterion("book_level >", value, "bookLevel");
            return (Criteria) this;
        }

        public Criteria andBookLevelGreaterThanOrEqualTo(String value) {
            addCriterion("book_level >=", value, "bookLevel");
            return (Criteria) this;
        }

        public Criteria andBookLevelLessThan(String value) {
            addCriterion("book_level <", value, "bookLevel");
            return (Criteria) this;
        }

        public Criteria andBookLevelLessThanOrEqualTo(String value) {
            addCriterion("book_level <=", value, "bookLevel");
            return (Criteria) this;
        }

        public Criteria andBookLevelLike(String value) {
            addCriterion("book_level like", value, "bookLevel");
            return (Criteria) this;
        }

        public Criteria andBookLevelNotLike(String value) {
            addCriterion("book_level not like", value, "bookLevel");
            return (Criteria) this;
        }

        public Criteria andBookLevelIn(List<String> values) {
            addCriterion("book_level in", values, "bookLevel");
            return (Criteria) this;
        }

        public Criteria andBookLevelNotIn(List<String> values) {
            addCriterion("book_level not in", values, "bookLevel");
            return (Criteria) this;
        }

        public Criteria andBookLevelBetween(String value1, String value2) {
            addCriterion("book_level between", value1, value2, "bookLevel");
            return (Criteria) this;
        }

        public Criteria andBookLevelNotBetween(String value1, String value2) {
            addCriterion("book_level not between", value1, value2, "bookLevel");
            return (Criteria) this;
        }

        public Criteria andBookPublisherIsNull() {
            addCriterion("book_publisher is null");
            return (Criteria) this;
        }

        public Criteria andBookPublisherIsNotNull() {
            addCriterion("book_publisher is not null");
            return (Criteria) this;
        }

        public Criteria andBookPublisherEqualTo(String value) {
            addCriterion("book_publisher =", value, "bookPublisher");
            return (Criteria) this;
        }

        public Criteria andBookPublisherNotEqualTo(String value) {
            addCriterion("book_publisher <>", value, "bookPublisher");
            return (Criteria) this;
        }

        public Criteria andBookPublisherGreaterThan(String value) {
            addCriterion("book_publisher >", value, "bookPublisher");
            return (Criteria) this;
        }

        public Criteria andBookPublisherGreaterThanOrEqualTo(String value) {
            addCriterion("book_publisher >=", value, "bookPublisher");
            return (Criteria) this;
        }

        public Criteria andBookPublisherLessThan(String value) {
            addCriterion("book_publisher <", value, "bookPublisher");
            return (Criteria) this;
        }

        public Criteria andBookPublisherLessThanOrEqualTo(String value) {
            addCriterion("book_publisher <=", value, "bookPublisher");
            return (Criteria) this;
        }

        public Criteria andBookPublisherLike(String value) {
            addCriterion("book_publisher like", value, "bookPublisher");
            return (Criteria) this;
        }

        public Criteria andBookPublisherNotLike(String value) {
            addCriterion("book_publisher not like", value, "bookPublisher");
            return (Criteria) this;
        }

        public Criteria andBookPublisherIn(List<String> values) {
            addCriterion("book_publisher in", values, "bookPublisher");
            return (Criteria) this;
        }

        public Criteria andBookPublisherNotIn(List<String> values) {
            addCriterion("book_publisher not in", values, "bookPublisher");
            return (Criteria) this;
        }

        public Criteria andBookPublisherBetween(String value1, String value2) {
            addCriterion("book_publisher between", value1, value2, "bookPublisher");
            return (Criteria) this;
        }

        public Criteria andBookPublisherNotBetween(String value1, String value2) {
            addCriterion("book_publisher not between", value1, value2, "bookPublisher");
            return (Criteria) this;
        }

        public Criteria andIsbnNoIsNull() {
            addCriterion("ISBN_NO is null");
            return (Criteria) this;
        }

        public Criteria andIsbnNoIsNotNull() {
            addCriterion("ISBN_NO is not null");
            return (Criteria) this;
        }

        public Criteria andIsbnNoEqualTo(String value) {
            addCriterion("ISBN_NO =", value, "isbnNo");
            return (Criteria) this;
        }

        public Criteria andIsbnNoNotEqualTo(String value) {
            addCriterion("ISBN_NO <>", value, "isbnNo");
            return (Criteria) this;
        }

        public Criteria andIsbnNoGreaterThan(String value) {
            addCriterion("ISBN_NO >", value, "isbnNo");
            return (Criteria) this;
        }

        public Criteria andIsbnNoGreaterThanOrEqualTo(String value) {
            addCriterion("ISBN_NO >=", value, "isbnNo");
            return (Criteria) this;
        }

        public Criteria andIsbnNoLessThan(String value) {
            addCriterion("ISBN_NO <", value, "isbnNo");
            return (Criteria) this;
        }

        public Criteria andIsbnNoLessThanOrEqualTo(String value) {
            addCriterion("ISBN_NO <=", value, "isbnNo");
            return (Criteria) this;
        }

        public Criteria andIsbnNoLike(String value) {
            addCriterion("ISBN_NO like", value, "isbnNo");
            return (Criteria) this;
        }

        public Criteria andIsbnNoNotLike(String value) {
            addCriterion("ISBN_NO not like", value, "isbnNo");
            return (Criteria) this;
        }

        public Criteria andIsbnNoIn(List<String> values) {
            addCriterion("ISBN_NO in", values, "isbnNo");
            return (Criteria) this;
        }

        public Criteria andIsbnNoNotIn(List<String> values) {
            addCriterion("ISBN_NO not in", values, "isbnNo");
            return (Criteria) this;
        }

        public Criteria andIsbnNoBetween(String value1, String value2) {
            addCriterion("ISBN_NO between", value1, value2, "isbnNo");
            return (Criteria) this;
        }

        public Criteria andIsbnNoNotBetween(String value1, String value2) {
            addCriterion("ISBN_NO not between", value1, value2, "isbnNo");
            return (Criteria) this;
        }

        public Criteria andPageCountIsNull() {
            addCriterion("page_count is null");
            return (Criteria) this;
        }

        public Criteria andPageCountIsNotNull() {
            addCriterion("page_count is not null");
            return (Criteria) this;
        }

        public Criteria andPageCountEqualTo(Integer value) {
            addCriterion("page_count =", value, "pageCount");
            return (Criteria) this;
        }

        public Criteria andPageCountNotEqualTo(Integer value) {
            addCriterion("page_count <>", value, "pageCount");
            return (Criteria) this;
        }

        public Criteria andPageCountGreaterThan(Integer value) {
            addCriterion("page_count >", value, "pageCount");
            return (Criteria) this;
        }

        public Criteria andPageCountGreaterThanOrEqualTo(Integer value) {
            addCriterion("page_count >=", value, "pageCount");
            return (Criteria) this;
        }

        public Criteria andPageCountLessThan(Integer value) {
            addCriterion("page_count <", value, "pageCount");
            return (Criteria) this;
        }

        public Criteria andPageCountLessThanOrEqualTo(Integer value) {
            addCriterion("page_count <=", value, "pageCount");
            return (Criteria) this;
        }

        public Criteria andPageCountIn(List<Integer> values) {
            addCriterion("page_count in", values, "pageCount");
            return (Criteria) this;
        }

        public Criteria andPageCountNotIn(List<Integer> values) {
            addCriterion("page_count not in", values, "pageCount");
            return (Criteria) this;
        }

        public Criteria andPageCountBetween(Integer value1, Integer value2) {
            addCriterion("page_count between", value1, value2, "pageCount");
            return (Criteria) this;
        }

        public Criteria andPageCountNotBetween(Integer value1, Integer value2) {
            addCriterion("page_count not between", value1, value2, "pageCount");
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