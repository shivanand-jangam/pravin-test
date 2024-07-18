package com.test.interface1;

public class PravinBank implements GatewayInterface{

	@Override
	public void checkBalalce() {
		System.out.println("Balance is available in Pravin Bank");
	}

	@Override
	public void paymentSucessful() {
		System.out.println("paymentSucessful in Pravin Bank");
	}

	@Override
	public void paymentError() {
		System.out.println("paymentError in Pravin Bank");
	}

	@Override
	public void invalidDetails() {
		System.out.println("invalidDetails in Pravin Bank");
	}

}
