package com.pyteam.foreground.controller;

import com.pyteam.db.mbg.entity.Ad02;
import com.pyteam.foreground.service.Ad02Service;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import javax.servlet.http.HttpServletRequest;
import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

@Controller
public class AddAuctionController
{
    @Autowired
    private Ad02Service services;

    @RequestMapping(value = "/addAuction", method = RequestMethod.POST)
    public String wel(Ad02 ad02, Model model) throws Exception
    {
        System.out.println(ad02);
        boolean res = services.addAd02(ad02);

        String msg = "hello";
        model.addAttribute("msg",msg);
        return "addAuction";
    }

}
