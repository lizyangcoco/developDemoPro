package com.practice.develop.common.service.impl;

import com.practice.develop.common.CommonDao;
import com.practice.develop.common.service.CommonService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * 类描述：公有基层方法接口类
 * Created by 李泽阳 on 2019/2/15
 */
@Service
@Transactional
public class CommonServiceImpl implements CommonService {
    @Autowired
    private JdbcTemplate jdbcTemplate;
    @Autowired
    private CommonDao commonDao;

    public String getValue() {
        String sql = "";
        jdbcTemplate.queryForMap(sql);
        return null;
    }
}
