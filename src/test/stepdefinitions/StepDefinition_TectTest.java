package stepdefinitions;

import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import cucumber.api.java.After;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import pages.AmazonPDP;
import pages.GoogleHomePage;
import pages.GoogleSearchResultsPage;

public class StepDefinition_TectTest extends WebDriverUtil{
	
	@Before
	public void SetUp() throws Throwable {
		
		loadConfiguration();
	driver = createWebDriver(config.getString("local.browser", "firefox"));
	
		
	}
	
	@Given("^A user is on Google UK Website$")
	public void a_user_is_on_Google_UK_Website() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		driver.get("http://google.co.uk");
		   driver.manage().window().maximize();
	}

	@When("^The user searches for Iphone$")
	public void the_user_searches_for_Iphone() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		driver.findElement(GoogleHomePage.googleSearchBox).sendKeys("iPhone");
		   driver.findElement(GoogleHomePage.googleSearchBox).sendKeys(Keys.RETURN);
	}

	@When("^finds the link that points to Amazon UK$")
	public void finds_the_link_that_points_to_amazon_co_uk() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		WebDriverWait wait = new WebDriverWait(driver,100);
		 wait.until(ExpectedConditions.visibilityOfElementLocated(GoogleSearchResultsPage.resultsList));
		 List<WebElement> resultListElements = new ArrayList<WebElement>();
		 ListIterator<WebElement> itr = null;
		 WebElement toClick = null;
		boolean flag = false;
        int page_number = 1;
        while (!flag) {
        	resultListElements = wait.until(ExpectedConditions
                .presenceOfAllElementsLocatedBy(GoogleSearchResultsPage.resultsList));
            itr = resultListElements.listIterator(); // re-initializing iterator
            while (itr.hasNext()) {
                toClick = itr.next();
                
                if (toClick.getAttribute("href").toLowerCase().startsWith("https://www.amazon.co.uk")) {
                    toClick.click();
                    flag = true;
                    break;
                }
            }
            if (!flag) {
                driver.findElement(GoogleSearchResultsPage.pageNumberLinks)
                    .click();
                page_number++;
                resultListElements.clear();
                wait.until(ExpectedConditions.textToBePresentInElementLocated(
                    By.xpath("//td[@class='cur']"), page_number + ""));
            }
        }
	}

	@When("^Navigates to the result with maximum memory$")
	public void navigates_to_the_result_with_maximum_memory() throws Throwable {
		WebDriverWait wait = new WebDriverWait(driver,100);
		 wait.until(ExpectedConditions.visibilityOfElementLocated(AmazonPDP.largestIphone));
		driver.findElement(AmazonPDP.largestIphone).click();
	}

	@Then("^print the name and price of the product$")
	public void print_the_name_and_price_of_the_product() throws Throwable {
		System.out.println( driver.findElement(AmazonPDP.productTitle).getText());
	    
	}

	@Then("^validate if the price is not greater that £(\\d+)$")
	public void validate_if_the_price_is_not_greater_that_£(int arg1) throws Throwable {
	   String price =  driver.findElement(AmazonPDP.price).getText().substring(1);
	   int priceShown = Integer.parseInt(price);
	   assertEquals(true, priceShown<800.00);
	}
	
	@After
	public void closeBrowser()
	{
		if(driver!=null)
		driver.quit();
	}


}
