package com.pyteam.foreground.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class IndexController
{
    @RequestMapping("/index")
    public String index(Model model){
        model.addAttribute("uid","123456789");
        model.addAttribute("name","Jerry");
        return "index";
    }
}
