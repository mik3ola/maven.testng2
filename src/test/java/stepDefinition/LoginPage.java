package stepDefinition;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.Test;

public class LoginPage {
	WebDriver testDriver;
  @Test
  public void f() {
  
	  testDriver = maven.testng.UIFramework.BrowserFactory.chooseBrowser("firefox");
	  testDriver.get("http://yahoomail.com");
	  testDriver.close();
  
  }
  @AfterTest
  public void t() {
	  testDriver = library.Browsers.chooseBrowser("chrome");
	  testDriver.get("http://yahoomail.com");
	  
  }
}
