package com.ligh.wxdemo.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by ${ligh} on 2019/1/10 下午1:59
 */
@RestController
@RequestMapping("index")
public class IndexController {


    @RequestMapping("hello")
    @ResponseBody
    public String hello(){
        return "hello world!";
    }
}
