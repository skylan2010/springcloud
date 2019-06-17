package com.skylan.user.service;

import com.skylan.user.service.impl.UserDataHystrix;
import java.util.List;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

@FeignClient(value = "data-service", fallback = UserDataHystrix.class)
public interface UserDataRemote {

    @GetMapping("/getProviderData")
    public List<String> getProviderData();

    @GetMapping("/hellobaba")
    public String hellobaba(String name);

}
