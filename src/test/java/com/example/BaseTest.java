package com.example;

import org.junit.Before;
import org.junit.Test;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.web.context.ContextLoader;
import org.springframework.web.context.WebApplicationContext;

import com.alibaba.fastjson.JSONObject;
import com.example.model.GreetModel;
import com.example.service.GreetService;

public class BaseTest {
	
	private static ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("classpath:applicationContext.xml");
	
	@Before
	public void loadContext(){
		 
	}
    
	@Test
	public void testBase(){
//		1. 通过初始化的时候保存ClassPathXmlApplicationContext，再通过ClassPathXmlApplicationContext获取bean
		GreetService greetService_1 = context.getBean("greetService", GreetService.class);
		greetService_1.greet();
		
//		2. 通过ContextLoader获取,但是在server启动时。Spring容器初始化时，不能通过下面方法获取Spring 容器
		WebApplicationContext appContext = ContextLoader.getCurrentWebApplicationContext();
		if(appContext == null){
			System.out.print("appContext Null");
			return ;
		}
		String[] names = appContext.getBeanDefinitionNames();
		System.out.println("Names:"+names);
		GreetService gre = appContext.getBean(GreetService.class);
		gre.greet();
	}
	
	@Test
	public void textGetBean(){
		GreetModel model = (GreetModel)context.getBean("greetModel_1");
		System.out.println(JSONObject.toJSONString(model));
	}
	
	@Test
	public void testGreetService(){
		GreetService greetService_1 = context.getBean("greetService", GreetService.class);	
		greetService_1.doGreetModel();
		
     }
	
}
