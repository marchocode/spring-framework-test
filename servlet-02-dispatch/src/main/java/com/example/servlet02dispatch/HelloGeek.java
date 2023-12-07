package com.example.servlet02dispatch;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HelloGeek {

    @RequestMapping("/")
    public String display(ModelMap modelMap) {

        System.out.println("hello");
        modelMap.addAttribute("message","hello world");

        return "hello";
    }
}
