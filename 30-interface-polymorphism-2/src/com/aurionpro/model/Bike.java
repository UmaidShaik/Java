package com.aurionpro.model;

import java.time.LocalDate;

public class Bike extends Vehicle implements IMovable{

	public Bike(String model, LocalDate dom) {
		super(model, dom);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void move() {
		// TODO Auto-generated method stub
		System.out.println("Bikeis moving");
	}

	@Override
	public void showtopspeed() {
		// TODO Auto-generated method stub
		System.out.println("Bike top speed is 100");
	}

}
