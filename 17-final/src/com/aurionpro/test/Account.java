package com.aurionpro.test;

public class Account {
     
	private int id;
	private String name;
	private double balance;
	private AccountType accounttype;
	

  
public void SetId(int Id) {
	this.id = Id;
}

public void SetName(String Name) {
	this.name = name;
}

public void SetBalance(double Balance) {
	this.balance = balance;
}
 public int getId()
 {
	 return id;
 }
 public String getName()
 {
	 return name;
 }
 public double getBalance()
 {
	 return balance;
 }

public Account(int id, String name, double balance, AccountType accounttype) {
	super();
	this.id = id;
	this.name = name;
	this.balance = balance;
	this.accounttype = accounttype;
}

public AccountType getAccounttype() {
	return accounttype;
}

public void setAccounttype(AccountType accounttype) {
	this.accounttype = accounttype;
}

@Override
public String toString() {
	return "Account [id=" + id + ", name=" + name + ", balance=" + balance + ", accounttype=" + accounttype + "]";
}

 }