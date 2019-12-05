package com.lxl.api;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@FeignClient(name = "ribbon02",fallback = TestFallBack.class)
public interface TestApi {

    @RequestMapping("test1")
    public String test(@RequestParam("name") String name);

}
