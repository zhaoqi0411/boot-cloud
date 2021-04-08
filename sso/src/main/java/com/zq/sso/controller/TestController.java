package com.zq.sso.controller;

import com.alibaba.nacos.api.config.annotation.NacosValue;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author zhaoqi
 * @since 2021-04-08
 */
@RestController
public class TestController {

    @Value("${a}")
    public String a;


    @RequestMapping("/test")
    public String test() {
        return a;
    }
}
