package com.pyteam.foreground.controller;

import com.pyteam.db.mbg.entity.Ae05;
import com.pyteam.foreground.service.ConnectionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class ConnectionController
{
    @Autowired
    private ConnectionService service;

    @RequestMapping(value = "/addConnection", method = RequestMethod.GET)
    @ResponseBody
    public String addConnection(Ae05 ae05)
    {
        if(service.insert(ae05))
        {
            return "1";
        }
        else
        {
            return null;
        }
    }

    @RequestMapping(value = "delConnection", method = RequestMethod.GET)
    @ResponseBody
    public String delConnection(Ae05 ae05)
    {
        if(service.delByValue(ae05))
        {
            return "1";
        }
        else
        {
            return null;
        }
    }
}
