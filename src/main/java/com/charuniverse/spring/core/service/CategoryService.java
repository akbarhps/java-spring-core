package com.charuniverse.spring.core.service;

import com.charuniverse.spring.core.repository.CategoryRepository;
import lombok.Getter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

//@Scope("prototype")
//@Lazy
@Component
public class CategoryService {

    @Getter
    private CategoryRepository categoryRepository;

    @Autowired
    // disini kita menggunakan setter function sebagai
    // dependency injection dari CategoryRepository
    public void setCategoryService(CategoryRepository categoryRepository) {
        this.categoryRepository = categoryRepository;
    }

}
