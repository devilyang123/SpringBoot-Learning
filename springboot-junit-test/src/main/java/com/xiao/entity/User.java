package com.xiao.entity;

import lombok.Data;

/**
 * @Description 用于测试的用户实体类
 * @Auther: 笑笑是一个码农
 * @Date: 17:00 2019/11/17
 */
@Data //lombok插件主键，简化实体类的getter/setter等方法
public class User {

    private String userName;

    private Integer age;
}
