package com.charuniverse.spring.core.u_factory_bean;

import com.charuniverse.spring.core.client.PaymentGatewayClient;
import com.charuniverse.spring.core.course.u_factory_bean.FactoryBeanConfiguration;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class FactoryBeanTest {

    @Test
    void testFactoryBean() {
        ConfigurableApplicationContext context = new AnnotationConfigApplicationContext(FactoryBeanConfiguration.class);

        PaymentGatewayClient paymentGatewayClient = context.getBean(PaymentGatewayClient.class);
        Assertions.assertNotNull(paymentGatewayClient);
        Assertions.assertEquals("https://payment-gateway.com", paymentGatewayClient.getEndpoint());
        Assertions.assertEquals("private", paymentGatewayClient.getPrivateKey());
        Assertions.assertEquals("public", paymentGatewayClient.getPublicKey());
    }
}
