package com.charuniverse.spring.core.course.m_import;

import com.charuniverse.spring.core.data.Bar;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class BarConfiguration {

    @Bean
    public Bar bar() {
        return new Bar();
    }

}
