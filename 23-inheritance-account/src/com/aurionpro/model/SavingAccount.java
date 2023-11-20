package com.aurionpro.model;

public class SavingAccount extends Account {
	
	private final static double MIN_BALANCE = 1000;
	
	public SavingAccount(int id, String name, double balance) {
		super(id, name, balance);
	}
	
	@Override 
	public boolean withdraw (double amount) {
		if (this.getBalance() > amount) {
			double balance = this.getBalance() - amount;
			this.setBalance(balance);
			return true;
		}
		return false;
	}
	
	
	

}
