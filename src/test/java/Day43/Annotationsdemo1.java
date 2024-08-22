package Day43;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Annotationsdemo1 {
	
	
	@BeforeMethod
	public void login()
	{
		System.out.println("login succesfully");
		
	}
	
	@Test(priority=1)
	public void search()
	{
		System.out.println("search succesfully");
		
	}
	
	@Test(priority=2)
	public void advsearch()
	{
		System.out.println("Advsearch succesfully");
		
	}
	
	@AfterMethod
	public void logout()
	{
		System.out.println("logout succesfully");
		
	}

}
