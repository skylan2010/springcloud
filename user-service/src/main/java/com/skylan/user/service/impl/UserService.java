package com.skylan.user.service.impl;

import com.skylan.user.service.IUserService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.client.ClientHttpRequestFactory;
import org.springframework.http.client.SimpleClientHttpRequestFactory;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;

@Component
public class UserService implements IUserService {

    private RestTemplate restTemplate;
    private ClientHttpRequestFactory factory;

    @Autowired
    public void setFactory() {
        SimpleClientHttpRequestFactory factory = new SimpleClientHttpRequestFactory();
        factory.setReadTimeout(5000);
        factory.setConnectTimeout(15000);
        this.factory = factory;
    }

    @Autowired
    public void setRestTemplate() {
        this.restTemplate = new RestTemplate(this.factory);
    }

    @Override
    public String getDefaultUser() {
        return "UserService:getDefaultUser:skylan";
    }

    @Override
    public String getContextUserId() {
        return "UserService:getContextUserId:001";
    }

    @Override
    public List<String> getProviderData() {
        List<String> result = restTemplate
            .getForObject("http://localhost:8080/getProviderData", List.class);
        for (String str : result) {
            System.err.println("UserService:getProviderData: " + str);
        }
        return result;
    }
}
