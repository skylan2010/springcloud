package com.skylan.user.controller;

import com.skylan.user.service.impl.UserManager;
import java.util.List;
import java.util.logging.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserManagerController {

    private final Logger logger = Logger.getLogger("com.skylan.user.service.UserManagerController");

    @Autowired
    private UserManager userManager;

    @GetMapping("/getUser")
    public String getDefaultUser() {
        logger.info("UserManagerController getDefaultUser............");
        return "getDefaultUsergetDefaultUsergetDefaultUser";
    }

    @GetMapping("/getTestUser")
    public String getTestUser(String name) {
        return "This is test user." + name;
    }


    @GetMapping("/getUserId")
    public String getContextUserId() {
        return userManager.getContextUserId();
    }


    @GetMapping("/getData")
    public List<String> getProviderData() {
        return userManager.getProviderData();
    }

    @GetMapping("/hellobaba")
    public String hellobaba(String name) {
        System.out.println("UserManagerController--->" + name);
        return userManager.hellobaba(name);
    }

}
