package com.ramagen;

import java.util.ArrayList;

public class Team <T extends Player> implements Comparable <Team<T>>{
	
	private String name;
	int played = 0;
	int won = 0;
	int lost = 0;
	int tied = 0;
	
	private ArrayList<T> tmembers = new ArrayList<>();
	
	public Team(String name) {
		this.name = name;
	}
	
	public String getName() {
		return name;
	}

	public boolean addPlayer(T player) {
		if(tmembers.contains(player)) {
			System.out.println("Memeber is already in the list ");
			return false;
		}
		tmembers.add(player);
		System.out.println("New Player "+player.getName()+" added to the team");
		return true;	
	}
	
	public int numPlayer() {
		return this.tmembers.size();
	}
	
	public void matchResult(Team<T> opponent,int ourScore, int theirScore) {
		if(ourScore > theirScore) {
			//System.out.println("Won on");
			won++;
		}else if(ourScore == theirScore) {
			//System.out.println("Draw ");
			tied++;
		}else {
			//System.out.println("Lost ");
			lost++;
		}
		played++;
		if(opponent != null) {
			opponent.matchResult(null,theirScore,ourScore);
		}
	}
	
	public int ranking() {
		return (won*2)+tied;
		
	}
	
	 @Override
	    public int compareTo(Team<T> team) {
	        if(this.ranking() > team.ranking()) {
	            return -1;
	        } else if(this.ranking() < team.ranking()) {
	            return 1;
	        } else {
	            return 0;
	        }
	    }
}
