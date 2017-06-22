package stepdefinitions;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

import org.apache.commons.configuration.Configuration;
import org.apache.commons.configuration.ConfigurationException;
import org.apache.commons.configuration.PropertiesConfiguration;
import org.apache.commons.lang.StringUtils;
import org.junit.After;
import org.junit.Before;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxProfile;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.remote.Augmenter;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.support.events.EventFiringWebDriver;



public class WebDriverUtil {

	
	protected WebDriver driver;
	
	protected Configuration config;

	
	
	public void loadConfiguration() {
		try {
			config = new PropertiesConfiguration("test.properties");
		} catch (ConfigurationException e) {
			e.printStackTrace();
		}
	}

	

	public WebDriver createWebDriver(String driver) {
		WebDriver webDriver = null;
	//	FailureEventListener eventListener = new FailureEventListener();
		
		if (StringUtils.isBlank(driver)) {
			driver = "firefox";
		}

		
		
			System.setProperty("webdriver.gecko.driver", config.getString("geckodriverpath"));
				return new FirefoxDriver();
			
		
	}

	

}