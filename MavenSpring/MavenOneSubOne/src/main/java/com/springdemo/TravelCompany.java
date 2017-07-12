package com.springdemo;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TravelCompany {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ApplicationContext appContext= new ClassPathXmlApplicationContext("com/springdemo/Spring-Beans.xml");
		Vehicle v= (Vehicle)appContext.getBean("carObj");
		v.rent();
		v.paint();
	}

	
}
