package com.aurionpro.model;

public class ListItem {

	private int id;
	private String name;
	private int quantity;
	private double unitprice;
	private double totalcost;
	public ListItem(int id, String name, int quantity, double unitprice) {
		super();
		this.id = id;
		this.name = name;
		this.quantity = quantity;
		this.unitprice = unitprice;
	}
	public double totalcost() {
    return 	this.quantity*this.unitprice;
	
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
	public int getQuantity() {
		return quantity;
	}
	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}
	public double getUnitprice() {
		return unitprice;
	}
	public void setUnitprice(double unitprice) {
		this.unitprice = unitprice;
	}
	
	
	
}
