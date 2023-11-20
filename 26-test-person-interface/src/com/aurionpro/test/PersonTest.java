package com.aurionpro.test;

import java.time.LocalDate;

import com.aurionpro.model.student;

public class PersonTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		student student = new student(101, "Kalyan", LocalDate.of(2001, 5, 1), "IT");
	    System.out.println(student);
		

	}

}
