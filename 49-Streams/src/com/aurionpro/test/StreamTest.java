package com.aurionpro.test;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.stream.Collector;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import com.aurionpro.model.Account;
import com.aurionpro.model.Gender;

public class StreamTest {

	public static void main(String[] args) {
		
		Account[] accounts = {
				new Account(1, "Alice", Gender.MALE, 21000), 
				new Account(2, "Anjali", Gender.FEMALE, 167000), 
				new Account(3, "Amisha", Gender.FEMALE, 95000), 
				new Account(4, "Boby", Gender.FEMALE, 159000),
				new Account(1, "Umaid", Gender.MALE, 104000), 
				new Account(2, "Rahul", Gender.MALE, 65000), 
				new Account(3, "Sahil", Gender.MALE, 76000), 
				new Account(4, "Zaid", Gender.MALE, 162000)};
		
		List<Account> maleAcc = Arrays.stream(accounts)
				.filter((acc) -> (acc.getGender().equals(Gender.MALE)))
				.collect(Collectors.toList());
		
		maleAcc.forEach(System.out::println);
		
		System.out.println("*******************************************************************");
		
		List<Account> femaleAcc = Arrays.stream(accounts)
				.filter((acc) -> (acc.getGender().equals(Gender.FEMALE)))
				.collect(Collectors.toList());
		
		femaleAcc.forEach(System.out::println);
		
		System.out.println("*******************************************************************");
		
		List<Account> money = Arrays.stream(accounts)
				.filter((acc) -> (acc.getBalance() >= 100000))
				.collect(Collectors.toList());
		
		money.forEach(System.out::println);
		
		System.out.println("*******************************************************************");
		
		List<Double> all = Arrays.stream(accounts)
		        .map((account) ->(account.getBalance()))
		        .collect(Collectors.toList());
          System.out.println(all);
          
          System.out.println("*****************************************************************");
          
          List<String> sort = (List<String>) Arrays.stream(accounts)
        		  .sorted((Comparator.comparingDouble(Account::getBalance)))
                  .limit(3)
                  .map((Account)->Account.getName())
                  .collect(Collectors.toList());
          System.out.println(sort);
	}

}
