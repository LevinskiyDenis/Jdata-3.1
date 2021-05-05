package com.example.jdata3_1.Service;

import com.example.jdata3_1.Repository.Repository;

@org.springframework.stereotype.Service
public class Service {

    private final Repository repository;

    public Service(Repository repository) {
        this.repository = repository;
    }

    public String fetchProductByName(String name) {
        return repository.fetchByName(name);
    }

}
