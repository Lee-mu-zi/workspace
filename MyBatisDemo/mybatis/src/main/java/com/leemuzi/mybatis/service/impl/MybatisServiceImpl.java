package com.leemuzi.mybatis.service.impl;

import com.leemuzi.mybatis.domain.User;
import com.leemuzi.mybatis.mapper.MybatisMapper;
import com.leemuzi.mybatis.service.MybatisService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @Author 李Muzi
 * @Date 2025/3/22 14:29
 * @Description
 */
@Service
public class MybatisServiceImpl implements MybatisService {

    @Autowired
    private MybatisMapper mapper;

    @Override
    public int count() {
        return mapper.count();
    }

    @Override
    public User getUser(int id) {
        return mapper.getUser(id);
    }

    @Override
    public boolean createUser(User user) {
        return mapper.createUser(user);
    }
}
