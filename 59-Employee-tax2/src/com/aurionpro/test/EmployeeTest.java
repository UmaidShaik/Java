package com.aurionpro.test;

import com.aurionpro.model.Employee;
import com.aurionpro.model.PrintSalarySlip;
import com.aurionpro.model.Tax;

public class EmployeeTest {

	public static void main(String[] args) {
		
		Employee employee = new Employee(1,"umaid",50000);
		Tax tax = new Tax();
		PrintSalarySlip pss = new PrintSalarySlip();
		pss.printSalarySlip(employee, tax);
//		System.out.print("Monthly salary : ");
//		System.out.println(employee.calculateMonthlySalary());
//		System.out.print("Annual salary : ");
//		System.out.println(employee.calculateMonthlySalary()*12);
//		System.out.print("Tax : ");
//		System.out.println(tax.calculateTax(employee));
;


		

	}

}
