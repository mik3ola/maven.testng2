package maven.testng.UIFramework;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class BrowserFactory {
	
	public static WebDriver chooseBrowser(String myBrowser) {
		//String myBrowser;
		
		if (myBrowser.equals("chrome")) {
			System.setProperty("webdriver.chrome.driver", "driver_files/chromedriver");
			return new ChromeDriver();
		
		}else if (myBrowser.equals("firefox")) {
		System.setProperty("webdriver.gecko.driver", "driver_files/geckodriver");
		return new FirefoxDriver();
		}
	else {System.setProperty("webdriver.chrome.driver", "driver_files/chromedriver");
		return new ChromeDriver();
	}
	}

}
