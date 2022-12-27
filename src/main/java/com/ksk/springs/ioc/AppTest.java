package com.ksk.springs.ioc;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class AppTest {

	public static ApplicationContext applicationContext;
	
	public static void main(String[] args) {

		applicationContext = new ClassPathXmlApplicationContext("application-context.xml");
		Employee bean = (Employee) applicationContext.getBean("manager");
		Employee bean2 = (Employee) applicationContext.getBean("accountant");
		bean.doWork();
		bean2.doWork();
		
	}

}
