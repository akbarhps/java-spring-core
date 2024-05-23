package com.charuniverse.spring.core.zb_event_listener_annotation;

import com.charuniverse.spring.core.course.zb_event_listener_annotation.EventListenerAnnotationConfiguration;
import com.charuniverse.spring.core.service.UserService;
import org.junit.jupiter.api.Test;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class EventListenerAnnotationTest {

    @Test
    void testEventListenerAnnotation() {
        ConfigurableApplicationContext context = new AnnotationConfigApplicationContext(EventListenerAnnotationConfiguration.class);
        UserService userService = context.getBean(UserService.class);

        userService.login("akbar", "gemink");
        userService.login("admin", "admin");
    }
}
