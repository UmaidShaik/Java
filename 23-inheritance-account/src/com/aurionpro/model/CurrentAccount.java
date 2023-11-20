package com.aurionpro.model;

public class CurrentAccount extends Account{
	
	private final static double OVER_DRAFT = 25000;
	public CurrentAccount(int id, String name, int balance) {
		super(id, name, balance);
	}
	
	@Override 
	public boolean withdraw (double amount) {
		if ((this.getBalance() - amount >= -OVER_DRAFT)) { 
			double balance = this.getBalance() - amount;
			this.setBalance(balance);
			return true;
		} 
		return false;
	}
	
}

