package com.meowu.starter.web.mvc;

import com.meowu.starter.web.listener.RequestLogListener;
import org.springframework.boot.autoconfigure.condition.ConditionalOnProperty;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class ListenerConfig{

    @ConditionalOnProperty(name = "meowu.web.mvc.log", havingValue = "true")
    @Bean
    public RequestLogListener requestLogListener(){
        return new RequestLogListener();
    }
}
