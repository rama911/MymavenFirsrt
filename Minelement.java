import java.util.Arrays;
import java.util.Scanner;

public class Minelement {
	
	static Scanner scanner = new Scanner(System.in);
	
	public static int [] readIntegers(int count) {
		int[] inputIntegers = new int[count];
		System.out.println("Enter "+ count +  "integers in console");
		for (int i=0;i<count;i++){
			inputIntegers[i] = scanner.nextInt();
			scanner.nextLine();
		       }
		return inputIntegers;
	  }
	
    public static int findMin(int[]intArray) {
    	
    	int min = Integer.MAX_VALUE;
//    	Arrays.sort(intArray);
//    	boolean flag = true;
//    	int temp;
//      while(flag) {	
//    	  flag = false;
//    	for(int i=0;i<intArray.length-1;i++) {
//    		if(intArray[i] > intArray[i+1]) {
//    			temp = intArray[i+1] ;
//    			intArray[i] = intArray[i+1];
//    			intArray[i+1] = temp;
//    			flag = true;
//    		}	
//    	}
//    	
//      }
    	
    	for(int i = 0 ; i < intArray.length;i++) {
    		int value = intArray[i];
    		if(value < min) {
    			min = value;
    		}
    	}
    	return min ;
//		return intArray[0];	
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub	
		System.out.println("Enter count");
		Scanner scn = new Scanner(System.in);
		int count = scn.nextInt();
		scn.nextLine();
		int[] uinputIntegers = readIntegers(count);
		int minInteger = findMin(uinputIntegers);
		System.out.println("Minimum Integer is  "+minInteger);

	}
	
	

}
