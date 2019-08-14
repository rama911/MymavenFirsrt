
public class Account {
	
	int AccNumber;
	String AccName;
	
	// Constructor Account
	Account(int Number , String Name){
		this.AccNumber = Number;
		this.AccName = Name;
	}
	
	void ainfo() {
		System.out.println("This is account Number - "+ AccNumber + " This is Account Name - "+AccName );
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Account Bshaw = new Account (154678,"Bernard Shaw");
		Account Shawkins = new Account (1345678,"Stephen Hawkings");
		
	  Bshaw.ainfo();
	  Shawkins.ainfo();
	}

}
