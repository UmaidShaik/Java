package com.aurionpro.model;

import java.time.LocalDate;

public class Bus extends Vehicle implements IMovable{

	public Bus(String model, LocalDate dom) {
		super(model, dom);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void move() {
		// TODO Auto-generated method stub
		System.out.println("Bus is moving");
	}

	@Override
	public void showtopspeed() {
		// TODO Auto-generated method stub
		System.out.println("Bus top speed is 80");
	}

}
