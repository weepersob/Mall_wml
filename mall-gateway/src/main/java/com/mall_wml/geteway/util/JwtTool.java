package com.mall_wml.geteway.util;

import cn.hutool.jwt.JWT;
import cn.hutool.jwt.JWTValidator;
import cn.hutool.jwt.signers.JWTSignerUtil;
import com.mall_wml.geteway.config.JwtProperties;
import com.mall_common.exception.UnauthorizedException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.time.Duration;
import java.util.Date;
import cn.hutool.jwt.signers.JWTSigner;


@Component
public class JwtTool {

    private final JWTSigner jwtSigner;

    public JwtTool(JwtProperties jwtProperties) {
        // 自动注入 JwtProperties 配置类
        // 使用 HMAC（HS256）算法和共享密钥
        this.jwtSigner = JWTSignerUtil.createSigner("hs256", jwtProperties.getSecretKey().getBytes());
    }

    /**
     * 创建 access-token
     *
     * @param userId 用户信息
     * @return access-token
     */
    public String createToken(Long userId, Duration ttl) {
        // 1.生成 JWT
        return JWT.create()
                .setPayload("user", userId)
                .setExpiresAt(new Date(System.currentTimeMillis() + ttl.toMillis()))
                .setSigner(jwtSigner)
                .sign();
    }

    /**
     * 解析 token
     *
     * @param token token
     * @return 解析刷新 token 得到的用户信息
     */
    public Long parseToken(String token) {
        // 1.校验 token 是否为空
        if (token == null) {
            throw new UnauthorizedException("未登录");
        }

        // 2.校验并解析 JWT
        JWT jwt;
        try {
            jwt = JWT.of(token).setSigner(jwtSigner);
        } catch (Exception e) {
            throw new UnauthorizedException("无效的token", e);
        }

        // 2.校验 JWT 是否有效
        if (!jwt.verify()) {
            // 验证失败
            throw new UnauthorizedException("无效的token");
        }

        // 3.校验是否过期
        try {
            JWTValidator.of(jwt).validateDate();
        } catch (Exception e) {
            throw new UnauthorizedException("token已经过期");
        }

        // 4.数据格式校验
        Object userPayload = jwt.getPayload("user");
        if (userPayload == null) {
            // 数据为空
            throw new UnauthorizedException("无效的token");
        }

        // 5.数据解析
        try {
            return Long.valueOf(userPayload.toString());
        } catch (RuntimeException e) {
            // 数据格式有误
            throw new UnauthorizedException("无效的token");
        }
    }
}
