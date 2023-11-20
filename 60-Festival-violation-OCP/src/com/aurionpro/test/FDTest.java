package com.aurionpro.test;

import com.aurionpro.model.FestivalType;
import com.aurionpro.model.FixedDeposit;

public class FDTest {
	    public static void main(String[] args) {
	        FixedDeposit fd = new FixedDeposit(12345, "Umaid", 10000, 2, FestivalType.HOLI);
	        
	        System.out.println("Account Number: " + fd.getAccountNumber());
	        System.out.println("Name: " + fd.getName());
	        System.out.println("Principal: " + fd.getPrincipal());
	        System.out.println("Duration: " + fd.getDuration() + " years");
	        System.out.println("Festival: " + fd.getFestival());
	        
	        double interest = fd.calculateSimpleInterest();
	        System.out.println("Simple Interest: " + interest);
	    }
	}


