package com.charuniverse.spring.core.course.x_ordered_bean_post_processor;

import com.charuniverse.spring.core.data.Car;
import com.charuniverse.spring.core.processor.IdGeneratorBeanPostProcessor;
import com.charuniverse.spring.core.processor.PrefixIdGeneratorBeanPostProcessor;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;

@Configuration
@Import({
        Car.class,
        IdGeneratorBeanPostProcessor.class,
        PrefixIdGeneratorBeanPostProcessor.class,
})
public class OrderedBeanPostProcessorConfiguration {
}
