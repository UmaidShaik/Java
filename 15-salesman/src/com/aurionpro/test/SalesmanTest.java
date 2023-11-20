package com.aurionpro.test;

public class SalesmanTest {
	
	public static void main(String[] args) {
		
		Salesman[] salesmans = {
				new Salesman(1," ramesh",5,7000, City.KALYAN),
				new Salesman(2," samesh",6,9000, City.THANE),
				new Salesman(3," Sahil",4,8000, City.KALYAN),
				new Salesman(4," danesh",4,4000, City.THANE),
				new Salesman(5," uamesh",5,6000, City.KALYAN)
		};
		
		Salesman highestSales = findHighestSales(salesmans);
		System.out.println("Account with highest Sales : "+ highestSales);
		
		double totalSalesOfAllSalesman=findTotalSalesOfAllSalesman(salesmans); 
		  System.out.println("Total sales of all salesman : "+totalSalesOfAllSalesman);
		
		Salesman highestSales1 = findHighestsalesInCity(salesmans, City.KALYAN);
		System.out.println("\nKalyan With The Highest Sales : " + highestSales1);
		
		Salesman highestSales2 = findHighestsalesInCity(salesmans, City.THANE);
		System.out.println("\nThane With The Highest Sales : " + highestSales2);
		
		
	}
	
	private static Salesman findHighestSales(Salesman[] salesmans) {
		Salesman maxSales = salesmans[0]; //6000
		
		for (int i=0;i<salesmans.length;i++)
		{
			if (salesmans[i].getSalesamount() > maxSales.getSalesamount()) {
				maxSales = salesmans[i];
			   }
		}
			  return maxSales;
	}
	
	 private static Salesman findHighestsalesInCity(Salesman[] salesmans, City type) {
		  Salesman maxAccount = null;
		  
		  for (int i=0; i<salesmans.length; i++) {
		   if (maxAccount==null && salesmans[i].getCity().equals(type)) {
		    maxAccount=salesmans[i];
		   }
		   
		   if (maxAccount != null) {
		    if (salesmans[i].getSalesamount() > maxAccount.getSalesamount() && salesmans[i].getCity().equals(type)) {
		     maxAccount = salesmans[i];
		    }
		   }
		  }
		  
		  return maxAccount;
		 }
	 
	 private static double findTotalSalesOfAllSalesman(Salesman[] salesmans) { 
		  double total=0; 
		  for(int i=0;i<salesmans.length;i++) { 
		   total+=salesmans[i].getSalesamount(); 
		  } 
		  return total; 
		 }
}
