
public class Car {
	
	private boolean engine;
    private int Cylinders;
    private int Wheels;
    private int Velocity;
    private int Seats;
	private String Name;
	public Car(boolean engine, int cylinders, int wheels, String Name, int Velocity) {
		
		this.engine = true;
		this.Cylinders = cylinders;
		this.Wheels = 4;
		this.Name = Name;
		this.Velocity = Velocity;
	}
	public int getCylinders() {
		return Cylinders;
	}
	public String getName() {
		return Name;
	}
	public void setCylinders(int cylinders) {
		this.Cylinders= cylinders;
	}
	public boolean startEngine() {
		System.out.println("Engine Started - CAR");
		return engine;	
	}
	public int Accelerator(int speed) {
	   Velocity += speed;
	   System.out.println("Acceleration of the"+ Name+ " is " +Velocity );
	   return Velocity;		
	}
    public int Break(int speed) {
		Velocity -= speed;
		System.out.println("Breakingspeed of the"+ Name +" is "+Velocity );
		return Velocity;
    }
}

class Honda extends Car {

	public Honda(boolean engine, int cylinders, int wheels, String Name, int Velocity) {
		super(engine, cylinders, wheels, Name, Velocity);
		// TODO Auto-generated constructor stub
	}
	@Override
	public boolean startEngine() {
		// TODO Auto-generated method stub
		return super.startEngine();
	}
	@Override
	public int Accelerator(int speed) {
		// TODO Auto-generated method stub
		return super.Accelerator(speed);
	}
	@Override
	public int Break(int speed) {
		// TODO Auto-generated method stub
		return super.Break(speed);
	}
	
}
		
class Ford extends Car {

	public Ford(boolean engine, int cylinders, int wheels, String Name, int Velocity) {
		super(engine, cylinders, wheels, Name, Velocity);
		// TODO Auto-generated constructor stub
	}
	@Override
	public boolean startEngine() {
		// TODO Auto-generated method stub
		return super.startEngine();
	}
	@Override
	public int Accelerator(int speed) {
		// TODO Auto-generated method stub
		return super.Accelerator(speed);
	}
	@Override
	public int Break(int speed) {
		// TODO Auto-generated method stub
		return super.Break(speed);
	}
	
}

 