
public class NewAccount {
	
	public int AccountNumber;
	private String AccountName;
	private String AccountAddress;
	private String AccountEmial;
	private double AccountBalance;
	
	public NewAccount() {
		this(11111,"DefaultName","Default Address","DefautEmail",1000.00);
		System.out.println("Empty constructor called");
		
	}
	
	public NewAccount(int AccountNumber, String AccountName, String AccountAddress,String AccountEmail, double AccountBalance)
	{
		this.AccountNumber = AccountNumber;
		this.AccountName = AccountName;
		this.AccountAddress = AccountAddress;
		this.AccountEmial = AccountEmail;
		this.AccountBalance = AccountBalance;
		System.out.println("This is constructor with parameters");
	}
	

	public NewAccount(String accountName, String accountAddress, String accountEmial) {
		this(99999,accountName,accountAddress,accountEmial,500.00);
	}

	public int getAccountNumber() {
		return AccountNumber;
	}
	public void setAccountNumber(int accountNumber) {
		this.AccountNumber = accountNumber;
	}
	public String getAccountName() {
		return AccountName;
	}
	public void setAccountName(String accountName) {
		this.AccountName = accountName;
	}
	public String getAccountAddress() {
		return AccountAddress;
	}
	public void setAccountAddress(String accountAddress) {
		this.AccountAddress = accountAddress;
	}
	public String getAccountEmial() {
		return AccountEmial;
	}
	public void setAccountEmial(String accountEmial) {
		this.AccountEmial = accountEmial;
	}
	public double getAccountBalance() {
		return AccountBalance;
	}
	public void setAccountBalance(double accountBalance) {
		this.AccountBalance = accountBalance;
	}
	
  public void Deposit(double DepositAmount){
	  
	  this.AccountBalance += DepositAmount ;
	  System.out.println("This is the Account Balance "+AccountBalance);
	  
  }
  
  public void WithDrawl(double WdAmount) {
	 
	  if(this.AccountBalance-WdAmount < 0) {	  
		 System.out.println("No Enough balance to withdraw");
	                                  }
	 else {
			 this.AccountBalance -= WdAmount ;
			 System.out.println("This is the Account Balance "+AccountBalance);
		 }
	  }
  }
  

