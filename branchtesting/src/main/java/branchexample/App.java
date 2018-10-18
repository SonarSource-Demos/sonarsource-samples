package branchexample;

public class App 
{
    public void aMethod( String[] args )
    {
    	int i = 0;
    	if (i != 0) {
    		// TODO fix this too..
    		int j = 5 / i;
    	}
    	//TODO make this a logger
    	System.out.println("IN AMETHOD"); 
    }
    
    public String uncoveredMethod() {
    	return "UNCOVERED";
    }
}
