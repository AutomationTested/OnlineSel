package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class LoginPage {
	
	private WebElement email;
	
	
	//@FindBy(how = How.XPATH, using = "//input[@id='pass']")
	
	@FindBy(xpath = "//input[@id='pass']")
	private WebElement x;
	//private WebElement login;
	
	
	
	ChromeDriver driver;
	public void enterUsername()
	{
		email.sendKeys("Hello");
	}
	
	public void enterPassword()
	{
		x.sendKeys("Pass");
	}
	
	public void clickSignin()
	{
		//login.click();
	}

}
