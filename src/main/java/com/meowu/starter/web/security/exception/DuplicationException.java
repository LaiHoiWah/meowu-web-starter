package com.meowu.starter.web.security.exception;

public class DuplicationException extends BusinessException{

    public DuplicationException(){
        super();
    }

    public DuplicationException(String message){
        super(message);
    }

    public DuplicationException(Throwable cause){
        super(cause);
    }

    public DuplicationException(String message, Throwable cause){
        super(message, cause);
    }

    public DuplicationException(Integer code, String message){
        super(code, message);
    }

    public DuplicationException(Integer code, String message, Throwable cause){
        super(code, message, cause);
    }
}
