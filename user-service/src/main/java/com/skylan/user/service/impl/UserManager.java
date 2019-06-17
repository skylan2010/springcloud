package com.skylan.user.service.impl;

import com.skylan.user.service.UserDataRemote;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class UserManager {

    @Autowired
    private UserDataRemote userDataRemote;

    public String getDefaultUser() {
        return "UserManager1:skylan";
    }

    public String getContextUserId() {
        return "UserManager:001";
    }

    public List<String> getProviderData() {
        List<String> result = userDataRemote.getProviderData();
        for (String str : result) {
            System.err.println("UserManager Name: " + str);
        }
        return result;
    }

    public String hellobaba(String name) {
        System.out.println("UserManager--->" + name);
        return userDataRemote.hellobaba(name);
    }

}
