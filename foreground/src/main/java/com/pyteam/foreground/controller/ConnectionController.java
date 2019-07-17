package com.pyteam.foreground.controller;

import com.pyteam.foreground.dto.ConnectionDto;
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
    public String addConnection(ConnectionDto dto)
    {
        if(service.insert(dto))
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
    public String delConnection(ConnectionDto dto)
    {
        return null;
    }
}
