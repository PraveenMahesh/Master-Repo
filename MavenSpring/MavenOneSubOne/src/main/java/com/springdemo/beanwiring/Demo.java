package com.springdemo.beanwiring;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Demo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ApplicationContext appContext= new ClassPathXmlApplicationContext("com/springdemo/beanwiring/Spring-Beans.xml");
		Student std=(Student)appContext.getBean("stdObj");
		System.out.println("student name= "+std.getName());
		System.out.println("book title= "+std.getBookRef().getTitle());
		System.out.println("__________________");
		Collage c=(Collage)appContext.getBean("collageObj");
		System.out.println("collage name = "+c.getcName());
		System.out.println("Collage student name ="+c.getStd().getName());
	}

}
