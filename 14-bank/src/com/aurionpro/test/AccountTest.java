package com.aurionpro.test;

import com.aurionpro.model.AccountType;

import com.aurionpro.model.Account;
import com.aurionpro.model.*;

public class AccountTest {

 public static void main(String[] args) {
  Account account = new Account();
  account.setBalance(100);
  account.setId(1);
  account.setName("Rasika");
  account.setAccount(AccountType.SAVING);
  
  System.out.println(account);
  deposite(2000, account);
  System.out.println(account);
  WithDraw(2000, account, AccountType.SAVING);
  System.out.println(account);
  WithDraw(12000, account, AccountType.SAVING);
  System.out.println(account);
  
  Account account1 = new Account();
  account1.setBalance(100);
  account1.setId(1);
  account1.setName("Rasika");
  account1.setAccount(AccountType.CURRENT);
  
  System.out.println(account1);
  deposite(2000, account1);
  System.out.println(account1);
  WithDraw(2000, account1, AccountType.CURRENT);
  System.out.println(account1);
  WithDraw(12000, account1, AccountType.CURRENT);
  System.out.println(account1);
  WithDraw(13100, account1, AccountType.CURRENT);
  System.out.println(account1);
  WithDraw(1, account1, AccountType.CURRENT);
  System.out.println(account1);

 }
 
  private static void deposite(double amount, Account account) {
   if(amount>0) {
   double update = account.getBalance();
   update += amount ;
   account.setBalance(update);
   }
  }
  
  private static void WithDraw(double amount,Account account ,AccountType type) {
   if(AccountType.SAVING.equals(type)) {
    if(amount>account.getBalance()) {
     System.out.println("WithDraw failed");
    }
    else {
     double update = account.getBalance();
     update -= amount;
     account.setBalance(update);
     System.out.println("Withdraw Success");
    }
   }
   
   if(AccountType.CURRENT.equals(type)) {
    if((account.getBalance()-amount>=(-25000))) {
     double update = account.getBalance();
     update -= amount;
     account.setBalance(update);
     System.out.println("Withdraw Success");
    }
    else {
     System.out.println("Failed");


    }
    
   }
  }

}
