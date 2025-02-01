package com.meowu.starter.web.security.response;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Response{

    private Integer code;
    private String message;
    private Object data;

    public Response(){

    }

    public Response(Object data){
        this.data = data;
    }

    public Response(Integer code, String message){
        this.code = code;
        this.message = message;
    }

    public Response(Integer code, String message, Object data){
        this.code = code;
        this.message = message;
        this.data = data;
    }
}
