package PageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Accountspage {
 public WebDriver driver;
 
 public Accountspage(WebDriver driver)
 {
	 this.driver=driver;
 }
 
 By overview=By.linkText("Accounts Overview");
 By Accounts=By.cssSelector("ul.mega-menu-lobs>li:nth-child(1)");
 By Chequing=By.linkText("Chequing Accounts");
 By Savings=By.linkText("Savings Accounts");
 By Branches=By.xpath("//label[contains(text(),'Branches')]");
 By inputloc=By.cssSelector("#postal");
 By search=By.xpath("//button[contains(text(),'Search')]");
 By compare=By.cssSelector("div[class='banner-text']>a[href*=compare-savings]");
 
 public WebElement Accountview()
 {
	return driver.findElement(overview);
 }
 public WebElement clickonaccount()
 {
	 return driver.findElement(Accounts);
 }
 
 public WebElement checkoption()
 {
	return driver.findElement(Chequing);
 }
 
 public WebElement Savingsoption()
 {
	return driver.findElement(Savings);
 }
 public WebElement branchclick()
 {
	return driver.findElement(Branches);
 }
 public WebElement enterpost()
 {
	return driver.findElement(inputloc);
 }
 public WebElement clicksearch()
 {
	return driver.findElement(search);
 }
 public WebElement compareaccounts()
 {
	return driver.findElement(compare);
 }
}
