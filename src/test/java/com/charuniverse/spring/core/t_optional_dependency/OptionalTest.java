package com.charuniverse.spring.core.t_optional_dependency;

import com.charuniverse.spring.core.course.t_optional_dependency.ObjectProviderConfiguration;
import com.charuniverse.spring.core.course.t_optional_dependency.OptionalConfiguration;
import com.charuniverse.spring.core.data.Foo;
import com.charuniverse.spring.core.data.FooBar;
import com.charuniverse.spring.core.data.MultiFoo;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class OptionalTest {

    @Test
    void testOptional() {
        ConfigurableApplicationContext context = new AnnotationConfigApplicationContext(OptionalConfiguration.class);
        Foo foo = context.getBean(Foo.class);
        FooBar fooBar = context.getBean(FooBar.class);

        Assertions.assertNull(fooBar.getBar());
        Assertions.assertSame(foo, fooBar.getFoo());
    }

    @Test
    void testObjectProvider() {
        ConfigurableApplicationContext context = new AnnotationConfigApplicationContext(ObjectProviderConfiguration.class);
        MultiFoo multiFoo = context.getBean(MultiFoo.class);
        Assertions.assertEquals(3, multiFoo.getFoos().size());
    }
}
