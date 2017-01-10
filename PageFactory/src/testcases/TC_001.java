package testcases;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import base.CreateDriver;
import pages.LoginPage;

public class TC_001 extends CreateDriver {
	
	
	@Test
	public void tcase1() throws InterruptedException
	{
		
		driver.findElementById("email").sendKeys("Hello");
		driver.findElementById("pass").sendKeys("Hello");
		
	}

}
