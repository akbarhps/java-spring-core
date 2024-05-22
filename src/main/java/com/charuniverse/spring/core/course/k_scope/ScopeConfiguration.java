package com.charuniverse.spring.core.course.k_scope;

import com.charuniverse.spring.core.data.Bar;
import com.charuniverse.spring.core.data.Foo;
import com.charuniverse.spring.core.scope.DoubletonScope;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.config.CustomScopeConfigurer;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;

@Slf4j
@Configuration
public class ScopeConfiguration {

    @Bean
    @Scope("prototype")
    // @Scope berfungsi untuk mengatur scope dari bean
    // singleton   = membuat bean hanya sekali dalam Spring IoC Container (default)
    // prototype   = membuat bean setiap kali diambil dari Spring IoC Container
    // request     = membuat bean setiap kali ada request HTTP
    // session     = membuat bean setiap kali ada session HTTP
    // application = membuat bean hanya sekali dalam ServletContext
    // websocket   = membuat bean hanya sekali dalam WebSocket
    public Bar bar() {
        log.info("Creating bar");
        return new Bar();
    }

    @Bean
    public CustomScopeConfigurer customScopeConfigurer() {
        CustomScopeConfigurer configurer = new CustomScopeConfigurer();
        configurer.addScope("doubleton", new DoubletonScope());
        return configurer;
    }

    @Bean
    @Scope("doubleton")
    public Foo foo() {
        log.info("Creating foo");
        return new Foo();
    }


}
