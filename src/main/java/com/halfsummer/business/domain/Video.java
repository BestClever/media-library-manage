package com.halfsummer.business.domain;

public class Video {
    private String videoId;

    private String videoTitle;

    private String bookAuthor;

    private String videoLevel;

    private String producerName;

    private String producerYear;

    private String videoTime;

    public String getVideoId() {
        return videoId;
    }

    public void setVideoId(String videoId) {
        this.videoId = videoId == null ? null : videoId.trim();
    }

    public String getVideoTitle() {
        return videoTitle;
    }

    public void setVideoTitle(String videoTitle) {
        this.videoTitle = videoTitle == null ? null : videoTitle.trim();
    }

    public String getBookAuthor() {
        return bookAuthor;
    }

    public void setBookAuthor(String bookAuthor) {
        this.bookAuthor = bookAuthor == null ? null : bookAuthor.trim();
    }

    public String getVideoLevel() {
        return videoLevel;
    }

    public void setVideoLevel(String videoLevel) {
        this.videoLevel = videoLevel == null ? null : videoLevel.trim();
    }

    public String getProducerName() {
        return producerName;
    }

    public void setProducerName(String producerName) {
        this.producerName = producerName == null ? null : producerName.trim();
    }

    public String getProducerYear() {
        return producerYear;
    }

    public void setProducerYear(String producerYear) {
        this.producerYear = producerYear == null ? null : producerYear.trim();
    }

    public String getVideoTime() {
        return videoTime;
    }

    public void setVideoTime(String videoTime) {
        this.videoTime = videoTime == null ? null : videoTime.trim();
    }
}