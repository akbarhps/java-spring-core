package com.charuniverse.spring.core.y_aware;

import com.charuniverse.spring.core.course.y_aware.AwareConfiguration;
import com.charuniverse.spring.core.service.AuthService;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class AwareTest {

    @Test
    void testAware() {
        ConfigurableApplicationContext context = new AnnotationConfigApplicationContext(AwareConfiguration.class);

        AuthService service = context.getBean(AuthService.class);

        Assertions.assertEquals("com.charuniverse.spring.core.service.AuthService", service.getBeanName());
        Assertions.assertEquals(context, service.getApplicationContext());
    }
}
