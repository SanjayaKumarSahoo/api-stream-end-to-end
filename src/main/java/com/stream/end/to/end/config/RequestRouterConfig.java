package com.stream.end.to.end.config;

import com.stream.end.to.end.handler.RequestHandler;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.reactive.function.server.RequestPredicates;
import org.springframework.web.reactive.function.server.RouterFunction;
import org.springframework.web.reactive.function.server.RouterFunctions;

@Configuration
public class RequestRouterConfig {

    @Bean
    public RouterFunction<?> routes(RequestHandler requestHandler) {
        return RouterFunctions.route(RequestPredicates
                .GET("/stream"), requestHandler::streamData);

    }
}
