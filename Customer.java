import java.util.ArrayList;

public class Customer {
	
	private String Name;
	private ArrayList<Double> Transactions;
	
	public Customer(String name,double transactionAmount) {
		this.Name = name;
		this.Transactions = new ArrayList<>();
		addTransaction(transactionAmount);
		
	}
	
	public String getName() {
		return Name;
	}

	public  ArrayList<Double> getTransactions() {
		return Transactions;
	}

	public void addTransaction(double transactionAmout) {
		Transactions.add(transactionAmout);
	}
	
//	
//	public static Customer addCustomer(String Name ,double transactionAmout) {
//		return new Customer(Name,transactionAmout);
//		
//	}
	

}
