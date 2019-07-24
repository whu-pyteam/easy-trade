package com.pyteam.foreground.controller;

import com.pyteam.db.mbg.entity.Ac05;
import com.pyteam.db.mbg.entity.Ad02;
import com.pyteam.db.mbg.entity.Ad06;
import com.pyteam.db.mbg.entity.Ae05;
import com.pyteam.foreground.dto.Ad02Dto;
import com.pyteam.foreground.service.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
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

    @Autowired
    private OrderService orderService;

    private boolean isLogin;

    @RequestMapping(value = "/auctionConn.html", method = RequestMethod.GET)
    public String showConnection(HttpServletRequest request, HttpServletResponse response, int pageNum, Model model)
    {
        isLogin = isLogin(request, response);
        if(isLogin)
        {
            int aad401 = Integer.parseInt(getCookies(request, "aad401_auc"));
            Map<String, Object> connMap = connService.selectAd02RightAe05(aad401, pageNum, 8);
            int pageCount = (int)connMap.get("pageCount");
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
            model.addAttribute("aconnList", (List<Ad02>)connMap.get("ad02List"));
            model.addAttribute("isLogin", isLogin);
            model.addAttribute("pre", pre);
            model.addAttribute("next", next);
            model.addAttribute("pageNum", pageNum);
            return "auctionConn";
        }
        return this.wel(request, response, 1, model);
    }

    @RequestMapping(value = "/addAucConn", method = RequestMethod.GET)
    @ResponseBody
    public String addAucConn(HttpServletRequest request, HttpServletResponse response, Ae05 ae05)
    {
        if(isLogin(request, response))
        {
            ae05.setAad401(Integer.parseInt(getCookies(request, "aad401_auc")));
            if(connService.insert(ae05))
            {
                return "true";
            }
        }
        return null;
    }

    @RequestMapping(value = "delAucConn", method = RequestMethod.GET)
    @ResponseBody
    public String delAucConn(HttpServletRequest request, HttpServletResponse response, Ae05 ae05)
    {
        if(isLogin(request, response))
        {
            ae05.setAad401(Integer.parseInt(getCookies(request, "aad401_auc")));
            if(connService.delByValue(ae05))
            {
                return "true";
            }
        }
        return null;
    }

    @RequestMapping(value = "/deliverAuc", method = RequestMethod.GET)
    @ResponseBody
    public String deliverAuc(HttpServletRequest request, HttpServletResponse response, int aac501)
    {
        if(isLogin(request, response))
        {
            if(orderService.deliverAuc(aac501))
            {
                return "true";
            }
        }
        return null;
    }

    @RequestMapping(value = "/takenAuc", method = RequestMethod.GET)
    @ResponseBody
    public String takenAuc(HttpServletRequest request, HttpServletResponse response, int aad201, int aac501)
    {
        if(isLogin(request, response))
        {
            int aab101 = Integer.parseInt(getCookies(request, "userId"));
            if(orderService.takenAuc(aab101, aad201, aac501))
            {
                return "true";
            }
        }
        return null;
    }

    @RequestMapping(value = "/auctionPart.html", method = RequestMethod.POST)
    public String addOrder(HttpServletRequest request, HttpServletResponse response, Ac05 ac05, int aad201, int aad601, Model model)
    {
        isLogin = isLogin(request, response);
        if(isLogin)
        {
            int aab101 = Integer.parseInt(getCookies(request, "userId"));
            ac05.setAab101(aab101);
            int res;
            if(orderService.addAucOrder(ac05, aad201, aad601))
            {
                res = 1;
            }
            else
            {
                res = 2;
            }
            model.addAttribute("apartList", auctionService.selectAd06LeftAd02(aab101));
            model.addAttribute("isLogin", isLogin);
            model.addAttribute("res", res);
            return "auctionPart";
        }
        return this.wel(request, response, 1, model);
    }

    @RequestMapping(value = "/auctionOrder.html", method = RequestMethod.GET)
    public String setOrder(HttpServletRequest request, HttpServletResponse response, int aad201, Model model)
    {
        isLogin = isLogin(request, response);
        if(isLogin)
        {
            int aab101 = Integer.parseInt(getCookies(request, "userId"));
            model.addAttribute("ac05", orderService.selectAc05Byaad201(aad201));
            model.addAttribute("ad02", service.findById(aad201));
            model.addAttribute("isBuy", service.isBuy(aab101, aad201));
            model.addAttribute("isLogin", isLogin);
            return "auctionOrder";
        }
        return this.wel(request, response, 1, model);
    }


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
        return this.wel(request, response, 1, model);
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
        return this.wel(request, response, 1, model);
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
    public String findByUserID(HttpServletRequest request, HttpServletResponse response, int pageNum, Model model)
    {
        isLogin = isLogin(request, response);
        if(isLogin)
        {
            int aab101 = Integer.parseInt(getCookies(request, "userId"));
            Map<String, Object> ad02Map = service.findByUserId(aab101, pageNum, 8);
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
            List<Ad02> ad02List = (List<Ad02>)ad02Map.get("ad02List");
            model.addAttribute("ad02List", orderService.myLauState(ad02List));
            model.addAttribute("isLogin", isLogin);
            model.addAttribute("pre", pre);
            model.addAttribute("next", next);
            model.addAttribute("pageNum", pageNum);
            return "auctionMyLau";
        }
        return this.wel(request, response, 1, model);
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

    @RequestMapping(value = "/auctionSearch.html", method = RequestMethod.GET)
    public String searchByValue(HttpServletRequest request, HttpServletResponse response, String searchValue, int pageNum, Model model)
    {
        Map<String, Object> ad02Map = service.findByValue(searchValue, pageNum, 8);
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
        model.addAttribute("isLogin", isLogin(request, response));
        model.addAttribute("pre", pre);
        model.addAttribute("next", next);
        model.addAttribute("pageNum", pageNum);
        model.addAttribute("searchValue", searchValue);
        model.addAttribute("type", 2);
        return "auction";
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
        return this.wel(request, response, 1, model);
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
        return this.wel(request, response, 1, model);
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
        model.addAttribute("isLogin", isLogin(request, response));
        model.addAttribute("pre", pre);
        model.addAttribute("next", next);
        model.addAttribute("pageNum", pageNum);
        model.addAttribute("type", 1);
        return "auction";
    }
}
