package com.charuniverse.spring.core.r_field_based_di;

import com.charuniverse.spring.core.course.r_field_based_di.FieldBasedDIConfiguration;
import com.charuniverse.spring.core.repository.CustomerRepository;
import com.charuniverse.spring.core.service.CustomerService;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class FieldBasedDITest {

    ConfigurableApplicationContext context;

    @BeforeEach
    void setUp() {
        context = new AnnotationConfigApplicationContext(FieldBasedDIConfiguration.class);
    }

    @Test
    void testSetterBasedDI() {
        CustomerService service = context.getBean(CustomerService.class);

        CustomerRepository normalCustomerRepository = context.getBean("normalCustomerRepository", CustomerRepository.class);
        CustomerRepository premiumCustomerRepository = context.getBean("premiumCustomerRepository", CustomerRepository.class);

        Assertions.assertSame(normalCustomerRepository, service.getNormalCustomerRepository());
        Assertions.assertSame(premiumCustomerRepository, service.getPremiumCustomerRepository());
    }
}
