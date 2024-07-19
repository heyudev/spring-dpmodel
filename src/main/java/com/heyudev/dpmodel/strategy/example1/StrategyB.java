package com.heyudev.dpmodel.strategy.example1;

import org.springframework.stereotype.Component;

/**
 * @author heyudev
 */
@Component
public class StrategyB implements Strategy {
    @Override
    public void execute() {
        System.out.println("execute B strategy");
    }
}
