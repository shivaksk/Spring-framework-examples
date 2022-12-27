package com.ksk.springs.ioc.messagewriterex;

public class MessageProducerFactory {

	public static IMessageProducer createMessageProducer(String type) {
		if (type.equals("HTML")) {
			return new HTMLMessageProducer();
		} else if (type.equals("TEXT")) {

			return new TextMessageProducer();
		}
		return null;
	}
}
