package com.charuniverse.spring.core.course.m_import;

import com.charuniverse.spring.core.configuration.BarConfiguration;
import com.charuniverse.spring.core.configuration.FooConfiguration;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;

@Configuration
@Import({
        FooConfiguration.class,
        BarConfiguration.class
})
public class ImportConfiguration {
}
