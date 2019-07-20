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

    private boolean isLogin;

    @RequestMapping(value = "/auctionOffer.html", method = RequestMethod.POST)
    public String insertAd06(HttpServletRequest request, HttpServletResponse response, Ad06 ad06, Model model)
    {
        isLogin = isLogin(request, response);
        if(isLogin)
        {
            int aab101 = Integer.parseInt(getCookies(request, "userId"));
            ad06.setAab101(aab101);
            if(ad06Service.insertAd06(ad06))
            {
                model.addAttribute("isLogin", isLogin);
                return "auctionOffer";
            }
            else
            {
                return "123456";
            }
        }
        model.addAttribute("isLogin", isLogin);
        return "auction";
    }

    @RequestMapping(value = "/delMyAuc", method = RequestMethod.GET)
    @ResponseBody
    public String delMyAuc(HttpServletRequest request, HttpServletResponse response, int aad201)
    {
        if(isLogin(request, response) && !service.deleteById(aad201))
        {
            return null;
        }
        else
        {
            return "1";
        }
    }

    @RequestMapping(value = "myAuction.html", method = RequestMethod.GET)
    public String findByUserID(HttpServletRequest request, HttpServletResponse response, Model model)
    {
        isLogin = isLogin(request, response);
        if(isLogin)
        {
            int aab101 = Integer.parseInt(getCookies(request, "userId"));
            model.addAttribute("ad02List", service.findByUserId(aab101));
            model.addAttribute("isLogin", isLogin);
            return "myAuction";
        }
        model.addAttribute("isLogin", isLogin);
        return "auction";
    }

    @RequestMapping(value = "/auctionShow.html", method = RequestMethod.GET)
    public String findById(HttpServletRequest request, HttpServletResponse response, int id, Model model)
    {
        model.addAttribute("ad02", service.findById(id));
        model.addAttribute("isLogin", isLogin(request, response));
        return "auctionShow";
    }

    @RequestMapping(value = "/auctionSearch.html", method = RequestMethod.POST)
    public String searchByValue(HttpServletRequest request, HttpServletResponse response, String searchValue, Model model)
    {
        model.addAttribute("searchList", service.findByValue(searchValue));
        model.addAttribute("isLogin", isLogin(request, response));
        return "auctionSearch";
    }

    @RequestMapping(value = "/auctionLaunch.html", method = RequestMethod.GET)
    public String insert(HttpServletRequest request, HttpServletResponse response, Model model)
    {
        isLogin = isLogin(request, response);
        if(isLogin)
        {
            model.addAttribute("isLogin", isLogin);
            return "auctionLaunch";
        }
        model.addAttribute("isLogin", isLogin);
        return "auction";
    }

    @RequestMapping(value = "/auctionLaunch.html", method = RequestMethod.POST)
    public String insert(HttpServletRequest request, HttpServletResponse response, Ad02Dto dto, Model model)
    {
        isLogin = isLogin(request, response);
        if(isLogin)
        {
            dto.setAab101(Integer.parseInt(getCookies(request, "userId")));
            if(service.insert(dto))
            {
                model.addAttribute("isLogin", isLogin);
                return "auctionLaunch";
            }
            else
            {
                return "123456";
            }

        }
        model.addAttribute("isLogin", isLogin);
        return "auction";
    }


    @RequestMapping(value = "/auction.html", method = RequestMethod.GET)
    public String wel(HttpServletRequest request, HttpServletResponse response, Model model)
    {
        isLogin = isLogin(request, response);
        int aad401 = 0;
        if(isLogin)
        {
            aad401 = Integer.parseInt(getCookies(request, "aad401_auc"));
        }
        model.addAttribute("ad02_connList", connService.selectAd02LeftAe05(aad401));
        model.addAttribute("isLogin", isLogin);
        return "auction";
    }
}
