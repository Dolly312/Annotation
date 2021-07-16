package com.fis.app.service;

import org.springframework.stereotype.Component;

import com.fis.app.util.LoggingClass;
import com.fis.app.util.SecurityClass;

@Component
public class StudentService {

	public void doViewAttendance()
	{
		
		System.out.println(" Displaying attendance status code executing .... ");
		
	}
	
	public void doPayFees()
	{
	
		System.out.println(" makePayment code executing .... ");
		
	}
	
	public void doPayFees(String paymentType)
	{
	
		System.out.println(" makePayment code executing .... "+paymentType);
	
	}
	
	
	
}

