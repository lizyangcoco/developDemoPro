package com.practice.develop.common.response;

import com.practice.develop.common.emun.ResponseMessageEnum;

/**
 * 类描述：接口响应返回结果工具类
 * Created by 李泽阳 on 2019/2/15
 */
public class Result {
    public static final ResponseMessage RESPONSE_MESSAGE_SUCCESS = new ResponseMessage(ResponseMessageEnum.SUCCESS, "成功", true, null);

    public static ResponseMessage success() {
        return RESPONSE_MESSAGE_SUCCESS;
    }


    public static <T> ResponseMessage<T> success(T t){
        return new ResponseMessage(ResponseMessageEnum.SUCCESS,"成功",true,t);
    }

}
