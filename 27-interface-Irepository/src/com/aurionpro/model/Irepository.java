package com.aurionpro.model;

public interface Irepository {
	
	int categories=10;
	
	void create();
	public abstract void read();
	void update();
	void delete();

	
public default void showGreetings() {
	System.out.println("Hello from product interface");
}
}
