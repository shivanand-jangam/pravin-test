package com.test.interface1;

public class ShivaBank implements GatewayInterface {

	@Override
	public void checkBalalce() {
		System.out.println("Balance is available in ShivaBank");
	}

	@Override
	public void paymentSucessful() {
		System.out.println("paymentSucessful in ShivaBank");
	}

	@Override
	public void paymentError() {
		System.out.println("paymentError in ShivaBank");
	}

	@Override
	public void invalidDetails() {
		System.out.println("invalidDetails in ShivaBank");
	}

}
