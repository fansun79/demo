package com.sun.demo.controller.req;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import javax.validation.constraints.NotEmpty;

@ApiModel
@Data
public class CreateTradingAccountReq {

    @ApiModelProperty(value = "账户名称",required = true,example = "12345")
    @NotEmpty(message =  "账号名称不能为空")
    private String name;

    @ApiModelProperty(value = "账户密码",required = true,example = "1234546")
    @NotEmpty(message =  "密码不能为空")
    private String password;

}
