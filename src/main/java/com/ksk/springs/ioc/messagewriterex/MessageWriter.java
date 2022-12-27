package com.ksk.springs.ioc.messagewriterex;

import org.springframework.stereotype.Component;

@Component
public class MessageWriter {

	IMessageProducer messageProducer;

	
	public void setMessageProducer(IMessageProducer messageProducer) {
		this.messageProducer = messageProducer;
	}


	public void writeMessage(String message) {
	

		String formatMessage = messageProducer.formatMessage(message);
		System.out.println(formatMessage);

	}
}
