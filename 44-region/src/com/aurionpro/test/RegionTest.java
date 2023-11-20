package com.aurionpro.test;

import java.util.ArrayList;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

import com.aurionpro.model.Region;

public class RegionTest {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the Region code");
		int rcode = sc.nextInt();
		
		Map<Integer,String> Rname=new HashMap();
		Rname.put(1,"Europe");
		Rname.put(2,"Americas");
		Rname.put(3,"Asia");
		Rname.put(4,"Middle East & Africa");
		
		ArrayList<Region> country = new ArrayList<>();
		country.add(new Region("IT", "Italy", 1));
		country.add(new Region("JP", "Japan", 3));
		country.add(new Region("US", "United States of America", 2));
		country.add(new Region("CA", "Canada", 2));
		country.add(new Region("CN", "China", 3));
		country.add(new Region("IN", "India", 3));
		country.add(new Region("AU", "Australia", 3));
		country.add(new Region("ZW", "Zimbabwe",4));
		country.add(new Region("SG", "Singapore", 3));
		country.add(new Region("UK", "United Kingdom", 1));
		country.add(new Region("FR", "France", 1));
		country.add(new Region("DE", "Germany", 1));
		country.add(new Region("ZM", "Zambia", 4));
		country.add(new Region("EG", "Egypt", 4));
		country.add(new Region("BR", "Brazil", 2));
		country.add(new Region("CH", "Switzerland", 1));
		country.add(new Region("NL", "Netherlands", 1));
		country.add(new Region("MX", "Mexico", 2));
		country.add(new Region("KW", "Kuwait", 4));
		country.add(new Region("IL", "Israel", 4));
		country.add(new Region("DK", "Denmark", 1));
		country.add(new Region("HK", "HongKong", 3));
		country.add(new Region("NG", "Nigeria", 4));
		country.add(new Region("AR", "Argentina", 2));
		country.add(new Region("BE", "Belgium", 1));

		if (Rname.containsKey(rcode)) {
			ArrayList<String> countryNames = new ArrayList<>();
			for (Region country1: country) {
				if (country1.getRegioncode() == rcode) {
					countryNames.add(country1.getFname());
				}
			}
			System.out.println(countryNames);
		}
		else {
			System.out.println("Invalid Region ID");
		}
		
		
		System.out.print("Enter Country Code: ");
		String Ccode = sc.next();
		
		boolean isExist = false;
		for (Region country1: country) {
			if (country1.getSname().equalsIgnoreCase(Ccode)) {
				System.out.println(country1.getFname());
				isExist = true;
				break;
			}
		}
		if (!isExist) {
			System.out.println("Country Code Not Found");
		}
		
			
	}


}
