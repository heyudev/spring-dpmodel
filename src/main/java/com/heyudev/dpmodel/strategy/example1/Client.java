package com.heyudev.dpmodel.strategy.example1;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

/**
 * @author heyudev
 */
@Component
public class Client {

    @Autowired
    private Context context;

    public void test(){
        context.execute("strategyA");
    }

}
