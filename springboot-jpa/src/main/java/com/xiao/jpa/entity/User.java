package com.xiao.jpa.entity;

import lombok.Data;

import javax.persistence.*;

/**
 * @Description JPA测试实体类
 * @Auther: 笑笑是一个码农
 * @Date: 22:33 2019/12/4
 */
@Data
@Entity(name = "tb_user")//绑定映射的实体并指定数据库名称
public class User {

    @Id //表示该字段作为主键
    @GeneratedValue(strategy = GenerationType.IDENTITY) //主键生成策略，自增
    private int id;


    @Column //用来标识实体类中属性与数据表中字段的对应关系
    private String userName;

    @Column
    private String password;

    @Column
    private int age;

}
