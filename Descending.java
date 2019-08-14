import java.io.InputStream;
import java.util.Scanner;
public class Descending {
	
  private static  Scanner scn = new Scanner(System.in);
  
      int [] givenInteger = getInteger(5);
      
    public static int [] getInteger(int number) {
    	System.out.println("Enter 5 Numbers");
    	int [] intValue = new int[number] ;
    	for (int i=0 ;i<= intValue.length;i++ ) {
    		 intValue[i] = scn.nextInt();
    	}
		return intValue;	
    }
    
    public static void printInteger(int[] prntInteger) {
    	for (int i=0;i < prntInteger.length;i++) {
    		System.out.println(prntInteger[i]);
    	}
    }
    
    public static int [] sortIntegers(int [] intArray) {
       int [] sortedArray = new int [intArray.length-1];
    	  for(int i=0;i<sortedArray.length;i++){	
    		   sortedArray[i] = intArray[i];
    		   if (sortedArray[i] < sortedArray[i+1]) {
    			   int temp = sortedArray[i+1];
    			   sortedArray[i] = sortedArray[i+1];
    			   sortedArray[i+1] = temp;
    		   }
    		                                    }
    	return sortedArray;
    }
	
}

