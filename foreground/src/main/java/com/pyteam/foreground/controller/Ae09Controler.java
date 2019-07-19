package com.pyteam.foreground.controller;

import com.pyteam.db.mbg.entity.Ac02;
import com.pyteam.db.mbg.entity.Ae09;
import com.pyteam.foreground.mapper.Ae09NewMapper;
import com.pyteam.foreground.service.Ae09Service;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.ArrayList;
import java.util.List;

/**
 * @author wjm
 * @date2019/7/15 15:19
 */
@Service

public class Ae09Controler
{
    @Autowired
    private Ae09Service ae09Service;


    @GetMapping("ad01/addae09")
    public String showA()
    {
        return "ad01/addae09";
    }



}
