package abstraction;

public class CreditCardPayment extends Payment 
{
	private String cardNumber;
    private String cardHolderName;
    
    public CreditCardPayment(double amt, String cardNum, String cardHolder) 
    {
        super(amt);
        cardNumber = cardNum;
        cardHolderName = cardHolder;
    }
    
    public void makePayment() 
    {
        System.out.println("Processing credit card payment...");
        System.out.println("Card Number: " + cardNumber);
        System.out.println("Card Holder: " + cardHolderName);
        System.out.println("Amount: " + getAmount());
    }

    public void refundPayment() 
    {
        System.out.println("Refunding credit card payment...");
        System.out.println("Card Number: " + cardNumber);
        System.out.println("Amount: " + getAmount());
    }
}


class PayPalPayment extends Payment 
{
    private String email;

    public PayPalPayment(double amt, String mail) 
    {
        super(amt);
        email = mail;
    }
    
    
    public void makePayment()
    {
        System.out.println("Processing PayPal payment...");
        System.out.println("PayPal Email: " + email);
        System.out.println("Amount: " + getAmount());
    }
    
    public void refundPayment() {
        System.out.println("Refunding PayPal payment...");
        System.out.println("PayPal Email: " + email);
        System.out.println("Amount: " + getAmount());
    }
    
}
	

