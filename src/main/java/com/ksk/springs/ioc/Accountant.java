package com.ksk.springs.ioc;

import org.springframework.stereotype.Component;

@Component
public class Accountant implements Employee {

	public void doWork() {
		System.out.println("Accountant do work");

	}

}
