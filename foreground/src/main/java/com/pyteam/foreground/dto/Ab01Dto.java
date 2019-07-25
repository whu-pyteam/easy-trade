package com.pyteam.foreground.dto;

import lombok.Data;
import org.springframework.web.multipart.MultipartFile;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.logging.SimpleFormatter;

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
    public String getAab103() {
        return aab103;
    }

    public String getAab104() {
        return aab104;
    }

    public String getAab105() {
        return aab105;
    }

    public String getAab106() {
        return aab106;
    }

    public MultipartFile getAab107() {
        return aab107;
    }

    public String getAab111() {
        return aab111;
    }

    public String getHasEdit() {
        return hasEdit;
    }

    public void setAab103(String aab103) {
        this.aab103 = aab103;
    }

    public void setAab104(String aab104) {
        this.aab104 = aab104;
    }

    public void setAab105(String aab105) {
        this.aab105 = aab105;
    }

    public void setAab106(String aab106) {
        this.aab106 = aab106;
    }

    public void setAab107(MultipartFile aab107) {
        this.aab107 = aab107;
    }

    public void setAab111(String aab111) {
        this.aab111 = aab111;
    }

    public void setHasEdit(String hasEdit) {
        this.hasEdit = hasEdit;
    }

}
