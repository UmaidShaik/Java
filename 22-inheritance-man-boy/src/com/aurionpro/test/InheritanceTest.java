package com.aurionpro.test;

import com.aurionpro.model.Boy;
import com.aurionpro.model.Infant;
import com.aurionpro.model.Kid;
import com.aurionpro.model.Man;

public class InheritanceTest {
	
	public static void main(String[] args) {
		
		case1();
		System.out.println("------");
		case2();
		System.out.println("-----");
		case3();
		System.out.println("-----");
		case4();
		System.out.println("-----");
		case5();
		System.out.println("-----");
		case6();
		
	
	}
		


		private static void case1() {
			Man man = new Man();
			man.play();
			man.read();
		}
		
		private static void case2() {
			Boy boy = new Boy();
			boy.eat();
			boy.play();
			boy.read();
			
		}
			
		private static void case3() {
			Man man = new Infant();
			man.play();
			man.read();
		}
		
		private static void case4() {
			playAtPark(new Man());
			playAtPark(new Boy());
			playAtPark(new Kid());
			playAtPark(new Infant());
		}
		
		private static void playAtPark(Man man) {
			System.out.println("At the park---");
			man.play();
		}
//		
//		private static void case4() {
//			Man man = new Man();
//			System.out.println("At the park---");
//			man.play();
//			Man man1 = new Boy();
//			System.out.println("At the park---");
//			man1.play();
//			Man man2 = new Kid();
//			System.out.println("At the park---");
//			man2.play();
//			Man man3 = new Infant();
//			System.out.println("At the park---");
//			man3.play();
//			playAtPark(new Man());
//			playAtPark(new Boy());
//			playAtPark(new Kid());
//			playAtPark(new Infant());
		
		
		
		private static void case5() {
			Man man = new Man();
			Object obj;
			obj=10;
			System.out.println(obj.getClass().getName());
			obj="hello";
			System.out.println(obj.getClass().getName());
			
		}
		
		private static void case6() {
			typeCastObject(new Infant());
		}

		private static void typeCastObject(Man man) {
			if(man instanceof Infant) {
				Infant infant=(Infant)man;
				infant.Sleep();
			}
	}
		
}	
		
		
		
		
	


