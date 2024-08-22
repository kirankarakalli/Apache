package Day44;

import org.testng.annotations.Test;

import junit.framework.Assert;

public class login {
	@Test(priority=1,groups= {"sanity"})
	public void loginByemail()
	{
		Assert.assertTrue(true);
	}
	
	
	@Test(priority=2,groups= {"sanity"})
	public void loginbyfacebook()
	{
		Assert.assertTrue(true);
	}
	
	
	@Test(priority=3,groups= {"sanity"})
	public void loginbyyahoo()
	{
		Assert.assertTrue(true);
	}
	

}
