package com.halfsummer.baseframework.enums;


import com.halfsummer.baseframework.exception.BaseInfoInterface;

/**
 * halfsummer
 *
 * @author pancm
 * @Title: CommonEnum
 * @Description: 公用描述枚举类
 * @Version:1.0.0
 * @date 2018年6月25日
 */
public enum CommonEnum implements BaseInfoInterface {
    // 数据操作错误定义
    SUCCESS(200, "成功!"),
    BODY_NOT_MATCH(400, "请求的数据格式不符!"),
    SIGNATURE_NOT_MATCH(401, "请求的数字签名不匹配!"),
    NOT_FOUND(404, "未找到该资源!"),
    INTERNAL_SERVER_ERROR(500, "服务器内部错误!"),
    SERVER_BUSY(503, "服务器正忙，请稍后再试!"),
    ARITHMETIC_ERROR(1100, "数学运算错误!"),
    REPERTORY_FULL(1101,"文件库已满！"),
    DATA_EXIST(1200, "数据存在!"),
    DATA_NOT_EXIST(1250, "数据不存存在!"),

    /*登录*/
    LOGIN_SUCCESS_STUDENT(9001, "登录成功！"),
    NOT_EXIST_USER(9051, "不存在该用户"),
    PWD_ERROR(9052,"密码错误"),

    /*添加*/
    ADD_SUCESS(9101, "新增成功！"),
    ADD_FAILURE(9151, "新增失败！"),
    /*更新*/
    UPDATE_SUCESS(9201, "更新成功！"),
    UPDATE_FAILURE(9251, "更新失败！"),
    /*删除*/
    REMOVE_SUCESS(9301, "删除成功！"),
    REMOVE_FAILURE(9351, "删除失败！"),

    ;

    /**
     * 错误码
     */
    private Integer resultCode;

    /**
     * 错误描述
     */
    private String resultMsg;

    CommonEnum(Integer resultCode, String resultMsg) {
        this.resultCode = resultCode;
        this.resultMsg = resultMsg;
    }

    @Override
    public Integer getResultCode() {
        return resultCode;
    }

    @Override
    public String getResultMsg() {
        return resultMsg;
    }

}
