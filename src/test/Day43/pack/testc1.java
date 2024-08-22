package Day43.pack;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class testc1 {
	
	
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
	
	
	

}
