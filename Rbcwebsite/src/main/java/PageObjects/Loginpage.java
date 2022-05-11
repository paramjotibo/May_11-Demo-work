package PageObjects;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import Browsers.Waiting;


public class Loginpage {

	public WebDriver driver;
	public Waiting W;
	@SuppressWarnings("deprecation")
	public Loginpage(WebDriver driver)
	{
		this.driver=driver;
		W=new Waiting(this.driver);
	
	}
	
	By Credit=By.cssSelector("ul.mega-menu-lobs>li:nth-child(2)");
	By ImproveScore=By.xpath("//a[contains(text(),'Improve my credit score')]");
	By Apply=By.xpath("//a[contains(text(),'How to Apply for a Credit Card Online')]");
	By Accounts=By.cssSelector("ul.mega-menu-lobs>li:nth-child(1)");
	By GrabText=By.xpath("//h1[@id='page-title']");
	
	By DTD=By.linkText("Day to Day Banking");
	
	By viewallcards=By.linkText("View All Credit Cards");
	By cash=By.linkText("Cash Back");
	By firstselect=By.xpath("(//div[@class='width-100 hidden-xs']/a)[1]");
//	By secondselect=By.xpath("(//div[@class='width-100 hidden-xs']/a)[3]");
	By thirdselect=By.xpath("(//div[@class='width-100 hidden-xs']/a)[5]");
	By compare=By.cssSelector("div[class='fl-r mar-t-hlf']>a");
	By firstadd=By.xpath("(//div[@class='col-xs-12 compare-tray-card']/a)[3]");
	By secondadd=By.xpath("(//div[@class='col-xs-12 compare-tray-card']/a)[5]");
	By scroll=By.xpath("//body/div[@id='dvl-wpr']/div[2]/div[1]");
	//By selection=By.xpath("(//div[@class='width-100 text-center']/a)[1]");
	
	//By hiddenObj = By.xpath("//*[@id='idOfYourHiddenElement' and @type='hidden']");
	
	public WebElement down()
	{
		return driver.findElement(scroll);
	}
	public Object nowapply()
	{
		WebElement selection=driver.findElement(By.xpath("(//div[@class='width-100 text-center']/a)[3]"));
		
			
			JavascriptExecutor jse= (JavascriptExecutor)driver;
			return jse.executeScript("arguments[0].click()", selection);
	}
	public WebElement CreditCards()
	{ 
		return driver.findElement(Credit);
	
	}
	 public WebElement ImproveScore()
	 {
		
		  WebElement home=driver.findElement(ImproveScore);
		
		  return home;
	 }
	 public WebElement Applyonline()
	 {
		 return driver.findElement(Apply);
		 
	 }
	 
	 public WebElement Accountclick()
	 {
		 return driver.findElement(Accounts);
	 }
	 public WebElement Banking()
	 {
		return  driver.findElement(DTD);
	 }
	 
	 public WebElement Text()
	 {
		return driver.findElement(GrabText);
	 }
	 
	 // all credit cards
	public WebElement allcreditcards()
	{
		return driver.findElement(viewallcards);
	}
	public WebElement cashclick()
	{
		return driver.findElement(cash);
	}
	public WebElement select()
	{
		return driver.findElement(firstselect);
	}
	public Object select2()
	{
		
		WebElement secondselect=driver.findElement(By.xpath("(//div[@class='width-100 hidden-xs']/a)[3]"));
		//By secondselect=By.xpath("(//div[@class='width-100 hidden-xs']/a)[3]");
		JavascriptExecutor jse= (JavascriptExecutor)driver;
		return jse.executeScript("arguments[0].click()", secondselect);
	}
	public WebElement select3()
	{
		
		WebElement done= driver.findElement(thirdselect);
		W.WaitForElement(done);
		 return done;
	}
	public WebElement lastcompare()
	{
		
		return driver.findElement(compare);
		
	}
	public WebElement secondaddition()
	{
		
	
		WebElement daol= driver.findElement(firstadd);
		W.WaitForElement(daol);
		return daol;
	}
	
	public WebElement thirdaditiin()
	{
		
		
	WebElement goam= driver.findElement(secondadd);
	W.WaitForElement(goam);
	
	return goam;
	
	}
	}
