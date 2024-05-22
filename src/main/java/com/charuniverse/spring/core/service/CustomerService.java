package com.charuniverse.spring.core.service;

import com.charuniverse.spring.core.repository.CustomerRepository;
import lombok.Getter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

//@Scope("prototype")
//@Lazy
@Component
public class CustomerService {

    @Getter
    @Autowired
    private CustomerRepository customerRepository;

}
