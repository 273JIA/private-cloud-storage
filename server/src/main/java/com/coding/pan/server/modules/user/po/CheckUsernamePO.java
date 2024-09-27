package com.coding.pan.server.modules.user.po;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Pattern;
import java.io.Serializable;

/**
 * 校验用户名称PO对象
 */
@ApiModel(value = "用户忘记密码-校验用户名参数")
@Data
public class CheckUsernamePO implements Serializable {

    private static final long serialVersionUID = 1795641889740242870L;

    @ApiModelProperty(value = "用户名", required = true)
    @NotBlank(message = "Username cannot be empty")
    @Pattern(regexp = "^[0-9A-Za-z]{6,16}$", message = "Please enter a username that is 6-16 characters long and contains only letters and numbers")
    private String username;

}
