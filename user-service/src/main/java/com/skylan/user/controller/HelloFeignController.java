package com.skylan.user.controller;

import com.skylan.user.service.IHelloFeignService;
import com.skylan.user.service.IUserFeignService;
import com.skylan.user.service.IUserService;
import java.util.List;
import java.util.logging.Logger;
import javax.annotation.Resource;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloFeignController {

    private final Logger logger = Logger
        .getLogger("com.skylan.user.controller.HelloFeignController");

    @Resource
    private IHelloFeignService feignService;
    @Resource
    private IUserFeignService userFeignService;


    @RequestMapping(value = "sayhello")
    public String hello(String username) {
        logger.info("HelloFeignController:hello():" + username);
        return feignService.sayHello(username);
    }

    @RequestMapping(value = "getUserData", method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_UTF8_VALUE)
    public List<String> getProviderData() {
        logger.info("HelloFeignController:getProviderData()");
        return userFeignService.getProviderData();
    }

}
