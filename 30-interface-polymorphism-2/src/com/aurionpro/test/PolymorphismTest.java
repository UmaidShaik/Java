package com.aurionpro.test;

import java.time.LocalDate;

import com.aurionpro.model.Bike;
import com.aurionpro.model.Bus;
import com.aurionpro.model.Car;
import com.aurionpro.model.IMovable;

public class PolymorphismTest {
	
	public static void main(String[] args) {
		
		IMovable[] movables= {
				new Car("AUDI", LocalDate.(12,12,2001)), 
				new Bike(), 
				new Bus(),
		};
		
		for (IMovable x : movables) {
			startMoving(x);
			
			
		}
	}


	private static void startMoving(IMovable movables) {
         System.out.println("");		
         movables.move();
	}

}
