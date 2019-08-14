
public class Room {
	
	private String dinningTable;
	private String coffeTable;
	private String televisionSet;
	private String color;
	private double length;
	//private double length;
	private double width;
	
	public Room(String dinningTable, String coffeTable, String televisionSet, double length, double width , String color) 
	{
		this.dinningTable = dinningTable;
		this.coffeTable = coffeTable;
		this.televisionSet = televisionSet;
		this.length = length;
		this.width = width;
		this.color = color;
	}

	public String getDinningTable() {
		return dinningTable;
	}

	public String getCoffeTable() {
		return coffeTable;
	}

	public String getTelevisionSet() {
		return televisionSet;
	}
	public String getColor() {
		return color;
		
	} String Name (String roomType) {
		return roomType;
	}
	
	public double rDimenssions(double length, double width) {
	
		return length* width;
		
		
	}

}
