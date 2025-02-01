package com.meowu.starter.web.listener;

import lombok.extern.slf4j.Slf4j;
import org.springframework.context.ApplicationListener;
import org.springframework.web.context.support.ServletRequestHandledEvent;

@Slf4j
public class RequestLogListener implements ApplicationListener<ServletRequestHandledEvent>{

    @Override
    public void onApplicationEvent(ServletRequestHandledEvent event){
        String url = event.getRequestUrl();
        String method = event.getMethod();
        String client = event.getClientAddress();
        long processTime = event.getProcessingTimeMillis();

        log.info("Request URL: {}, Http Method: {}, Client Address: {}, Processing Time Millis: {}", url, method, client, processTime);
    }
}
