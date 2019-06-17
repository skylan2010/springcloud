package com.skylan.dataservice.controller;

import com.skylan.dataservice.config.DataConfig;
import java.util.ArrayList;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DataController {

    @Autowired
    private DataConfig dataConfig;

    @GetMapping("/getContextUserId")
    public String getContextUserId() {
        return "user:00000002";
    }

    @GetMapping("/getDefaultUser")
    public String getDefaultUser() {
        return dataConfig.getDefaultUser();
    }

    @GetMapping("/getProviderData")
    public List<String> getProviderData() {
        System.out.println("开始调用DataController的getProviderData（）方法。。。");
        List<String> provider = new ArrayList<String>();
        provider.add("Beijing Company");
        provider.add("Shanghai Company");
        provider.add("Shenzhen Company");
        return provider;
    }

}
