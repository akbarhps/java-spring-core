package com.charuniverse.spring.core.course.v_inheritance;

import com.charuniverse.spring.core.service.MerchantServiceImpl;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;

@Configuration
@Import(MerchantServiceImpl.class)
public class InheritanceConfiguration {
}
