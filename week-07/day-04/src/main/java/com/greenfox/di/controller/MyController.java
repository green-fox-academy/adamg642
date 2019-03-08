package com.greenfox.di.controller;


import com.greenfox.di.UtilityService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class MyController {
    private UtilityService utilityService;

    @Autowired
    MyController(UtilityService utilityService) {
        this.utilityService = utilityService;
    }


    @RequestMapping("/useful")
    public String getMainPage() {
        String whatCol = utilityService.randomColor();
        System.out.println(whatCol);
        return "MainPage";
    }

    @RequestMapping("/useful/colored")
    public String getMainPageWithColor(Model model) {
        String whatCol = utilityService.randomColor();
        model.addAttribute("color",whatCol);
        return "MainPage";
    }

    @RequestMapping("/useful/email")
    public String getMainPageEmail(Model model,@RequestParam(name = "email") String email) {
        String linkColor = "color: blue";

        if (utilityService.validateEmail(email)) {
            linkColor = "color: green";
        } else {
            linkColor = "color: red";
        }
        String whatCol = utilityService.randomColor();
        model.addAttribute("linkColor",linkColor);
        model.addAttribute("color","white");
        return "MainPage";
    }
}
