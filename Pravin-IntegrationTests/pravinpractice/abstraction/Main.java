package abstraction;

public class Main 
{

	public static void main(String[] args)
	{
		Payment creditCardPayment = new CreditCardPayment(100.0, "1234-5678-9876-5432", "John Doe");
        Payment payPalPayment = new PayPalPayment(200.0, "jane.smith@example.com");
        
        creditCardPayment.makePayment();
        creditCardPayment.printReceipt();
        creditCardPayment.refundPayment();
        
        System.out.println();
        
        payPalPayment.makePayment();
        payPalPayment.printReceipt();
        payPalPayment.refundPayment();

	}

}
