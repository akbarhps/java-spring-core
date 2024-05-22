package com.charuniverse.spring.core.course.s_qualifier;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(basePackages = {
        "com.charuniverse.spring.core.repository",
        "com.charuniverse.spring.core.service",
        "com.charuniverse.spring.core.configuration",
})
public class QualifierConfiguration {
}
