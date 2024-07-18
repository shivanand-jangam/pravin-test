package com.test.abstatClass;

public class SavingAccount extends Account{

	@Override
	public void calculateInterest() {
		System.out.println("Calculate Saving account Interest with 6%");
	}

}
