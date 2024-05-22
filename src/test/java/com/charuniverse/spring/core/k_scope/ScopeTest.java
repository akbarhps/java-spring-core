package com.charuniverse.spring.core.k_scope;

import com.charuniverse.spring.core.course.k_scope.ScopeConfiguration;
import com.charuniverse.spring.core.data.Bar;
import com.charuniverse.spring.core.data.Foo;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class ScopeTest {

    ApplicationContext context;

    @BeforeEach
    void setUp() {
        context = new AnnotationConfigApplicationContext(ScopeConfiguration.class);
    }

    @Test
    void testBeanScope() {
        Foo foo1 = context.getBean(Foo.class);
        Foo foo2 = context.getBean(Foo.class);
        Assertions.assertNotSame(foo1, foo2);

        Bar bar1 = context.getBean(Bar.class);
        Bar bar2 = context.getBean(Bar.class);
        Assertions.assertNotSame(bar1, bar2);
    }

    @Test
    void testBeanDoubletonScope() {
        Foo foo1 = context.getBean(Foo.class);
        Foo foo2 = context.getBean(Foo.class);
        Assertions.assertNotSame(foo1, foo2);

        Foo foo3 = context.getBean(Foo.class);
        Foo foo4 = context.getBean(Foo.class);
        Assertions.assertNotSame(foo3, foo4);

        Assertions.assertSame(foo1, foo3);
        Assertions.assertSame(foo2, foo4);
    }
}
