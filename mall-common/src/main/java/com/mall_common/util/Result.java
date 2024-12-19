package com.mall_common.util;

import com.mall_common.exception.CommonException;

public class Result<T> {
    private int code;       // 响应状态码
    private String message; // 响应消息
    private T data;         // 响应数据

    // 无参构造函数
    public Result() {
    }

    // 有参构造函数
    public Result(int code, String message) {
        this.code = code;
        this.message = message;
    }

    public Result(int code, String message, T data) {
        this.code = code;
        this.message = message;
        this.data = data;
    }
    public static <T> Result<T> error(String msg) {
        return new Result<>(500, msg, null);
    }


    public static <T> Result<T> error(CommonException e) {
        return new Result<>(e.getCode(), e.getMessage(), null);
    }

    // Getter 和 Setter
    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public T getData() {
        return data;
    }

    public void setData(T data) {
        this.data = data;
    }

    // 成功响应的静态方法
    public static <T> Result<T> success(T data) {
        return new Result<>(200, "Success", data);
    }

    public static Result<Void> success() {
        return new Result<>(200, "Success");
    }

    // 失败响应的静态方法
    public static <T> Result<T> error(int code, String message) {
        return new Result<>(code, message);
    }
}
