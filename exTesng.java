import org.testng.annotations.Test;

public class exTesng {
 String word = "malayalam";
  @Test
  public void Palindrome (String word) {   
	    	System.out.println(word);
	    	
	    	StringBuilder nwd = new StringBuilder(word);
	    	 
	    	 String revwd = nwd.reverse().toString();
	    	 
	    	 if(word.equalsIgnoreCase(revwd)){
	    		 System.out.println("This is my palandrome");
	    	 }
	    	 else {
	    		 System.out.println("This is not my palandrome");
	    	 }		
	}

}
