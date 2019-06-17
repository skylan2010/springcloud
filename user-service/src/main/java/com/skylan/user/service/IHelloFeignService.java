package com.skylan.user.service;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

@FeignClient(name = "helloFeign", url = "http://localhost:8080")
public interface IHelloFeignService {

    @RequestMapping(value = "hello", method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_UTF8_VALUE)
    public String sayHello(@RequestParam("name") String name);
}
