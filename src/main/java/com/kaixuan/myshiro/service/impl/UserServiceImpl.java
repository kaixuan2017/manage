package com.kaixuan.myshiro.service.impl;

import com.kaixuan.myshiro.dao.UserDao;
import com.kaixuan.myshiro.entity.User;
import com.kaixuan.myshiro.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Created by Administrator on 2019/4/1.
 */
@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserDao userDao;

    public User findUserByUserName(String userName) {
        return userDao.findUserByUserName(userName);
    }
}
