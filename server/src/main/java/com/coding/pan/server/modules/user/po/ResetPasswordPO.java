package com.coding.pan.server.modules.user.po;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;
import org.hibernate.validator.constraints.Length;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Pattern;
import java.io.Serializable;

/**
 * 重置用户密码PO对象
 */
@ApiModel(value = "用户忘记密码-重置用户密码参数")
@Data
public class ResetPasswordPO implements Serializable {

    private static final long serialVersionUID = 6775932472330393644L;

    @ApiModelProperty(value = "用户名", required = true)
    @NotBlank(message = "Username cannot be empty")
    @Pattern(regexp = "^[0-9A-Za-z]{6,16}$", message = "Please enter a username that is 6-16 characters long and contains only letters and numbers")
    private String username;

    @ApiModelProperty(value = "密码", required = true)
    @NotBlank(message = "Password cannot be empty")
    @Length(min = 8, max = 16, message = "Please enter a password that is 8-16 characters long")
    private String password;

    @ApiModelProperty(value = "提交重置密码的token")
    @NotBlank(message = "The token cannot be empty")
    private String token;

}
