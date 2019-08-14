import java.util.ArrayList;

public class Bank {
	private String Bankname;
	private ArrayList<Branch> branches;
	
	public Bank(String bankname) {
		this.Bankname = bankname;
		this.branches = new ArrayList<>();
	}
	
	public String getBankname() {
		return Bankname;
	}

	public boolean addBranch(String branchName) {
		if(findBranch(branchName)== null) {
			this.branches.add(new Branch(branchName));
			return true;
		}
		System.out.println("Branch already exists");
		return false;
	}
	public boolean addCustomer(String branchName,String CustomerName,double intialAmount) {
		 Branch branch = findBranch(branchName);
		if(branch!= null) {
			 return branch.addNewcustomer(CustomerName, intialAmount);
		 }
		System.out.println("Branch Name not found in the bank");
		return false;
	}
  
	public boolean addcustomerTransaction(String branchName,String customerName, double initialAmount) {
		 Branch branch = findBranch(branchName);
		if(branch != null) {
		 return branch.addTransaction(customerName, initialAmount);		 
		}
		System.out.println("Branch Name not found"+ branchName);
		return false;
	}
	
	public boolean printCustomers(String branchName,boolean showTransactions) {
		Branch branch = findBranch(branchName);
		if(branch != null) {
			ArrayList<Customer>branchcustomers = branch.getCustomerList();
			for(int i=0; i <branchcustomers.size();i++ ) {
				Customer customer = branchcustomers.get(i);
				System.out.println("Customer name is "+customer.getName()+"[ " + (i+1) + " ]");
				if(showTransactions) {
				  ArrayList<Double> customerTransactions = customer.getTransactions();
				   for (int j = 0; j < customerTransactions.size();j++) {
					   System.out.println("Customer Transaction is "+"[" + (j+1) +"]"+ customerTransactions.get(j)); 
				 }
			 }
		  }
		   
			return true;
	   }
		else {
			return false;
		}
		   
	}
	
	private Branch findBranch(String branchName) {
		for(int i=0;i<branches.size();i++) {
		   Branch existingbranch = branches.get(i);
		   if(existingbranch.getBranchName().equalsIgnoreCase(branchName)) {
			   return existingbranch;
		   }
		}
		   return null;
	}
		
}






