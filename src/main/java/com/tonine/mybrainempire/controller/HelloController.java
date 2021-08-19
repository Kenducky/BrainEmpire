package com.tonine.mybrainempire.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author XiongYiGe
 * @date 2021/8/11
 * @description
 */
@RestController
@RequestMapping("/")
public class HelloController {
    @GetMapping("hello")
    public String hello(){
        return "hello";
    }
}
