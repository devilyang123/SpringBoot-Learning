package com.xiao;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * @Description 入口类
 * @Auther: 笑笑是一个码农
 * @Date: 22:04 2020/1/6
 */
@SpringBootApplication
@MapperScan("com.xiao.mapper")
public class Application {
    public static void main(String[] args) {
        SpringApplication.run(Application.class, args);
    }
}
