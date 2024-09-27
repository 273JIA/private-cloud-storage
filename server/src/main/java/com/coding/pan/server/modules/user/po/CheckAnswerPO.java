package com.coding.pan.server.modules.user.po;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;
import org.hibernate.validator.constraints.Length;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Pattern;
import java.io.Serializable;

/**
 * 校验密保答案PO对象
 */
@ApiModel(value = "用户忘记密码-校验密保答案参数")
@Data
public class CheckAnswerPO implements Serializable {

    private static final long serialVersionUID = 6407965612511380183L;

    @ApiModelProperty(value = "用户名", required = true)
    @NotBlank(message = "Username cannot be empty")
    @Pattern(regexp = "^[0-9A-Za-z]{6,16}$", message = "Please enter a username that is 6-16 characters long and contains only letters and numbers")
    private String username;

    @ApiModelProperty(value = "密码问题", required = true)
    @NotBlank(message = "Security question cannot be empty")
    @Length(max = 100, message = "Security question cannot exceed 100 characters")
    private String question;

    @ApiModelProperty(value = "密码答案", required = true)
    @NotBlank(message = "Security answer cannot be empty")
    @Length(max = 100, message = "Security answer cannot exceed 100 characters")
    private String answer;

}
