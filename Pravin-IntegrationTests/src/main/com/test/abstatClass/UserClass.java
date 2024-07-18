package com.test.abstatClass;

import com.test.interface1.GatewayInterface;
import com.test.interface1.PravinBank;

public class UserClass {

	public static void main(String[] args) {
		SavingAccount account = new SavingAccount();
		// account.calculateInterest();
		account.desposit();

		// Normal Java class
		
//		ChromeDriver driver = new ChromeDriver();
		CurrentAccount account3 = new CurrentAccount();
		account3.desposit();


		// With reference to Interface
//		Webdriver driver= new ChromeDriver();
		GatewayInterface gatewayInterface = new PravinBank();
		gatewayInterface.checkBalalce();
		
		// with reference to Abstract class
		Account account2 = new SavingAccount();
		account2.calculateInterest();

		
		
		
		
		

	}
}
