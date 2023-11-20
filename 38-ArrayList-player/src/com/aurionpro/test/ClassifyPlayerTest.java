package com.aurionpro.test;

import java.util.ArrayList;
import java.util.List;
import com.aurionpro.model.ClassifyPlayer;
import com.aurionpro.model.Player;

public class ClassifyPlayerTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Player> players = new ArrayList<>();
		
		players.add(new Player(1, "sam", 200, 4000, 85));
		players.add(new Player(2, "Jam", 70, 7000, 160));
		players.add(new Player(3, "caam", 40, 3500, 170));
		players.add(new Player(4, "taam", 150, 4000, 140));
		players.add(new Player(5, "paam", 180, 6000, 155));
		players.add(new Player(6, "raam", 80, 1000, 96));
		players.add(new Player(7, "yam", 90, 6670, 112));
		players.add(new Player(8, "daam", 40, 4196, 89));
		players.add(new Player(9, "Maam", 150, 7000, 140));
		players.add(new Player(10, "laam", 87, 3186, 91));
		
		ClassifyPlayer classify = new ClassifyPlayer();
		
		List<Player> alister = classify.getAListeners(players);
		List<Player> blister = classify.getBListeners(players);
		List<Player> clister = classify.getCListeners(players);
		
		System.out.println("A-Listers are :");
		for(Player alist:alister) {
			System.out.println(alist);
		}
		
		System.out.println("***********************************************************\n");
		
		System.out.println("B-Listers are :");
		for(Player blist:blister) {
			System.out.println(blist);
		}
		
		System.out.println("***********************************************************\n");
		
		System.out.println("C-Listers are :");
		for(Player clist:clister) {
			System.out.println(clist);
		}
		
		System.out.println("***********************************************************\n");
		


	}

}
