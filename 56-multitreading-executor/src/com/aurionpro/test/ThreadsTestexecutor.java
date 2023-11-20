package com.aurionpro.test;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class ThreadsTestexecutor {

	public static void main(String[] args) {
	
		Runnable task = ()->{
			for(int i =0;i<3;i++) {
			System.out.println(Thread.currentThread());
			try {
				Thread.sleep(100);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			}
		};
	
		
		ExecutorService service = Executors.newFixedThreadPool(10);
		for(int i=0;i<10;i++) {
        service.execute(task);	
        }
}
}