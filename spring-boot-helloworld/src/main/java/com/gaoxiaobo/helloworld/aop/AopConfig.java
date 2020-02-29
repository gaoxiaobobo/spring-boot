package com.gaoxiaobo.helloworld.aop;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

@Configuration
@EnableAspectJAutoProxy(proxyTargetClass = true)//启用aop
@ComponentScan("com.gaoxiaobo.helloworld.aop")
public class AopConfig {
}

