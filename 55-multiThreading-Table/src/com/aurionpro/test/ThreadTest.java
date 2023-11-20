package com.aurionpro.test;

import com.aurionpro.model.Table;

public class ThreadTest {

	public static void main(String[] args) {
		
		try {
			Thread.sleep(10);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		Table tb1 =new Table(10);
		Thread t1 = new Thread(tb1);
		t1.start();
		
		Table tb2 =new Table(5);
		Thread t2 = new Thread(tb2);
		t2.start();
		

	}

}
