package com.charuniverse.spring.core.course.c_bean;

import com.charuniverse.spring.core.data.Foo;
import lombok.extern.slf4j.Slf4j;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Slf4j
@Configuration
public class BeanConfiguration {

    @Bean
    // @Bean menandakan bahwa method ini akan menghasilkan sebuah bean
    // @Bean ini akan di-manage oleh Spring IoC Container
    // @Bean hanya akan dibuat sekali, dan Spring akan menyimpannya di dalam kontainer
    public Foo foo() {
        Foo foo = new Foo();
        log.info("Creating new Foo");
        return foo;
    }

}
