package com.aurionpro.test;

import java.util.Scanner;

import com.aurionpro.model.AgeUtil;

public class ValidateAgeTest {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the age");
		int age=sc.nextInt();
		
		try {
			AgeUtil.validateAge(age);
		}
		catch(RuntimeException e) {
			System.out.println(e.getMessage());
		}
	}

}
