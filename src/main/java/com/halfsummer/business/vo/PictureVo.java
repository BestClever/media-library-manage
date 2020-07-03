package com.halfsummer.business.vo;

import com.halfsummer.baseframework.vo.BasePage;

/**
 * @author BestClever
 * @title: PictureVo
 * @projectName media-library-manage
 * @description: TODO
 * @date 2020-07-03 09:48
 */
public class PictureVo extends BasePage {

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
        this.pictureId = pictureId;
    }

    public String getPictureTitle() {
        return pictureTitle;
    }

    public void setPictureTitle(String pictureTitle) {
        this.pictureTitle = pictureTitle;
    }

    public String getBookAuthor() {
        return bookAuthor;
    }

    public void setBookAuthor(String bookAuthor) {
        this.bookAuthor = bookAuthor;
    }

    public String getPictureLevel() {
        return pictureLevel;
    }

    public void setPictureLevel(String pictureLevel) {
        this.pictureLevel = pictureLevel;
    }

    public String getProducerNational() {
        return producerNational;
    }

    public void setProducerNational(String producerNational) {
        this.producerNational = producerNational;
    }

    public String getWorkLong() {
        return workLong;
    }

    public void setWorkLong(String workLong) {
        this.workLong = workLong;
    }

    public String getWorkWidth() {
        return workWidth;
    }

    public void setWorkWidth(String workWidth) {
        this.workWidth = workWidth;
    }
}
