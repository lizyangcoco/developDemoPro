package com.practice.develop.common.response;

import com.practice.develop.common.emun.ResponseMessageEnum;

/**
 * 类描述：接口响应返回结构
 * Created by 李泽阳 on 2019/2/15
 */
public class ResponseMessage<T> {
    private String respCode;
    private String respMessage;
    private T data;
    private boolean ok;

    //构造函数
    public ResponseMessage(ResponseMessageEnum codeEnum, String message) {
        this.respCode = codeEnum.getCode();
        this.respMessage = message;
    }

    //重载构造方法
    public ResponseMessage(ResponseMessageEnum codeEnum, String message, boolean ok, T data) {
        this.respCode = codeEnum.getCode();
        this.respMessage = message;
        this.ok = ok;
        this.data = data;
    }


    public String getRespCode() {
        return respCode;
    }

    public void setRespCode(String respCode) {
        this.respCode = respCode;
    }

    public String getRespMessage() {
        return respMessage;
    }

    public void setRespMessage(String respMessage) {
        this.respMessage = respMessage;
    }

    public T getData() {
        return data;
    }

    public void setData(T data) {
        this.data = data;
    }

    public boolean isOk() {
        return ok;
    }

    public void setOk(boolean ok) {
        this.ok = ok;
    }
}
