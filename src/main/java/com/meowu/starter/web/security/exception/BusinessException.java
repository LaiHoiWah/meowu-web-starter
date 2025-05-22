package com.meowu.starter.web.security.exception;

import com.meowu.starter.web.security.response.ResponseCode;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class BusinessException extends RuntimeException{

    private Integer code;

    public BusinessException(){
        super();
        this.code = ResponseCode.FAILURE;
    }

    public BusinessException(String message){
        super(message);
        this.code = ResponseCode.FAILURE;
    }

    public BusinessException(Throwable cause){
        super(cause);
        this.code = ResponseCode.FAILURE;
    }

    public BusinessException(String message, Throwable cause){
        super(message, cause);
        this.code = ResponseCode.FAILURE;
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
