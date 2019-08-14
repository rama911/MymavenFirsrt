import java.util.ArrayList;
import java.util.List;

public class Computers implements Isaveable {
	
	private String make;
    private String model;		
    private int ram;													
    private int memory;
    
	public Computers(String make, String model, int ram, int memory) {
		this.make = make;
		this.model = model;
		this.ram = ram;
		this.memory = memory;
	}

	public String getMake() {
		return make;
	}

	public String getModel() {
		return model;
	}

	public int getRam() {
		return ram;
	}

	public int getMemory() {
		return memory;
	}

	public void setMake(String make) {
		this.make = make;
	}

	public void setModel(String model) {
		this.model = model;
	}

	public void setRam(int ram) {
		this.ram = ram;
	}

	public void setMemory(int memory) {
		this.memory = memory;
	}

	@Override
	public String toString() {
		return "Computers [make=" + make 
				+ ", model=" + model
				+ ", ram=" + ram 
				+ ", memory=" + memory + "]";
	}

	@Override
	public List<String> write() {
		// TODO Auto-generated method stub
		List <String> values = new ArrayList<>();
		values.add(0,this.make);
		values.add(1,this.model);
		values.add(2,"" +this.ram);
		values.add(3,""+ Integer.toString(this.memory));
				
		return values;
		
	}

	@Override
	public void savedValues(List<String> savedItems) {
		
		// TODO Auto-generated method stub
		
		if(savedItems != null  && savedItems.size() > 0) {
			this.make = savedItems.get(0);
			this.model = savedItems.get(1);
			this.ram = Integer.parseInt(savedItems.get(2));
			this.memory = Integer.parseInt(savedItems.get(3));
		}
		
	}
    
	
    
    
}
