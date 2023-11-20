package com.aurionpro.test;

import com.aurionpro.model.Account;
import com.aurionpro.model.InsufficientBalanceException;

public class AccountTest {

	public static void main(String[] args) {
      Account acc=new Account(101,"Umaid",100);
     acc.deposit(200);
     System.out.println("deposit is sucessful");
      try {
      acc.withdraw(260);
      System.out.println("your balance is"+acc.getBalance());
      }
      catch(InsufficientBalanceException e) {
    	  System.out.println(e);
      }
	}

}
