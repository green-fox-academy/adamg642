package com.greeenfox.hm;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class ContollerHome {

    @RequestMapping("/")
    public String home() {
        return "hello";
    }
}
