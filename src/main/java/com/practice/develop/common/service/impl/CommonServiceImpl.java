package com.practice.develop.common.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 * 类描述：公有基层方法接口类
 * Created by 李泽阳 on 2019/2/15
 */
@Service
@Transactional
public class CommonServiceImpl implements com.practice.develop.common.service.CommonServiceImpl {
    @Autowired
    private JdbcTemplate jdbcTemplate;

}
