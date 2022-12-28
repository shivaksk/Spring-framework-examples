package com.ksk.springs.constructorinj;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Manager implements Employee {

	@Autowired
	Accountant acctnt;
	
	
	public Manager(Accountant acctnt) {
		System.out.println("Manager Constructor. ");
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
