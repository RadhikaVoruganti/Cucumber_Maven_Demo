package Runner;

import org.junit.runner.RunWith;
import cucumber.api.CucumberOptions;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import cucumber.api.junit.Cucumber;
@RunWith(Cucumber.class)
@CucumberOptions(
        features = {"features"},
        tags = {"@TechTest"},
        glue = {"stepdefinitions"},
        plugin={"html:target/cucumber-html-report","junit:target/cucumber-results.xml","json:target/cucumber.json"}
      )
public class TestRunner_Demo {

	

}