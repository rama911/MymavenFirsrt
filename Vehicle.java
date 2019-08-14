
public class Vehicle {
	
	private String handsteering;
	private int changegears;
	private int speed;
	
  public Vehicle(String handsteering, int changegears, int speed) {
	  
	  this.handsteering = handsteering;
	  this.changegears = changegears;
	  this.speed = speed;
  }
  
  public void VehSpeed(int speed) {
	  
	  if (speed < 25) {
		  System.out.println("this is low speed vehcile");
	  }
	  else if (speed > 25 && speed < 50 ) {
		  System.out.println("this is a moderate speed vechicle");
	  }
	  else {
		  System.out.println("this is a high speed vehicle");
	  }
	  
  }
  
}
