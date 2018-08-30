package branchexample;

public class App 
{
    public void aMethod( String[] args )
    {
    	// TODO fix this
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
