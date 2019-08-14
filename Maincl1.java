package com.rama.collections;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Maincl1 {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Theater theater = new Theater("Rama",12,10);
		Theatercomparator tc = new Theatercomparator ("Rama",12,14);
		
//		List<Theatercomparator.Seat> revList = new ArrayList <>(tc.getSeats());
//		Collections.reverse(revList);
//		printList(revList);
		
		List<Theatercomparator.Seat> prcList = new ArrayList <>(tc.getSeats());
		prcList.add(tc.new Seat("B00",33.00));
		prcList.add(tc.new Seat("F00",23.00));
		Collections.sort(prcList, Theatercomparator.PRICE_ORDER);
		printList(prcList);
		
		
		// copy array - shallow copy referencing to same object seats
//		List<Theater.Seat> seatCopy = new ArrayList<>(theater.seats);
//		List<Theater.Seat> seatClone = new ArrayList<>(theater.seats);
//		System.out.println(theater.seats.size());
//		System.out.println(seatCopy.size());
//		System.out.println(seatClone.size());
		//Collections.copy(seatClone, theater.seats);
		
		//seatClone.addAll(theater.seats);
//		Iterator <Theater.Seat> itereator = theater.seats.iterator();
//		while(itereator.hasNext()){
//			seatClone.addAll(theater.seats);
//		}
//		
//		System.out.println(Collections.min(seatCopy).getSeatNumber());
//		System.out.println(Collections.max(seatCopy).getSeatNumber());
		
 		//printList(seatClone);
//		seatCopy.remove(3);
//		printList(seatCopy);
//		printList(theater.seats);
//		printList(seatCopy);
//		Collections.reverse(seatCopy);
//		printList(seatCopy);
//		Collections.sort(seatCopy);
//		printList(seatCopy);
//		theater.getSeats();
//		System.out.println(theater.getTheaterName());
//		
		if(tc.reserveSeat("H09")) {
		System.out.println("Please pay");
		} else {
			System.out.println("Seat not available");
		}
		if(tc.reserveSeat("H09")) {
			System.out.println("Please pay");
		} else {
		    System.out.println("Seat not available");
		}
		if(tc.reserveSeat("H08")) {
			System.out.println("Please pay");
		} else {
		    System.out.println("Seat not available");
		}
		if(tc.reserveSeat("H09")) {
			System.out.println("Please pay");
		} else {
		    System.out.println("Seat not available");
		}
 	}
	
	public static void printList(List<Theatercomparator.Seat> list) {
	    for(Theatercomparator.Seat seat : list) {
	        System.out.print(" " + seat.getSeatNumber()+"  "+ seat.getPrice());
	    }
	    System.out.println();
	    System.out.println("======================================================================");
    }
	
 }
// Deep copy example
//ArrayList<Employee> employeeList = new ArrayList<>();
//ArrayList<Employee> employeeListClone = new ArrayList<>();
// 
//Iterator<Employee> iterator = employeeList.iterator();
// 
//while(iterator.hasNext())
//{
//    //Add the object clones
//    employeeListClone.add((Employee) iterator.next().clone()); 
//}


