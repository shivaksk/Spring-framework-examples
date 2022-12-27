package com.ksk.springs.ioc.messagewriterex;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Test {

	public static void main(String[] args) {

		AnnotationConfigApplicationContext applicationContext = new AnnotationConfigApplicationContext(AppConfig.class);
		MessageWriter mw= (MessageWriter) applicationContext.getBean("messageWriter");
		
		HTMLMessageProducer bean = applicationContext.getBean("HTMLMessageProducer",HTMLMessageProducer.class);
		mw.setMessageProducer(bean);
		mw.writeMessage("Good Morning");
	}

}
