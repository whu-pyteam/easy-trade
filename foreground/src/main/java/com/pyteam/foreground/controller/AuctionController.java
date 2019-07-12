package com.pyteam.foreground.controller;

import com.pyteam.db.mbg.entity.Ad02;
import com.pyteam.foreground.service.Ad02Service;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;

@Controller
public class AuctionController
{
    @Autowired
    private Ad02Service service;

    @RequestMapping(value = "/auction.html", method = RequestMethod.GET)
    public String wel(Model model)
    {
        try
        {
            model.addAttribute("ad02List", service.selectById());
            return "auction";
        }
        catch (Exception e)
        {
            e.printStackTrace();
            return "snow";
        }
    }

    @RequestMapping(value = "/searchAuction.html", method = RequestMethod.POST)
    public String searchByValue(@RequestParam(value = "searchValue") String value)
    {



        return "searchAuction";
    }
}
