package Day44;

import org.testng.annotations.Test;

import junit.framework.Assert;

public class payment {
	@Test(priority=1,groups= {"regression","sanity","functional"})
	public void paymentinruppes()
	{
		Assert.assertTrue(true);
	}
	
	
	@Test(priority=2,groups= {"regression","sanity","functional"})
	public void paymentindollars()
	{
		Assert.assertTrue(true);
	}

}
