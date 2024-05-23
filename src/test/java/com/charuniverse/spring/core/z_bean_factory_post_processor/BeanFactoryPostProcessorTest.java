package com.charuniverse.spring.core.z_bean_factory_post_processor;

import com.charuniverse.spring.core.course.z_bean_factory_post_processor.BeanFactoryPostProcessorConfiguration;
import com.charuniverse.spring.core.data.Foo;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class BeanFactoryPostProcessorTest {

    @Test
    void testBeanFactoryPostProcessor() {
        ConfigurableApplicationContext context = new AnnotationConfigApplicationContext(BeanFactoryPostProcessorConfiguration.class);

        Foo foo = context.getBean(Foo.class);
        Assertions.assertNotNull(foo);
    }
}
