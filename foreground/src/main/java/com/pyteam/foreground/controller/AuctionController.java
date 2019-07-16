package com.pyteam.foreground.controller;

import com.pyteam.foreground.dto.Ad02Dto;
import com.pyteam.foreground.service.Ad02Service;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
<<<<<<< HEAD
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import static com.pyteam.foreground.controller.LoginController.isLogin;
import static com.pyteam.foreground.controller.LoginController.getCookies;
=======
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
>>>>>>> parent of 2b55527... 拍卖物品收藏添加

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
            model.addAttribute("type", 3);
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
            model.addAttribute("type", 3);
            return "auctionSearch";
        }
        catch (Exception e)
        {
            e.printStackTrace();
            return "snow";
        }
    }

    @RequestMapping(value = "/auctionLaunch.html", method = RequestMethod.GET)
    public String insert(Ad02Dto dto, Model model)
    {
        model.addAttribute("type", 3);
        return "auctionLaunch";
    }

    @RequestMapping(value = "/auctionLaunch.html", method = RequestMethod.POST)
    public String add(Ad02Dto dto, Model model)
    {
        try
        {
            model.addAttribute("type", 3);
            service.addAd02(dto);
            return "auctionLaunch";
        }
        catch (Exception e)
        {
            e.printStackTrace();
            return "error/404";
        }
    }


    @RequestMapping(value = "/auction.html", method = RequestMethod.GET)
<<<<<<< HEAD
    public String wel(HttpServletRequest request, HttpServletResponse response, Model model)
    {
        int aab101 = 0;
        if(isLogin(request, response))
=======
    public String wel(Model model)
    {
        try
>>>>>>> parent of 2b55527... 拍卖物品收藏添加
        {
            model.addAttribute("ad02List", service.selectAll());
            model.addAttribute("type", 3);
            return "auction";
        }
        catch (Exception e)
        {
            e.printStackTrace();
            return "snow";
        }
    }
}
