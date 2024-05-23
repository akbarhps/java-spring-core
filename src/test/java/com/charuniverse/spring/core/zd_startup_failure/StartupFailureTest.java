package com.charuniverse.spring.core.zd_startup_failure;

import com.charuniverse.spring.core.application.FooAplication;
import org.junit.jupiter.api.Test;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class StartupFailureTest {

    private ConfigurableApplicationContext context;

    @Test
    void testFoo() {
        context = new AnnotationConfigApplicationContext(FooAplication.class);
    }
}
