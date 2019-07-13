package com.pyteam.foreground.controller;

import com.pyteam.foreground.service.Ad02Service;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class AuctionController
{
    @Autowired
    private Ad02Service service;

    @RequestMapping(value = "/auctionShow.html", method = RequestMethod.GET)
    public String searchById(int id, Model model)
    {
        try
        {
            System.out.println(id);
            model.addAttribute("ad02", service.findById(id));
            return "auctionShow";
        }
        catch (Exception e)
        {
            e.printStackTrace();
            return "error/404";
        }
    }

    @RequestMapping(value = "/auctionSearch.html", method = RequestMethod.POST)
    public String searchByValue(@RequestParam(value = "searchValue") String value, Model model)
    {
        try
        {
            model.addAttribute("searchList", service.searchByValue(value));
            return "auctionSearch";
        }
        catch (Exception e)
        {
            e.printStackTrace();
            return "snow";
        }
    }

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
}
