package com.charuniverse.spring.core.x_ordered_bean_post_processor;

import com.charuniverse.spring.core.course.x_ordered_bean_post_processor.OrderedBeanPostProcessorConfiguration;
import com.charuniverse.spring.core.data.Car;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class OrderedBeanPostProcessorTest {

    @Test
    void testOrderedPostProcessor() {
        ConfigurableApplicationContext context = new AnnotationConfigApplicationContext(OrderedBeanPostProcessorConfiguration.class);

        Car car = context.getBean(Car.class);
        System.out.println(car.getId());

        Assertions.assertNotNull(car.getId());
        Assertions.assertTrue(car.getId().startsWith("PREFIX-"));
    }
}
