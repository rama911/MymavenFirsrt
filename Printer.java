
public class Printer {
	
	private double tonerLevel;
	private int pagesToprint;
	private boolean isDuplex;
	
	public Printer(int tonerLevel, int pagesToprint, boolean isDuplex) {
	
		if (tonerLevel > 0 && tonerLevel <100) {
		this.tonerLevel = tonerLevel;
		}
		this.pagesToprint = pagesToprint;
		this.isDuplex = isDuplex;
	}
	
	public double getTonerLevel() {	
		return tonerLevel;
	}
	public int getPagesToprint() {
		return pagesToprint;
	}
	public boolean isDuplex() {
		return isDuplex;
	}

	public void addToner() {
		if (tonerLevel <= 5) {	
		   this.tonerLevel = 100;
		   System.out.println("Printer toner lelve is -" + tonerLevel);
		                   }
	} 
    public void print () {
    
    if (isDuplex) {
    	
    	pagesToprint = (pagesToprint/2) + pagesToprint % 2 ;
     	System.out.println("No of pages printed in duplex mode " + pagesToprint);
     	}
     	
   else {
    	System.out.println("Printed single page"+ pagesToprint);
    	 }
    	
    }
    
}
