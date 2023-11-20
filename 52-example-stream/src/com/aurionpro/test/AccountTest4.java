package com.aurionpro.test;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

import com.aurionpro.model.Account;

public class AccountTest4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Account> acc = Arrays.asList(
				new Account(1,"umaid",1300000),
				new Account(2,"Dipikas",50000),
				new Account(3,"Sahil",10000)
				);    
		Optional<Account> Minsalary = acc.stream().min(Comparator.comparing(Account::getSalary));
		System.out.println(Minsalary);
		System.out.println("*******************************************");
		Optional<Account> maxsalary = acc.stream().max(Comparator.comparing(Account::getSalary));
		System.out.println(maxsalary);
		System.out.println("*******************************************");

		acc.stream().filter((a)->a.getName().length()>6).forEach(System.out::println);
		System.out.println("*******************************************");

		Double sum = acc.stream().collect(Collectors.summingDouble(Account::getSalary));
		System.out.println(sum);
		
		}
	

}
