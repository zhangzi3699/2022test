package com.bjpowernode.boot05web.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class MyWebController {

    @RequestMapping("/hello")
    @ResponseBody
    public String helloSpringBoot(){

        return "===欢迎使用SpringBoot框架，开发应用===";
    }
}
