package Steppack;


import cucumber.api.java.en.Given;
import cucumber.api.java.en.When;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.And;
import cucumber.api.junit.Cucumber;
import org.junit.runner.RunWith;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.asserts.SoftAssert;

import Browsers.Generalfile;
import PageObjects.Accountspage;

@RunWith(Cucumber.class)
public class Def2 extends Generalfile {
public WebDriver driver;
public Accountspage ap;
    @Given("^user is on homepage$")
    public void user_is_on_homepage() throws Throwable {
    	driver=initialbrowser();
		driver.get("https://www.rbcroyalbank.com/ways-to-bank/online-banking/index.html");
    }

    @And("^user hovers on Account option$")
    public void user_hovers_on_account_option() throws Throwable {
    	Actions am=new Actions(driver);
    	 ap=new Accountspage(driver);
		am.moveToElement(ap.clickonaccount()).build().perform();
    }

    @When("^user click on chequing option$")
    public void user_click_on_chequing_option() throws Throwable {
      ap.checkoption().click();
    }

    @Then("^Chequing tab is open$")
    public void chequing_tab_is_open() throws Throwable {
        System.out.println(driver.getTitle());
    }
    @When("^user click on Savings option$")
    public void user_click_on_Savings_option() throws Throwable {
       ap.Savingsoption().click();
        
    }

    @Then("^Savings tab is open$")
    public void savings_tab_is_open() throws Throwable {
        
        System.out.println(driver.getTitle());
    }
    

    @When("^user clicks on branch button$")
    public void user_clicks_on_branch_button() throws Throwable {
    	
    	Thread.sleep(6000);
       ap.branchclick().click();
    }
    @And("^Enters the postal code$")
    public void enters_the_postal_code() throws Throwable {
        ap.enterpost().sendKeys("M9W4E7");
    }

    @And("^Clicks on Search$")
    public void clicks_on_search() throws Throwable {
      ap.clicksearch().click();
    }

    @Then("^location tab opens up$")
    public void location_tab_opens_up() throws Throwable {
       
    }
    @When("^user clicks on compare accounts$")
    public void user_clicks_on_compare_accounts() throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        ap.compareaccounts().click();
    }

    @Then("^New tab is populated$")
    public void new_tab_is_populated() throws Throwable {
        // Write code here that turns the phrase above into concrete actions
       System.out.println(driver.getTitle()); 
       SoftAssert agh=new SoftAssert();
    }





}