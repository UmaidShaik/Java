package com.aurionpro.test;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;


public class Streamtest3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[] names= {"Jay","Nimesh","Mark","Mahesh","Ramesh"};
		Arrays.stream(names).limit(3).sorted().forEach(System.out::println);
		System.out.println("************************************************");
		Arrays.stream(names).filter((a)->a.contains("a")).limit(3).sorted().forEach(System.out::println);  
        System.out.println("************************************************************");
        Arrays.stream(names).sorted(Comparator.reverseOrder()).forEach(System.out::println);
        System.out.println("************************************************************");
        Arrays.stream(names).map((b)->b.substring(0, 3)).forEach(System.out::println);
        System.out.println("************************************************************");
        Arrays.stream(names).filter((c)->c.length()<=4).forEach(System.out::println);

	}

}
