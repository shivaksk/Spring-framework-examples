package com.ksk.springs.ioc.messagewriterex;

import org.springframework.stereotype.Component;

@Component
public class HTMLMessageProducer implements IMessageProducer {

	public String formatMessage(String message) {

		return "<HTML><HEAD><BODY>" + message + "</BODY></HEAD></HTML>";
	}

}
