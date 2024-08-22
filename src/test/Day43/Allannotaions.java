package Day43;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Allannotaions {
	

	@BeforeSuite
	public void beforesuite()
	{
		System.out.println("excecute before suite");
	}
	@AfterSuite
	public void aftersuite()
	{
		System.out.println("excecute after suite");
	}
	
	@BeforeTest
	public void beforetest()
	{
		System.out.println("excecute before evry test");
	}
	@Test
	public void abc()
	{
		System.out.println("test1");
	}
	
	@Test
	public void xyz()
	{
		System.out.println("test2");
	}
	
	
	@AfterTest
	public void Aftertest()
	{
		System.out.println("excecute After evry test");
	}

	@BeforeMethod
	public void login()
	{
		System.out.println("beforemethod succesfully");
		
	}
	
	@AfterMethod
	public void logout()
	{
		System.out.println("aftermethod succesfully");
		
	}
	
	@BeforeClass
	public void beforeclass()
	{
		System.out.println("beforeclass succesfully");
		
	}

	@AfterClass
	public void afterclass()
	{
		System.out.println("afterclass succesfully");
		
	}
}
