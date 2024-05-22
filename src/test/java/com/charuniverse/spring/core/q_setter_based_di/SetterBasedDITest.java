package com.charuniverse.spring.core.q_setter_based_di;

import com.charuniverse.spring.core.course.q_setter_based_di.SetterBasedDIConfiguration;
import com.charuniverse.spring.core.repository.CategoryRepository;
import com.charuniverse.spring.core.service.CategoryService;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class SetterBasedDITest {

    ConfigurableApplicationContext context;

    @BeforeEach
    void setUp() {
        context = new AnnotationConfigApplicationContext(SetterBasedDIConfiguration.class);
    }

    @Test
    void testSetterBasedDI() {
        CategoryService service = context.getBean(CategoryService.class);
        CategoryRepository repository = context.getBean(CategoryRepository.class);

        Assertions.assertSame(repository, service.getCategoryRepository());
    }
}
