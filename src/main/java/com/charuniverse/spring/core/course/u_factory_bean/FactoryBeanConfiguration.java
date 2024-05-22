package com.charuniverse.spring.core.course.u_factory_bean;

import com.charuniverse.spring.core.factory.PaymentGatewayClientFactoryBean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;

@Configuration
@Import({
        PaymentGatewayClientFactoryBean.class
})
public class FactoryBeanConfiguration {
}
