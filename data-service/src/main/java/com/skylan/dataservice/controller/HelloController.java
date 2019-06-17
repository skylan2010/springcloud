package com.skylan.dataservice.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

    @GetMapping("/hellobaba")
    public String hellobaba(String name) {
        System.out.println("HelloController--->" + name);
        return "Hello," + name + "!";
    }


}
