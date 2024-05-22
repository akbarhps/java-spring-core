package com.charuniverse.spring.core.n_component_scan;

import com.charuniverse.spring.core.course.n_component_scan.ComponentScanConfiguration;
import com.charuniverse.spring.core.data.Bar;
import com.charuniverse.spring.core.data.Foo;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class ComponentScanTest {

    private ConfigurableApplicationContext context;

    @BeforeEach
    void setUp() {
        context = new AnnotationConfigApplicationContext(ComponentScanConfiguration.class);
        context.registerShutdownHook();
    }

    @Test
    void testComponentScan() {
        Foo foo = context.getBean(Foo.class);
        Bar bar = context.getBean(Bar.class);

        Assertions.assertNotNull(foo);
        Assertions.assertNotNull(bar);
    }
}
