package com.example.SpringBootFirstApp;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HomeController {

    @RequestMapping("/")
    public String greeting(){
        return "Hello this is my first app";
    }

    @RequestMapping("/about")
    public String about(){
        return "I can do this all day";
    }
}
