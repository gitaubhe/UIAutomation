package qaclickacademy.Mavenjava;

import java.io.IOException;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import PageObjects.LandingPage;
import PageObjects.LoginPage;
import resource.Base;


public class HomePage extends Base{
	 public static Logger log =LogManager.getLogger(Base.class.getName());
	public WebDriver driver;
	
	@BeforeTest
	public void Initialize() throws IOException
	{
		driver = InitializeDriver();
	}
	
	@Test(dataProvider = "getData")
	public void basePageNavigation(String email, String pwd)
	{

		driver.get(prop.getProperty("url"));
		LandingPage lp = new LandingPage(driver);
		log.info("Application launched");
		Assert.assertEquals(lp.GetTitle().getText(), "ALL ACCESS SUBSCRIPTIONs");
		log.info("Landing page validated");
		LoginPage loginpage = lp.GoToLoginPage();
		loginpage.GetEmail().sendKeys(email);
		loginpage.GetPassword().sendKeys(pwd);
		loginpage.GetLogin().click();
		
	}
	
	@AfterTest
	public void Close()
	{
		driver.quit();
	}

	@DataProvider
public Object[][] getData()
{
	Object data[][] = new Object[2][2];
	data[0][0] = "gita@gamil.com";
	data[0][1] = "gita";
	data[1][0] = "riya@gamail.com";
	data[1][1] = "riya";
	
	return data;
	
}
}
