package com.heyudev.dpmodel.strategy.example2;

import org.springframework.stereotype.Component;

/**
 * @author heyudev
 */
@Component
public class StrategyB implements Strategy {

    @Override
    public Type type() {
        return Type.B;
    }

    @Override
    public void execute() {
        System.out.println("execute B strategy");
    }
}
