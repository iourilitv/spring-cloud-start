package com.flamexander.cloud.client.controllers.interfaces;

import org.springframework.web.bind.annotation.*;

public interface IGreetingController {
    @RequestMapping("/greeting")
    String greeting();

    @RequestMapping("/greeting1")
    String greeting1();

    @RequestMapping("/greeting2")
    String greeting2();

    @RequestMapping("/id")
    void getIdByValue(@RequestParam("id") String fileName);

//    @GetMapping("userInfo/{userId}/userId")
//    String getUserDetailsById(@PathVariable Long userId);
//
//    @GetMapping("userInfo/{userName}/userName")
//    String getUserDetailsByUserName(@PathVariable String userName);
//
//    @GetMapping("userInfo/{email}/email")
//    String getUserDetailsByEmail(@PathVariable String email);

}
