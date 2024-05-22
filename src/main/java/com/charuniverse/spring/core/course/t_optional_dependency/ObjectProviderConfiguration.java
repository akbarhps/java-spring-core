package com.charuniverse.spring.core.course.t_optional_dependency;

import com.charuniverse.spring.core.data.MultiFoo;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;

@Configuration
@Import(MultiFoo.class)
@ComponentScan(basePackages = {
        "com.charuniverse.spring.core.repository",
        "com.charuniverse.spring.core.service",
        "com.charuniverse.spring.core.configuration",
})
public class ObjectProviderConfiguration {

}
