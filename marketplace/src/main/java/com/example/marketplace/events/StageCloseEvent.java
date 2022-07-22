package com.example.marketplace.events;

import com.example.marketplace.services.base.BaseService;
import org.springframework.context.ApplicationEvent;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.Collection;

public class StageCloseEvent extends ApplicationEvent {
    public StageCloseEvent(Object context) {
        super(context);

        System.out.println("Try to stop all services");

        var factory = ((ConfigurableApplicationContext) source).getBeanFactory();
        Collection<BaseService> interfaces = factory.getBeansOfType(BaseService.class).values();
        interfaces.forEach(BaseService::stop);

        System.out.println("All services was stopped");
    }
}
