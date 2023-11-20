package com.aurionpro.test;

import java.util.HashSet;
import java.util.Set;

public class AccountTest {
	public static void main(String[] args) {
		Set<Account> objectSet = new HashSet<>();
		objectSet.add(new Account(101,"umaid",1000));
		objectSet.add(new Account(102,"Hello",1000));
		objectSet.add(new Account(102,"Hello",1000));

		
		
		System.out.println(objectSet);
	}

}
