package com.practice.develop.common.response;

import com.practice.develop.common.emun.ResponseMessageEnum;

/**
 * 类描述：接口响应返回结果工具类
 * Created by 李泽阳 on 2019/2/15
 */
public class Result {
    public static final ResponseMessage RESPONSE_MESSAGE_SUCCESS = new ResponseMessage(ResponseMessageEnum.SUCCESS, "成功", true, null);
    public static final ResponseMessage RESPONSE_MESSAGE_ERROR = new ResponseMessage(ResponseMessageEnum.ERROR, "失败", false, null);

    //空返回success
    public static ResponseMessage success() {
        return RESPONSE_MESSAGE_SUCCESS;
    }

    //对象返回success
    public static <T> ResponseMessage<T> success(T t) {
        return new ResponseMessage(ResponseMessageEnum.SUCCESS, "成功", true, t);
    }

    //按状态码返回success
    public static <T> ResponseMessage<T> success(ResponseMessageEnum codeEnum, T t) {
        return new ResponseMessage(codeEnum, "", true, t);
    }

    //按自定义返回信息success
    public static <T> ResponseMessage<T> success(ResponseMessageEnum codeEnum, String message, T t) {
        return new ResponseMessage(codeEnum, message, true, t);
    }

    //空返回error

    public static ResponseMessage error() {
        return error("失败");
    }

    public static ResponseMessage error(String message) {
        return error(ResponseMessageEnum.ERROR, message);
    }

    public static ResponseMessage error(ResponseMessageEnum codeEnum, String message) {
        return error(codeEnum, message, null);
    }

    public static <T> ResponseMessage<T> error(ResponseMessageEnum codeEnum, String message, T t) {
        return new ResponseMessage(codeEnum, message, false, t);
    }

    /**
     * 校验失败信息
     *
     * @param t
     * @param <T>
     * @return
     */
    public static <T> ResponseMessage<T> error(T t) {
        return new ResponseMessage(ResponseMessageEnum.VALID_ERROR, "校验失败", false, t);
    }


}
