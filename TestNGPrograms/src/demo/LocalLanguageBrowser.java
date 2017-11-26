package demo;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxProfile;
import org.testng.Assert;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class LocalLanguageBrowser {
	WebDriver driver;
	
	@BeforeTest
	public void openBrowser() {
		
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		FirefoxProfile profile = new FirefoxProfile();
		profile.setPreference("intl.accept_languages", "de");
		driver = new FirefoxDriver(profile);
		driver.get("https://gmail.com");
	}
	
	@Test
	public void verifyTitle() {
			String expectedTitle = "GMail";
			String actualTitle = driver.getTitle();
			Assert.assertEquals(actualTitle, expectedTitle);
					
		}
	
}
