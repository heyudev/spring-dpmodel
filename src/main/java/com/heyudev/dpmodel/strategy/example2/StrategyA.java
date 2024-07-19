package com.heyudev.dpmodel.strategy.example2;

import org.springframework.stereotype.Component;

/**
 * @author heyudev
 */
@Component
public class StrategyA implements Strategy {

    @Override
    public Type type() {
        return Type.A;
    }

    @Override
    public void execute() {
        System.out.println("execute A strategy");
    }
}
