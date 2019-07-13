package com.pyteam.foreground.controller;

import com.pyteam.foreground.dto.Ad02Dto;
import com.pyteam.foreground.service.Ad02Service;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class LaunchAuctionController
{
    @Autowired
    private Ad02Service services;

    @RequestMapping(value = "/auctionLaunch.html", method = RequestMethod.GET)
    public String wel(Model model) throws Exception
    {
        model.addAttribute("msg","");
        return "auctionLaunch";
    }

    @RequestMapping(value = "/auctionLaunch", method = RequestMethod.POST)
    public String add(Ad02Dto dto, Model model) throws Exception
    {
//        System.out.println(dto);
//        System.out.println(dto.getAad203().getSize());

        boolean res = services.addAd02(dto);

        String msg = "hello";
        model.addAttribute("msg",msg);
        return "auctionLaunch";
    }

}
