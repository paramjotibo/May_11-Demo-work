package cucumberoptions;

import org.junit.runner.RunWith;

import cucumber.api.junit.Cucumber;



@RunWith(Cucumber.class)
@cucumber.api.CucumberOptions
(features="src/test/java/feature/credit.feature",glue="Steppack",tags="@RegTest",
plugin= {"html:target/cucumber-html-report"}
)
	
		
public class Testrunner  {

}
