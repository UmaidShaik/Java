package com.aurionpro.model;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class MapTest {

	public static void main(String[] args) {
		Map<Integer,String> namemap=new HashMap();
		namemap.put(101, "Umaid");
		namemap.put(102, "Akash");
		namemap.put(103, "Yash");
		
		
		Set<Entry<Integer, String>> entrySet = namemap.entrySet();
		for(Entry x: entrySet) {
			System.out.println(x.getKey()+" "+x.getValue());
		}
        namemap.forEach((key,value)->{
        	System.out.println(key+" : "+value);
        });
        
        System.out.println(namemap.containsValue("Umaid"));
        namemap.containsKey(102);
	}

}
