package com.leemuzi.mybatisplus;

import com.leemuzi.mybatisplus.domain.DO.UserDO;
import com.leemuzi.mybatisplus.mapper.UserMapper;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

@SpringBootTest
class MybatisPlusApplicationTests {

    @Autowired
    private UserMapper userMapper;

    @Test
    public void testSelect() {
        System.out.println(("----- selectAll method test ------"));
        List<UserDO> userDOS = userMapper.selectList(null);
        userDOS.forEach(System.out::println);
    }
}
