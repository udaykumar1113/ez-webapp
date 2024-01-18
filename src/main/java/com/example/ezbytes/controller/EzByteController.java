package com.example.ezbytes.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class EzByteController {

    @RequestMapping(value = {"/home","/",""})
    public String displayHomePage(){
        return "home.html";
    }
}
