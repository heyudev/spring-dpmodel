package com.heyudev.dpmodel.strategy.example3;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;

/**
 * @author heyudev
 */
@Component
public class Client {

    @Autowired
    private List<Strategy> strategyList;

    public void test(){
        strategyList.get(0).execute();
    }
}
