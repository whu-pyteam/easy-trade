package com.pyteam.foreground.dto;

import lombok.Data;
import org.springframework.web.multipart.MultipartFile;

import java.math.BigDecimal;
import java.util.Date;

@Data
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
     * 商品分类名称
     */
    private String aac202;

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
}
