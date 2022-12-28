package com.ksk.springs.ioc.messagewriterex;

import org.springframework.stereotype.Component;

@Component
public class TextMessageProducer implements IMessageProducer {

	public String formatMessage(String message) {
		// TODO Auto-generated method stub
		return "Hello "+message+ "..!";
	}
}
