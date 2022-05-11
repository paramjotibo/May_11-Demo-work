package Steppack;

import cucumber.api.PendingException;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.When;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.And;
import cucumber.api.junit.Cucumber;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

import org.junit.runner.RunWith;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Actions;

import Browsers.Generalfile;
import PageObjects.Loginpage;

@RunWith(Cucumber.class)
public class Definitions extends Generalfile {
public Loginpage lp;
public WebDriver driver;

    @SuppressWarnings("deprecation")
	@Given("^Browser is initiated$")
    public void browser_is_initiated() throws Throwable {
    	driver=initialbrowser();
		 driver.get("https://www.rbcroyalbank.com/ways-to-bank/online-banking/index.html");
		 driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
    }

    @When("^user hovers on credit option$")
    public void user_hovers_on_credit_option() throws Throwable {
    	 lp=new Loginpage(driver);
		Actions a=new Actions(driver);
		a.moveToElement(lp.CreditCards()).build().perform();
    }

    @When("^user clicks on how to improve score$")
    public void user_clicks_on_how_to_improve_score() throws Throwable {
    	lp.Applyonline().click();
    }

   @And("^clicks on improve credit score$")
    public void clicks_on_improve_credit_score() throws Throwable {
    	lp.ImproveScore().click();
    }
    @Then("^Credit card tab is populated$")
    public void credit_card_tab_is_populated() throws Throwable {
    	System.out.println(driver.getTitle());
    }
    @And("^clicks on view all credit cards$")
    public void clicks_on_view_all_credit_cards() throws Throwable {
        lp.allcreditcards().click();
    }
    @Then("^new webpage pops up$")
    public void new_webpage_pops_up() throws Throwable {
        System.out.println(driver.getTitle());
    }

    @And("^user selects Cash back option$")
    public void user_selects_cash_back_option() throws Throwable {
        lp.cashclick().click();
    }
 

@And("^user selects first option$")
public void user_selects_first_option() throws Throwable {
    // Write code here that turns the phrase above into concrete actions
	
    lp.select().click();
 }
@And("^user click on scrll$")
public void user_click_on_scrll() throws Throwable {

lp.down().click();
Thread.sleep(5000);
}

@And("^user click option(\\d+)$")
public void user_click_option(int arg1) throws Throwable {
  lp.secondaddition().click();
 Thread.sleep(5000);
}

@And("^user selects second option$")
public void user_selects_second_option() throws Throwable {
	Thread.sleep(4000);
   lp.select2();
}

@And("^user click on add option(\\d+)$")
public void user_click_on_add_option(int arg1) throws Throwable {
	Thread.sleep(4000);
  lp.thirdaditiin().click();
}
@Then("^user selects third option$")
public void user_selects_third_option() throws Throwable {
	Thread.sleep(4000);
 lp.select3().click();
}
@Then("^user selects compare$")
public void user_selects_compare() throws Throwable {
    lp.lastcompare().click();
}

}
