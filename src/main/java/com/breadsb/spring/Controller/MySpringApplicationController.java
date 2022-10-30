package com.breadsb.spring.Controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MySpringApplicationController {

    @GetMapping("/welcome")
    String welcome() {
        return "Welcome in my new App on Heroku!";
    }
}