package com.aurionpro.model;

public class PrintSalarySlip {
	public void printSalarySlip(Employee employee,Tax tax) {
		System.out.println("Id : "+employee.getId());
		System.out.println("Name : "+employee.getName());
		System.out.println("Basic "+employee.getBasic());
		System.out.println("Hra "+employee.getHra());
		System.out.println("DA "+employee.getDa());
		System.out.println("TA "+employee.getTa());
		System.out.println("Total Monthly Salary "+employee.calculateMonthlySalary());
		System.out.println("Tax "+tax.calculateTax(employee));
		System.out.println("Net Monthly salary "+(employee.calculateMonthlySalary()-tax.calculateTax(employee)/12));
	}
}
