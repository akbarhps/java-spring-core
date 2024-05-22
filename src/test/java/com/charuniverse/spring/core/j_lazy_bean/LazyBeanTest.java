package com.charuniverse.spring.core.j_lazy_bean;

import com.charuniverse.spring.core.course.j_lazy_bean.LazyBeanConfiguration;
import com.charuniverse.spring.core.data.Bar;
import com.charuniverse.spring.core.data.Foo;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class LazyBeanTest {

    ApplicationContext context;

    @BeforeEach
    void setUp() {
        context = new AnnotationConfigApplicationContext(LazyBeanConfiguration.class);
    }

    @Test
    void testLazyBeanFooShouldNotBeInitialized() {
        Bar bar = context.getBean(Bar.class);
        Assertions.assertNotNull(bar);
    }

    @Test
    void testLazyBean() {
        Foo foo = context.getBean(Foo.class);
        Bar bar = context.getBean(Bar.class);

        Assertions.assertNotNull(foo);
        Assertions.assertNotNull(bar);
    }
}
