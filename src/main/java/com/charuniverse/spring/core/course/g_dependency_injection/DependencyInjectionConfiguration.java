package com.charuniverse.spring.core.course.g_dependency_injection;

import com.charuniverse.spring.core.data.Bar;
import com.charuniverse.spring.core.data.Foo;
import com.charuniverse.spring.core.data.FooBar;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;

@Configuration
public class DependencyInjectionConfiguration {

    @Primary
    @Bean(name = "firstFoo")
    public Foo firstFoo() {
        Foo foo = new Foo();
        return foo;
    }

    @Bean(name = "secondFoo")
    public Foo secondFoo() {
        Foo foo = new Foo();
        return foo;
    }

    @Bean
    public Bar bar() {
        Bar bar = new Bar();
        return bar;
    }

    @Bean
    // @Qualifier berguna untuk memilih bean yang akan diinject berdasarkan nama bean
    public FooBar fooBar(@Qualifier("secondFoo") Foo foo, Bar bar) {
        FooBar fooBar = new FooBar(foo, bar);
        return fooBar;
    }

}
