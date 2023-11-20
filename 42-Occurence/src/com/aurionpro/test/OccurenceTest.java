 package com.aurionpro.test;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class OccurenceTest {

	public static void main(String[] args) {
		
		List<Integer> numberList = Arrays.asList(10,13,13,20,10,40,40,70,60,70,70,70);
		
//		for(Integer x:numberList) {
//			System.out.println(x);
//		}
		int count=0;
		Map<Integer,Integer> countmap=new HashMap();
		for(Integer x:numberList) {
			if(!countmap.containsKey(x) ){
				countmap.put(x, 1);
			}
			else {
				countmap.put(x,countmap.get(x)+1);
			}
		}
		countmap.forEach((key,value)->{
			System.out.println(key+" "+value);
		});


	}

}
