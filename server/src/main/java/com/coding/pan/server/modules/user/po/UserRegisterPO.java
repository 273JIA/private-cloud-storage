package com.coding.pan.server.modules.user.po;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;
import org.hibernate.validator.constraints.Length;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Pattern;
import java.io.Serializable;

/**
 * 注册用户参数实体对象
 */
@Data
@ApiModel(value = "用户注册参数")
public class UserRegisterPO implements Serializable {

    private static final long serialVersionUID = -5521427813609988931L;

    @ApiModelProperty(value = "用户名", required = true)
    @NotBlank(message = "Username cannot be empty")
    @Pattern(regexp = "^[0-9A-Za-z]{6,16}$", message = "Please enter a username that is 6-16 characters long and contains only letters and numbers")
    private String username;

    @ApiModelProperty(value = "密码", required = true)
    @NotBlank(message = "Password cannot be empty")
    @Length(min = 8, max = 16, message = "Please enter a password of 8-16 digits")
    private String password;

    @ApiModelProperty(value = "密码问题", required = true)
    @NotBlank(message = "Security question cannot be empty")
    @Length(max = 100, message = "Security question cannot exceed 100 characters")
    private String question;

    @ApiModelProperty(value = "密码答案", required = true)
    @NotBlank(message = "Security answer cannot be empty")
    @Length(max = 100, message = "Security answer cannot exceed 100 characters")
    private String answer;

}
