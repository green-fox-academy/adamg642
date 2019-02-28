package controllers;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.greenfoxacademy.springstart.Greeting;

@RestController
public class HelloRESTController {

    @RequestMapping
    public Greeting greeting() {
        Greeting greeting = new Greeting(42,"Hello");
        return greeting;
    }
}
