package maven.testng;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class BasePageTest {
	WebDriver testDriver;
	
  @Test
  public void fistPage() {
	  
	  		
			System.setProperty("webdriver.chrome.driver", "driver_files/chromedriver");
			//testDriver = library.Browsers.chooseBrowser("chrome");
			testDriver = new ChromeDriver();
			testDriver.get("http://yahoomail.com");
		  
		  	
			testDriver.close();
  }
}
