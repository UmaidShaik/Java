package com.aurionpro.test;

import com.aurionpro.model.FestivalInterest;
import com.aurionpro.model.FixedDeposit;

public class FDTest {
    public static void main(String[] args) {
        FestivalInterest diwaliInterest = new DiwaliInterest();
        FestivalInterest HoliInterest = new HoliInterest();
        
        FixedDeposit fd1 = new FixedDeposit(12345, "Umaid", 10000, 2, diwaliInterest);
        FixedDeposit fd2 = new FixedDeposit(67890, "Shaikh", 15000, 3, HoliInterest);
        
        System.out.println("Account Number: " + fd1.getAccountNumber());
        System.out.println("Name: " + fd1.getName());
        System.out.println("Principal: " + fd1.getPrincipal());
        System.out.println("Duration: " + fd1.getDuration() + " years");
        
        double interest1 = fd1.calculateSimpleInterest();
        System.out.println("Simple Interest: " + interest1+"%");
        
        System.out.println("\nAccount Number: " + fd2.getAccountNumber());
        System.out.println("Name: " + fd2.getName());
        System.out.println("Principal: " + fd2.getPrincipal());
        System.out.println("Duration: " + fd2.getDuration() + " years");
        
        double interest2 = fd2.calculateSimpleInterest();
        System.out.println("Simple Interest: " + interest2);
    }
}

class DiwaliInterest implements FestivalInterest {
    @Override
    public double getInterestRate() {
        return 8.5;
    }
}

class HoliInterest implements FestivalInterest {
    @Override
    public double getInterestRate() {
        return 7.5;
    }
}

class newyear implements FestivalInterest{

	@Override
	public double getInterestRate() {
		return 8;
	}
	
}
