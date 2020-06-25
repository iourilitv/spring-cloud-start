package com.flamexander.cloud.client.controllers;

import com.flamexander.cloud.client.controllers.interfaces.IGreetingController;
import com.flamexander.cloud.client.entities.User;
import com.flamexander.cloud.client.services.interfaces.IUserService;
import com.netflix.discovery.EurekaClient;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Lazy;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DBGreetingController implements IGreetingController {
    private IUserService userService;

//    @Autowired
    @Lazy
    private EurekaClient eurekaClient;

    @Value("${spring.application.name}")
    private String appName;

    @Value("${userValue}")
    private String username;

    @Autowired
    public void setUserService(IUserService userService) {
        this.userService = userService;
    }

    public String greeting() {
        return "hello EurekaClient";
    }

    @Override
    public String greeting1() {
//        return String.format("Hello1");
        return "Hello1";
    }

    @Override
    public String greeting2() {
//        return String.format("new Param");
        return "new Param";
    }

    @Override
    public void getIdByValue(String fileName) {

    }

//    @Override
//    public String getUserDetailsById(Long userId) {
//        User user = userService.getUserById(userId);
//        if(user == null) {
//            return "No user with the requested userId!";
//        }
//        return user.toString();
//    }
//
//    @Override
//    public String getUserDetailsByUserName(String userName) {
//        User user = userService.getUserByName(userName);
//        if(user == null) {
//            return "No user with the requested name!";
//        }
//        return user.toString();
//    }
//
//    @Override
//    public String getUserDetailsByEmail(String email) {
//        User user = userService.getUserByEmail(email);
//        if(user == null) {
//            return "No user with the requested email!";
//        }
//        return user.toString();
//    }

    @GetMapping("/abc")
    public void test() {
        System.out.println(username);
    }
}
