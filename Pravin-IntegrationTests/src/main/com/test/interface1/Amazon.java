package com.test.interface1;

public class Amazon {

	public static void main(String[] args) {

		GatewayInterface shivaBank = new ShivaBank();

		GatewayInterface pravinBank = new PravinBank();

		shivaBank.checkBalalce();

		shivaBank.paymentSucessful();

		pravinBank.checkBalalce();
		pravinBank.invalidDetails();
	}

}
