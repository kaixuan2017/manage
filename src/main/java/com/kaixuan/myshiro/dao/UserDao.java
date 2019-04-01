package com.kaixuan.myshiro.dao;

import com.kaixuan.myshiro.entity.User;

/**
 * Created by Administrator on 2019/4/1.
 */
public interface UserDao {

    User findUserByUserName(String userName);
}
