package Day44;

import org.testng.annotations.Test;

import junit.framework.Assert;

public class signup {
	
	@Test(priority=1,groups= {"regression"})
	public void signupByemail()
	{
		Assert.assertTrue(true);
	}
	
	
	@Test(priority=2,groups= {"regression"})
	public void signupfacebook()
	{
		Assert.assertTrue(true);
	}
	
	
	@Test(priority=3,groups= {"regression"})
	public void signupyahoo()
	{
		Assert.assertTrue(true);
	}

}
