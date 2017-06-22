package pages;

import org.openqa.selenium.By;

public class GoogleSearchResultsPage {
	
	public static By resultsList = By.xpath("//h3[@class='r']/a");
	public static By pageNumberLinks = By.xpath("//a[@id='pnnext']/span[1]");

}
