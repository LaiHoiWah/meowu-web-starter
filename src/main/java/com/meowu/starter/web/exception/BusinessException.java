package com.meowu.starter.web.exception;

import lombok.Getter;

@Getter
public class BusinessException extends RuntimeException{

    private Integer code;

    public BusinessException(){
        super();
    }

    public BusinessException(String message){
        super(message);
    }

    public BusinessException(Throwable cause){
        super(cause);
    }

    public BusinessException(String message, Throwable cause){
        super(message, cause);
    }

    public BusinessException(Integer code, String message){
        super(message);

        this.code = code;
    }

    public BusinessException(Integer code, String message, Throwable cause){
        super(message, cause);

        this.code = code;
    }
}
