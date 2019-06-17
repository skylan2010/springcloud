package com.skylan.gateway;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.gateway.route.RouteLocator;
import org.springframework.cloud.gateway.route.builder.RouteLocatorBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.web.bind.annotation.RequestMapping;

@SpringBootApplication
public class GatewayServiceApplication {

    public static void main(String[] args) {
        SpringApplication.run(GatewayServiceApplication.class, args);
    }

    @Bean
    public RouteLocator myRoutes(RouteLocatorBuilder builder) {
        return builder.routes()
            .route(p -> p
                .path("/getTestUser")
//                .filters(f -> f.addRequestParameter("name", " lanhuagui"))
                .filters(f -> f.hystrix(config -> config
                    .setName("myHystrix")
                    .setFallbackUri("forward:/fallback")))
                .uri("http://localhost:8081"))
//            .route(p -> p.path("getUser").filters(gatewayFilterSpec -> gatewayFilterSpec
//                .addRequestParameter("name", "skylan")).uri("http://localhost:8081"))
            .build();
    }

    @RequestMapping("fallback")
    public String fallback() {
        return "Hello,Hystrix fallback";
    }
}
