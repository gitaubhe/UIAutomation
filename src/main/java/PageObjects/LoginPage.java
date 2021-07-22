package PageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class LoginPage {
	public WebDriver driver;
	By emailAddress = By.cssSelector("[id='user_email']");
	By password = By.cssSelector("[id='user_password']");
	By logIn = By.cssSelector("[type='submit']");
	
	public LoginPage(WebDriver driver)
	{
		this.driver = driver;
	}
	
	public WebElement GetEmail()
	{
		return driver.findElement(emailAddress);
	}
	public WebElement GetPassword()
	{
		return driver.findElement(password);
	}

	public WebElement GetLogin()
	{
		return driver.findElement(logIn);
	}

}
