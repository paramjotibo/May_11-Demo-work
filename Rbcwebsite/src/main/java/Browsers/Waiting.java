package Browsers;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Waiting {
 
	public WebDriver driver;
	int i;
	public Waiting (WebDriver driver)
	{
		this.driver=driver;
	}
	
	public void WaitForElement(WebElement element)
	{
		WebDriverWait W=new WebDriverWait(driver,Duration.ofSeconds(10));
		W.until(ExpectedConditions.visibilityOf(element));
		
	}
	
	

	
}
