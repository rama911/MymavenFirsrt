import java.util.Scanner;

public class Mobilephone {
	
	private static Scanner scanner = new Scanner(System.in);
	private static Contacts Contacts = new Contacts();
	
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
	
	boolean quit = false;
	int userSelection = 0;
	
	menu();
	while(!quit) {
		
		System.out.println("Enter your choice from menu");
		
		userSelection = scanner.nextInt();
		scanner.nextLine();
		switch(userSelection) {
		case 0 :
			menu();
			break;
		case 1 :
			printContacts();
			break;
		case 2 : 
			addContact();
			break;
		case  3 :
		    editContact();
		     break;
		case 4 :
			deleteContact();
			break;
		case 5 :
		    searchContact();
		    break;
		case 6 :
			quit = true;
			break;
		}
	}
	}
	
	public static void menu() {
        System.out.println("Press ");
        System.out.println(" 0 - Menu options.");
        System.out.println(" 1 - To print saved contacts in the phone.");
        System.out.println(" 2 - To add new contact to the phone.");
        System.out.println(" 3 - To edit contact in the phone.");
        System.out.println(" 4 - To delete contact in the phone.");
        System.out.println(" 5 - To search contact in the phone.");
        System.out.println(" 6 - To quit the application.");
    }
	
	public static void addContact() {
		System.out.println("Enter contact to be added");
		Contacts.addContact(scanner.nextLine());	
	}
    
	public static void printContacts() {
		System.out.println("Total number of contacts in the phone : ");
		Contacts.printContacts();	
	}
	
	public static void editContact() {
		System.out.println("Enter old contact details");
		String oldContact = (scanner.nextLine());
		System.out.println("Enter details to be updated");
		String updateContact  = (scanner.nextLine());
		Contacts.editContact(oldContact, updateContact);	
	}
	public static void deleteContact() {
		System.out.println("Enter contact details to delete");
		Contacts.deleteContact(scanner.nextLine());
	}

	public static void searchContact() {
		System.out.println("Enter contact details to search ");
		Contacts.isaContact(scanner.nextLine());
	}
}
