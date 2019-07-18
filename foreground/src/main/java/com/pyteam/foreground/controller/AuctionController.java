package com.pyteam.foreground.controller;

import com.pyteam.foreground.dto.Ad02Dto;
import com.pyteam.foreground.service.Ad02Service;
import com.pyteam.foreground.service.ConnectionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import static com.pyteam.foreground.controller.LoginController.isLogin;
import static com.pyteam.foreground.controller.LoginController.getCookies;

@Controller
public class AuctionController
{
    @Autowired
    private Ad02Service service;

    @Autowired
    private ConnectionService connService;

    @RequestMapping(value = "/auctionShow.html", method = RequestMethod.GET)
    public String searchById(int id, Model model)
    {
        model.addAttribute("ad02", service.findById(id));
        model.addAttribute("type", 3);
        return "auctionShow";
    }

    @RequestMapping(value = "/auctionSearch.html", method = RequestMethod.POST)
    public String searchByValue(@RequestParam(value = "searchValue") String value, Model model)
    {
        model.addAttribute("searchList", service.searchByValue(value));
        model.addAttribute("type", 3);
        return "auctionSearch";
    }

    @RequestMapping(value = "/auctionLaunch.html", method = RequestMethod.GET)
    public String insert(Model model)
    {
        model.addAttribute("type", 3);
        return "auctionLaunch";
    }

    @RequestMapping(value = "/auctionLaunch.html", method = RequestMethod.POST)
    public String insert(Ad02Dto dto, Model model)
    {
        model.addAttribute("type", 3);
        service.insert(dto);
        return "auctionLaunch";
    }


    @RequestMapping(value = "/auction.html", method = RequestMethod.GET)
    public String wel(HttpServletRequest request, HttpServletResponse response, Model model)
    {
        int aab101 = 0;
        if(isLogin(request, response))
        {
            aab101 = Integer.parseInt(getCookies(request, "username"));
        }
        model.addAttribute("aconnList", connService.selectAd02AndAe05(aab101, "2"));
        //model.addAttribute("ad02List", service.selectAll());
        model.addAttribute("type", 3);
        return "auction";
    }
}
