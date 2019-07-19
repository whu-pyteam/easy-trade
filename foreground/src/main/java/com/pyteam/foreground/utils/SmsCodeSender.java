package com.pyteam.foreground.utils;

import java.util.Random;

/**
 * @author tyc
 * @date 2019/7/18 15:53
 */
public class SmsCodeSender
{
    public String send(String mobile)
    {
        String code = this.generator();
        System.out.println("向手机" + mobile + "发送短信验证码" + code);
        return code;
    }


    private String generator()
    {
        Random random = new Random();
        StringBuilder stringBuilder = new StringBuilder();
        for(int i = 0; i < 6; i++)
        {
            stringBuilder.append(random.nextInt(10));
        }
        return stringBuilder.toString();
    }
}
