package com.pyteam.db;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication(scanBasePackages = {"com.pyteam.db"})
@MapperScan("com.pyteam.db.mapper")
public class DbApplication
{
    public static void main(String[] args)
    {
        SpringApplication.run(DbApplication.class, args);
    }
}
