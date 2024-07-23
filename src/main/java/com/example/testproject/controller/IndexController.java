package com.example.testproject.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class IndexController{

    @GetMapping("/test")
    public String test(){
        return "test";
    }
}