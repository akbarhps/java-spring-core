package com.charuniverse.spring.core.course.m_import;

import com.charuniverse.spring.core.data.Foo;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class FooConfiguration {

    @Bean
    public Foo foo() {
        return new Foo();
    }

}
