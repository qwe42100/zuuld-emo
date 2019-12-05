package com.lxl.web;

import org.junit.runner.RunWith;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class Application1 {
    public static void main(String[] args) {
        SpringApplication.run(Application1.class);
    }

    @RequestMapping("test2")
    public String test02(){
        System.out.println("----------------test2------------------");
        return "test2_ok";
    }



}
