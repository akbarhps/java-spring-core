package com.charuniverse.spring.core.course.f_bean_name;

import com.charuniverse.spring.core.data.Foo;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;

@Configuration
public class NameConfiguration {

    @Bean(name = "firstFoo")
    @Primary
    public Foo foo1() {
        Foo foo = new Foo();
        return foo;
    }

    @Bean(name = "secondFoo")
    public Foo foo2() {
        Foo foo = new Foo();
        return foo;
    }

}
