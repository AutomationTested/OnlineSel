package base;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.BeforeMethod;

public class CreateDriver {

	public ChromeDriver driver;
	@BeforeMethod
	public void bmet() throws MalformedURLException
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\TestingWorld\\Downloads\\chromedriver_win32\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("https://www.facebook.com");
	}
	
}
