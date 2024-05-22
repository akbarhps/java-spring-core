package com.charuniverse.spring.core.course.n_component_scan;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(basePackages = {
        "com.charuniverse.spring.core.configuration"
})
public class ComponentScanConfiguration {
}
