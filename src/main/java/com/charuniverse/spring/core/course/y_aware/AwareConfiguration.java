package com.charuniverse.spring.core.course.y_aware;

import com.charuniverse.spring.core.service.AuthService;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;

@Configuration
@Import({
        AuthService.class,
})
public class AwareConfiguration {
}
