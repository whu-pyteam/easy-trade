package com.pyteam.foreground;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.transaction.annotation.EnableTransactionManagement;

@EnableTransactionManagement
@SpringBootApplication(scanBasePackages = {"com.pyteam.db", "com.pyteam.foreground"})
@MapperScan({"com.pyteam.db.mbg.mapper", "com.pyteam.db.mapper","com.pyteam.foreground.mapper"})
public class ForegroundApplication
{

    public static void main(String[] args)
    {
        SpringApplication.run(ForegroundApplication.class, args);
    }

}
