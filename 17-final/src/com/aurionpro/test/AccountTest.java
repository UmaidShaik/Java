package com.aurionpro.test;

public class AccountTest {
	public static void main(String[] args) {
		// Create an array to store the account objects
		Account[] accounts = { 
				new Account(1, "ramesh", 5000, AccountType.SAVING),
				new Account(2, "ganesh", 6000, AccountType.CURRENT), 
				new Account(3, "duresh", 4000, AccountType.SAVING),
				new Account(4, "suresh", 4000, AccountType.CURRENT),
				new Account(5, "pamesh", 4000, AccountType.SAVING),
				new Account(6, "tamesh", 4000, AccountType.CURRENT),
				new Account(7, "oamesh", 4000, AccountType.SAVING),
				new Account(8, "yamesh", 4000, AccountType.CURRENT),
				new Account(9, "namesh", 4000, AccountType.SAVING),
				new Account(10, "zamesh",4000, AccountType.CURRENT)
		};
			Account highestBalanceAccount = findHighestBalanceAccount(accounts);
			System.out.println("Account with highest Balance : "+ highestBalanceAccount);
			
			Account highestCurrentBalanceAccount = findHighestBalanceAccountInAccountType(accounts, AccountType.CURRENT);
			System.out.println("\nCurrent Account With The Highest Balance : " + highestCurrentBalanceAccount);
			
			Account highestSavingBalanceAccount = findHighestBalanceAccountInAccountType(accounts, AccountType.SAVING);
			System.out.println("\nSaving Account With The Highest Balance : " + highestSavingBalanceAccount);
			
			sortAccountsArrayBySalary(accounts);
			  for(Account acc : accounts){
			   System.out.println(acc);
			  }

	}
	
	
	private static Account findHighestBalanceAccount(Account[] accounts) {
		Account maxAccount = accounts[0]; //6000
		
		for (int i=0;i<accounts.length;i++)
		{
			if (accounts[i].getBalance() > maxAccount.getBalance()) {
			    maxAccount = accounts[i];
			   }
		}
			  return maxAccount;
	}
	
	 private static Account findHighestBalanceAccountInAccountType(Account[] accounts, AccountType type) {
		  Account maxAccount = null;
		  
		  for (int i=0; i<accounts.length; i++) {
		   if (maxAccount==null && accounts[i].getAccounttype().equals(type)) {
		    maxAccount=accounts[i];
		   }
		   
		   if (maxAccount != null) {
		    if (accounts[i].getBalance() > maxAccount.getBalance() && accounts[i].getAccounttype().equals(type)) {
		     maxAccount = accounts[i];
		    }
		   }
		  }
		  
		  return maxAccount;
		 }
		 
		 private static void sortAccountsArrayBySalary(Account[] accounts) {
		  Account temp = null;
		  for (int i = 0; i < accounts.length; i++) {
		   for (int j = 0; j < accounts.length-1; j++) {
		    if (accounts[i].getBalance()>accounts[j].getBalance()) {
		     temp=accounts[i];
		     accounts[i]=accounts[j];
		     accounts[j]=temp;
		    }
		   }
		   
		  }
		 }
		 
		 
		 private static double findSum(Account[] accounts) {
		  double sumBalance=0;
		  for (int i=0; i < accounts.length; i++) {
		   sumBalance = sumBalance + accounts[i].getBalance();
		  }
		  return sumBalance;
		 }
		 
		 private static double findSumSavings(Account[] accounts) {
		  double sumBalance=0;
		  for (int i=0; i < accounts.length; i++) {
		   if (accounts[i].getAccounttype().equals(AccountType.SAVINGS)) {
		   sumBalance = sumBalance + accounts[i].getBalance();
		   }
		  }
		  return sumBalance;
}
}
	

