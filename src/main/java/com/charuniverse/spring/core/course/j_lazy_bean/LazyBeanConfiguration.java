package com.charuniverse.spring.core.course.j_lazy_bean;

import com.charuniverse.spring.core.data.Bar;
import com.charuniverse.spring.core.data.Foo;
import lombok.extern.slf4j.Slf4j;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.DependsOn;
import org.springframework.context.annotation.Lazy;

@Slf4j
@Configuration
public class LazyBeanConfiguration {

    @Bean
    @DependsOn(value = {"bar"})
    @Lazy
    // @Lazy mengindikasikan bahwa bean ini tidak akan dibuat jika tidak dipanggil
    // dan akan dibuat ketika bean ini dipanggil
    public Foo foo() {
        log.info("Creating foo");
        return new Foo();
    }

    @Bean
    public Bar bar() {
        log.info("Creating bar");
        return new Bar();
    }

}
