package com.springdemo.beanscopes;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.springdemo.beanwiring.Student;

public class Demo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		for(int i=0;i<5;i++)
		System.out.println("student class created is :"+new Student());
		ApplicationContext appContext=new ClassPathXmlApplicationContext("com/springdemo/beanscopes/Spring-Beans.xml");
		
		for(int i=0;i<5;i++)
			System.out.println("student class created is :"+(Student)appContext.getBean("StudentObj"));
		
	}

}
