package com.example.marketplace.events;

import com.example.marketplace.services.base.BaseService;
import org.springframework.context.ApplicationEvent;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.Collection;

public class StageReadyEvent extends ApplicationEvent {
    public StageReadyEvent(Object context) {
        super(context);

        System.out.println("Try to start all services");

        var factory = ((ConfigurableApplicationContext) source).getBeanFactory();
        Collection<BaseService> interfaces = factory.getBeansOfType(BaseService.class).values();

        interfaces.forEach(BaseService::start);

        System.out.println("All services was started");
    }
}
