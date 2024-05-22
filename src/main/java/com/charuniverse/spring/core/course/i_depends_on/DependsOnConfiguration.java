package com.charuniverse.spring.core.course.i_depends_on;

import com.charuniverse.spring.core.data.Bar;
import com.charuniverse.spring.core.data.Foo;
import lombok.extern.slf4j.Slf4j;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.DependsOn;

@Slf4j
@Configuration
public class DependsOnConfiguration {

    @Bean
    @DependsOn(value = {"bar"})
    // @DependsOn menandakan bahwa bean foo bergantung pada bean bar
    // Jadi, bean bar akan dibuat terlebih dahulu sebelum bean foo
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
