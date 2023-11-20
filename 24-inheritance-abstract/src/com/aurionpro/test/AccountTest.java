package com.aurionpro.test;

import com.aurionpro.model.Account;
import com.aurionpro.model.CurrentAccount;
import com.aurionpro.model.SavingAccount;

public class AccountTest {

	public static void main(String[] args) {
//		Account acc1 = new Account(1, "hello", 5000);
		Account acc2 = new SavingAccount(2, "Ram", 3000);
		Account acc3 = new CurrentAccount(3, "Shyam", 5000);
		
		Account acc1 = new SavingAccount(2,"raj", 6000);
		System.out.println(acc1.balance);
		
		acc1.deposit(2000);
		acc2.deposit(1000);
		acc3.deposit(1000);
		
		System.out.println("Account after Deposit " + acc1.balance);
		System.out.println("Current Account after Deposit " + acc2.balance);
		System.out.println("Savings Account after Deposit " + acc3.balance);
		
		acc2.withdraw(2000);
		System.out.println(acc2.balance);
		
		acc3.withdraw(2000);
		System.out.println(acc3.balance);
		
		
	}

}
