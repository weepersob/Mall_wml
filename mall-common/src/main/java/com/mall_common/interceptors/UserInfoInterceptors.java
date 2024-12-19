package com.mall_common.interceptors;

import cn.hutool.core.util.StrUtil;

import com.mall_common.util.UserContext;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import org.springframework.web.servlet.HandlerInterceptor;


public class UserInfoInterceptors implements HandlerInterceptor {

    public boolean preHandle(HttpServletRequest request, HttpServletResponse response,
                             Object handler) throws Exception {
        // 获取登录用户信息
        String userInfo = request.getHeader("Authorization");
        // 判断是否为空    判断是否获取了用户，如果有则存入ThreadLocal
        if(StrUtil.isBlank(userInfo)){
            // 设置状态码为 401 Unauthorized
            response.setStatus(HttpServletResponse.SC_UNAUTHORIZED);
            // 返回错误信息，告诉客户端没有提供授权信息
            response.getWriter().write("Service Unauthorized: Missing or invalid authorization header");
            // 返回false，拦截后续请求，不再继续执行
            return false;
        }
        UserContext.setUser(Long.parseLong(userInfo));
        // 放行
        return true;

    }

    public void afterCompletion(final HttpServletRequest request, final HttpServletResponse response,
                                final Object handler, final Exception ex) throws Exception {
        // 清理用户
        UserContext.removeUser();
    }
}
