package com.charuniverse.spring.core.i_depends_on;

import com.charuniverse.spring.core.course.i_depends_on.DependsOnConfiguration;
import com.charuniverse.spring.core.data.Bar;
import com.charuniverse.spring.core.data.Foo;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class DependsOnTest {

    @Test
    void testDependsOn() {
        ApplicationContext context = new AnnotationConfigApplicationContext(DependsOnConfiguration.class);

        Foo foo = context.getBean(Foo.class);
        Bar bar = context.getBean(Bar.class);

        Assertions.assertNotNull(foo);
        Assertions.assertNotNull(bar);
    }

}
