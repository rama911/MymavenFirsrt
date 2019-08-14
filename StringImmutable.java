package com.rama.collections;

public class StringImmutable {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String s1 = "java"; 
		s1 = s1.concat(" rules");

		// Yes, s1 still refers to "java"
		System.out.println("s1 refers to " + s1);
		
		Immutableex immutable = new Immutableex(20,"Srinu");
		
		System.out.println(immutable.getId());
		System.out.println(immutable.getName());
		
		//to String equal, hashcode, clone
		String name2 = new String("Srinu");
		String name = name2;
		System.out.println(name == name2?"true":"String");

	}

}
