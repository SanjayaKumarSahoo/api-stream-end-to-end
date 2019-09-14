package com.stream.end.to.end.config;

import com.stream.end.to.end.handler.RequestHandler;
import com.stream.end.to.end.service.StreamService;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class ApplicationBeanConfig {

    @Bean
    public StreamService streamService() {
        return new StreamService();
    }

    @Bean
    public RequestHandler requestHandler(StreamService streamService) {
        return new RequestHandler(streamService);
    }
}
