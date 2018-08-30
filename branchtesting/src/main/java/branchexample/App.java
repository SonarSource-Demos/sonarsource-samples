package branchexample;

import java.math.BigDecimal;

public class App 
{
	public static String vulnerableString = new String();
	
    public void aMethod( String[] args )
    {
    	double d = 1.1;

    	BigDecimal bd1 = new BigDecimal(d); // Buggy
    	int i = 0;
    	if (i == 0) {
    		// TODO fix this too..
    		int j = 5 / i;
    	}
    	System.out.println("IN AMETHOD");
    	System.out.println("New issue"); 
    }
    
    public String uncoveredMethod() {
    	return "UNCOVERED";
    }
}
