package com.charuniverse.spring.core.course.q_setter_based_di;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(basePackages = {
        "com.charuniverse.spring.core.service",
        "com.charuniverse.spring.core.repository"
})
public class SetterBasedDIConfiguration {
}
