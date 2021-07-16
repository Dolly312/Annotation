package com.fis.app.client;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.fis.app.model.DemoClass;
import com.fis.app.service.StudentService;

public class MainRunner {

	public static void main(String[] args) {
		
		ClassPathXmlApplicationContext spring = new ClassPathXmlApplicationContext("spring-config.xml");
		
		
		
		StudentService studentService = (StudentService)spring.getBean("studentService");
		
		System.out.println(" \n\n------------New AOP Approach --------- \n\n");
		studentService.doViewAttendance();
		
		System.out.println(" \n\n--------- No Argument call ---------\n\n");
		studentService.doPayFees();
		
		System.out.println(" \n\n--------- make payment with argument ---------\n\n");
		studentService.doPayFees("Demand-Draft/Cheque");
		
		
	
		
	}
}