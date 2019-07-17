package com.pyteam.background;

import com.github.pagehelper.PageHelper;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.transaction.annotation.EnableTransactionManagement;

import java.util.Properties;

@SpringBootApplication(scanBasePackages = {"com.pyteam.db", "com.pyteam.background"})
@MapperScan({"com.pyteam.db.mapper", "com.pyteam.background.mapper"})
public class BackgroundApplication
{
    public static void main(String[] args)
    {
        SpringApplication.run(BackgroundApplication.class, args);
    }


    @Bean
    public PageHelper pageHelper(){
        PageHelper pageHelper = new PageHelper();
        Properties properties = new Properties();
        //数据库
        properties.setProperty("helperDialect", "mysql");
        //是否将参数offset作为PageNum使用
        properties.setProperty("offsetAsPageNum", "true");
        //是否进行count查询
        properties.setProperty("rowBoundsWithCount", "true");
        //是否分页合理化
        properties.setProperty("reasonable", "false");
        pageHelper.setProperties(properties);
        return pageHelper;
    }

}
