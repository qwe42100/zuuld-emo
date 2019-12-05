package com.lxl.api;

import org.springframework.stereotype.Component;

@Component
public class TestFallBack implements TestApi {
    @Override
    public String test(String name) {
        return "Hystrix熔断！！！";
    }
}
