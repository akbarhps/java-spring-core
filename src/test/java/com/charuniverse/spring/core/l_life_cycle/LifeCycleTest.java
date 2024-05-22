package com.charuniverse.spring.core.l_life_cycle;

import com.charuniverse.spring.core.course.l_life_cycle.LifeCycleConfiguration;
import com.charuniverse.spring.core.data.Connection;
import com.charuniverse.spring.core.data.Server;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class LifeCycleTest {

    ConfigurableApplicationContext context;

    @BeforeEach
    void setUp() {
        context = new AnnotationConfigApplicationContext(LifeCycleConfiguration.class);
        context.registerShutdownHook();
    }

    @AfterEach
    void tearDown() {
        // manually close the context to trigger destroy method
//        context.close();
    }

    @Test
    void testConnection() {
        Connection connection = context.getBean(Connection.class);
    }

    @Test
    void testServer() {
        Server server = context.getBean(Server.class);
    }

}
