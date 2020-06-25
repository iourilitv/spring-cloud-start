package com.flamexander.cloud.client.feign;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class GreetingController {
    private IGreetingClient greetingClient;

    @Autowired
    public void setGreetingClient(IGreetingClient greetingClient) {
        this.greetingClient = greetingClient;
    }

    @RequestMapping("/get-greeting")
    public String greeting(Model model) {
        String answer = greetingClient.greeting();
        String answer1 = greetingClient.greeting1();
        String answer2 = greetingClient.greeting2();
        System.out.println("Answer: " + answer);
        model.addAttribute("greeting", answer);
        model.addAttribute("greeting1", answer1);
        model.addAttribute("greeting2", answer2);
        return "greeting-view";
    }

//    @GetMapping("userInfo/{userId}/userId")
//    String getUserDetailsById(@PathVariable Long userId, Model model) {
//        String userDetails = greetingClient.getUserDetailsById(userId);
//        model.addAttribute("userDetailsById", userDetails);
//        return "user-details-view";
//    }
//
//    @GetMapping("userInfo/{userName}/userName")
//    String getUserDetails(@PathVariable String userName, Model model) {
//        String userDetails = greetingClient.getUserDetails(userName);
//        model.addAttribute("userDetailsByUserName", userDetails);
//        return "user-details-view";
//    }
//
//    @GetMapping("userInfo/{email}/email")
//    String getUserDetailsByEmail(@PathVariable String email, Model model) {
//        String userDetails = greetingClient.getUserDetailsByEmail(email);
//        model.addAttribute("userDetailsByEmail", userDetails);
//        return "user-details-view";
//    }

}
