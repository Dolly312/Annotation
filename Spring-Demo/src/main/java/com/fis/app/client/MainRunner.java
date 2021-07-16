package com.fis.app.client;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.fis.app.model.DemoClass;
public class MainRunner {
	
		public static void main(String[] args) {
			
			// Spring container 
			ApplicationContext spring = new ClassPathXmlApplicationContext("spring-config.xml");
			DemoClass dc = (DemoClass)spring.getBean("myDemo2");
			System.out.println(dc);
			DemoClass dc1 = (DemoClass)spring.getBean("myDemo4");
			System.out.println(dc1);
			
			((AbstractApplicationContext) spring).close();
			
		
	}
}
