package com.aurionpro.model;

import java.time.LocalDate;


public abstract class person {
	
	private int id;
	private String address;
	private LocalDate date;
	public person(int id, String address, LocalDate date) {
		super();
		this.id = id;
		this.address = address;
		this.date = date;
	}
	public int getId() {
		return id;
	}
	
	public String getAddress() {
		return address;
	}
	
	public LocalDate getDate() {
		return date;
	}
	@Override
	public String toString() {
		return "person [id=" + id + ", address=" + address + ", date=" + date + "]";
	}
	
	
	

}

