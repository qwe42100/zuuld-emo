package com.lxl.web;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.zuul.EnableZuulProxy;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@EnableZuulProxy
@SpringBootApplication
public class Application12 {
    public static void main(String[] args) {
        SpringApplication.run(Application12.class);
    }

    @RequestMapping("testPath")
    public String test12(){
        System.out.println("========helthCheck==========");
        return "test12_ok";
    }

}
