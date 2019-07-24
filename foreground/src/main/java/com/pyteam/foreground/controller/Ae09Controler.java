package com.pyteam.foreground.controller;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.pyteam.db.mbg.entity.Ac02;
import com.pyteam.db.mbg.entity.Ae09;
import com.pyteam.foreground.dto.Ad01ac02Dto;
import com.pyteam.foreground.mapper.Ae09NewMapper;
import com.pyteam.foreground.service.Ad01Service;
import com.pyteam.foreground.service.Ae07Service;
import com.pyteam.foreground.service.Ae09Service;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

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

    @Autowired
    private Ae07Service ae07Service;
    @Autowired
    private Ad01Service ad01Service;
    @GetMapping("addae09")
    public String showA()
    {
        return "addae09";
    }


    @GetMapping("comeonbaby")
    public String lailai(@RequestParam(value = "pageNo",defaultValue = "1")int pageNo, @RequestParam(value="pageSize",defaultValue="8")int pageSize, Model model)
    {
        PageInfo<Ad01ac02Dto>page=ae07Service.nul(pageNo,pageSize);
        model.addAttribute("pageInfo",page);
        return "lailailai.html";
    }
}
