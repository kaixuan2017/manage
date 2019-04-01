package com.kaixuan.myshiro.service;

import com.kaixuan.myshiro.entity.User;

/**
 * Created by Administrator on 2019/4/1.
 */
public interface UserService {
    User findUserByUserName(String userName);
}
