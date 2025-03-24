package com.leemuzi.mybatis.service;

import com.leemuzi.mybatis.domain.User;

/**
 * @Author 李Muzi
 * @Date 2025/3/22 14:28
 * @Description
 */
public interface MybatisService {

    int count();

    User getUser(int id);

    boolean createUser(User user);
}
