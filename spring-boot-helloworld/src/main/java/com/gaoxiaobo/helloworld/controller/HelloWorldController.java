package com.gaoxiaobo.helloworld.controller;

import lombok.extern.slf4j.Slf4j;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.PropertySource;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@Slf4j
@RestController
@PropertySource({"classpath:test.properties"})
public class HelloWorldController {
    @Value("${user.age:11}")
    private int age;

    @Value("${user.name2:xx}")
    private String  name;

    public int getAge(){

        log.warn("age:{}", age);
        return age;
    }

    /**
     *
     * @return
     */
    @RequestMapping("/hello")
    public String index(){
        log.error("name4:{}",name);
        getAge();
        return name;
    }
}
