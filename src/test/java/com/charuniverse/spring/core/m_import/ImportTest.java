package com.charuniverse.spring.core.m_import;

import com.charuniverse.spring.core.course.m_import.ImportConfiguration;
import com.charuniverse.spring.core.data.Bar;
import com.charuniverse.spring.core.data.Foo;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class ImportTest {

    private ConfigurableApplicationContext context;

    @BeforeEach
    void setUp() {
        context = new AnnotationConfigApplicationContext(ImportConfiguration.class);
        context.registerShutdownHook();
    }

    @Test
    void testImport() {
        Foo foo = context.getBean(Foo.class);
        Bar bar = context.getBean(Bar.class);

        Assertions.assertNotNull(foo);
        Assertions.assertNotNull(bar);
    }
}
