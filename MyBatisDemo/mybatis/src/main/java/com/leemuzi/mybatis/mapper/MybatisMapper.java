package com.leemuzi.mybatis.mapper;

import com.leemuzi.mybatis.domain.User;
import org.apache.ibatis.annotations.Mapper;

import java.util.HashMap;


@Mapper
public interface MybatisMapper {

    int count();

    User getUser(int id);

}
