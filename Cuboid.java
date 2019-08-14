
public class Cuboid extends Rectangle{
	
	private double height;

	public Cuboid(double length, double width , double height) {
		super(length, width);
		// TODO Auto-generated constructor stub
		if (height <= 0 ) {
			this.height = 0 ;
		                  }
		else {
		this.height = height;
		     }	
	}

	public double getHeight() {
		return this.height;
	}
    public double getVolume() {
    	
    	return getArea() * getHeight();
    }
}
