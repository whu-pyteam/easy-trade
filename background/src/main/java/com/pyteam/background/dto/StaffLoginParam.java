package com.pyteam.background.dto;

import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

/**
 * 员工登录 dto
 * @author tyc
 * @date 2019/7/6 11:29
 */
@Data
public class StaffLoginParam
{
    @ApiModelProperty(value = "用户名", required = true)
    private String username;

    @ApiModelProperty(value = "密码", required = true)
    private String password;
}
