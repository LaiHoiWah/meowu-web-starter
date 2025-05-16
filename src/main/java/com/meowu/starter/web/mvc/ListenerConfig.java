package com.meowu.starter.web.mvc;

import com.meowu.starter.web.listener.RequestLogListener;
import org.springframework.boot.autoconfigure.condition.ConditionalOnProperty;
import org.springframework.context.ApplicationListener;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class ListenerConfig{

    @ConditionalOnProperty(name = "meowu.web.request-log.enabled", havingValue = "true")
    @Bean
    public ApplicationListener<?> requestLogListener(){
        return new RequestLogListener();
    }
}
