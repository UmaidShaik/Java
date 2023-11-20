package com.aurionpro.model;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Scanner;
import java.util.Set;

public class MapTest {

	public static void main(String[] args) {
		Scanner sc =new Scanner(System.in);
		Map<Integer,String> namemap=new HashMap();
		namemap.put(101, "Umaid");
		namemap.put(102, "Akash");
		namemap.put(103, "Yash");
		
//		Set<Entry<Integer, String>> entrySet = namemap.entrySet();
//		for(Entry x: entrySet) {
//			System.out.println(x.getKey()+" "+x.getValue());
//		}
		System.out.println("enter the name");
		String name=sc.nextLine();
        
		if (namemap.containsValue(name)) {  
		    namemap.values().removeIf(value -> value.equals(name));
		    namemap.forEach((key, value) -> {   
		    	System.out.println(key + " " + value);
		   });  
		        System.out.println("Name removed from the map.");
		  } else {
		   System.out.println("Name does not exist.");  } 
	}

}
