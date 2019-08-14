package com.rama.collections;
import java.util.HashSet;
import java.util.Set;

public class HeavenlyBody {
	
	private final String name;
	private final double orbitalperiod;
	private final Set<HeavenlyBody>sattelites;
	private final BodyTypes bodyType;
	
	public enum BodyTypes {
		STAR,
		PLANET,
		DWARF_PLANET,
        MOON,
        COMET,
        ASTEROID	
	}
	
	public HeavenlyBody(String name , double orbitalperiod, BodyTypes bodyType) {
		this.name = name;
		this.orbitalperiod = orbitalperiod;
		this.sattelites = new HashSet<>();
		this.bodyType = bodyType;
		
	}

	public String getName() {
		return name;
	}

	public double getOrbitalperiod() {
		return orbitalperiod;
	}
	public boolean addSattelite(HeavenlyBody Moon) {
		return this.sattelites.add(Moon);	
	}
	
	public Set<HeavenlyBody> getSattelites() {
		return new HashSet<>(this.sattelites);
	}
	
	
	public BodyTypes getBodyType() {
		return bodyType;
	}

	@Override
    public final boolean equals(Object obj) {
        if(this == obj) {
            return true;
        }
//        if ((obj == null) || (obj.getClass() != this.getClass())) {
//            return false;
//        }
        if(obj instanceof HeavenlyBody) {
        	HeavenlyBody theObject = (HeavenlyBody) obj;
        
        if(this.name.equals(theObject.getName())) {
        	return this.bodyType == theObject.getBodyType();
        }
        }
        return false;
//        String objName = ((HeavenlyBody) obj).getName();
//        return this.name.equals(objName);
    }

    @Override
    public int hashCode() {
        System.out.println("hashcode called");
        return this.name.hashCode() + 57 +this.bodyType.hashCode();
    }

	@Override
	public String toString() {
		return this.name + ":"+ this.orbitalperiod + ":" + this.bodyType ;
	}
    
}
