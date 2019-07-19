package com.pyteam.foreground.controller;

import com.pyteam.foreground.RegisterService;
import com.pyteam.foreground.utils.SmsCodeSender;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletRequest;
import java.util.HashMap;
import java.util.Map;

/**
 * @author tyc
 * @date 2019/7/18 14:13
 */
@Controller()
public class RegisterController
{
    @Autowired
    RegisterService registerService;

    /**
     * 模拟发送验证码
     * @param number
     * @return
     */
    @PostMapping("/register/sms")
    @ResponseBody
    public Map<String, String> sendSmsCode(@RequestParam("number")String number)
    {
        Map<String, String> result = new HashMap<>(1);
        // 该手机号已经被使用
        if(!registerService.isNumberFree(number))
        {
            result.put("message", "failed");
            return result;
        }
        SmsCodeSender smsCodeSender = new SmsCodeSender();
        String s = smsCodeSender.send(number);
        registerService.insertCode(number, s);
        result.put("message", "success");
        return result;
    }

    @PostMapping("/register")
    @ResponseBody
    public Map<String, String> register(@RequestParam("username")String username,
                                        @RequestParam("password")String password,
                                        @RequestParam("number")String number,
                                        @RequestParam("code")String code)
    {
        Map<String, String> result = new HashMap<>(1);
        if(!registerService.isNameFree(username))
        {
            result.put("message", "name");
            return result;
        }
        if(!registerService.validCode(number, code))
        {
            result.put("message", "code");
            return result;
        }
        registerService.register(username, password, number);
        result.put("message", "success");
        return result;
    }



}
