package com.gaoxiaobo.helloworld.aop;

import com.alibaba.fastjson.JSON;
import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.*;
import org.slf4j.LoggerFactory;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;
import org.springframework.web.context.request.RequestContextHolder;
import org.springframework.web.context.request.ServletRequestAttributes;

import javax.servlet.http.HttpServletRequest;

//AOP切面 ：多个切面时，@Order(i)注解来标识切面的优先级。i的值越小，优先级越高
//@Order(5)
@Aspect
@Component
public class SysAspect {

    //统计请求的处理时间
    ThreadLocal<Long> startTime = new ThreadLocal<>();

    //    @Pointcut("execution(public * com.gaoxiaobo.helloworld.controller.*(..))")
    @Pointcut("execution( * com.gaoxiaobo.helloworld.aop.TestAop.runTime())")
    public void log() {
    }

    @Before("log()")
    public void doBefore(JoinPoint joinPoint) throws Throwable {
        startTime.set(System.currentTimeMillis());
    }
    @AfterReturning(returning = "ret" , pointcut = "log()")
    public void doAfterReturning(Object ret){
        //处理完请求后，返回内容
        System.out.println("方法返回值:"+ JSON.toJSONString(ret) +",方法执行时间:"+ (System.currentTimeMillis() - startTime.get()));
    }

}