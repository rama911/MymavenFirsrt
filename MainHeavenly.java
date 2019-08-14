package com.rama.collections;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class MainHeavenly {
	
	private static Map<String, HeavenlyBody> solarsystems = new HashMap<>();
	private static Set<HeavenlyBody> planets = new HashSet<>();

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        
		HeavenlyBody temp = new Planet("Earth", 365);
		solarsystems.put(temp.getName(), temp);
		planets.add(temp);
		
		temp = new Planet("Mercury", 88);
		solarsystems.put(temp.getName(), temp);
		planets.add(temp);
		
		temp = new Planet("Venus", 125);
		solarsystems.put(temp.getName(), temp);
		planets.add(temp);
		
		HeavenlyBody tempMoon = new Moon("Moon", 365);
		solarsystems.put(temp.getName(), tempMoon);
		temp.addSattelite(tempMoon);
		
		temp = new Planet("Mars", 687);
        solarsystems.put(temp.getName(), temp);
        planets.add(temp);

        tempMoon = new Moon("Deimos", 452);
        solarsystems.put(tempMoon.getName(), tempMoon);
        temp.addSattelite(tempMoon); // temp is still Mars

        tempMoon = new Moon("Phobos", 283);
        solarsystems.put(tempMoon.getName(), tempMoon);
        temp.addSattelite(tempMoon); // temp is still Mars

        
        
        temp = new Planet("Pluto", 587);
        solarsystems.put(temp.getName(), temp);
        planets.add(temp);
        
        temp = new Planet("Pluto", 285);
        solarsystems.put(temp.getName(), temp);
        planets.add(temp);

		System.out.println("planets");
		
		for(HeavenlyBody planet : planets) {
			System.out.println("\t"+ planet.getName());
		}
		
		HeavenlyBody body = solarsystems.get("Mars");
		System.out.println("Moons of "+ body.getName());
		
		 for(HeavenlyBody marsmoon: body.getSattelites()) {
	            System.out.println("\t" + marsmoon.getName());
	        }
		 
		 Set<HeavenlyBody>moons = new HashSet<>();
		 for(HeavenlyBody planet : planets) {
			 System.out.println(planet);
			 moons.addAll(planet.getSattelites());
		 }
		 
		 System.out.println("All Moons");
		 for(HeavenlyBody moon : moons) {
			 System.out.println(moon.getName());
			 System.out.println(moon.getOrbitalperiod());
		 }
		 
	   } 

}
