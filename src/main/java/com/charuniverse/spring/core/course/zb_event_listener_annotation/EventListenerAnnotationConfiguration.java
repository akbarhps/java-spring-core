package com.charuniverse.spring.core.course.zb_event_listener_annotation;

import com.charuniverse.spring.core.listener.UserListener;
import com.charuniverse.spring.core.service.UserService;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;

@Configuration
@Import({
        UserService.class,
        UserListener.class,
})
public class EventListenerAnnotationConfiguration {
}
