package com.charuniverse.spring.core.w_bean_post_processor;

import com.charuniverse.spring.core.course.w_bean_post_processor.BeanPostProcessorConfiguration;
import com.charuniverse.spring.core.data.Car;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class BeanPostProcessorTest {

    @Test
    void testBeanPostProcessor() {
        ConfigurableApplicationContext context = new AnnotationConfigApplicationContext(BeanPostProcessorConfiguration.class);

        Car car = context.getBean(Car.class);
        System.out.println(car.getId());
        Assertions.assertNotNull(car.getId());
    }

}
