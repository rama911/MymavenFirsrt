
import java.util.ArrayList;
import java.util.List;

public class Stores implements Isaveable {
	
	String Name;
	String Category;
	int streetNumber;
	String businessName;
	
	public Stores(String name, String category, int streetNumber) {
		super();
		this.Name = name;
		this.Category = category;
		this.streetNumber = streetNumber;
		this.businessName = "Sai Balaji Stores";
	}
	
	public String getName() {
		return Name;
	}
	public String getCategory() {
		return Category;
	}
	public int getStreetNumber() {
		return streetNumber;
	}

	public String getBusinessName() {
		return businessName;
	}

	public void setName(String name) {
		Name = name;
	}

	public void setCategory(String category) {
		Category = category;
	}

	public void setStreetNumber(int streetNumber) {
		this.streetNumber = streetNumber;
	}

	public void setBusinessName(String businessName) {
		this.businessName = businessName;
	}

	@Override
	public String toString() {
		return "Stores [Name=" + Name + ", "
				+ "Category=" + Category + ", "
				+ "streetNumber=" + streetNumber + ", "
				+ "businessName="+ businessName + "]";
	}


	@Override
	public List<String> write() {
		// TODO Auto-generated method stub
		List <String> values = new ArrayList<>();
		values.add(0,this.Name);
		values.add(1,this.Category);
		values.add(2,"" +this.streetNumber);
		values.add(3,this.businessName);
		
		return values;
	}
	@Override
	public void savedValues(List<String> savedItems) {
		// TODO Auto-generated method stub
		if(savedItems != null  && savedItems.size() > 0) {
			this.Name = savedItems.get(0);
			this.Category = savedItems.get(1);
			this.streetNumber = Integer.parseInt(savedItems.get(2));
			this.businessName = savedItems.get(3);
		}
		
	}

	

}
