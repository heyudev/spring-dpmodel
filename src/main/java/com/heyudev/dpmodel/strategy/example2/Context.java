package com.heyudev.dpmodel.strategy.example2;

import org.springframework.stereotype.Component;

import java.util.EnumMap;
import java.util.Map;

@Component
public class Context {
    private final Map<Type, Strategy> typeStrategyMap = new EnumMap<>(Type.class);

    public void execute(Type type) {
        Strategy strategy = typeStrategyMap.get(type);
        strategy.execute();
    }
}
