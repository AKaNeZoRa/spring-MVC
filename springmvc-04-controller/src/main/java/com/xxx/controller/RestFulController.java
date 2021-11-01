package com.xxx.controller;
/*
RestFul风格
使路径变得更加简洁；

获得参数更加方便，框架会自动进行类型转换。

通过路径变量的类型可以约束访问参数，如果类型不一样，则访问不到对应的请求方法，
如这里访问是的路径是/h1/1/a，则路径与方法不匹配，而不会是参数转换失败。
 */
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class RestFulController {
    @RequestMapping("h1/{p1}/{p2}")
    public String test1(@PathVariable int p1,@PathVariable String p2,Model model) {

        String res = p1+p2;
        model.addAttribute("msg","结果"+res);
        return "test";
    }

    @RequestMapping(value = "/hello",method = {RequestMethod.GET})
    public String index2(Model model){
        model.addAttribute("msg", "hello!");
        return "test";
    }
    @RequestMapping("/q1/w1")
    public String index3(Model model){
        return "index.jsp";
    }
    }
