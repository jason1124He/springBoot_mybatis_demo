package com.ocean.service.impl;

import com.ocean.dao.UserInfoMapper;
import com.ocean.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @Auther: Administrator
 * @Date: 2018/8/17 13:54
 * @Description:
 */
@Service("userService")
public class UserServiceImpl implements UserService {

    @Autowired
    private UserInfoMapper userInfoMapper;

    @Override
    public List findAllUser() {
        return userInfoMapper.findAllUser();
    }
}
