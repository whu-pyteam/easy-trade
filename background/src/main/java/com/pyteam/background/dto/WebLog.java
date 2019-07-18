package com.pyteam.background.dto;

import lombok.Data;

/**
 * 日志信息封装类
 * @author tyc
 * @date 2019/7/15 11:37
 */
@Data
public class WebLog
{
    /**
     * 操作描述
     */
    private String description;


    /**
     * 操作用户
     */
    private String username;

    /**
     * 操作时间
     */
    private Long startTime;


    /**
     * 消耗时间
     */
    private Integer spendTime;


    /**
     * 根路径
     */
    private String basePath;


    /**
     * URI
     */
    private String uri;


    /**
     * URL
     */
    private String url;


    /**
     * 请求类型
     */
    private String method;


    /**
     * IP地址
     */
    private String ip;


    /**
     * 请求参数
     */
    private Object parameter;

    /**
     * 请求返回的结果
     */
    private Object result;
}
