package com.test.abstatClass;

public abstract class Account {

	public abstract void calculateInterest();

	public void desposit() {
		System.out.println("Amount gets deposited");
	}

	public void withDraw() {
		System.out.println("Amount gets withDraw");
	}
}
