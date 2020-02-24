package com.gaoxiaobo.helloworld;

import com.gaoxiaobo.helloworld.enablexxx.ColorConfiguration;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.stream.Stream;


//@RunWith(value = SpringRunner.class)
@SpringBootTest
public class SpringBootHelloworldApplicationTests {

	@Test
	public void contextLoads() {
		AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext(ColorConfiguration.class);
		String[] beanDefinitionNames = ctx.getBeanDefinitionNames();
		Stream.of(beanDefinitionNames).forEach(System.out::println);
	}
	@Test
	public void test(){
		System.out.println("xxx");

	}

}
