package com.pyteam.foreground.controller;

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

import static com.pyteam.foreground.controller.LoginController.getCookies;
import static com.pyteam.foreground.controller.LoginController.isLogin;

@Controller
public class ConnectionController
{
    @Autowired
    private ConnectionService connService;

    @RequestMapping(value = "/auctionConn.html", method = RequestMethod.GET)
    public String showConnection(HttpServletRequest request, HttpServletResponse response, Model model)
    {
        int aad401 = 0;
        if(isLogin(request, response))
        {
            aad401 = Integer.parseInt(getCookies(request, "aad401_auc"));
        }
        model.addAttribute("aconnList", connService.selectAd02RightAe05(aad401, 1, 8));
        return "auctionConn";
    }

    @RequestMapping(value = "/addAucConn", method = RequestMethod.GET)
    @ResponseBody
    public String addAucConn(Ae05 ae05)
    {
        if(connService.insert(ae05))
        {
            return "1";
        }
        else
        {
            return null;
        }
    }

    @RequestMapping(value = "delAucConn", method = RequestMethod.GET)
    @ResponseBody
    public String delAucConn(Ae05 ae05)
    {
        if(connService.delByValue(ae05))
        {
            return "1";
        }
        else
        {
            return null;
        }
    }
}
