package com.stream.end.to.end.handler;

import com.stream.end.to.end.service.SampleData;
import com.stream.end.to.end.service.StreamService;
import org.springframework.http.MediaType;
import org.springframework.web.reactive.function.server.ServerRequest;
import org.springframework.web.reactive.function.server.ServerResponse;
import reactor.core.publisher.Mono;

public class RequestHandler {

    private final StreamService streamService;

    public RequestHandler(StreamService streamService) {
        this.streamService = streamService;
    }

    public Mono<ServerResponse> streamData(ServerRequest request) {
        return ServerResponse.ok()
                .contentType(MediaType.TEXT_EVENT_STREAM)
                .body(streamService.streamData(), SampleData.class);
    }
}