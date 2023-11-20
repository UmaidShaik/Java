package com.aurionpro.model;

import java.time.LocalDate;

public abstract class Vehicle {
	
	
	public String model;
	public LocalDate dom;



public Vehicle(String model, LocalDate dom) {
		super();
		this.model = model;
		this.dom = dom;
	}



public abstract void showtopspeed();

}
