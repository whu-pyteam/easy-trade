package com.pyteam.foreground.dto;

import lombok.Data;
import org.springframework.web.multipart.MultipartFile;

import java.math.BigDecimal;
import java.util.Date;

public class Ac01Dto
{

    /**
     * 商品流水号
     */
    private Integer aac101;

    /**
     * 卖家流水号
     */
    private Integer aab101;

    /**
     * 商品分类流水号
     */
    private Integer aac201;

    /**
     * 商品名
     */
    private String aac102;

    /**
     * 商品详情
     */
    private String aac103;

    /**
     * 审核情况
     * 0-未审核
     * 1-审核已通过
     * 2-审核未通过
     */
    private String aac104;

    /**
     * 商品价格
     */
    private BigDecimal aac105;

    /**
     * 商品图片
     */
    private MultipartFile aac106;

    /**
     * 创建时间
     */
    private Date aac107;


    public Integer getAac101() {
        return aac101;
    }

    public Integer getAab101() {
        return aab101;
    }

    public Integer getAac201() {
        return aac201;
    }

    public String getAac102() {
        return aac102;
    }

    public String getAac103() {
        return aac103;
    }

    public String getAac104() {
        return aac104;
    }

    public BigDecimal getAac105() {
        return aac105;
    }

    public MultipartFile getAac106() {
        return aac106;
    }

    public Date getAac107() {
        return aac107;
    }

    public void setAac101(Integer aac101) {
        this.aac101 = aac101;
    }

    public void setAab101(Integer aab101) {
        this.aab101 = aab101;
    }

    public void setAac201(Integer aac201) {
        this.aac201 = aac201;
    }

    public void setAac102(String aac102) {
        this.aac102 = aac102;
    }

    public void setAac103(String aac103) {
        this.aac103 = aac103;
    }

    public void setAac104(String aac104) {
        this.aac104 = aac104;
    }

    public void setAac105(BigDecimal aac105) {
        this.aac105 = aac105;
    }

    public void setAac106(MultipartFile aac106) {
        this.aac106 = aac106;
    }

    public void setAac107(Date aac107) {
        this.aac107 = aac107;
    }
}
