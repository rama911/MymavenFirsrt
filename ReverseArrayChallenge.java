import java.util.Arrays;

public class ReverseArrayChallenge {
	
	private static void reverse (int [] tobeReversed) {
		
		int maxIndex = tobeReversed.length-1;
		int halflength = tobeReversed.length/2;
		int temp;
		for(int i = 0;i < halflength;i++) {
			temp = tobeReversed [i];
			tobeReversed [i] = tobeReversed[maxIndex-i];
			tobeReversed[maxIndex-i] = temp;
		  }
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [] givenArray = {10,15,25,27,29};
		System.out.println("Given Array is " + Arrays.toString(givenArray));
		reverse(givenArray);
		System.out.println("Given Array is " + Arrays.toString(givenArray));
		
	}

}
