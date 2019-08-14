
public class RoomComposition {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
//		Room room = new Room ("hawali","Mocha","LG",5,5,"blue");
//		House house = new House(6,2,room);
//		System.out.println(house.getRooms());
//		house.DinningRoom();
//		System.out.println(house.getMyRoom().rDimenssions(5,6));
		
//		Printer printer = new Printer (3,9,true);
//		
//		printer.addToner();
//		printer.print();
//		
		Car car = new Car(true,4,0,"CAR",15);
		car.Accelerator(20);
		car.Break(10);
		car.startEngine();
		
		Honda hr = new Honda(false, 0, 0, "HONDA", 20);
		hr.Accelerator(50);
		hr.Break(30);
		hr.startEngine();
		
		Ford fr = new Ford(false, 0, 0, "FORD", 50);
		fr.Accelerator(50);
		fr.Break(100);
		fr.startEngine();

	}

}

