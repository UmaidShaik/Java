package com.aurionpro.test;

import java.util.Scanner;

public class Hellojava {
  
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter the Name : ");
		String name=sc.next();
		System.out.println("Hello" +name);
		
	}

}
