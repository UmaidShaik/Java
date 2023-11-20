package com.aurionpro.model;

import com.aurionpro.exception.InvalidException;

public class AgeUtil {
	public static void validateAge(int age) {
		if(age>=18) {
			System.out.println("Eligible for voting..");
		}
		else {
			throw new InvalidException("Invalid age");
		}
	}
	

}
