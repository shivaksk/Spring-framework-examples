package com.ksk.springs.ioc;

import org.springframework.stereotype.Component;

@Component
public class Manager implements Employee {

	public void doWork() {
		System.out.println("Manager do work");

	}

}
