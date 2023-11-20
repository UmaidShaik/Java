package com.aurionpro.test;

import com.aurionpro.model.Manager;
import com.aurionpro.model.Developer;
import com.aurionpro.model.Accountant;

public class EmployeeTest { 
	public static void main(String[] args) {
    Manager obj =new Manager(001, "RAJ", 5000);    
    salarySlipOfManager(obj);
    Developer obj1 =new Developer(201, "RAM", 250000);
    salarySlipOfDeveloper(obj1);  
    Accountant obj2 =new Accountant(301, "SHYAM", 150000);  
    salarySlipOfAccountant(obj2);
   }
    private static void salarySlipOfManager(Manager obj) {
     double annualCtc = obj.calculateAnnualCTC();  
     System.out.println(obj);
     System.out.println("annual salary of manager is : "+annualCtc);  
     System.out.println("----------------------------");
   }
  private static void salarySlipOfDeveloper(Developer obj1) {
  double annualCtcOfDeveloper = obj1.calculateAnnualCTC();  
  System.out.println(obj1);
  System.out.println("annual CTC of Developer is : "+annualCtcOfDeveloper);  
  System.out.println("----------------------------");
   }
  private static void salarySlipOfAccountant(Accountant obj2) {
  double annualCtcOfAccountant = obj2.calculateAnnualCTC();  
  System.out.println(obj2);
  System.out.println("annual CTC of manager is : "+annualCtcOfAccountant);  
  System.out.println("----------------------------");
   }
}