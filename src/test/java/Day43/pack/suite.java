package Day43.pack;

import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;

public class suite {
	
	@BeforeSuite
	public void beforesuite()
	{
		System.out.println("excecute before suite");
	}
	@AfterSuite
	public void aftersuite()
	{
		System.out.println("excecute After suite");
	}

}
