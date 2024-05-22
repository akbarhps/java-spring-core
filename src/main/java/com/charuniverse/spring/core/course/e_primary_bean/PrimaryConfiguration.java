package com.charuniverse.spring.core.course.e_primary_bean;

import com.charuniverse.spring.core.data.Foo;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;

@Configuration
public class PrimaryConfiguration {

    @Bean
    @Primary
    // @Primary berguna untuk menandakan bahwa bean ini adalah bean utama
    // jika ada dua bean dengan tipe yang sama, maka bean ini yang akan dipilih
    // jika tidak ada @Primary, maka akan terjadi error NoUniqueBeanDefinitionException
    public Foo foo1() {
        Foo foo = new Foo();
        return foo;
    }

    @Bean
    public Foo foo2() {
        Foo foo = new Foo();
        return foo;
    }

}
