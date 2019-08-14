
public class Burger {
	
	private String rollType;
	private String meat;
	protected double price;
	private String  bName;
	
	
	
	public Burger(String rollType, String meat, double price, String bName) {
		
		this.rollType = rollType;
		this.meat = meat;
		this.price = price;
		this.bName = bName;
	}
	
	 public double basePrice() {
		return price;
	}
	// Assuming all 4 additions 
	public double finalPrice(double addPrice,String addName) {
		
	  if (addName.equalsIgnoreCase("Tomato")) {	
		System.out.println("Tomato Added to the burger");
		price += addPrice;
		return price;
	    }
	  else if(addName.equalsIgnoreCase("Lettuce")){
		  System.out.println("Lettuce Added to "+rollType+bName+meat+" Burger");
		  price += addPrice;
		  return price;
	                                           }
	  else if (addName.equalsIgnoreCase("Carrot")) {
		  System.out.println("Carrot Added to the burger");
		  price += addPrice;
		  return price;
	  }
	  else
	    System.out.println(addName+ " added to the burger");
	    price += addPrice;
		return price;
	  }
}
class HealthyBurger extends Burger {
	
	public HealthyBurger(String rollType, String meat, double price, String bName) {
		super(rollType, meat, price, bName);
		rollType = "brown rye bread roll";
		bName = "Health Burger";
		meat = "Vegetarian";
		                                                                                 }
	@Override
	public double basePrice() {
		// TODO Auto-generated method stub
		return super.basePrice();
	}
	@Override
	public double finalPrice(double addPrice, String addName) {
		
		if (addName.equalsIgnoreCase("Vegetarain")) {
			   price += addPrice;
			  return price;	
		}     
		else if (addName.equalsIgnoreCase("Sauce")) {
			  price += addPrice;
			  return price;
		}
		else {
		// TODO Auto-generated method stub
			price = super.finalPrice(addPrice, addName);
			return price;
		}
	}
  }
  class DeluxeBurger extends Burger {

	public DeluxeBurger() {
		super("White", "Ham",11,"Deluxe");
		// TODO Auto-generated constructor stub
	}

	@Override
	public double finalPrice(double addPrice, String addName) {
		
		if (addName.equalsIgnoreCase("Chips")) {
			   price += addPrice;
			  return price;	
		}     
		else if (addName.equalsIgnoreCase("Drink")) {
			  price += addPrice;
			  return price;
		}
		
		else {
		// TODO Auto-generated method stub
		return super.finalPrice(0, "Nothing");
		     }
	}
	
	  
  }

