package com.charuniverse.spring.core.f_bean_name;

import com.charuniverse.spring.core.course.f_bean_name.NameConfiguration;
import com.charuniverse.spring.core.data.Foo;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class BeanNameTest {

    private ApplicationContext context;

    @BeforeEach
    void setUp() {
        context = new AnnotationConfigApplicationContext(NameConfiguration.class);
    }

    @Test
    void testGetBeanByName() {
        Foo foo = context.getBean(Foo.class);
        Foo foo1 = context.getBean("firstFoo", Foo.class);
        Foo foo2 = context.getBean("secondFoo", Foo.class);

        Assertions.assertSame(foo, foo1);
        Assertions.assertNotSame(foo, foo2);
    }
}
