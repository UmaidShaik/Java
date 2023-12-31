package com.aurionpro.model;

public abstract class Account {
	
	protected int id;
	protected String name;
	public double balance;
	
	public Account(int id, String name, double balance) {
		super();
		this.id = id;
		this.name = name;
		this.balance = balance;
	}

	
	public boolean deposit(double amount) {
		if (amount>0) {
			  balance = balance + amount ;
			  return true;
		 }
		return false;
	}
	
	public abstract boolean withdraw(double amount);



public void printDetails(Account acc1) {
	System.out.println(balance);
}
}
