package com.aurionpro.test;

import com.aurionpro.model.Boy;
import com.aurionpro.model.IEmotionable;
import com.aurionpro.model.IMannerable;
import com.aurionpro.model.Man;

public class InterfacePolymorphism {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Man man = new Man();
		Boy boy = new Boy();
		 attheparty(man);
		 attheparty(boy);
		 
		 atthemovies(man);
		 atthemovies(boy);
		 
		
	}
	
	public static void atthemovies(IMannerable obj) {
		System.out.println("At the party");
		obj.cry();
		obj.laugh();
	}
	
	public static void attheparty(IEmotionable obj) {
	    System.out.println("At the movies");
	    obj.depart();
	    obj.wish();
	
	}

}
