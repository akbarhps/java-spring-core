package com.charuniverse.spring.core.service;

import com.charuniverse.spring.core.repository.ProductRepository;
import lombok.Getter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

//@Scope("prototype")
//@Lazy
@Component
public class ProductService {

    @Getter
    private ProductRepository productRepository;

    @Autowired
    // @Autowired dibutuhkan jika constructor lebih dari 1
    // jika constructor hanya 1, tidak wajib digunakan
    public ProductService(ProductRepository productRepository) {
        this.productRepository = productRepository;
    }

    public ProductService(ProductRepository productRepository, String name) {
        this.productRepository = productRepository;
    }

}
