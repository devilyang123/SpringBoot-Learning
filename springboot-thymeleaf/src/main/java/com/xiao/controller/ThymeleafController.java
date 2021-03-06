package com.xiao.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import java.util.Map;

/**
 * @Description Thymeleaf测试
 * @Auther: 笑笑是一个码农
 * @Date: 19:42 2019/11/10
 */
@Controller
public class ThymeleafController {

    private static final String INDEX_PAGE = "index";

    @GetMapping(value = "/index")
    public String index(Map<String, String> map){
        map.put("username","笑笑是一个码农");
        return INDEX_PAGE;
    }
}
