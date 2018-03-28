package demo;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class VerifyTitle {
		WebDriver driver;

  @BeforeTest
  
  public void openBrowser() {
	System.setProperty("webdriver.chrome.driver", "chromedriver.exe");  
	driver = new ChromeDriver(); //Browser being opened
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	driver.get("https://www.Orbitz.com");
	    
  }
  
	
	@Test
	public void verifyTitle(){
		String expectedTitle = "ORBITZ.com – Best Travel Deals";
	    String actualTitle = driver.getTitle();
	    Assert.assertEquals(actualTitle, expectedTitle);
	}
	
	@AfterTest
	public void closeBrowser() {
		driver.quit();
		
	}	

}
