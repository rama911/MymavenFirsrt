
public class myConstructor {
	
	int Cnumber;
	String CName;
	
 myConstructor (int number,String name) {
	 this.Cnumber = number;
	 this.CName = name;
   } 
  void info(){
	 System.out.println("This is number "+Cnumber+ " This is Cname "+ CName);
 }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		myConstructor obj1 = new myConstructor(1111,"Rama");
		myConstructor obj2 = new myConstructor(2222,"Krishna");
		
		obj1.info();
		obj2.info();
	}

}
