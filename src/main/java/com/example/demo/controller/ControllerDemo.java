package com.example.demo.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ControllerDemo {

    @RequestMapping("/type")
    public String message(){
        return "I am going to America...";
    }

    @RequestMapping("/buddy")
    public double doubleMessage(){
        return 91.3;
    }

    @RequestMapping("/integer")
    public int makeInteger(){
        return 45;
    }

    @RequestMapping("/makers")
    public String assertion(){
        return "make an assertive sentence.";
    }
}
