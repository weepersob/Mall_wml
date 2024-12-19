package com.mall_wml.geteway.filters;


import com.mall_common.exception.UnauthorizedException;
import com.mall_wml.geteway.config.AuthProperties;
import com.mall_wml.geteway.util.JwtTool;
import lombok.RequiredArgsConstructor;
import org.springframework.cloud.gateway.filter.GatewayFilterChain;
import org.springframework.cloud.gateway.filter.GlobalFilter;
import org.springframework.core.Ordered;
import org.springframework.http.HttpStatus;
import org.springframework.http.server.reactive.ServerHttpRequest;
import org.springframework.http.server.reactive.ServerHttpResponse;
import org.springframework.stereotype.Component;
import org.springframework.util.AntPathMatcher;
import org.springframework.web.server.ServerWebExchange;
import reactor.core.publisher.Mono;

import java.util.List;

@Component
@RequiredArgsConstructor
public class AuthGlobalFilter implements GlobalFilter, Ordered {

    private final AuthProperties authProperties;// 属性配置类
    private final JwtTool jwtTool;// jwt解析
//    用于匹配带有 Ant 风格路径模式的字符串。Ant 风格路径模式是指包含通配符的路径模式
    private final AntPathMatcher antPathMatcher = new AntPathMatcher();
    @Override
    public Mono<Void> filter(ServerWebExchange exchange, GatewayFilterChain chain) {

        // 获取request
        ServerHttpRequest request = exchange.getRequest();
        //判断是否需要登录拦截
        if(isExclude(request.getPath().toString())){
            // 放行
            return chain.filter(exchange);
        }
        // 获取token并解析
        String token=null;
        List<String> headers = request.getHeaders().get("Authorization");
        if(headers != null&& !headers.isEmpty()){
            token = headers.get(0);
        }
        Long userId=null;
        try {
             userId= jwtTool.parseToken(token);
        } catch (UnauthorizedException e) {
            // 拦截设置状态码为401表示未登录
            ServerHttpResponse response = exchange.getResponse();
            response.setStatusCode(HttpStatus.UNAUTHORIZED);

            // 返回错误信息，告诉客户端没有提供授权信息
            String errorMessage = "{ \"error\": \"Gateway Unauthorized\", \"message\": \"Invalid or missing Authorization token.\" }";

            // 返回错误信息
            response.getHeaders().add("Content-Type", "application/json");
            response.writeWith(Mono.just(response.bufferFactory().wrap(errorMessage.getBytes())))
                    .then();
            return response.setComplete();
        }
        // 设置用户信息
        String userInfo=userId.toString();
        ServerWebExchange swe = exchange.mutate()
                .request(builder -> builder.header("Authorization", userInfo))
                .build();
        //放行
        return chain.filter(swe);
    }

    private boolean isExclude(String path) {
        for (String pathPattern : authProperties.getExcludePaths()) {
           if(antPathMatcher.match(pathPattern, path))return true;
        }
        return false;
    }

    @Override
    public int getOrder() {
        return 0;
    }
}
