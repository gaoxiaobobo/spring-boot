package com.gaoxiaobo.helloworld.spi;

import org.junit.Test;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.ServiceLoader;

import static org.junit.jupiter.api.Assertions.*;
@SpringBootTest
public class SpiDemoInterfaceTest {
    @Test
    public void lodaSpi(){
        ServiceLoader<SpiDemoInterface> loaders = ServiceLoader.load(SpiDemoInterface.class);
        loaders.forEach(SpiDemoInterface::test);
    }

}