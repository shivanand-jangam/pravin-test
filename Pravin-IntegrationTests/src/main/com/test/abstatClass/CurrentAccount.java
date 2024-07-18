package com.test.abstatClass;

public class CurrentAccount extends Account {

	@Override
	public void calculateInterest() {
		System.out.println("Calculate interest with 10%");
	}

}
