package com.rama.collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Theater {
	
	private final String theaterName;
	public List<Seat> seats = new ArrayList<>();
	
	public Theater(String theaterName , int numRows, int seatsPerRow) {
		this.theaterName = theaterName;
		int lastRow = 'A'+ numRows-1 ;
		for(char row = 'A' ; row <= lastRow ; row++) {
			for(int seatNum = 1;seatNum <= seatsPerRow ; seatNum++) {
				Seat seat = new Seat(row+String.format("%02d", seatNum));
				seats.add(seat);
			}	
		}
	}
	
	public String getTheaterName() {
		return theaterName;
	}
	
	public void getSeats() {
		for(Seat seat : seats) {
            System.out.println(seat.getSeatNumber());
        }
	}

	public boolean reserveSeat(String seatNumber) {
		// Better Implementation using collections
		  Seat requestedSeat = new Seat(seatNumber);
		  int foundseat = Collections.binarySearch(seats,requestedSeat,null);
		  if(foundseat >= 0 ){
			  return (seats.get(foundseat).reserve());
		  } else {
			  System.out.println("Not able to find the seat  "+seatNumber);
			  return false;
		  }
	// Basic Implementation	  
		  
//		  Seat requestedSeat = null;
//		 for(Seat seat : seats) {
//			if(seat.getSeatNumber().equals(seatNumber)) {
//				requestedSeat = seat;
//				break;
//			}
//		}
//		if(requestedSeat == null) {
//			System.out.println("Requested seat is not available"+ seatNumber);
//		}
//		return requestedSeat.reserve();
    	}
	
	public class Seat implements Comparable<Seat>{
		
		private final String seatNumber;
		private boolean reserved = false;
		
		public Seat(String seatNumber) {
			this.seatNumber = seatNumber;
		}

		public String getSeatNumber() {
			return seatNumber;
		}
		
		public boolean reserve() {
			if(!this.reserved) {
				this.reserved = true;
				System.out.println("Seat "+seatNumber+" reserved");
				return true;
			}else {
				return false;
			}	
		}
		
		public boolean cancel() {
			if(this.reserved) {
			   this.reserved = false;
			   System.out.println("Seat "+seatNumber+" Cancelled");
			   return true;
			} else {
				return false;
			}
		}
		@Override
		public int compareTo(Seat seat) {
			// TODO Auto-generated method stub
			return this.seatNumber.compareToIgnoreCase(seat.getSeatNumber());
		}
	  
	}
}
