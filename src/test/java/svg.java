import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class svg {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://selectorshub.com/how-to-automate-svg-elements-in-selenium-cypress-playwright-etc/");
		Thread.sleep(5000);
		WebElement ele=driver.findElement(By.xpath("//*[name()='path' and contains(@d,'M549.655 1')]"));
		Actions act=new Actions(driver);
		act.moveToElement(ele).click().perform();
		//driver.quit();

	}

}
