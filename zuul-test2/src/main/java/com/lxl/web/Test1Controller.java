package com.lxl.web;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController

public class Test1Controller {

    @RequestMapping("test1")
    public String test2(String name){
        System.out.println("dddddd");
        return "test2++++"+name;
    }



}
