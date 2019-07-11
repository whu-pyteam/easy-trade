package com.pyteam.background;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication(scanBasePackages = {"com.pyteam.db", "com.pyteam.background"})
@MapperScan({"com.pyteam.db.mapper", "com.pyteam.background.mapper"})
public class BackgroundApplication
{
    public static void main(String[] args)
    {
        SpringApplication.run(BackgroundApplication.class, args);
    }

}
