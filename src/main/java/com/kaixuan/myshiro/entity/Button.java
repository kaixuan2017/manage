package com.kaixuan.myshiro.entity;

import lombok.Data;

/**
 * Created by Administrator on 2019/4/1.
 */
@Data
public class Button {

    //按钮编码
    private String buttonCode;

    //按钮名称
    private String buttonName;

    //状态 0无效 1有效
    private String status;
}
