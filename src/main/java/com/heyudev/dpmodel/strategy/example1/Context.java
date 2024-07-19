package com.heyudev.dpmodel.strategy.example1;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.Map;

@Component
public class Context {
    @Autowired
    private Map<String, Strategy> strategyMap;

    public void execute(String beanName) {
        Strategy strategy = strategyMap.get(beanName);
        strategy.execute();
    }
}
