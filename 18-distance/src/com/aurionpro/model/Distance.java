package com.aurionpro.model;

public class Distance {
      
	private int inch;
	private int feet;
	private int setFeet;
	public Distance(int inch, int feet) {
		super();
		this.inch = inch;
		this.feet = feet;
	}
	public int getInch() {
		return inch;
	}
	public void setInch(int inch) {
		this.inch = inch;
	}
	public int getFeet() {
		return feet;
	}
	public void setFeet(int feet) {
		this.feet = feet;
	}
	
	public int addinch() {
		if(inch<12) {
			return setFeet+1;
								
		}
		
		return feet;
		
	}
}
