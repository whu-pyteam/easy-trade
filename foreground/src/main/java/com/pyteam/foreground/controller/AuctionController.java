package com.pyteam.foreground.controller;

import com.pyteam.db.mbg.entity.Ad02;
import com.pyteam.db.mbg.entity.Ad06;
import com.pyteam.db.mbg.entity.Ae05;
import com.pyteam.foreground.dto.Ad02Dto;
import com.pyteam.foreground.service.Ad02Service;
import com.pyteam.foreground.service.Ad06Service;
import com.pyteam.foreground.service.AuctionService;
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

import java.util.List;
import java.util.Map;

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

    @Autowired
    private AuctionService auctionService;

    private boolean isLogin;

    @RequestMapping(value = "/delPart", method = RequestMethod.GET)
    @ResponseBody
    public String delMyPart(HttpServletRequest request, HttpServletResponse response, int aad601)
    {
        if(isLogin(request, response) && !ad06Service.deleteById(aad601))
        {
            return null;
        }
        else
        {
            return "1";
        }
    }

    @RequestMapping(value = "/auctionPart.html", method = RequestMethod.GET)
    public String selectAucPart(HttpServletRequest request, HttpServletResponse response, Model model)
    {
        isLogin = isLogin(request, response);
        if(isLogin)
        {
            int aab101 = Integer.parseInt(getCookies(request, "userId"));
            model.addAttribute("apartList", auctionService.selectAd06LeftAd02(aab101));
            model.addAttribute("isLogin", isLogin);
            return "auctionPart";
        }
        model.addAttribute("isLogin", isLogin);
        return "auction";
    }

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
                model.addAttribute("isLogin", isLogin);
                return "auction";
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

    @RequestMapping(value = "auctionMyLau.html", method = RequestMethod.GET)
    public String findByUserID(HttpServletRequest request, HttpServletResponse response, Model model)
    {
        isLogin = isLogin(request, response);
        if(isLogin)
        {
            int aab101 = Integer.parseInt(getCookies(request, "userId"));
            model.addAttribute("ad02List", service.findByUserId(aab101));
            model.addAttribute("isLogin", isLogin);
            return "auctionMyLau";
        }
        model.addAttribute("isLogin", isLogin);
        return "auction";
    }

    @RequestMapping(value = "/auctionShow.html", method = RequestMethod.GET)
    public String findById(HttpServletRequest request, HttpServletResponse response, int aad201, Model model)
    {
        isLogin = isLogin(request, response);
        int aad401 = 0;
        if(isLogin)
        {
            aad401 = Integer.parseInt(getCookies(request, "aad401_auc"));
        }
        model.addAttribute("ad02", service.findById(aad201));
        model.addAttribute("isLogin", isLogin);
        model.addAttribute("isConn", connService.isAe05Exist(aad401, aad201));
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
            model.addAttribute("res", 0);
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
                model.addAttribute("res", 1);
                return "auctionLaunch";
            }
            else
            {
                model.addAttribute("isLogin", isLogin);
                model.addAttribute("res", 2);
                return "auctionLaunch";
            }

        }
        model.addAttribute("isLogin", isLogin);
        return "auction";
    }


    @RequestMapping(value = "/auction.html", method = RequestMethod.GET)
    public String wel(HttpServletRequest request, HttpServletResponse response, int pageNum, Model model)
    {

        Map<String, Object> ad02Map = service.selectAll(pageNum, 8);
        int pageCount = (int)ad02Map.get("pageCount");
        boolean pre = true;
        boolean next = true;
        if(pageCount <= 1)
        {
            pre = false;
            next = false;
        }
        else if(pageNum == 1)
        {
            pre = false;
        }
        else if(pageNum == pageCount)
        {
            next = false;
        }
        else
        {
            return "404";
        }


        model.addAttribute("ad02List", (List<Ad02>)ad02Map.get("ad02List"));
        model.addAttribute("slideList", service.selectSlide());
        model.addAttribute("isLogin", isLogin(request, response));
        model.addAttribute("pre", pre);
        model.addAttribute("next", next);
        model.addAttribute("pageNum", pageNum);
        return "auction";
    }
}
