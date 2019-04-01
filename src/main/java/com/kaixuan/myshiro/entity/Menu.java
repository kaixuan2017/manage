package com.kaixuan.myshiro.entity;

import lombok.Data;

import java.util.List;

/**
 * Created by Administrator on 2019/4/1.
 */
@Data
public class Menu {
    //主键
    private String id;
    //菜单编码
    private String menuCode;
    //菜单名称
    private String menuName;
    //菜单地址
    private String url;

    //按钮
    List<Button> buttons;
}
