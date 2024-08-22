package Day42;

import org.testng.annotations.Test;

public class FirstTestCase {
	
	@Test(priority=0)
	public  void openapp()  
	{
		System.out.println("openapp successfully.....");
		
	}
	
	@Test(priority=1)
	public  void login()
	{
		System.out.println("login successfully.....");
		
	}
	
	@Test(priority=2)
	public  void logout()
	{
		System.out.println("logout successfully.....");
		
	}

}
