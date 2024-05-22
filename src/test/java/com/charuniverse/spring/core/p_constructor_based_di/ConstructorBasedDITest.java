package com.charuniverse.spring.core.p_constructor_based_di;

import com.charuniverse.spring.core.course.p_constructor_based_di.ConstructorBasedDIConfiguration;
import com.charuniverse.spring.core.repository.ProductRepository;
import com.charuniverse.spring.core.service.ProductService;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class ConstructorBasedDITest {

    ConfigurableApplicationContext context;

    @BeforeEach
    void setUp() {
        context = new AnnotationConfigApplicationContext(ConstructorBasedDIConfiguration.class);
        context.registerShutdownHook();
    }

    @Test
    void testConstructorBasedDI() {
        ProductService service = context.getBean(ProductService.class);
        ProductRepository repository = context.getBean(ProductRepository.class);

        Assertions.assertSame(repository, service.getProductRepository());
    }
}
