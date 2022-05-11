package April10.Rbcwebsite;

import java.io.IOException;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.AfterTest;
import org.testng.annotations.Test;

import Browsers.Generalfile;
import PageObjects.Loginpage;

public class CreditTest extends Generalfile {
	 public static Logger log=LogManager.getLogger(Generalfile.class.getName());
public WebDriver driver;
/*	@BeforeTest
	public void invokebrowser() throws IOException
	{
		 driver=Callbrowser();
		 driver.get("https://www.rbcroyalbank.com/ways-to-bank/online-banking/");
		 }*/
	@Test
	public void Creditapp() throws IOException, InterruptedException
	{
		driver=initialbrowser();
		 driver.get("https://www.rbcroyalbank.com/ways-to-bank/online-banking/index.html");
		 driver.get(prep.getProperty("url"));
		 log.info("home pass");
		Loginpage lp=new Loginpage(driver);
		 log.info("home pass");
		Actions a=new Actions(driver);
		a.moveToElement(lp.CreditCards()).build().perform();
		lp.ImproveScore().click();
		lp.Applyonline().click();
		Thread.sleep(8000);
	System.out.println(driver.getCurrentUrl());
		
		
	}
	
}
