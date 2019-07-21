package com.pyteam.foreground.controller;

import com.pyteam.foreground.service.Ad03Service;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@Controller
public class CommentController
{
    @Autowired
    private Ad03Service ad03Service;

    @PostMapping("submitComment.html")
    @ResponseBody
    public boolean submitComment(HttpServletRequest request, HttpServletResponse response)
    {
        String aad303 = request.getParameter("aad303");
        String aad304 = request.getParameter("aad304");
        String aab101 = request.getParameter("aab101");
        String aac101 = request.getParameter("aac101");
        ad03Service.submitComment(aad303,aad304,Integer.parseInt(aab101),Integer.parseInt(aac101));
        return true;
    }
}
