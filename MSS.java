import java.util.Scanner;

public class MSS {
	
	private static Scanner scanner = new Scanner(System.in);
	private static Memberservice ms = new Memberservice("123 456 678");

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		boolean quit = false;
		memberOptions();
		
		while(!quit) {
			int memberSelection = scanner.nextInt();
			scanner.nextLine();
			switch(memberSelection) {
			   
			case 0:
                System.out.println("Shutting down...");
                quit = true;
                break;

            case 1:
            	ms.printMembers();
                break;

            case 2:
            	addNewMember();
                break;

            case 3:
            	updateMember();
                break;

            case 4:
                removeMember();
                break;

            case 5:
                queryMember();
                break;

            case 6:
            	memberOptions();
                break;
			}
		}	
	}
		
	private static void addNewMember() {
		System.out.println("Enter Member Name to add");
		String name = scanner.nextLine();
		System.out.println("Enter Phone number to add");
		String phone = scanner.nextLine();
		Member newMember = Member.CreateMember(name, phone);
		if(ms.addNewMember(newMember)) {
			System.out.println("New Memeber Added "+name+"Phone number is "+phone);
		}else
		{
			System.out.println("Memeber is already on file "+name);
		}	
	}
	
	private static void updateMember() {
		System.out.println("Enter existing Memebr Name");
		String name = scanner.nextLine();
		Member existingMember = ms.searchMember(name);
		if(existingMember == null) {
			System.out.println("Member Not found");
		}
		System.out.println("Enter new member Name");
		String newName = scanner.nextLine();
		System.out.println("Enter new phone number");
		String phone = scanner.nextLine();
		Member newMember = Member.CreateMember(newName, phone);
		if(ms.updateMember(existingMember, newMember)) {
			System.out.println("New Memeber Added "+newName+"Phone number is "+phone);
		}else {
			System.out.println("Error updating the record");
		}
	}
    
	private static void removeMember() {
		System.out.println("Enter Member Name that need to be removed");
		String name = scanner.nextLine();
		Member existingMember = ms.searchMember(name);
		if(existingMember == null) {
			System.out.println("Member Not found");
		}
		if(ms.removeMember(existingMember)) {
			System.out.println("Member deleted with name"+existingMember.getName()+"is deleted from the application ");
		}
		else {
			System.out.println("Not able to remover member form application");
		}
	}
	
	private static void queryMember(){
		System.out.println("Enter Member name you want to searc");
		String name = scanner.nextLine();
		Member existingMember = ms.searchMember(name);
		if(existingMember==null) {
			System.out.println("member not found");
		}
		else {
			System.out.println("Member found in application"+existingMember.getName()+existingMember.getPhNumber());	
		}
	}
	 
	private static void memberOptions() {
		// TODO Auto-generated method stub
		System.out.println("Available options: press");
        System.out.println("0  - to shutdown \n" +
                           "1  - to view Members\n" +
                           "2  - to add a new member\n" +
                           "3  - to update existing an existing member\n" +
                           "4  - to remove an existing member\n" +
                           "5  - query if an existing member\n" +
                           "6  - to print a list of available actions.\n");
        System.out.println("Choose your option: ");
		
	}	
}
