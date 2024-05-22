package com.charuniverse.spring.core.h_cyclic_dependency;

import com.charuniverse.spring.core.course.h_cyclic_dependency.CyclicConfiguration;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class CyclicDependencyTest {

    @Test
    void testCyclic() {
        Assertions.assertThrows(Throwable.class, () -> new AnnotationConfigApplicationContext(CyclicConfiguration.class));
    }
}
