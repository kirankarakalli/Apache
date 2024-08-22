package Day46;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

public class MyListner implements ITestListener {
	
	  
	  public void onStart(ITestContext context) {
		  System.out.println("test exceution  stated");
		    
	}
	  
    public void onTestStart(ITestResult result) {
    	  System.out.println("test case  stated");
	  }

	  
	  public void onTestSuccess(ITestResult result) {
		  System.out.println("test success  stated");
	    
	  }

	 
	  public void onTestFailure(ITestResult result) {
		  System.out.println("test failure  stated");
	    
	  }

	  
	  public void onTestSkipped(ITestResult result) {
		  System.out.println("test skipped  stated");
	    
	  }
	  
	

		 
		
		  public void onFinish(ITestContext context) {
			  System.out.println("test finshed ");
		   
		  }

}
