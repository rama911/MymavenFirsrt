
public class Bankmain {
   
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Bank bank = new Bank("National Australian Bank");
		
		bank.addBranch("Adelaide");
		bank.addCustomer("Adelaide", "Rama", 50.00);
		bank.addCustomer("Adelaide", "Suma", 150.00);
		bank.addCustomer("Adelaide", "Eswar", 250.00);
		bank.addBranch("Sydney");
		bank.addCustomer("Sydney", "Venku", 50.00);
		bank.addCustomer("Sydney", "Banku", 150.00);
		bank.addCustomer("Sydney", "Sai", 250.00);
		
		bank.addcustomerTransaction("Adelaide", "Rama", 100.00);
		bank.printCustomers("Adelaide", true);
		bank.printCustomers("Sydney", true);
		bank.addBranch("Adelaide");
		System.out.println("Branch already exists");
		bank.addCustomer("Adelaide", "Rama", 200.00);
		System.out.println("Customer already exists");
		
	}

}
