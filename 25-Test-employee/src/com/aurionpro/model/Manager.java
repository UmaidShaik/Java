package com.aurionpro.model;
public class Manager extends Employee{
	private double hra=0.25*basic;
 private double da=0.15*basic;
 private double ta = 0.10*basic; 
  
  public Manager(long employeeID, String name, double basic) {
  super(employeeID, name, basic); }

 public double getHra() {  
	 return hra;
 }
 public double getDa() {  
	 return da;
 }
 public double getTa() {  
	 return ta;
 }
 @Override
 public double calculateAnnualCTC() {  
	 double annualCtc = basic + hra + da +ta;
   return annualCtc; 
  }
 @Override 
 public String toString() {
  return "Manager [hra=" + hra + ", da=" + da + ", ta=" + ta + ", EmployeeID=" + EmployeeID + ", name=" + name    + ", basic=" + basic + "]";
 } 
  
 }