package com.aurionpro.test;

import java.util.ArrayList;
import java.util.List;

public class ListTest {

	public static void main(String[] args) {
		
		List<Integer> numbers = new ArrayList<Integer>();
			numbers.add(10);
			numbers.add(20);
			numbers.add(30);
			numbers.add(40);
			
			System.out.println(numbers);
			System.out.println(numbers.contains(20));
			numbers.remove(0);
			System.out.println(numbers);
			numbers.clear();
			System.out.println(numbers);
			
		}

	}


