package com.practice.develop.dao;

import com.practice.develop.entity.UserEnter;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * 类描述：公有jap数据操作层
 * Created by 李泽阳 on 2019/2/15
 */
public interface CommonDaoRepository extends JpaRepository<UserEnter,Integer> {
}
