package com.charuniverse.spring.core.o_component;

import com.charuniverse.spring.core.course.o_component.ComponentConfiguration;
import com.charuniverse.spring.core.service.ProductService;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class ComponentTest {

    private ConfigurableApplicationContext context;

    @BeforeEach
    void setUp() {
        context = new AnnotationConfigApplicationContext(ComponentConfiguration.class);
        context.registerShutdownHook();
    }

    @Test
    void testComponent() {
        ProductService service = context.getBean(ProductService.class);
        Assertions.assertNotNull(service);

        ProductService service2 = context.getBean("productService", ProductService.class);
        Assertions.assertNotNull(service2);

        Assertions.assertSame(service, service2);
    }
}
