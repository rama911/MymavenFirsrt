
public class House {
	
	private int rooms;
	private int carParks;
	private Room myRoom;
	
	
	public House(int rooms, int carParks, Room myRoom) {
		this.rooms = rooms;
		this.carParks = carParks;
		this.myRoom = myRoom;
	}
	
	public int getRooms() {
		return rooms;
	}

	public int getCarParks() {
		return carParks;
	}

	public Room getMyRoom() {
		return myRoom;
	}


	public void DinningRoom () {
		System.out.println(myRoom.getColor());
		
	}
	
	public void NumberofRooms() {
		
		
	}
	

}
