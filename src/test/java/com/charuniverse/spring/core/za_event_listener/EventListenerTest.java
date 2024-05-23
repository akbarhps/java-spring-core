package com.charuniverse.spring.core.za_event_listener;

import com.charuniverse.spring.core.course.za_event_listener.EventListenerConfiguration;
import com.charuniverse.spring.core.service.UserService;
import org.junit.jupiter.api.Test;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class EventListenerTest {

    @Test
    void testEventListener() {
        ConfigurableApplicationContext context = new AnnotationConfigApplicationContext(EventListenerConfiguration.class);
        UserService userService = context.getBean(UserService.class);

        userService.login("akbar", "gemink");
        userService.login("admin", "admin");
    }
}
