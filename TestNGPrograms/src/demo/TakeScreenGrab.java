package demo;

import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class TakeScreenGrab {
	WebDriver driver;
	@BeforeTest
	public void openBrowser() {
		System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.get("http://newtours.demoaut.com");
		
	}
	@Test
	public void grabScreen() throws IOException {
		try {
			
		driver.findElement(By.name("userName")).sendKeys("mercury");
		driver.findElement(By.name("password")).sendKeys("mercury");
		driver.findElement(By.name("login")).click();
			

		
		driver.findElement(By.name("findFlights")).click();
		driver.findElement(By.name("reserveFlights")).click();
		driver.findElement(By.name("First0")).sendKeys("Deepinder"); //Test case will fail here as we gave a wrong name
		driver.findElement(By.name("passLast0")).sendKeys("Bhatti");
		}
		catch(Exception e) {
			System.out.println("Control is in Catch Block");
			getScreenshot();   //calling the method

		}
	}
	
	public void getScreenshot() throws IOException {   //defining the method
		File ss = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
	    FileHandler.copy(ss, new File("C:\\\\Users\\\\sruja\\\\Desktop\\\\Vidya\\\\QA_Related\\\\Selenium\\\\Selenium_Practice_Programs\\\\Photos\\\\NewtoursScreenshot.jpg"));
	    
	    driver.quit();		
	}
	
	
}
