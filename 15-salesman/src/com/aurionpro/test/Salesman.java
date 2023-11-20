package com.aurionpro.test;

public class Salesman {
	
	private int id;
	private String name;
	private int experience;
	private double salesamount;
    private City city;
    
    
	public Salesman(int id, String name, int experience, double salesamount, City city) {
		super();
		this.id = id;
		this.name = name;
		this.experience = experience;
		this.salesamount = salesamount;
		this.city = city;
	}


	public int getId() {
		return id;
	}


	public void setId(int id) {
		this.id = id;
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public int getExperience() {
		return experience;
	}


	public void setExperience(int experience) {
		this.experience = experience;
	}


	public double getSalesamount() {
		return salesamount;
	}


	public void setSalesamount(double salesamount) {
		this.salesamount = salesamount;
	}


	public City getCity() {
		return city;
	}


	public void setCity(City city) {
		this.city = city;
	}


	@Override
	public String toString() {
		return "Salesman [id=" + id + ", name=" + name + ", experience=" + experience + ", salesamount=" + salesamount
				+ ", city=" + city + "]";
	}
	
	
    
    
}
 
    

