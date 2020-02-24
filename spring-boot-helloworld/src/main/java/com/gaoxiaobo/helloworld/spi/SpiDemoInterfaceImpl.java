package com.gaoxiaobo.helloworld.spi;

public class SpiDemoInterfaceImpl implements SpiDemoInterface {
    @Override
    public void test() {
        System.out.println("SpiDemo#test() run ...");
    }
}
