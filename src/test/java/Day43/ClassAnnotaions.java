package Day43;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class ClassAnnotaions {
	@BeforeClass
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
	
	@AfterClass
	public void logout()
	{
		System.out.println("logout succesfully");
		
	}

}
