package com.meowu.starter.web.mvc;

import com.google.gson.Gson;
import com.meowu.starter.commons.utils.GsonUtils;
import org.springframework.boot.autoconfigure.condition.ConditionalOnProperty;
import org.springframework.boot.autoconfigure.http.HttpMessageConverters;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.http.converter.StringHttpMessageConverter;
import org.springframework.http.converter.json.GsonHttpMessageConverter;

import java.nio.charset.StandardCharsets;

@Configuration
public class HttpMessageConverterConfig{

    @ConditionalOnProperty(name = "meowu.web.mvc.converter", havingValue = "gson")
    @Bean
    public HttpMessageConverters gsonConverter(){
        // gson convert
        GsonHttpMessageConverter converter = new GsonHttpMessageConverter();
        converter.setDefaultCharset(StandardCharsets.UTF_8);
        converter.setGson(GsonUtils.getBuilder().create());

        return new HttpMessageConverters(converter);
    }

    @ConditionalOnProperty(name = "meowu.web.mvc.converter", havingValue = "string")
    @Bean
    public HttpMessageConverters stringConverter(){
        // string convert
        StringHttpMessageConverter converter = new StringHttpMessageConverter();
        converter.setDefaultCharset(StandardCharsets.UTF_8);

        return new HttpMessageConverters(converter);
    }
}
