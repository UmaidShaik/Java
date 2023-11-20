package com.aurionpro.test;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;

import com.aurionpro.model.Account;

public class AccountTest {

	public static void main(String[] args) {
		List<Account> accounts=new ArrayList<>();
		
		accounts.add(new Account(21, "Jay", 200000));
		accounts.add(new Account(12, "Raj", 100000));
		accounts.add(new Account(32, "Yash", 130000));
		accounts.add(new Account(14, "Aju", 150000));
		
		System.out.println(accounts);
		
//        for(Account account:accounts) {
//			System.out.println(account.getName());
//		}
//		
		Iterator<Account> iterator = accounts.iterator();
		
		while(iterator.hasNext()) {
			System.out.println(iterator.next().getName());
		}
		
		accounts.forEach((account)->System.out.println(account.getBalance()));
	
		
		
		accounts.forEach(System.out::println);
		
//		Collections.sort((List<T>) accounts);
		System.out.println(accounts);
		
	
	}

}
