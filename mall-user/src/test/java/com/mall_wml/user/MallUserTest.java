package com.mall_wml.user;


import com.mall_wml.user.config.JwtProperties;
import com.mall_wml.user.util.JwtTool;

public class MallUserTest {
    public static final JwtTool jwtTool = new JwtTool(new JwtProperties());
}
