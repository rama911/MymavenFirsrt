
public class Cylinder extends Circle {
	private double height;
	public Cylinder(double radius , double height) {
		super(radius);
		// TODO Auto-generated constructor stub
		if (height <= 0 ) {	
			height = 0 ;
		                  }
		else {
			this.height = height;
		}
	     }
    public double getHeight() {
		return this.height;	
    }
    public double getVolume() {
    	
		return super.getArea()*getHeight();
    	
    }
}
