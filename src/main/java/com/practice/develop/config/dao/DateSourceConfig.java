package com.practice.develop.config.dao;

import com.mchange.v2.c3p0.ComboPooledDataSource;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.beans.PropertyVetoException;

/**
 * 类描述：数据对象连接类
 * Created by 李泽阳 on 2019/2/14
 */
@Configuration//把该类作为spring的xml配置文件中的<beans>
@MapperScan("com.practice.develop")//扫描路径
public class DateSourceConfig {
    @Value("${jdbc.driver}")
    private String jdbcDriver;
    @Value("${jdbc.url}")
    private String jdbcUrl;
    @Value("${jdbc.username}")
    private String jdbcUserName;
    @Value("${jdbc.password}")
    private String jdbcPassWord;

    @Bean(name = "dataSource")//注册bean对象
    public ComboPooledDataSource createDateSource() throws PropertyVetoException {
        ComboPooledDataSource dataSource = new ComboPooledDataSource();
        dataSource.setDriverClass(jdbcDriver);//连接驱动
        dataSource.setJdbcUrl(jdbcUrl);//连接地址
        dataSource.setUser(jdbcUserName);//用户账号
        dataSource.setPassword(jdbcPassWord);//用户密码
        dataSource.setAutoCommitOnClose(false);//关闭连接后不提交commit提交
        return dataSource;
    }
}


