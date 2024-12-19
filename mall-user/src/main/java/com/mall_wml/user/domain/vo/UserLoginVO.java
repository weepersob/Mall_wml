package com.mall_wml.user.domain.vo;
import lombok.Data;
import lombok.experimental.Accessors;

@Data
@Accessors(chain = true)
public class UserLoginVO {

    /**
     * 用户名
     */
    private String username;


    /**
     * 手机号
     */
    private String phone;

    /**
     * 邮箱
     */
    private String email;

    /**
     * 地址
     */
    private String address;

    /**
     * 用户头像文件
     */
    private String avatar;
    /**
     * 用户状态
     */
    private Integer status;
    /**
     * token
     */
    private String token;
}
