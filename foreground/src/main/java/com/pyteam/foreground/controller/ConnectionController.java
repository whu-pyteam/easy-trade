package com.pyteam.foreground.controller;

import com.pyteam.db.mbg.entity.Ad02;
import com.pyteam.db.mbg.entity.Ae05;
import com.pyteam.foreground.service.ConnectionService;
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

import static com.pyteam.foreground.controller.LoginController.getCookies;
import static com.pyteam.foreground.controller.LoginController.isLogin;

@Controller
public class ConnectionController
{
    @Autowired
    private ConnectionService connService;

    private boolean isLogin;

    @RequestMapping(value = "/auctionConn.html", method = RequestMethod.GET)
    public String showConnection(HttpServletRequest request, HttpServletResponse response, int pageNum, Model model)
    {
        isLogin = isLogin(request, response);
        int aad401 = 0;
        if(isLogin)
        {
            aad401 = Integer.parseInt(getCookies(request, "aad401_auc"));
        }
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
            return "auction";
        }
        model.addAttribute("aconnList", (List<Ad02>)connMap.get("ad02List"));
        model.addAttribute("isLogin", isLogin);
        model.addAttribute("pre", pre);
        model.addAttribute("next", next);
        model.addAttribute("pageNum", pageNum);
        return "auctionConn";
    }

    @RequestMapping(value = "/addAucConn", method = RequestMethod.GET)
    @ResponseBody
    public String addAucConn(HttpServletRequest request, HttpServletResponse response, Ae05 ae05)
    {
        if(isLogin(request, response) && !connService.insert(ae05))
        {
            return null;
        }
        else
        {
            return "1";
        }
    }

    @RequestMapping(value = "delAucConn", method = RequestMethod.GET)
    @ResponseBody
    public String delAucConn(HttpServletRequest request, HttpServletResponse response, Ae05 ae05)
    {
        if(isLogin(request, response) && !connService.delByValue(ae05))
        {
            return null;
        }
        else
        {
            return "1";
        }
    }
}
