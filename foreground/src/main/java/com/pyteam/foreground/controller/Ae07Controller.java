package com.pyteam.foreground.controller;

import com.pyteam.db.mbg.entity.Ac05;
import com.pyteam.foreground.service.Ae07Service;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

/**
 * @author wjm
 * @date2019/7/16 18:14
 */

@Controller

public class Ae07Controller
{
    @Autowired
    private Ae07Service ae07Service;

    @GetMapping("/ad01/myOrder")
    public String view(Model m)
    {
        int id =1;
        m.addAttribute("ac05",ae07Service.select(id));
        return"/ad01/myOrder";
    }

    @PostMapping("/ad01/myOrder")
    public String edit(@ModelAttribute("ac05") Ac05 ac05)
    {
        System.out.println(ac05);

        return "/ad01/myOrder";
    }
}
