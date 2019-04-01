package com.kaixuan.myshiro.entity;

import lombok.Data;

import java.util.List;

/**
 * Created by Administrator on 2019/4/1.
 */
@Data
public class User {
    //用户编码
    private String userCode;
    //用户名称
    private String userName;
    //用户密码
    private String password;
    //盐
    private String salt;
    //邮箱
    private String email;
    //电话
    private String phone;
    //菜单权限
    List<Menu> menus;
    //角色权限
    List<Role> roles;

}
