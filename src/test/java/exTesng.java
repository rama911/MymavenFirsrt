import org.testng.annotations.Test;

public class exTesng {
	
  @Test
  public void Palindrome (String word) {   
	    	System.out.println(word);
	    	
	    	StringBuilder nwd = new StringBuilder(word);
	    	 
	    	 String revwd = nwd.reverse().toString();
	    	 
	    	 if(word.equalsIgnoreCase(revwd)){
	    		 System.out.println("This is palandrome");
	    	 }
	    	 else {
	    		 System.out.println("This is not a palandrome");
	    	 }		
	}

}
