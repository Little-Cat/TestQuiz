package com.example.marketplace.services;

import com.example.marketplace.services.base.BaseService;
import org.springframework.stereotype.Service;

@Service
public class SecondService extends BaseService {
    @Override
    public void start() {
        System.out.println("start second service");
    }

    @Override
    public void stop() {
        System.out.println("stop second service");
    }
}
