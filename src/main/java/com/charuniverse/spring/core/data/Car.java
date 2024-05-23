package com.charuniverse.spring.core.data;

import com.charuniverse.spring.core.aware.IdAware;
import lombok.Getter;

public class Car implements IdAware {

    @Getter
    private String id;

    @Override
    public void setId(String id) {
        this.id = id;
    }
}
