package com.greenfox.di.controller;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class MyController {


    @RequestMapping("/useful")
    public String getMainPage() {
        return "MainPage";
    }
}
