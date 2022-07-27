package com.example.marketplace.services;

import com.example.marketplace.repository.ProductRepository;
import com.example.marketplace.services.base.BaseService;
import org.springframework.stereotype.Service;
import org.springframework.beans.factory.annotation.Autowired;

@Service
public class ProductService extends BaseService {

    private final ProductRepository repository;

    public ProductService(ProductRepository repository) {
        this.repository = repository;
    }

    @Override
    public void start() {
        System.out.println("start second service");

        this.repository.findAll();
    }

    @Override
    public void stop() {
        System.out.println("stop second service");
    }
}
