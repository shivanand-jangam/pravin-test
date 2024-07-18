package com.test.pravinpractice.abstraction;

 abstract class Payment 
 {
	 private double amount;
	 public Payment(double amt) 
	 {
		 amount=amt;
		 
	 }
	 
	// Abstract methods
	 public abstract void makePayment();
	 public abstract void refundPayment();
	 
	 
	// Concrete method
	 public void printReceipt() 
	 {
	        System.out.println("Receipt: Payment of " + amount + " processed.");
	  }
	 
	 public double getAmount() {
	        return amount;
	    }
	}

