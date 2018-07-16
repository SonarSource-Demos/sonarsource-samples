package branchexample;

public class App 
{
    public void aMethod( String[] args )
    {
    	if (true) {
    		// TODO something new
    	}
    	System.out.println("IN AMETHOD"); 
    }
    
    public String uncoveredMethod() {
    	return "UNCOVERED";
    }
}
