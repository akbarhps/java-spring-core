package com.charuniverse.spring.core.s_qualifier;

import com.charuniverse.spring.core.course.s_qualifier.QualifierConfiguration;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class QualifierTest {

    ConfigurableApplicationContext context;

    @BeforeEach
    void setUp() {
        context = new AnnotationConfigApplicationContext(QualifierConfiguration.class);
    }

    @Test
    void testQualifier() {

    }
}
