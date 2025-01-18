package com.meowu.starter.web.advice;

import com.meowu.starter.web.exception.BusinessException;
import com.meowu.starter.web.response.Response;
import com.meowu.starter.web.response.ResponseCode;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestControllerAdvice;

@RestControllerAdvice
@Slf4j
public class ExceptionAdvice{

    @ExceptionHandler(value = {
        Exception.class,
        RuntimeException.class
    })
    @ResponseStatus(HttpStatus.INTERNAL_SERVER_ERROR)
    public Response exceptionHandler(Exception e){
        // do log
        log.error(e.getMessage(), e);

        return new Response(ResponseCode.FAILURE, e.getLocalizedMessage());
    }

    @ExceptionHandler(value = BusinessException.class)
    @ResponseStatus(HttpStatus.OK)
    public Response businessExceptionHandler(BusinessException e){
        // do log
        log.error(e.getMessage(), e);

        return new Response(e.getCode(), e.getLocalizedMessage());
    }
}
