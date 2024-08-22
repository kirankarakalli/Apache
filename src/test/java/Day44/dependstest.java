package Day44;

import org.testng.annotations.Test;

import junit.framework.Assert;

public class dependstest {
	
	@Test(priority=0)
	public void openapp()
	{
		Assert.assertTrue(true);
	}
	
	@Test(priority=1,dependsOnMethods= {"openapp"})
	public void login()
	{
		Assert.assertTrue(true);
	}
	
	
	@Test(priority=2,dependsOnMethods= {"login"})
	public void search()
	{
		Assert.assertTrue(false);
	}
	
	
	@Test(priority=3,dependsOnMethods= {"login","search"})
	public void advsearch()
	{
		Assert.assertTrue(true);
	}
	
	@Test(priority=4,dependsOnMethods= {"login"})
	public void logout()
	{
		Assert.assertTrue(true);
	}

}
