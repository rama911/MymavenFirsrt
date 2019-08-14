package com.rama.collections;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class AdventureMain {
	
	private static Map<Integer, AdventureGame> locations = new HashMap<>();

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		//int loc = scanner.nextInt();
		// TODO Auto-generated method stub
		locations.put(0, new AdventureGame(0,"Sitting infront of computer"));
		locations.put(1, new AdventureGame(1,"You are standing infront of the wall"));
		locations.put(2, new AdventureGame(2,"You are on the top of the hill"));
		locations.put(3, new AdventureGame(3,"You are inside a building, a well house for a small spring"));
		locations.put(4, new AdventureGame(4,"you are in valley"));
		locations.put(5, new AdventureGame(5,"you are in the forrest"));
		
//		System.out.println(locations.get(1).getDescription());
//		System.out.println(locations.get(2).getDescription());
//		System.out.println(locations.get(3).getDescription());
//		System.out.println(locations.get(4).getDescription());
//		System.out.println(locations.get(5).getDescription());
		
		locations.get(1).addExit("W", 2);
		locations.get(1).addExit("E", 3);
		locations.get(1).addExit("N", 5);
		locations.get(1).addExit("S", 4);
			
		locations.get(2).addExit("N", 5);
		locations.get(3).addExit("W", 1);	
		
		locations.get(4).addExit("N", 1);
		locations.get(4).addExit("W", 2);	
		locations.get(5).addExit("S", 1);
        locations.get(5).addExit("W", 2);
		
		Map <String,String> kwd = new HashMap<String , String>();
		
		kwd.put("QUIT", "Q");
		kwd.put("EAST", "E");
		kwd.put("WEST", "W");
		kwd.put("NORTH", "N");
		kwd.put("SOUTH", "S");
		
		// Available exits code
	  int loc = 1;
      while(true) {
          System.out.println(locations.get(loc).getDescription());
          if(loc == 0) {
              break;
          }
          Map<String, Integer> exits = locations.get(loc).getExits();
          
          System.out.print("Available exits are ");
          for(String exit: exits.keySet()) {
              System.out.print(exit + ", ");
          }
          System.out.println();
          String direction = scanner.nextLine().toUpperCase();
          if(direction.length() > 1) {
        	 String[] words = direction.split(" ");
        	 for (String word : words) {
        		 if(kwd.containsKey(word)) {
        		 direction = kwd.get(word);
        		 }
        	 }
          }   
          if(exits.containsKey(direction)){
              loc = exits.get(direction);
          }
          else {
              System.out.println("You cannot go in that direction");
          }
      }
	 scanner.close();	
  }
}
