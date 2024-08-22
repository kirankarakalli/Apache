package Day47;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

public class Loginpage2 {
	//constructor
	WebDriver driver;
	Loginpage2(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	
	
	@FindBy(how=How.XPATH,using="//input[@placeholder='Username']") WebElement username;
	@FindBy(xpath="//input[@placeholder='Password']") WebElement password;
	@FindBy(xpath="//button[@type='submit']") WebElement login;
	@FindBy(tagName="a") List<WebElement> links;
	
	//locators
	
	
	//Action methods
	
	
	public void setUser(String user)
	{
		username.sendKeys(user);
	}
	
	
	public void setPass(String pass)
	{
		password.sendKeys(pass);
	}
	
	
	public void clickLog()
	{
		login.click();
	}
	

}
