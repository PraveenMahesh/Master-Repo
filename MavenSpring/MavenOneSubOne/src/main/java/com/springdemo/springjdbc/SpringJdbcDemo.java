package com.springdemo.springjdbc;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class SpringJdbcDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ApplicationContext appContext= new ClassPathXmlApplicationContext("com/springdemo/springjdbc/Spring-Beans.xml");
		UserDAO userdao=(UserDAO)appContext.getBean("userDaoObj");
		User user= userdao.findUserById(2);
		System.out.println("user name= "+user.getUserName());
	}

}
