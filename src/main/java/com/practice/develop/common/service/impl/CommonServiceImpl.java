package com.practice.develop.common.service.impl;

import com.practice.develop.common.service.CommonServiceI;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.io.Serializable;

/**
 * 类描述：公有基层方法接口类
 * Created by 李泽阳 on 2019/2/15
 */
@Service("commonServiceI")
@Transactional
public class CommonServiceImpl implements CommonServiceI {


    @Override
    public <T> Serializable save(T entity) {
        return null;
    }
}
