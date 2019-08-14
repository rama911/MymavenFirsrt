import java.util.ArrayList;

public class Branch {
	
	private String branchName;
    private ArrayList<Customer> CustomerList;
    
	public Branch(String branchName) {	
		this.branchName = branchName;
		this.CustomerList = new ArrayList<Customer>();
	}
	
	public String getBranchName() {
		return branchName;
	}

	public  ArrayList<Customer> getCustomerList() {
		return CustomerList;
	}
	
	public boolean addNewcustomer(String customerName, double initialAmount) {
		if(findCustomer(customerName) == null) {
			CustomerList.add(new Customer(customerName,initialAmount));
			 return true;
		}
		 return false;                  
	 }
		 
	public boolean addTransaction(String customerName,double Amount){
		     Customer existingCustomer = findCustomer(customerName);
		     if(existingCustomer !=null) {
		    	 existingCustomer.addTransaction(Amount);
			return true;
		     }
		    return false;  
		}
	
	private Customer findCustomer(String Name) {
		
		for(int i=0;i<CustomerList.size();i++) {
			Customer customer = CustomerList.get(i);
			if(customer.getName().equalsIgnoreCase(Name)) {
				return customer;
			}
		}
		return null;
	}
	
	
//   public static Branch addBranch(String  branchName) {
//	return new Branch(branchName);
//	   
//   }
}
