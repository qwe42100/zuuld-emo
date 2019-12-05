package com.lxl;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.circuitbreaker.EnableCircuitBreaker;
import org.springframework.cloud.netflix.hystrix.EnableHystrix;
import org.springframework.cloud.openfeign.EnableFeignClients;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
@SpringBootApplication
@EnableHystrix
@EnableFeignClients
@EnableCircuitBreaker
@RestController
public class Application {
    public static void main(String[] args) {
        SpringApplication.run(Application.class);
    }

   @RequestMapping("test1")
    public String test(){
        System.out.println("test1++++++++");
        return "test_ok";
   }




}