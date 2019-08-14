package com.ramagen;

public class Maingenerics {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LeagueTable<Team <FootballPlayer>> aflleague = new LeagueTable<>("AFL");
		FootballPlayer rama = new FootballPlayer("RAMA");
		SoccerPlayer suma = new SoccerPlayer("SUMA");
		BaseballPlayer MJ = new BaseballPlayer("JORDAN");
		
		Team<FootballPlayer> adelaidecrows = new Team <>("adeliadecrows");
		Team<FootballPlayer> westcoasteagles = new Team <>("westcoasteagles");
		Team<FootballPlayer> BL = new Team <>("Brisbane Lions");
		Team<FootballPlayer> PA = new Team <>("Port Adelaide");
		Team<SoccerPlayer> manchesterunited = new Team<>("manchesterunited");
		Team <BaseballPlayer>royals = new Team<>("Royals");
		
		adelaidecrows.addPlayer(rama);
		manchesterunited.addPlayer(suma);
		// baseball player is added to football team so to restrict this we use type 
		//adelaidecrows.addPlayer(MJ);
		royals.addPlayer(MJ);
		adelaidecrows.matchResult(westcoasteagles, 5, 7);
		PA.matchResult(BL, 45, 22);
		PA.matchResult(adelaidecrows, 75, 22);
		PA.matchResult(westcoasteagles, 79, 22);
		BL.matchResult(westcoasteagles, 21, 72);
		
		aflleague.addTeam(westcoasteagles);
		aflleague.addTeam(adelaidecrows);
		aflleague.addTeam(BL);
		aflleague.addTeam(PA);
		aflleague.printLeague();

	}

}
