package com.example.marketplace.services;

import com.example.marketplace.services.base.BaseService;
import org.springframework.stereotype.Service;


@Service
public class FirstService extends BaseService {
    @Override
    public void start() {
        System.out.println("start first service");
    }

    @Override
    public void stop() {
        System.out.println("stop first service");
    }
}
