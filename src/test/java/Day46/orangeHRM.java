package Day46;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.safari.SafariDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Listeners;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import junit.framework.Assert;


@Listeners(Day46.MyListner.class)
public class orangeHRM {
	
	
	WebDriver driver;
	@BeforeClass
	void setup() throws InterruptedException
	{
		
		driver=new ChromeDriver();
	
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		driver.manage().window().maximize();
	    Thread.sleep(3000);
		
	}
	
	@Test(priority=0)
	void testlogo()
	{
		boolean status=driver.findElement(By.xpath("//img[@alt='company-branding']")).isDisplayed();
		
		Assert.assertEquals(status, true);
		
	}
	
	@Test(priority=2,dependsOnMethods= {"testurl"})
	void testtitle()
	{
		Assert.assertEquals(driver.getTitle(), "OrangeHRM");
		
		
	}
	
	
	@Test(priority=1)
	void testurl()
	{
		Assert.assertEquals(driver.getCurrentUrl(), "https://opensource-demo.orangehrmlive.com/web/index.php");
		
	}
	
	
	@AfterClass
	void tearDown()
	{
		driver.quit();
	}

}
