package com.aurionpro.test;

import java.util.ArrayList;
import java.util.function.BiFunction;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;

import com.aurionpro.model.IAddable;
import com.aurionpro.model.IGreetable;
import com.aurionpro.model.WelcomeGreeting;

public class LambdaTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		class Lambdatest{
			public Lambdatest() {
				System.out.println("hello");
			}
		}
		
//		IGreetable obj = new WelcomeGreeting();
//		obj.printGreeting();

//		IGreetable bye = new IGreetable(){
//
//			@Override
//			public void printGreeting() {
//				System.out.println("bye");
//				
//			}
//			
//		};
//		bye.printGreeting();
//		IGreetable bye = () -> {
//
//			System.out.println("bye");
//
//		};
//		bye.printGreeting();
//
//	}
// IGreetable hi =() -> {
//	 System.out.println("Add");
//	 
// };
// hi.printAdd();
		//consumer
		Consumer<String> cons =(name)->{
			System.out.println(name);
		};
		cons.accept("Umaid");
		
		
		//bifunction
		BiFunction<Integer,Integer,Integer> bifunc = (no1,no2)->{
			return no1+no2;
		};
		System.out.println(bifunc.apply(10, 20));
		
		
		//function
		Function<String,Integer> func=(name)->{
			return name.length();
		};
		System.out.println(func.apply("Umaid"));
		
		
		//predicate
		Predicate<Integer> predicateobj = (num)->{
			return num%2==0;
		};
		System.out.println(predicateobj.test(10));
		
		IAddable add = (int x, int y) -> System.out.println(x + y);
		add.printAdd(3, 4);
		
		ArrayList<String> names = new ArrayList<>();
		  names.add("Umaid");
		  names.add("Dipika");
		  names.add("Shail");
		  names.add("saswsw");
		  names.add("gdtfyhkjlsxssxsk");
		  names.add("dzghsxsh");
		  
		  
		  ArrayList<String> newnames = new ArrayList<>();
		  for (String x: names) {
		   if(x.length() >3 && x.length()< 6) {
		    newnames.add(x);
		   }
		  }
		  System.out.println(newnames);
		 
		

	}
}
