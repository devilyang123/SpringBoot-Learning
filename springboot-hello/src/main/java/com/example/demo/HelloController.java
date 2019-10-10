package com.example.demo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Description 第一个SpringBoot应用
 * @Auther: 笑笑
 * @Date: 17:57 2019/10/10
 */
@RestController
public class HelloController {

    @GetMapping(value = "/hello")
    public String hello(){
        return "Hello SpringBoot!";
    }

}
