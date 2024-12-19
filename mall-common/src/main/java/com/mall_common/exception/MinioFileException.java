package com.mall_common.exception;

public class MinioFileException extends CommonException{
    public MinioFileException(String message) {
        super(message, 500);
    }
    public MinioFileException(String message, int code) {
        super(message, code);
    }

    public MinioFileException(String message, Throwable cause, int code) {
        super(message, cause, code);
    }

    public MinioFileException(Throwable cause, int code) {
        super(cause, code);
    }
}
