package com.aurionpro.test;

import com.aurionpro.models.Printschar;

public class ThreadTest2 {

	public static void main(String[] args) {
		Printschar obj1=new Printschar();
		Thread obj2=new Thread(obj1);
		try {
			obj2.sleep(2000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		obj2.start();

	}

}
