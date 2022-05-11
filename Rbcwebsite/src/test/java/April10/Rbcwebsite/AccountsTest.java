package April10.Rbcwebsite;

import java.io.IOException;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import Browsers.Generalfile;
import PageObjects.Accountspage;
import PageObjects.Loginpage;

public class AccountsTest extends Generalfile {
	 public static Logger log=LogManager.getLogger(Generalfile.class.getName());
public WebDriver driver;
public Accountspage ap;
	/*@BeforeTest(groups= {"smoke"})
	public void Browsercall() throws IOException
	{
		driver=initialbrowser();
		driver.get("https://www.rbcroyalbank.com/ways-to-bank/online-banking/index.html");
	}
	
	@Test
	public void Accountsinit() throws IOException
	{
		
		Loginpage lon=new Loginpage(driver);
		Actions am=new Actions(driver);
		am.moveToElement(lon.Accountclick()).build().perform();
		lon.Banking().click();
		String name=lon.Text().getText();
		System.out.println(name);
		//driver.close();
	}
	
@Test
		public void overview() throws IOException
		{
			driver=initialbrowser();
			driver.get("https://www.rbcroyalbank.com/ways-to-bank/online-banking/index.html");
			Actions am=new Actions(driver);
		Accountspage ap=new Accountspage(driver);
		am.moveToElement(ap.clickonaccount()).build().perform();
		ap.Accountview().click();
	}
		
		@Test
	public void RBCvan() throws IOException
	{
			driver=initialbrowser();
			driver.get("https://www.rbcroyalbank.com/ways-to-bank/online-banking/index.html");
			Actions am=new Actions(driver);
			Accountspage ap=new Accountspage(driver);
			am.moveToElement(ap.clickonaccount()).build().perform();
			ap.checkoption().click();
	}*/

		@Test
		public void Savings() throws IOException
		{
			driver=initialbrowser();
			driver.get("https://www.rbcroyalbank.com/ways-to-bank/online-banking/index.html");
			log.info("driver invoked");
			Actions am=new Actions(driver);
	
		 ap=new Accountspage(driver);
			am.moveToElement(ap.clickonaccount()).build().perform();
			ap.Savingsoption().click();
			
		}
		
		@Test
		public void savings2()
		
		{
			ap.branchclick().click();
			ap.enterpost().sendKeys("jkl");
		}

	

	}
	
