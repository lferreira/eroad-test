package com.eroad.test.patterns;

public abstract class BankChain {
	 
    protected BankChain next;
    
    protected Banks bankId;
 
    public BankChain(Banks id) {
        next = null;
        bankId = id;
    }
 
    public void makePayment(Banks id) throws Exception {
        if (canMakeThePayment(id)) {
            makePayment();
        } else {
            if (next == null) {
                throw new Exception("bank not registered");
            }
            next.makePayment(id);
        }
    }
     
    private boolean canMakeThePayment(Banks id) {
        if (bankId == id) {
            return true;
        }
        return false;
    }
     
    protected abstract void makePayment();
    
    public void setNext(BankChain form) {
        if (next == null) {
            next = form;
        } else {
            next.setNext(form);
        }
    }
}