package Day47;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Loginpage {
	//constructor
	WebDriver driver;
	Loginpage(WebDriver driver)
	{
		this.driver=driver;
	}
	
	//locators
	By username= By.xpath("//input[@placeholder='Username']");
	By password= By.xpath("//input[@placeholder='Password']");
	By login= By.xpath("//button[@type='submit']");
	
	//Action methods
	
	
	public void setUserName(String user)
	{
		driver.findElement(username).sendKeys(user);
	}
	
	
	public void setPassword(String password)
	{
		driver.findElement(username).sendKeys(password);
	}
	
	
	public void clickLogin()
	{
		driver.findElement(login).click();
	}
	

}
