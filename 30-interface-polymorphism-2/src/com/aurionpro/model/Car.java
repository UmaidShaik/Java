package com.aurionpro.model;

import java.time.LocalDate;

public class Car extends Vehicle implements IMovable{
	
	
	
	

	public Car(String model, LocalDate dom) {
		super(model, dom);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void showtopspeed() {
		// TODO Auto-generated method stub
		System.out.println("car top speed is 120");
	}

	@Override
	public void move() {

		System.out.println("Car is moving");
	}

	

}
