package com.aurionpro.models;

public class Printschar implements Runnable{

	@Override
	public void run() {
		for(char i='A';i<='H';i++) {
			
			System.out.println(i);
			System.out.println(Thread.currentThread().getName());
		}
		
	}

}
