package com.practice.develop.common.emun;

/**
 * 类描述：接口返回状态码
 * Created by 李泽阳 on 2019/2/15
 */
public enum ResponseMessageEnum {
    SUCCESS("0"),
    ERROR("-1"),
    VALID_ERROR("0001"),//校验失败
    SAVE_SUCCESS("S001"),//保存
    UPDATE_SUCCESS("U001"),//更新
    SELECT_SUCCESS("S001"),// 查询
    DELETE_SUCCESS("R001");//删除

    private String code;

    ResponseMessageEnum(String code) {
        this.code = code;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }
}
