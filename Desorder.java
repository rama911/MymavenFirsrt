import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class Desorder {
	
	private static  Scanner scn = new Scanner(System.in);

	public static void main(String[] args) {
		// TODO Auto-generated method stub
     
	int [] givenInteger = getInteger(5);
	int [] sortedInteger = sortIntegers(givenInteger);
	printInteger(sortedInteger);
//	Arrays.sort(givenInteger);
//	System.out.println(givenInteger.length);
//	for (int i=0;i<givenInteger.length;i++) {
//		System.out.println(givenInteger[(givenInteger.length-1)-i]);
	                                        }
	public static int[] getInteger(int number) {
		System.out.println("Enter 5 Numbers");
    	int [] intValue = new int[number] ;
    	for(int i=0 ;i<intValue.length;i++ ) {
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
        int [] sortedArray = new int [intArray.length];
       for (int i=0;i< intArray.length;i++)  {
    	   sortedArray[i] = intArray[i];
       }
       boolean flag = true;
       
       while(flag) {
    	 flag = false;
     	    for(int i=0; i<sortedArray.length-1;i++){ 
     		    if (sortedArray[i] < sortedArray[i+1]) {
     			   int temp = sortedArray[i];
     			   sortedArray[i] = sortedArray[i+1];
     			   sortedArray[i+1] = temp;
     			   flag = true;
     		   }
     		                                    }
     }
       return sortedArray;
    }   
}
