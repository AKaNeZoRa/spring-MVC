package com.xxx.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class Controllertest1 {

    @RequestMapping("m1/t1")
    public String sayHello(Model model) {
        model.addAttribute("msg", "Controllertest1");
        return "redirect:/index.jsp";
    }
}


