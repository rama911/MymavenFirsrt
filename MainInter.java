
import java.util.ArrayList;
import java.util.Scanner;

public class MainInter {

	public static void main(String[] args) {
		
		// TODO Auto-generated method stub
		
//		Stores grocery = new Stores("Rama","SuperMarket",54);
//	    System.out.println(grocery.toString());
//	    
//	    System.out.println(grocery.getCategory());
//	     grocery.setCategory("Mens Fashion");
//	     
//	     saveObject(grocery);
//	     System.out.println(grocery.getCategory());
//	     loadObject(grocery);
//	     System.out.println(grocery.toString());
//	    
	     
//	    grocery.setBusinessName("Mama Mia");
//	    saveObject(grocery);
//	    loadObject(grocery);
		
//	    System.out.println(grocery);
		
		Computers mycomp = new Computers("DELL","TG5412",16,64);
		System.out.println(mycomp.toString());
		mycomp.setMake("HP");
		mycomp.setModel("FJ78945");
		mycomp.setMemory(64);
		mycomp.setRam(32);
		saveObject(mycomp);
		
//		loadObject(mycomp);
		System.out.println(mycomp.toString());
	}
		
		public static ArrayList<String> readValues() {
	        ArrayList<String> values = new ArrayList<String>();

	        Scanner scanner = new Scanner(System.in);
	        boolean quit = false;
	        int index = 0;
	        System.out.println("Choose\n" +
	                "1 to enter a string\n" +
	                "0 to quit");

	        while (!quit) {
	            System.out.print("Choose an option: ");
	            int choice = scanner.nextInt();
	            scanner.nextLine();
	            switch (choice) {
	                case 0:
	                    quit = true;
	                    break;
	                case 1:
	                    System.out.print("Enter a string: ");
	                    String stringInput = scanner.nextLine();
	                    values.add(index, stringInput);
	                    index++;
	                    break;
	            }
	        }
	        scanner.close();
	        return values;
	    
		}
		
		public static void saveObject(Isaveable ObjecttoSave) {
			for(int i=0;i<ObjecttoSave.write().size();i++) {
				System.out.println("Saving"+ObjecttoSave.write().get(i)+"to Storage");
			}
		}
		
       public static void loadObject(Isaveable ObjecttoLoad) {
    	   ArrayList <String> values = readValues();
    	   ObjecttoLoad.savedValues(values);
       }

}
