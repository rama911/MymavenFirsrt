package com.ramagen;

import java.util.ArrayList;
import java.util.Collections;

public class LeagueTable<T extends Team<?>> {
	public String name;
	private ArrayList<T>league = new ArrayList<T>();
	
	public LeagueTable(String name) {
		this.name = name;
	}
	public boolean addTeam(T Team) {
		if(league.contains(Team)) {
			System.out.println("Team already present "+ Team.getName());
			return false;
		}
		league.add(Team);
		return true;
	}
	public int numTeams() {
		return league.size();
	}
	
	public void printLeague() {
		Collections.sort(league);
		for(T t : league) {
		    System.out.println(t.getName()+" :"+ t.ranking());	
		}
	}
}
