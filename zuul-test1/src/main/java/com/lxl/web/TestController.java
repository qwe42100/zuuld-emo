package com.lxl.web;

import com.lxl.api.TestApi;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController {

    @Autowired
    private TestApi testApi;

    @RequestMapping("test001/{name}")

    public String test1(@PathVariable String name){
        return  testApi.test(name);
    }





}
