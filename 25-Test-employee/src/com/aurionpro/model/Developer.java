package com.aurionpro.model;

public class Developer extends Employee {
	
	private double pa=0.40*basic;
	private double ot=0.20*basic;
	
	
	
	public Developer(long employeeId, String name, double basic) {
		super(employeeId, name, basic);
	}

	public double getPa() {
		return pa;
	}
	public double getOt() {
		return ot;
	}
	
	@Override
	 public double calculateAnnualCTC() {  
		 double annualCtc = basic + pa +ot;
	  return annualCtc; 
	  }

	@Override
	public String toString() {
		return "Developer [pa=" + pa + ", ot=" + ot + ", EmployeeID=" + EmployeeID + ", name=" + name + ", basic="
				+ basic + ", getPa()=" + getPa() + ", getOt()=" + getOt() + ", calculateAnnualCTC()="
				+ calculateAnnualCTC() + ", getEmployeeID()=" + getEmployeeID() + ", getName()=" + getName()
				+ ", getBasic()=" + getBasic() + ", toString()=" + super.toString() + ", getClass()=" + getClass()
				+ ", hashCode()=" + hashCode() + "]";
	}

    
	
	

}
