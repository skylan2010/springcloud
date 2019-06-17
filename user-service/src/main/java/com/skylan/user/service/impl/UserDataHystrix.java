package com.skylan.user.service.impl;

import com.skylan.user.service.UserDataRemote;
import java.util.ArrayList;
import java.util.List;
import org.springframework.stereotype.Component;

@Component
public class UserDataHystrix implements UserDataRemote {

    @Override
    public List<String> getProviderData() {
        List list = new ArrayList();
        list.add("data-service getProviderData invoke fail....");
        return list;
    }

    @Override
    public String hellobaba(String name) {
        return "Say hello 调用失败了。";
    }
}
