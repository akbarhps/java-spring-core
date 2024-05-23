package com.charuniverse.spring.core.course.z_bean_factory_post_processor;

import com.charuniverse.spring.core.processor.FooBeanFactoryPostProcessor;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;

@Configuration
@Import({
        FooBeanFactoryPostProcessor.class,
})
public class BeanFactoryPostProcessorConfiguration {
}
