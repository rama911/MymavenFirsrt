
public class vipCustomer {
	
	String FieldName;
	double Creditlimit;
	String EmailAddress;
	
	public vipCustomer() {	
		this("Defaut FieldName",10000.00,"Default EmailName");
		System.out.println("This is empty constructor");
	}
	
	public vipCustomer(String FieldName, double Creidtlimit) {
		this(FieldName,Creidtlimit,"Default Email");
		this.FieldName = FieldName;
		this.Creditlimit = Creidtlimit;
		System.out.println("This is second constructor") ;
	}
	
	public vipCustomer(String FieldName, double Creidtlimit,String EmailAddress) {
		this.FieldName = FieldName;
		this.Creditlimit = Creidtlimit;
		this.EmailAddress = EmailAddress;
	  System.out.println("This is third constructor");
	}

	public String getFieldName() {
		return FieldName;
	}

	public double getCreditlimit() {
		return Creditlimit;
	}

	public String getEmailAddress() {
		return EmailAddress;
	}

}
