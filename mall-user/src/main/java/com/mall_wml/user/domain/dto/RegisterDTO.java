package com.mall_wml.user.domain.dto;

import io.swagger.v3.oas.annotations.media.Schema;
import lombok.Data;
import lombok.experimental.Accessors;
import org.springframework.web.multipart.MultipartFile;
@Data
@Accessors(chain = true)
@Schema(description = "用户注册DTO")
public class RegisterDTO {
        /**
         * 用户名
         */
        @Schema(description = "用户名")
        private String username;

        /**
         * 密码
         */
        @Schema(description = "密码")
        private String password;

        /**
         * 手机号
         */
        @Schema(description = "手机号")
        private String phone;

        /**
         * 邮箱
         */
        @Schema(description = "邮箱")
        private String email;

        /**
         * 地址
         */
        @Schema(description = "地址")
        private String address;

        /**
         * 用户头像文件
         */
        @Schema(description = "用户头像文件")
        private MultipartFile avatarFile;  // 这里用 MultipartFile 来接收文件

}
