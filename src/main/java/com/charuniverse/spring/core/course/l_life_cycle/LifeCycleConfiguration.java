package com.charuniverse.spring.core.course.l_life_cycle;

import com.charuniverse.spring.core.data.Connection;
import com.charuniverse.spring.core.data.Server;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class LifeCycleConfiguration {

    @Bean
    public Connection connection() {
        return new Connection();
    }

    @Bean
    // @Bean(initMethod = "start", destroyMethod = "stop")
    // initMethod menandakan method yang akan dijalankan setelah bean diinisialisasi
    // destroyMethod menandakan method yang akan dijalankan sebelum bean dihancurkan.
    // initMethod dan destroyMethod tidak wajib jika sudah menambahkan
    // annotation @PostConstruct dan @PreDestroy di class Server.
    public Server server() {
        return new Server();
    }

}
