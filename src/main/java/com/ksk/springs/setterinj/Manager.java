package com.ksk.springs.setterinj;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Manager implements Employee {

	Accountant acctnt;
	
	

	@Autowired
	public void setAcctnt(Accountant acctnt) {
		this.acctnt = acctnt;
	}

	public void doWork() {
		System.out.println("Manager do work");

	}
	
	public void callMeeting() {

		System.out.println("Call meeting method executed () ....");
		acctnt.doWork();
	}
}
