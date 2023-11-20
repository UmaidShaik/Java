package com.aurionpro.test;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;

public class ArrayList5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Integer> numbers=Arrays.asList(10,20,30,40,50,25,35,45);
		Optional<Integer> min = numbers.stream().min(Comparator.comparing((a)->a));
		System.out.println(min.get());
		Optional<Integer> max = numbers.stream().max(Comparator.comparing((b)->b));
		System.out.println(max.get());

	}

}
