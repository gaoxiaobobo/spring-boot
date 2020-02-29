package com.gaoxiaobo.helloworld;

import com.gaoxiaobo.helloworld.aop.TestAop;
import com.gaoxiaobo.helloworld.enablexxx.ColorConfiguration;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockitoTestExecutionListener;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.test.context.TestExecutionListeners;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.stream.Stream;


@RunWith(value = SpringRunner.class) //这里有区别，不加这个加载的少
@SpringBootTest(classes = {SpringBootHelloworldApplication.class})
//@TestExecutionListeners(listeners = MockitoTestExecutionListener.class)//开启Mockito的支持,不会启动tomcat

public class SpringBootHelloworldApplicationTests {

	@Autowired
	TestAop testAop;
	@Test
	public void contextLoads() {
		AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext(ColorConfiguration.class);
		String[] beanDefinitionNames = ctx.getBeanDefinitionNames();
		Stream.of(beanDefinitionNames).forEach(System.out::println);
	}
	@Test
	public void test(){
		String name = testAop.runTime();
		System.out.println(name);

	}

}
