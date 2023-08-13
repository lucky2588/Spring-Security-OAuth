package com.example.springoauth.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController

public class WebController {

    @GetMapping("getMess")
    public String getMess(){
        return "Hello";
    }


}
