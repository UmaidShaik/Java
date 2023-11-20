package com.aurionpro.test;

import java.util.Arrays;
import java.util.List;

import com.aurionpro.model.PrintValue;
import com.aurionpro.model.Rectangle;

public class PrintTest {

	public static void main(String[] args) {
//		PrintValue<Integer>  obj1 = new PrintValue<Integer>(10);
//		System.out.println(obj1);
//		
//		PrintValue<Double>  obj2 = new PrintValue<Double>(10.9);
//		System.out.println(obj2);
		
		Rectangle<Double>  obj3 = new Rectangle<Double>(10.9,3.4);
		System.out.println(obj3);
		
		printValue(11,"Umaid");
		printValue(22.5,23);
		printValue("hii",678);

		
		List<Integer> intlist =Arrays.asList(20,23,21,23,43);
		List<Double> doublelist =Arrays.asList(20.2,23.5,21.8,23.4,43.5);
		printList(intlist);
		printList(doublelist);


		
		
	}
	private static <T,S> void printValue(T value1,S value2) {
		System.out.println(value1);
		System.out.println(value2);
		
		
	}
	private static <T> void printList(List<T> list) {
		for(T x: list) {
			System.out.println(x);
		}
	}

}
