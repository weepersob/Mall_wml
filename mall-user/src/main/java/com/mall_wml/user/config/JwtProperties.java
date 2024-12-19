package com.mall_wml.user.config;

import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.PropertySource;
import org.springframework.stereotype.Component;

import java.time.Duration;
@Component
@Data
@ConfigurationProperties(prefix = "mall.jwt")
public class JwtProperties {
    // Getter for secretKey
    private String secretKey;
    // Getter for tokenTTL
    private Duration tokenTTL = Duration.ofMinutes(10);
}

