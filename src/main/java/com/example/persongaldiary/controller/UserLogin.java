package com.example.persongaldiary.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class UserLogin {
    @RequestMapping("/")
    public String init(){
        return "register";
    }
}
