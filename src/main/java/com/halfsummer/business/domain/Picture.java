package com.halfsummer.business.domain;

public class Picture {
    private String pictureId;

    private String pictureTitle;

    private String bookAuthor;

    private String pictureLevel;

    private String producerNational;

    private String workLong;

    private String workWidth;

    public String getPictureId() {
        return pictureId;
    }

    public void setPictureId(String pictureId) {
        this.pictureId = pictureId == null ? null : pictureId.trim();
    }

    public String getPictureTitle() {
        return pictureTitle;
    }

    public void setPictureTitle(String pictureTitle) {
        this.pictureTitle = pictureTitle == null ? null : pictureTitle.trim();
    }

    public String getBookAuthor() {
        return bookAuthor;
    }

    public void setBookAuthor(String bookAuthor) {
        this.bookAuthor = bookAuthor == null ? null : bookAuthor.trim();
    }

    public String getPictureLevel() {
        return pictureLevel;
    }

    public void setPictureLevel(String pictureLevel) {
        this.pictureLevel = pictureLevel == null ? null : pictureLevel.trim();
    }

    public String getProducerNational() {
        return producerNational;
    }

    public void setProducerNational(String producerNational) {
        this.producerNational = producerNational == null ? null : producerNational.trim();
    }

    public String getWorkLong() {
        return workLong;
    }

    public void setWorkLong(String workLong) {
        this.workLong = workLong == null ? null : workLong.trim();
    }

    public String getWorkWidth() {
        return workWidth;
    }

    public void setWorkWidth(String workWidth) {
        this.workWidth = workWidth == null ? null : workWidth.trim();
    }
}