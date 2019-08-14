package com.rama.collections;

public class Planet extends HeavenlyBody{

	public Planet(String name, double orbitalperiod) {
		super(name, orbitalperiod, BodyTypes.PLANET);
		// TODO Auto-generated constructor stub		
	}
	@Override
	public boolean addSattelite(HeavenlyBody Moon) {
		if(Moon.getBodyType() == BodyTypes.MOON) {
			return super.addSattelite(Moon);
		}
		return false;
	}
}
