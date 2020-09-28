package com.binfen.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author: zhangBin
 * @description: TODO
 * @date: 2020/8/23 23:17
 */
@RestController
public class HelloController {

    /**
     * @author: zhangBin
     * @description: TODO
     * @date: 2020/8/23 23:20
     * @param: null
     * @return: Hello, SpringBoot!
     */
    @RequestMapping("/hello")
    public String hello() {
        return "Hello, SpringBoot!";
    }

}
