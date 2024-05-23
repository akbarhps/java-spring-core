package com.charuniverse.spring.core.course.za_event_listener;

import com.charuniverse.spring.core.listener.AnotherLoginSuccessListener;
import com.charuniverse.spring.core.listener.LoginSuccessListener;
import com.charuniverse.spring.core.service.UserService;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;

@Configuration
@Import({
        UserService.class,
        LoginSuccessListener.class,
        AnotherLoginSuccessListener.class
})
public class EventListenerConfiguration {
}
