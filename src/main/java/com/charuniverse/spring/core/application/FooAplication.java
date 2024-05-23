package com.charuniverse.spring.core.application;

import com.charuniverse.spring.core.data.Foo;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class FooAplication {

    public static void main(String[] args) {
        ConfigurableApplicationContext context = SpringApplication.run(FooAplication.class, args);

        Foo foo = context.getBean(Foo.class);
        System.out.println(foo);
    }

    @Bean
    public Foo foo() {
        return new Foo();
    }
}
