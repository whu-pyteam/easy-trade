package com.pyteam.foreground.controller;

import com.pyteam.db.mbg.entity.Ad06;
import com.pyteam.db.mbg.entity.Ae05;
import com.pyteam.foreground.dto.Ad02Dto;
import com.pyteam.foreground.service.Ad02Service;
import com.pyteam.foreground.service.Ad06Service;
import com.pyteam.foreground.service.ConnectionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

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

    @Autowired
    private Ad06Service ad06Service;

    @RequestMapping(value = "/auctionOffer.html", method = RequestMethod.POST)
    public String insertAd06(HttpServletRequest request, HttpServletResponse response, Ad06 ad06)
    {
        if(isLogin(request, response))
        {
            int aab101 = Integer.parseInt(getCookies(request, "username"));
            ad06.setAab101(aab101);
            if(ad06Service.insertAd06(ad06))
            {
                return "auctionOffer";
            }
            return "bad";
        }

        return "error/404";
    }

    @RequestMapping(value = "/delMyAuc", method = RequestMethod.GET)
    @ResponseBody
    public String delMyAuc(int aad201)
    {
        if(service.deleteById(aad201))
        {
            return "1";
        }
        else
        {
            return null;
        }
    }

    @RequestMapping(value = "myAuction.html", method = RequestMethod.GET)
    public String findByUserID(HttpServletRequest request, HttpServletResponse response, Model model)
    {
        int aab101 = 0;
        if(isLogin(request, response))
        {
            aab101 = Integer.parseInt(getCookies(request, "username"));
        }
        model.addAttribute("ad02List", service.findByUserId(aab101));
        return "myAuction";
    }

    @RequestMapping(value = "/auctionShow.html", method = RequestMethod.GET)
    public String findById(int id, Model model)
    {
        model.addAttribute("ad02", service.findById(id));
        model.addAttribute("type", 3);
        return "auctionShow";
    }

    @RequestMapping(value = "/auctionSearch.html", method = RequestMethod.POST)
    public String searchByValue(@RequestParam(value = "searchValue") String value, Model model)
    {
        model.addAttribute("searchList", service.findByValue(value));
        model.addAttribute("type", 3);
        return "auctionSearch";
    }

    @RequestMapping(value = "/auctionLaunch.html", method = RequestMethod.GET)
    public String insert(Model model)
    {
        return "auctionLaunch";
    }

    @RequestMapping(value = "/auctionLaunch.html", method = RequestMethod.POST)
    public String insert(Ad02Dto dto, Model model)
    {
        service.insert(dto);
        return "auctionLaunch";
    }


    @RequestMapping(value = "/auction.html", method = RequestMethod.GET)
    public String wel(HttpServletRequest request, HttpServletResponse response, Model model)
    {
        int aad401 = 0;
        if(isLogin(request, response))
        {
            aad401 = Integer.parseInt(getCookies(request, "aad401_auc"));
        }
        model.addAttribute("aconnList", connService.selectAd02LeftAe05(aad401));
        //model.addAttribute("ad02List", service.selectAll());
        model.addAttribute("type", 3);
        return "auction";
    }
}
