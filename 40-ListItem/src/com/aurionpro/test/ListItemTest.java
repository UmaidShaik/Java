package com.aurionpro.test;

import java.util.ArrayList;

import com.aurionpro.model.ListItem;

public class ListItemTest {

	public static void main(String[] args) {
		ArrayList<ListItem> items = new ArrayList<>();
		items.add(new ListItem(101,"Umaid",100,10));
		items.add(new ListItem(102,"tmaid",200,20));
		items.add(new ListItem(103,"fmaid",300,30));
 
		double totalCart=0;
		for(ListItem each : items) {
			totalCart+=each.totalcost();
			
		}
		System.out.println(totalCart);
		
		
	}

}
