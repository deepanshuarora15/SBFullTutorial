package com.dailycodebuffer.springBoot.tutorial.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {
    @GetMapping(path="/helloworld")
    public String HelloWorld(){
        return "Welcome to my tutorial bitches hitches snitches";
    }
}
