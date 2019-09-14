package com.stream.end.to.end.service;

import lombok.extern.slf4j.Slf4j;
import reactor.core.publisher.Flux;

import java.util.stream.LongStream;
import java.util.stream.Stream;

@Slf4j
public class StreamService {

    public Flux<SampleData> streamData() {
        log.info("Calling to streams data");
        Stream<SampleData> stream = LongStream.range(1, 10000000000L).mapToObj(i -> {
            SampleData sampleData = new SampleData();
            sampleData.setCount(i);
            sampleData.setEpoch(System.currentTimeMillis());
            return sampleData;
        });
        return Flux.fromStream(stream);
    }
}
