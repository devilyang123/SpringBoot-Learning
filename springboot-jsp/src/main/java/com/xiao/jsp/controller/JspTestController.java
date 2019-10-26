package com.xiao.jsp.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

/**
 * @Description JSP测试控制器
 * @Auther: 笑笑
 * @Date: 14:38 2019/10/26
 */
@Controller
public class JspTestController {

    private static final String INDEX_PAGE = "index";

    /**
     * 首页跳转测试
     * @param model
     * @return
     */
    @GetMapping(value = "/index")
    public String index(Model model){
        model.addAttribute("jsp","Hello Jsp!");
        return INDEX_PAGE;
    }
}
