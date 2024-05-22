package com.charuniverse.spring.core.data;

import jakarta.annotation.PostConstruct;
import jakarta.annotation.PreDestroy;
import lombok.extern.slf4j.Slf4j;

@Slf4j
public class Server {

    @PostConstruct
    // @PostConstruct menandakan bahwa method ini akan dijalankan setelah bean diinisialisasi
    public void start() {
        log.info("Starting server");
    }

    @PreDestroy
    // @PreDestroy menandakan bahwa method ini akan dijalankan sebelum bean dihancurkan
    public void stop() {
        log.info("Stopping server");
    }

}
