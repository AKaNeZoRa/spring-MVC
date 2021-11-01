package com.xxx.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class Encoding {
    @RequestMapping("/e/t1")
    public String test1(String name,Model model){
        model.addAttribute("msg",name);
        return "test";
    }
}
