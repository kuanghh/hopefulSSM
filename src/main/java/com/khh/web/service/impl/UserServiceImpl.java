package com.khh.web.service.impl;

import com.khh.web.dao.UserMapper;
import com.khh.web.domain.User;
import com.khh.web.service.interface_.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Created by Administrator on 2017/6/30.
 */
@Service("userService")
public class UserServiceImpl implements UserService{

    @Autowired
    private UserMapper userMapper;


    public int insertUser(User user) {
        return userMapper.insert(user);
    }

    public User findById(int id) {
        return userMapper.selectByPrimaryKey(id);
    }
}
