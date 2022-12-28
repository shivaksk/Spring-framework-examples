package com.ksk.springs.setterinj;

import org.springframework.stereotype.Component;

@Component
public class Accountant implements Employee {

	public Accountant() {
		System.out.println("Accountant - Constructor....");
	}

	public void doWork() {
		System.out.println("Accountant do work -annotation approach");

	}

}
