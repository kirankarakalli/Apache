package Day45;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import junit.framework.Assert;

public class DaraDriverdemo {
	
	WebDriver driver;
	@BeforeClass
	void setup()
	{
		driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
	}
	
	@Test(dataProvider="dp")
	void testlogin(String Username,String pwd) 
	{
		driver.get("https://tutorialsninja.com/demo/index.php?route=account/login");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//input[@id='input-email']")).sendKeys(Username);
		driver.findElement(By.xpath("//input[@id='input-password']")).sendKeys(pwd);
		driver.findElement(By.xpath("//input[@value='Login']")).click();
		boolean status=driver.findElement(By.xpath("//h2[normalize-space()='My Account']")).isDisplayed();
		
		if(status==true)
		{
		
			driver.findElement(By.xpath("//a[@class='list-group-item'][normalize-space()='Logout']")).click();
			Assert.assertTrue(true);
			
		}
		else
		{
			Assert.fail();
		}
		
	}
	
	@DataProvider(name="dp",indices= {0,1})
	Object[][] loginData()
	{
		Object data[][]= {{"kirankarakalli92@gmail.com","Kirank@123"},
				          {"Admin","admin"},
				          {"admin","admin123"}
				          
		};
		
		return data;
	}
	
	@AfterClass
	void tearDown()
	{
		driver.quit();
		
	}
	
	

}
