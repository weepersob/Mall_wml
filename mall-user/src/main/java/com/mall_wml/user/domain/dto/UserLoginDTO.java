package com.mall_wml.user.domain.dto;

import io.swagger.v3.oas.annotations.media.Schema;
import lombok.Data;
import lombok.experimental.Accessors;


@Accessors(chain = true)
@Schema(description = "用户登录DTO")
@Data
public class UserLoginDTO {
    /**
     * 手机号
     */
    @Schema(description = "手机号")
    private String phone;
    /**
     * 密码
     */
    @Schema(description = "密码")
    private String password;
}
