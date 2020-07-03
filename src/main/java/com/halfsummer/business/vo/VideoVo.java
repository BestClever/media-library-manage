package com.halfsummer.business.vo;

import com.halfsummer.baseframework.vo.BasePage;

/**
 * @author BestClever
 * @title: VideoVo
 * @projectName media-library-manage
 * @description: TODO
 * @date 2020-07-03 09:48
 */
public class VideoVo extends BasePage {

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
        this.videoId = videoId;
    }

    public String getVideoTitle() {
        return videoTitle;
    }

    public void setVideoTitle(String videoTitle) {
        this.videoTitle = videoTitle;
    }

    public String getBookAuthor() {
        return bookAuthor;
    }

    public void setBookAuthor(String bookAuthor) {
        this.bookAuthor = bookAuthor;
    }

    public String getVideoLevel() {
        return videoLevel;
    }

    public void setVideoLevel(String videoLevel) {
        this.videoLevel = videoLevel;
    }

    public String getProducerName() {
        return producerName;
    }

    public void setProducerName(String producerName) {
        this.producerName = producerName;
    }

    public String getProducerYear() {
        return producerYear;
    }

    public void setProducerYear(String producerYear) {
        this.producerYear = producerYear;
    }

    public String getVideoTime() {
        return videoTime;
    }

    public void setVideoTime(String videoTime) {
        this.videoTime = videoTime;
    }
}
