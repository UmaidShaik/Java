package com.aurionpro.test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import com.aurionpro.model.custom;

public class CTest {

	    public static void main(String[] args) {
	        List<custom> cus = new ArrayList<>(Arrays.asList(
	            new custom(1, "Umaid", 80),
	            new custom(2, "Zaid", 70)
	        ));

	        for (custom x : cus) {
	            System.out.println(x);
	        }

	        cus.remove(0);

	        System.out.println("After removal:");

	        for (custom y : cus) {
	            System.out.println(y);
	        }
	        cus.add(new custom(5,"Savg",50));
	    }
}
