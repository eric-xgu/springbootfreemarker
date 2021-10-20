package com.ringo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class IndexController {
    @RequestMapping("index")
    public String index(){
        return "index";
    }
    @RequestMapping("my")
    public String index1(Model model){
        model.addAttribute("msg","thymeleaf");
        return "my";
    }

}
