package com.ltp.painting.controllers;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;

@Controller
public class MainController {
    
    @Value("${title.page}")
    private String title;


    @ModelAttribute("title")
    public String titlePages(){
        return title;
    }
    @GetMapping("/")
    public String task4(){
        return "index";
    }
    @GetMapping("/task5")
    public String task5(){
        return "task5";
    }
    @GetMapping("/task6")
    public String task6(){
        return "task6";
    }
    @GetMapping("/task7")
    public String task7(){
        return "task7";
    }
    @GetMapping("/task8")
    public String task8(){
        return "task8";
    }
}
