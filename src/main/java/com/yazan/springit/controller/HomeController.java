package com.yazan.springit.controller;

import org.springframework.stereotype.Component;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@Controller
public class HomeController {


    @GetMapping("/home")
    public String hello(Model model) {
        model.addAttribute("title","home spring boot page");
        return "home";
    }

}
