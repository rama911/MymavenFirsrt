
package com.rama.collections;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Theatercomparator {
		private final String theaterName;
		private List<Seat> seats = new ArrayList<>();
		static final Comparator<Seat> PRICE_ORDER = new Comparator<Seat>() {
//      Can declare as a static block
//	    static {
//	        PRICE_ORDER = new Comparator<Seat>() {
	            @Override
	            public int compare(Seat seat1, Seat seat2) {
	                if (seat1.getPrice() < seat2.getPrice()) {
	                    return -1;
	                } else if (seat1.getPrice() > seat2.getPrice()) {
	                    return 1;
	                } else {
	                    return 0;
	                }
	            }
 	        };
//	    }
		
		
		public Theatercomparator(String theaterName , int numRows, int seatsPerRow) {
			this.theaterName = theaterName;
			int lastRow = 'A'+ numRows-1 ;
			for(char row = 'A' ; row <= lastRow ; row++) {
				for(int seatNum = 1;seatNum <= seatsPerRow ; seatNum++) {
					double price = 10.00;
					if(row < 'D' && (seatNum >= 4 && seatNum <= 9)){
						price = 14.00;
					}else if((row > 'F') || (seatNum < 4 || seatNum > 9)){
						price = 7.00;
					}
					Seat seat = new Seat(row+String.format("%02d", seatNum),price);
					seats.add(seat);
				}	
			}
		}
		
		public String getTheaterName() {
			return theaterName;
		}
		
		public Collection <Seat> getSeats() {
			return seats;
		}

		public boolean reserveSeat(String seatNumber) {
			// Better Implementation using collections
			  Seat requestedSeat = new Seat(seatNumber,0);
			  int foundseat = Collections.binarySearch(seats,requestedSeat,null);
			  if(foundseat >= 0 ){
				  return (seats.get(foundseat).reserve());
			  } else {
				  System.out.println("Not able to find the seat  "+seatNumber);
				  return false;
			  }
		// Basic Implementation	  
			  
//			  Seat requestedSeat = null;
//			 for(Seat seat : seats) {
//				if(seat.getSeatNumber().equals(seatNumber)) {
//					requestedSeat = seat;
//					break;
//				}
//			}
//			if(requestedSeat == null) {
//				System.out.println("Requested seat is not available"+ seatNumber);
//			}
//			return requestedSeat.reserve();
	    	}
		
		public class Seat implements Comparable<Seat>{
			
			private final String seatNumber;
			private double price;
			private boolean reserved = false;
			
			public Seat(String seatNumber, double price) {
				this.seatNumber = seatNumber;
				this.price = price;
			}

			public double getPrice() {
				// TODO Auto-generated method stub
				return price;
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


