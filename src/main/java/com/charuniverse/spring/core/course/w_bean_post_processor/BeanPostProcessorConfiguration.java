package com.charuniverse.spring.core.course.w_bean_post_processor;

import com.charuniverse.spring.core.data.Car;
import com.charuniverse.spring.core.processor.IdGeneratorBeanPostProcessor;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;

@Configuration
@Import({
        Car.class,
        IdGeneratorBeanPostProcessor.class,
})
public class BeanPostProcessorConfiguration {
}
