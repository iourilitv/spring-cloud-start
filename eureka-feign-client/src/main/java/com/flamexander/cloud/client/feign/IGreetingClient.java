package com.flamexander.cloud.client.feign;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

@FeignClient("geek-spring-cloud-eureka-client")
public interface IGreetingClient {
    @RequestMapping("/greeting")
    String greeting();

    @RequestMapping("/greeting1")
    String greeting1();

    @RequestMapping("/greeting2")
    String greeting2();

//    @GetMapping("userInfo/{userId}/userId")
//    String getUserDetailsById(@PathVariable Long userId);
//
//    @GetMapping("userInfo/{userName}/userName")
//    String getUserDetails(@PathVariable String userName);
//
//    @GetMapping("userInfo/{email}/email")
//    String getUserDetailsByEmail(@PathVariable String email);

}
