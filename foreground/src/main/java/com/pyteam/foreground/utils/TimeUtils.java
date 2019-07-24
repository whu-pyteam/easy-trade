package com.pyteam.foreground.utils;

import com.pyteam.foreground.service.OrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

@Component
public class TimeUtils
{
    @Autowired
    private OrderService orderService;

    @Scheduled(cron = "0 */1 * * * ?")
    public void setOrder()
    {
        orderService.updateAd02AndAd06();
    }

}
