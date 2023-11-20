package com.aurionpro.model;

import java.util.ArrayList;
import java.util.List;

public class ClassifyPlayer{
	
	public List<Player> getAListeners(List<Player> players) {
		
		List<Player> alisters = new ArrayList<>(); 
		for (Player player:players) {
			if (player.getMatches()>100 && (player.getRuns() > 5000 || player.getWickets()>150)) {
				alisters.add(player);
			}
		}
		return alisters;
	}

	
	public List<Player> getBListeners(List<Player> players) {
		
		List<Player> blisters = new ArrayList<>();  
		for (Player player:players) { 
			if ((player.getMatches()>50 && player.getMatches()<=100) && ((player.getRuns() > 3000 && player.getRuns() <= 5000) || (player.getWickets()>75 && player.getWickets()<=150))) {
				blisters.add(player);
			}
		}
		return blisters;
	}
	
	public List<Player> getCListeners(List<Player> players) {
		
		List<Player> clisters = new ArrayList<>(); 
		for (Player player:players) {
			if (player.getMatches()<50 && (player.getRuns() < 3000 || player.getWickets()<150)) {
				clisters.add(player);
			}
		}
		
		return clisters;
	}
	
	
}
