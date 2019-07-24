package com.pyteam.foreground.dto;

import lombok.Data;
import org.springframework.web.multipart.MultipartFile;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.logging.SimpleFormatter;

@Data
public class Ab01Dto
{

    /**
     * 昵称
     */
    private String aab103;

    /**
     * 性别
     */
    private String aab104;

    /**
     * 生日
     */
    private String aab105;

    /**
     * 院校代号
     */
    private String aab106;

    /**
     * 头像
     */
    private MultipartFile aab107;

    /**
     * 个性签名
     */
    private String aab111;

    private String hasEdit;

}
