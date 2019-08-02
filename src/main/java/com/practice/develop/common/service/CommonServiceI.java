package com.practice.develop.common.service;

import java.io.Serializable;

/**
 * 类描述：公有基层方法接口
 * Created by 李泽阳 on 2019/2/15
 */
public interface CommonServiceI {

    /**
     * Serializable 对象序列化
     */

    public <T> Serializable save(T entity);

}
