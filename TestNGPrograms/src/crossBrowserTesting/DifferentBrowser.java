package crossBrowserTesting;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.testng.annotations.Test;

public class DifferentBrowser {
	@Test
	public void openDifferentBrowser() {
	//	System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
//		WebDriver driver = new ChromeDriver();
	//	driver.get("https://www.facebook.com");
		
//		System.setProperty("webdriver.gecko.driver", "geckodriver.exe");
//		WebDriver driver = new FirefoxDriver();
		
//		System.setProperty("webdriver.chrome.driver", "C:\\Users\\sruja\\Downloads\\chromedriver_win32\\chromedriver.exe");
//		WebDriver driver = new ChromeDriver();
		
	System.setProperty("webdriver.ie.driver", "C:\\\\Users\\\\sruja\\\\Downloads\\\\IEDriverServer_x64_3.7.0\\\\IEDriverServer.exe");

		WebDriver driver = new InternetExplorerDriver();
	driver.get("https://www.facebook.com");
		
//		System.setProperty("webdriver.edge.driver", "MicrosoftWenDriver.exe");
//		WebDriver driver = new EdgeDriver();	
		
	}

}
