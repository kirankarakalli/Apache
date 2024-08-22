package Day43.pack;

import org.testng.annotations.AfterTest;
import org.testng.annotations.Test;

public class testc2 {
	
	@Test
	public void abc()
	{
		System.out.println("test2");
	}
	
	
	@AfterTest
	public void Aftertest()
	{
		System.out.println("excecute After evry test");
	}


}
