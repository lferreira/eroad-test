package com.eroad.test.patterns;

public class BankA extends BankChain {
	 
    public BankA() {
        super(Banks.BANK_A);
    }
 
    @Override
    protected void makePayment() {
        System.out.println("Bank A making payment");
    }
}
