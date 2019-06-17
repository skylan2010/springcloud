package com.skylan.user.controller;

import com.skylan.user.service.IUserService;
import java.util.List;
import java.util.logging.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController {

    private final Logger logger = Logger.getLogger("com.skylan.user.controller.UserController");

    @Autowired
    private IUserService userService;

    /**
     * 获取配置文件中系统默认用户
     */
    @GetMapping("/getDefaultUser")
    public String getDefaultUser() {
        logger.info("............");
        return userService.getDefaultUser();
    }

    /**
     * 获取上下文用户
     */
    @GetMapping("/getContextUserId")
    public String getContextUserId() {
        return userService.getContextUserId();
    }

    /**
     * 获取供应商数据
     */
    @GetMapping("/getProviderData")
    public List<String> getProviderData() {
        return userService.getProviderData();
    }
}
