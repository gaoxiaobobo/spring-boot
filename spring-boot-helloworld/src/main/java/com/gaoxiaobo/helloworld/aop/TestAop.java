package com.gaoxiaobo.helloworld.aop;

import org.springframework.stereotype.Component;

@Component
public class TestAop {
    public String runTime()  {
        String name ="paopao";
        System.out.println("name is:" + name);
//        try {
//            Thread.sleep(0);
//        } catch (InterruptedException e) {
//            e.printStackTrace();
//        }
        return name;
    }
}
