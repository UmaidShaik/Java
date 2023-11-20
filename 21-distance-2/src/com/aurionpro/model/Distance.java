package com.aurionpro.model;

public class Distance {
	
	private int Inch;
	private int Feet;
	public Distance(int inch, int feet) {
		super();
		Inch = inch;
		Feet = feet;
	}
	public int getInch() {
		return Inch;
	}
	public void setInch(int inch) {
		Inch = inch;
	}
	public int getFeet() {
		return Feet;
	}
	public void setFeet(int feet) {
		Feet = feet;
	}
	public Distance addDistance(Distance d2) {
        Distance Temp = new Distance();
        Temp.setInch(this.getInch()+d2.getInch());
        
		return Temp;
	}
	
	

}
