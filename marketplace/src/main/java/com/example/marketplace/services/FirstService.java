package com.example.marketplace.services;

import com.example.marketplace.repository.UserRepository;
import com.example.marketplace.services.base.BaseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service
public class FirstService extends BaseService {


    @Autowired
    private UserRepository repository;

    @Override
    public void start() {
        System.out.println("start first service");
    }

    @Override
    public void stop() {
        System.out.println("stop first service");
    }
}
