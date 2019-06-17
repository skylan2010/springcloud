package com.skylan.dataservice.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class JdbcConfigController {
    @Value("${jdbc.url}")
    String url;
    @Value("${jdbc.username}")
    String username;
    @Value("${jdbc.password}")
    String password;

    @Value("${username}")
    String name;
    @Value("${password}")
    String pwd;
    @RequestMapping("/testJdbc")
    public String testJdbc() {
        return "测试环境数据源连接信息：url:" + url + ",username:" + username + ",password:" + password;
    }

    @RequestMapping("/testName")
    public String testName() {
        return "测试环境用户信息:,name:" + name + ",password:" + pwd;
    }
}
