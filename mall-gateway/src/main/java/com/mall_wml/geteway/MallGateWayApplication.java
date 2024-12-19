package com.mall_wml.geteway;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.ConfigurationPropertiesScan;
import org.springframework.boot.context.properties.EnableConfigurationProperties;

@SpringBootApplication
@ConfigurationPropertiesScan
@EnableConfigurationProperties
public class MallGateWayApplication {
    public static void main(String[] args) {
     SpringApplication.run(MallGateWayApplication.class, args);
    }

}
