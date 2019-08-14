package com.rama.collections;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class SetMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Set<Integer> squares = new HashSet<>();
		Set<Integer> cubes	= new HashSet<>();
		
		for(int i=1;i<=100;i++) {
			squares.add(i*i);
			cubes.add(i*i*i);
		}	
		System.out.println("Squares of the size " +squares.size());
		System.out.println("cubes of the size " +cubes.size());
		Set<Integer> union = new HashSet<>(squares);
		union.addAll(cubes);
		System.out.println("unions size "+union.size());
		
		Set<Integer>intersection = new HashSet<>(squares);
		System.out.println("unions size "+intersection.size());
		intersection.retainAll(cubes);
		System.out.println("unions size "+intersection.size());
		
		for(int i : intersection) {
			System.out.println(i +" Square root of :"+Math.sqrt(i)+" and the cube of  :"+ Math.cbrt(i));
		   }
		
//		Set<String>words = new HashSet<>();
//		String sentence = "This is lord mallikarjuna and amma bramarambika";
//		String[] arraywords = sentence.split(" ");
//		words.addAll(Arrays.asList(arraywords));
//		
//		for(String s :words) {
//			System.out.println("this is the list of sentence :"+ s);
			
	    Set<String> nature = new HashSet<>();
	    Set<String> divine = new HashSet<>();
	    String[] natureWords = {"Agasthya", "Ganesh", "Mallinkarjuna", "Amma", "Arunachala", "Sainatha", "subramanyam", "thee"};
	    nature.addAll(Arrays.asList(natureWords));

	    String[] divineWords = {"to", "err", "is", "Mallinkarjuna", "Amma", "Arunachala", "divine"};
	    divine.addAll(Arrays.asList(divineWords));
	    
	    System.out.println("Nature - Divine");
	    Set<String> diff1 = new HashSet<>(nature);
	    diff1.removeAll(divine);
	    printSet(diff1);
	    
	    Set<String> diff2 = new HashSet<>(divine);
	    diff2.removeAll(nature);
	    printSet(diff2);
	    
	    Set <String> unionTest = new HashSet<>(nature);
	    unionTest.addAll(divine);
	    Set<String> IntersectionTest = new HashSet<>(nature);
	    IntersectionTest.retainAll(divine); 
	    System.out.println("Symetric Difference");
	    unionTest.removeAll(IntersectionTest);
	    printSet(unionTest);	
  }
		
	private static void printSet(Set<String> set) {
        System.out.print("\t");
        for(String s : set) {
            System.out.print(s + " ");
        }
        System.out.println();
    }

}
