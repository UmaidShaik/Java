package com.aurionpro.model;

public class Account {
	private int accountNumber;
	private String name;
	private double balance;
	private final double MIN_BALANCE=1000;
	public Account(int accountNumber, String name, double balance) {
		super();
		this.accountNumber = accountNumber;
		this.name = name;
		this.balance = balance;
	}
	public int getAccountNumber() {
		return accountNumber;
	}
	public void setAccountNumber(int accountNumber) {
		this.accountNumber = accountNumber;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public double getBalance() {
		return balance;
	}
	public void setBalance(double balance) {
		this.balance = balance;
	}
	
	public double deposit(double amount) {
		if(amount>0) {
		balance=balance+amount;
		return balance;
	}return balance;
	}
	
	public double withdraw(double amount) {
		if((balance-amount)<MIN_BALANCE) {
			System.out.println("insufficient balance");
			throw new InsufficientBalanceException("insufficient");
		}
		else {
			System.out.println("withdraw sucessfull");
			balance=balance-amount;
			
			return balance;
			
		}
	
	
	
	}
	
	
	@Override
	public String toString() {
		return "Account [accountNumber=" + accountNumber + ", name=" + name + ", balance=" + balance + "]";
	}
	
	

}
