package com.xiao.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.Map;

/**
 * @Description Freemarker测试
 * @Auther: 笑笑是一个码农
 * @Date: 21:18 2019/11/4
 */
@Controller
public class FreemarkerController {

    private static final String INDEX_PAGE = "index";

    /**
     * 跳转测试页面控制器
     * @param map
     * @return
     */
    @GetMapping(value = "/index")
    public String index(Map<String, String> map){
        map.put("username","笑笑是一个码农");
        return INDEX_PAGE;
    }
}
