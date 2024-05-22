package com.charuniverse.spring.core.v_inheritance;

import com.charuniverse.spring.core.course.v_inheritance.InheritanceConfiguration;
import com.charuniverse.spring.core.service.MerchantService;
import com.charuniverse.spring.core.service.MerchantServiceImpl;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class InheritanceTest {

    @Test
    void testInheritance() {
        ConfigurableApplicationContext context = new AnnotationConfigApplicationContext(InheritanceConfiguration.class);

        MerchantService merchantService = context.getBean(MerchantService.class);
        MerchantServiceImpl merchantServiceImpl = context.getBean(MerchantServiceImpl.class);

        Assertions.assertNotNull(merchantService);
        Assertions.assertNotNull(merchantServiceImpl);
        Assertions.assertSame(merchantServiceImpl, merchantService);
    }

}
