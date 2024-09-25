package com.leemuzi.mybatisplus.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.leemuzi.mybatisplus.domain.DO.UserDO;
import com.leemuzi.mybatisplus.service.UserService;
import com.leemuzi.mybatisplus.mapper.UserMapper;
import org.springframework.stereotype.Service;

/**
* @author 92058
* @description 针对表【user】的数据库操作Service实现
* @createDate 2024-09-24 23:46:35
*/
@Service
public class UserServiceImpl extends ServiceImpl<UserMapper, UserDO>
    implements UserService{

}




