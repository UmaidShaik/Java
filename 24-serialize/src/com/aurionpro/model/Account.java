package com.aurionpro.model;

import java.io.Serializable;

public class Account implements Serializable{
	
	protected int id;
	protected String name;
	public double balance;
	

	
	public Account(String string, String name2, int balance2) {
		// TODO Auto-generated constructor stub
	}


	public boolean deposit(double amount) {
		if (amount>0) {
			  balance = balance + amount ;
			  return true;
		 }
		return false;
	}
	
//	public boolean withdraw(double amount);{
//	if (balance > amount) { 
//		 balance = balance - amount;			
//		return true;
//	} 
//	return false;
//}




//public void printDetails(Account acc1) {
//	System.out.println(balance);
}

