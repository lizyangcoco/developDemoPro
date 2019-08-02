package com.practice.develop.dao.repository;

import com.practice.develop.entity.UserEnter;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * Created by 李泽阳 on 2019/8/1
 */
public interface UserRepository extends JpaRepository<UserEnter, Integer> {
}
