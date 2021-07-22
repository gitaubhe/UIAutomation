package PageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class LandingPage{
	
	public WebDriver driver;
    By signin = By.cssSelector("a[href*='sign_in']");
    By title = By.xpath("//div[@class='inner-box']/h1");

    
    public LandingPage(WebDriver driver)
    {
    	this.driver = driver;
    }

    public LoginPage GoToLoginPage() {
    	driver.findElement(signin).click();
    	return new LoginPage(driver);
    }
    
	public WebElement GetTitle()
	{
		return driver.findElement(title);
	}

}
