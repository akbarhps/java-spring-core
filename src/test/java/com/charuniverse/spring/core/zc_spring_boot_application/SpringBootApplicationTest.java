package com.charuniverse.spring.core.zc_spring_boot_application;

import com.charuniverse.spring.core.application.FooAplication;
import com.charuniverse.spring.core.data.Foo;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest(classes = FooAplication.class)
public class SpringBootApplicationTest {

    @Autowired
    Foo foo;

    @Test
    void testSpringBoot() {
        Assertions.assertNotNull(foo);
    }
}
