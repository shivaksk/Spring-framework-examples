package com.ksk.springs.ioc.annotation.noxml;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class AppTest {

	
	public static void main(String[] args) {

		AnnotationConfigApplicationContext applicationContext = new AnnotationConfigApplicationContext(AppConfig.class);
		Employee bean = (Employee) applicationContext.getBean("manager");
		Employee bean2 = (Employee) applicationContext.getBean("accountant");
		bean.doWork();
		bean2.doWork();
		
	}

}
