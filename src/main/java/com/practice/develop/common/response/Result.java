package com.practice.develop.common.response;

import com.practice.develop.common.emun.ResponseMessageEnum;

/**
 * 类描述：接口响应返回结果工具类
 * Created by 李泽阳 on 2019/2/15
 */
public class Result {
    public static final ResponseMessage RESPONSE_MESSAGE_SUCCESS = new ResponseMessage(ResponseMessageEnum.SUCCESS, "成功", true, null);

    //空返回
    public static ResponseMessage success() {
        return RESPONSE_MESSAGE_SUCCESS;
    }

    //对象返回
    public static <T> ResponseMessage<T> success(T t) {
        return new ResponseMessage(ResponseMessageEnum.SUCCESS, "成功", true, t);
    }

    //按状态码返回
    public static <T> ResponseMessage<T> success(ResponseMessageEnum codeEnum, T t) {
        return new ResponseMessage(codeEnum, "", true, t);
    }

    //按自定义返回信息
    public static <T> ResponseMessage<T> success(ResponseMessageEnum codeEnum, String message, T t) {
        return new ResponseMessage(codeEnum, message, true, t);
    }
   


}
